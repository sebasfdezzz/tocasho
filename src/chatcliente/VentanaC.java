
package chatcliente;

import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class VentanaC extends javax.swing.JFrame {

   
    public VentanaC() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String ip_puerto_nombre[]=getIP_Puerto_Nombre();
        String ip=ip_puerto_nombre[0];
        String puerto=ip_puerto_nombre[1];
        String nombre=ip_puerto_nombre[2];
        CrearCertificado(nombre);
        cliente=new Cliente(this, ip, Integer.valueOf(puerto), nombre);
    }
static void CrearCertificado(String nombre){
    String llavepublica=GenerarPublica();
    String llaveprivada=GenerarPriv();
    String Certificado=GenerarCertificado();
    
}

static String GenerarPublica(){
    
} 

static String GenerarPriv(String Llavepublica){
    
}

static String GenerarCertificado(String nombre, String llavepublica){
    
}

public static String LeerLLavePublica(String nombre){
    
}

public static String LeerLLavePrivada(String nombre){
    
}



public class SaveStringsToFiles {

    public static void main(String[] args) {
        String pub = "your pub string here";
        String priv = "your priv string here";
        String certificate = "your certificate string here";

        saveToFile(pub, "Pub", "user.pub");
        saveToFile(priv, "Priv", "user.priv");
        saveToFile(certificate, "Certs", "user.cert");
    }

