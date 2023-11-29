package chatserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Servidor extends Thread {

    private ServerSocket serverSocket;
    LinkedList<HiloCliente> clientes;
    private final VentanaS ventana;
    private final String puerto;
    static int correlativo;

    public Servidor(String puerto, VentanaS ventana) {
        correlativo = 0;
        this.puerto = puerto;
        this.ventana = ventana;
        clientes = new LinkedList<>();
        this.start();
    }

    @Override
    public void run() {
        try {
            serverSocket = new ServerSocket(Integer.parseInt(puerto));
            ventana.addServidorIniciado();
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Nueva conexión entrante: " + socket);
                HiloCliente h = new HiloCliente(socket, this);
                h.start();
            }
        } catch (IOException | NumberFormatException e) {
            mostrarError("El servidor no se ha podido iniciar, es posible que haya ingresado un puerto incorrecto.");
            System.exit(0);
        }
    }

    public LinkedList<String> getUsuariosConectados() {
        LinkedList<String> usuariosConectados = new LinkedList<>();
        clientes.forEach(c -> usuariosConectados.add(c.getIdentificador()));
        return usuariosConectados;
    }

    public void agregarLog(String texto) {
        ventana.agregarLog(texto);
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(ventana, mensaje + " Esta aplicación se cerrará.");
    }
}
