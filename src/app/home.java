/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author JESUS
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mboleto = new javax.swing.JMenu();
        Registropelicula = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menupelicula = new javax.swing.JMenuItem();
        menuboleto = new javax.swing.JMenuItem();
        ActualizarPelicula = new javax.swing.JMenuItem();
        Registrocliente = new javax.swing.JMenuItem();
        ActulizarCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Listaclientes = new javax.swing.JMenuItem();
        MostrarPeliculas = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("BIENVENIDO ");

        mboleto.setText("Archivo");
        mboleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mboletoActionPerformed(evt);
            }
        });

        Registropelicula.setText("Registrar Pelicula");
        Registropelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistropeliculaActionPerformed(evt);
            }
        });
        mboleto.add(Registropelicula);

        jMenu3.setText("Boleto");

        menupelicula.setText("Boleto Pelicula");
        menupelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menupeliculaActionPerformed(evt);
            }
        });
        jMenu3.add(menupelicula);

        menuboleto.setText("Detalle Boleto");
        menuboleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuboletoActionPerformed(evt);
            }
        });
        jMenu3.add(menuboleto);

        mboleto.add(jMenu3);

        ActualizarPelicula.setText("Actualizar  y Eliminar Pelicula");
        ActualizarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarPeliculaActionPerformed(evt);
            }
        });
        mboleto.add(ActualizarPelicula);

        Registrocliente.setText("Registrar Cliente");
        Registrocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroclienteActionPerformed(evt);
            }
        });
        mboleto.add(Registrocliente);

        ActulizarCliente.setText("Actulizar y Eliminar Cliente");
        ActulizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActulizarClienteActionPerformed(evt);
            }
        });
        mboleto.add(ActulizarCliente);

        jMenuBar1.add(mboleto);

        jMenu2.setText("Informe");

        Listaclientes.setText("Mostrar Clientes");
        jMenu2.add(Listaclientes);

        MostrarPeliculas.setText("Mostrar Peliculas");
        jMenu2.add(MostrarPeliculas);

        jMenuItem2.setText("Peliculas Alquiladas");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistropeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistropeliculaActionPerformed
        // TODO add your handling code here:
         pelicula r = new pelicula();
        r.setVisible(true);
       
        
    }//GEN-LAST:event_RegistropeliculaActionPerformed

    private void RegistroclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroclienteActionPerformed
        // TODO add your handling code here:
         clientes nuevocliente = new clientes();
        nuevocliente.setVisible(true);
    }//GEN-LAST:event_RegistroclienteActionPerformed

    private void ActualizarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarPeliculaActionPerformed
        // TODO add your handling code here:
        
        ActulizaP p= new ActulizaP();
        p.setVisible(true);
    }//GEN-LAST:event_ActualizarPeliculaActionPerformed

    private void ActulizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActulizarClienteActionPerformed
        // TODO add your handling code here:
        Aclientes a= new Aclientes();
        a.setVisible(true);
    }//GEN-LAST:event_ActulizarClienteActionPerformed

    private void mboletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mboletoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mboletoActionPerformed

    private void menupeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menupeliculaActionPerformed
AlquilarPelicula a = new AlquilarPelicula();
        a.setVisible(true);
    }//GEN-LAST:event_menupeliculaActionPerformed

    private void menuboletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuboletoActionPerformed
       DetalleBoleto d = new DetalleBoleto();
        d.setVisible(true);
    }//GEN-LAST:event_menuboletoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ActualizarPelicula;
    private javax.swing.JMenuItem ActulizarCliente;
    private javax.swing.JMenuItem Listaclientes;
    private javax.swing.JMenuItem MostrarPeliculas;
    private javax.swing.JMenuItem Registrocliente;
    private javax.swing.JMenuItem Registropelicula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu mboleto;
    private javax.swing.JMenuItem menuboleto;
    private javax.swing.JMenuItem menupelicula;
    // End of variables declaration//GEN-END:variables
}