    private static void saveToFile(String content, String folderName, String fileName) {
        // Create the folder if it doesn't exist
        File folder = new File(folderName);
        if (!folder.exists()) {
            folder.mkdir();
        }

        // Create the file path
        String filePath = folderName + File.separator + fileName;

        try (FileWriter writer = new FileWriter(filePath)) {
            // Write content to the file
            writer.write(content);
            System.out.println("File saved successfully: " + filePath);
        } catch (IOException e) {
            System.err.println("Error saving file: " + filePath);
            e.printStackTrace();
        }
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistorial = new javax.swing.JTextArea();
        txtMensaje = new javax.swing.JTextField();
        cmbContactos = new javax.swing.JComboBox();
        btnEnviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Llave = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setForeground(new java.awt.Color(153, 153, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        txtHistorial.setEditable(false);
        txtHistorial.setBackground(new java.awt.Color(172, 202, 186));
        txtHistorial.setColumns(20);
        txtHistorial.setRows(5);
        jScrollPane1.setViewportView(txtHistorial);

        btnEnviar.setBackground(new java.awt.Color(204, 255, 204));
        btnEnviar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        btnEnviar.setText("-->");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel1.setText("             Chat:");

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ChatUP");

        jButton1.setText("C.S.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("C.A.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("D.S.");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("D.A.");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Llave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LlaveActionPerformed(evt);
            }
        });

        jButton5.setText("EF");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Validar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("S.D.");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Quitar sobre");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Llave, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 115, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 94, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEnviar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbContactos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbContactos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(Llave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton6)
                    .addComponent(jButton8))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        
        if(cmbContactos.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Debe escoger un destinatario válido, si no \n"
                                                 + "hay uno, espere a que otro usuario se conecte\n"
                                                 + "para poder chatear con él.");        
            return;
        }
        String cliente_receptor=cmbContactos.getSelectedItem().toString();
        String mensaje=txtMensaje.getText();
        cliente.enviarMensaje(cliente_receptor, mensaje);
        
        txtHistorial.append("## Yo -> "+cliente_receptor+ " ## : \n" + mensaje+"\n");
        txtMensaje.setText("");
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    }//GEN-LAST:event_formWindowClosed
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cliente.confirmarDesconexion();
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(cmbContactos.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Debe escoger un destinatario válido, si no \n"
                                                 + "hay uno, espere a que otro usuario se conecte\n"
                                                 + "para poder chatear con él.");        
            return;
        }
        String llave=Llave.getText();
        if(!llave.isEmpty())
        {
            String cliente_receptor=cmbContactos.getSelectedItem().toString();
            String mensaje=txtMensaje.getText();
            String MensajeCifrado=cifrarTexto(mensaje,Integer.parseInt(llave));
            cliente.enviarMensaje(cliente_receptor, MensajeCifrado);

            txtHistorial.append("## Yo -> "+cliente_receptor+ " ## : \n" + MensajeCifrado+"\n");
            txtMensaje.setText("");
            Alerta(Integer.parseInt(llave));
        }
        
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(cmbContactos.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Debe escoger un destinatario válido, si no \n"
                                                 + "hay uno, espere a que otro usuario se conecte\n"
                                                 + "para poder chatear con él.");        
            return;
        }
        String llave = Llave.getText();
        if(!llave.isEmpty()){
            String cliente_receptor=cmbContactos.getSelectedItem().toString();
            String mensaje=txtMensaje.getText();
            String MensajeCifrado=cifrarTexto(mensaje,Integer.parseInt(llave));
            cliente.enviarMensaje(cliente_receptor, MensajeCifrado);

            txtHistorial.append("## Yo -> "+cliente_receptor+ " ## : \n" + MensajeCifrado+"\n");
            txtMensaje.setText("");
            Alerta(62-Integer.parseInt(llave));
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String llave=Llave.getText();
        if(!llave.isEmpty())
        {
            String textoCompleto = txtHistorial.getText();
            String cliente_receptor=cmbContactos.getSelectedItem().toString();

            String[] lineas = textoCompleto.split("\n");

            String ultimoMensaje = lineas[lineas.length - 1];
            String textodescifrado = descifrarTexto(ultimoMensaje,Integer.parseInt(llave));
            cliente.enviarMensaje(cliente_receptor, textodescifrado);

            txtHistorial.append("## El mensaje descifrado -> \n"  + textodescifrado+"\n");
            txtMensaje.setText("");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String llave=Llave.getText();
        if(!llave.isEmpty()){
            String textoCompleto = txtHistorial.getText();
            String cliente_receptor=cmbContactos.getSelectedItem().toString();

            String[] lineas = textoCompleto.split("\n");

            String ultimoMensaje = lineas[lineas.length - 1];
            String textodescifrado = cifrarTexto(ultimoMensaje,Integer.parseInt(llave));//La llave es 26 menos la llave privada para cifrar que es 4
            cliente.enviarMensaje(cliente_receptor, textodescifrado);

            txtHistorial.append("## El mensaje descifrado -> \n"  + textodescifrado+"\n");
            txtMensaje.setText("");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void LlaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LlaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LlaveActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            if(cmbContactos.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Debe escoger un destinatario válido, si no \n"
                                                 + "hay uno, espere a que otro usuario se conecte\n"
                                                 + "para poder chatear con él.");        
            return;
        }
        String llave=Llave.getText();
        if(!llave.isEmpty())
        {
            String cliente_receptor=cmbContactos.getSelectedItem().toString();
            String mensaje=txtMensaje.getText();
            String resumen= Hash(mensaje);
            String firma=cifrarTexto(resumen, Integer.parseInt(llave));
            cliente.enviarMensaje(cliente_receptor, mensaje + " " + firma);
            
            

            txtHistorial.append("## Yo \n Documento firmado -> "+cliente_receptor+ " ## : \n" + mensaje + " " + firma+"\n");
            txtMensaje.setText("");
            Alerta(62-Integer.parseInt(llave));
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String llave=Llave.getText();
        if(!llave.isEmpty()){
            String textoCompleto = txtHistorial.getText();
            String cliente_receptor=cmbContactos.getSelectedItem().toString();

            String[] lineas = textoCompleto.split("\n");

            String ultimoMensaje = lineas[lineas.length - 1];
            int ultimoEspacio = ultimoMensaje.lastIndexOf(" ");

        if (ultimoEspacio != -1) {
            String mensaje = ultimoMensaje.substring(0, ultimoEspacio);
            String firma = ultimoMensaje.substring(ultimoEspacio + 1);
            boolean Firmavalida=ValidarFirma(mensaje, firma, Integer.parseInt(llave)); 
            if(Firmavalida){
                
          
                cliente.enviarMensaje(cliente_receptor, "El mensaje ha sido validado");

                txtHistorial.append("## El mensaje ha sido validado ->" + "Mensaje: "+ mensaje + "\n");
                txtMensaje.setText(""); 
                
            }
            else{
                cliente.enviarMensaje(cliente_receptor, "El mensaje no ha sido validado");

                txtHistorial.append("## El mensaje no ha sido validado ->" + "Mensaje: "+ mensaje + "\n");
                txtMensaje.setText(""); 
            }

            System.out.println("Primera parte: " + mensaje);
            System.out.println("Segunda parte: " + firma);
        } else {
            System.out.println("La firma se genero incorrectamente.");
            cliente.enviarMensaje(cliente_receptor, "La firma se genero incorrectamente.");

            txtHistorial.append("## La firma se genero incorrectamente. \n");
            txtMensaje.setText(""); 
        }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            if(cmbContactos.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Debe escoger un destinatario válido, si no \n"
                                                 + "hay uno, espere a que otro usuario se conecte\n"
                                                 + "para poder chatear con él.");        
            return;
            }
        String mensaje = "Ingresa tu llave privada del emisor y pública del receptor (dos enteros separados por espacios):";

        String entrada = JOptionPane.showInputDialog(null, mensaje);

        if (entrada != null) {
            String[] partes = entrada.split(" ");
            
            if (partes.length == 2) {
                try {
                    int llavePrivadaEmisor = Integer.parseInt(partes[0]);
                    int llavePublicaReceptor = Integer.parseInt(partes[1]);
                    
                    Random random = new Random();

                    // Generar un número aleatorio en el rango de 0 a 9
                    int llaveAleatoria = random.nextInt(1,10);
                    
                    String cliente_receptor=cmbContactos.getSelectedItem().toString();
                    String mensajeamandar=txtMensaje.getText();
                    String resumen= Hash(mensajeamandar);
                    String firma=cifrarTexto(resumen, llavePrivadaEmisor);
                    String mensajecifrado=cifrarTexto(mensajeamandar, llaveAleatoria);
                    String firmacifrada=cifrarTexto(firma, llaveAleatoria);
                    String llaveAleatoriaCifrada=cifrarTexto(String.valueOf(llaveAleatoria),llavePublicaReceptor);
                    System.out.println("la llave aleatoria es: "+llaveAleatoria);
                    cliente.enviarMensaje(cliente_receptor, mensajecifrado + " " + firmacifrada + " " + llaveAleatoriaCifrada);

                    txtHistorial.append("## Yo \n Sobre Digital -> "+cliente_receptor+ " ## : \n" + mensajecifrado + " " + firmacifrada + " " + llaveAleatoriaCifrada+"\n");
                    txtMensaje.setText("");
                    Alerta2(llavePublicaReceptor,62-llavePrivadaEmisor);
            
            
                    // Ahora tienes las dos variables: llavePrivadaEmisor y llavePublicaReceptor
                    System.out.println("Llave privada del emisor: " + llavePrivadaEmisor);
                    System.out.println("Llave pública del receptor: " + llavePublicaReceptor);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingresa dos enteros válidos separados por espacio.");
                }
            } else {
                System.out.println("Error: Ingresa exactamente dos enteros separados por espacio.");
            }
        } else {
            System.out.println("Operación cancelada por el usuario.");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String mensaje = "Ingresa tu llave privada del emisor y pública del receptor (dos enteros separados por espacios):";

        
        String entrada = JOptionPane.showInputDialog(null, mensaje);

        if (entrada != null) {
            String[] partes = entrada.split(" ");
            
            if (partes.length == 2) {
                try {                    
                    int llavePublicaEmisor = Integer.parseInt(partes[0]);
                    int llavePublicaReceptor = Integer.parseInt(partes[1]);
                    String textoCompleto = txtHistorial.getText();
                    String cliente_receptor=cmbContactos.getSelectedItem().toString();
                    String[] lineas = textoCompleto.split("\n");
                    String ultimoMensaje = lineas[lineas.length - 1];
                    int ultimoEspacio = ultimoMensaje.lastIndexOf(" ");

                    if (ultimoEspacio != -1) {
                        String docfirmado = ultimoMensaje.substring(0, ultimoEspacio);
                        String llavealeatoria = ultimoMensaje.substring(ultimoEspacio + 1);
                        String llavedescifrada = descifrarTexto(llavealeatoria, llavePublicaReceptor);
                        System.out.println(llavedescifrada);
                        System.out.println(llavePublicaReceptor);
                        System.out.println(docfirmado + " " + "La llave es: "+llavealeatoria);
                        String textocompleto1 = docfirmado;
                        int ultimoespacio1 = textocompleto1.lastIndexOf(" ");
                        String mensaje_doc = textocompleto1.substring(0, ultimoespacio1);
                        String firma = textocompleto1.substring(ultimoespacio1+1);
                        
                        String mensajedescifrado = descifrarTexto(mensaje_doc,Integer.parseInt(llavedescifrada));
                        System.out.println(mensajedescifrado);
                        String firmadescifrada = descifrarTexto(firma,Integer.parseInt(llavedescifrada));
                        boolean Firmavalida = ValidarFirma(mensajedescifrado, firmadescifrada, llavePublicaEmisor);
                        if (Firmavalida) {

                            cliente.enviarMensaje(cliente_receptor, "El mensaje ha sido validado");

                            txtHistorial.append("## El mensaje ha sido validado ->" + "Mensaje: "+ mensajedescifrado + "\n");
                            txtMensaje.setText("");
                        } else {
                            cliente.enviarMensaje(cliente_receptor, "El mensaje no ha sido validado");

                            txtHistorial.append("## El mensaje no ha sido validado ->" + "Mensaje: "+ mensajedescifrado + "\n");
                            txtMensaje.setText("");
                        }

                        System.out.println("Primera parte: " + mensaje);
                        //System.out.println("Segunda parte: " + firma);
                    } else {
                        System.out.println("La firma se genero incorrectamente.");
                        cliente.enviarMensaje(cliente_receptor, "La firma se genero incorrectamente.");

                        txtHistorial.append("## La firma se genero incorrectamente. \n");
                        txtMensaje.setText("");
                    }
                }
                catch (Exception E1){
                    
                }
        
        
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed
    
    private void Alerta(int llave){
        try {
            // Mostrar una ventana de mensaje con el número ingresado
            JOptionPane.showMessageDialog(null, "La llave para descifrar es: " + llave, "Llave", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            // Si no se ingresó un número válido, mostrar una ventana de error
            JOptionPane.showMessageDialog(null, "No se ingresó una llave válida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void Alerta2(int llavePublicaReceptor, int llavePublicaEmisor){
        try {
            // Mostrar una ventana de mensaje con el número ingresado
            JOptionPane.showMessageDialog(null, "La llave para descifrar el sobre es: " + llavePublicaReceptor + "\nLa llave para validar la firma es: "+ llavePublicaEmisor, "Llave", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            // Si no se ingresó un número válido, mostrar una ventana de error
            JOptionPane.showMessageDialog(null, "No se ingresó una llave válida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
   public static String Hash(String input) {
        int hash = 0;

        for (char c : input.toCharArray()) {
            hash = (hash * 31) + c;
        }


        return String.valueOf(hash);
    }
   
    public static boolean ValidarFirma(String texto, String firma, int llave){
       String resumen = Hash(texto);
       String firmadescifrada= cifrarTexto(firma, llave);
       System.out.println(resumen);
       System.out.println(firmadescifrada);
       return resumen.equals(firmadescifrada);
   }
    
    public static String descifrarTexto(String textoCifrado, int desplazamiento) {
    return cifrarTexto(textoCifrado, -desplazamiento);
}

public static String cifrarTexto(String texto, int desplazamiento) {
    StringBuilder resultado = new StringBuilder();
    String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    for (char caracter : texto.toCharArray()) {
        int indice = alfabeto.indexOf(caracter);
        
        if (indice != -1) {
            int nuevoIndice = (indice + desplazamiento) % alfabeto.length();
            if (nuevoIndice < 0) {
                nuevoIndice += alfabeto.length();
            }
            resultado.append(alfabeto.charAt(nuevoIndice));
        } else {
            resultado.append(caracter);
        }
    }

    return resultado.toString();
}


     
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Llave;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JComboBox cmbContactos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtHistorial;
    private javax.swing.JTextField txtMensaje;
    // End of variables declaration//GEN-END:variables
    
    private final String DEFAULT_PORT="10101";
      
    private final String DEFAULT_IP="127.0.0.1";
    
    private final Cliente cliente;
    
    void addContacto(String contacto) {
        cmbContactos.addItem(contacto);
    }
    
    void addMensaje(String emisor, String mensaje) {
        txtHistorial.append("##### "+emisor + " ##### : \n" + mensaje+"\n");
    }
    
    void sesionIniciada(String identificador) {
        this.setTitle(" --- "+identificador+" --- ");
    }
    
    private String[] getIP_Puerto_Nombre() {
        String s[]=new String[3];
        s[0]=DEFAULT_IP;
        s[1]=DEFAULT_PORT;
        JTextField ip = new JTextField(20);
        JTextField puerto = new JTextField(20);
        JTextField usuario = new JTextField(20);
        ip.setText(DEFAULT_IP);
        puerto.setText(DEFAULT_PORT);
        usuario.setText("Sebas");
        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(3, 2));
        myPanel.add(new JLabel("IP del Servidor:"));
        myPanel.add(ip);
        myPanel.add(new JLabel("Puerto para conexión:"));
        myPanel.add(puerto);
        myPanel.add(new JLabel("Escriba su nombre:"));
        myPanel.add(usuario);        
        int result = JOptionPane.showConfirmDialog(null, myPanel, 
                 "Configuraciones de la comunicación", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
                s[0]=ip.getText();
                s[1]=puerto.getText();
                s[2]=usuario.getText();
        }else{
            System.exit(0);
        }
        return s;
    }    
    
    void eliminarContacto(String identificador) {
        for (int i = 0; i < cmbContactos.getItemCount(); i++) {
            if(cmbContactos.getItemAt(i).toString().equals(identificador)){
                cmbContactos.removeItemAt(i);
                return;
            }
        }
    }
}
