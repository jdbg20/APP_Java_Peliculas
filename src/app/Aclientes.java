/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author JESUS BARRIOS
 */
public class Aclientes extends javax.swing.JFrame {
public static final String URL="jdbc:mysql://localhost:3306/videotienda";
     public static final String USERNAME= "root";
     public static final String PASSWORD="";
     PreparedStatement ps;
     ResultSet rs; 
    private Connection con;
     public static Connection getConection(){
        Connection con =null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
           con= (Connection) DriverManager.getConnection(URL, USERNAME,PASSWORD);
          // JOptionPane.showMessageDialog(null,"Conexion exitosa");
        }catch(Exception e){
            System.out.println(e);
            
        }
        return con;
    }
     
     private void limpiar(){
         txtidcliente.setText(null);
         txtnombres.setText(null);
         txtpapellido.setText(null);
         txtsapellido.setText(null);
         txtdocumento.setText(null);
         txtdireccion.setText(null);
         txttelefono.setText(null);
         txtcelular.setText(null);
         
     } 
    
    public Aclientes() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtidcliente = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtpapellido = new javax.swing.JTextField();
        txtsapellido = new javax.swing.JTextField();
        txtdocumento = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        btnActulizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ACTULIZAR CLIENTE");

        jLabel2.setText("ID_CLIENTE:");

        jLabel3.setText("NOMBRES:");

        jLabel4.setText("PRIMER APELLIDO:");

        jLabel5.setText("DIRECCION:");

        jLabel6.setText("SEGUNDO APELLIDO:");

        jLabel7.setText("DOCUMENTO:");

        jLabel8.setText("TELEFONO:");

        jLabel9.setText("CELULAR:");

        btnActulizar.setText("Actulizar");
        btnActulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActulizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(153, 153, 153)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtidcliente)
                                    .addComponent(txtnombres)
                                    .addComponent(txtpapellido)
                                    .addComponent(txtsapellido)
                                    .addComponent(txtdocumento)
                                    .addComponent(txtdireccion)
                                    .addComponent(txttelefono)
                                    .addComponent(txtcelular, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnActulizar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)))
                        .addGap(36, 36, 36)
                        .addComponent(btnbuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLabel1)))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtpapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtsapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActulizar)
                    .addComponent(btnEliminar))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActulizarActionPerformed
          
        
        
        try{
          con = getConection();   
          ps= (PreparedStatement) con.prepareStatement("UPDATE cliente  SET nombre =?, apellido1=?,apellido2=?,documento=?,direccion=?,telefono=?,celular=?  WHERE idCliente=?  ");
          ps.setString(8,txtidcliente.getText());
          ps.setString(1,txtnombres.getText());
         ps.setString(2,txtpapellido.getText());
         ps.setString(3,txtsapellido.getText());
          ps.setInt(4,Integer.parseInt(txtdocumento.getText()));
          ps.setString(5,txtdireccion.getText());
          ps.setString(6,txttelefono.getText());
          ps.setString(7,txtcelular.getText());
          
          int res=ps.executeUpdate();
            
                      
          if(res>0){
              limpiar();
              JOptionPane.showMessageDialog(null,"Registro Actulizado");
               con.close();
              
          }else{
               limpiar();
            JOptionPane.showMessageDialog(null,"Fallo en el Registro");
            con.close();
        }
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Su Documento de Identificacion ya esta Registrado. ");
        }   
        
    }//GEN-LAST:event_btnActulizarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        
         try{
          con = getConection();   
          ps= (PreparedStatement) con.prepareStatement("SELECT * FROM cliente WHERE idCliente= ? ");
          ps.setString(1,txtidcliente.getText());
            rs = ps.executeQuery();
          if(rs.next()){
          
        txtidcliente.setText(rs.getString("idCliente"));
        txtnombres.setText(rs.getString("nombre"));
        txtpapellido.setText(rs.getString("apellido1"));
        txtsapellido.setText(rs.getString("apellido2"));
        txtdocumento.setText( rs.getString("documento"));
        txtdireccion.setText(rs.getString("direccion"));
        txttelefono.setText(rs.getString("telefono"));
        txtcelular.setText(rs.getString("telefono"));
          
          
          
          
          }else{
             limpiar();
            JOptionPane.showMessageDialog(null,"No existe el cliente");
 
          }
          
          
         
         
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
         try{
          con = getConection();   
          ps= (PreparedStatement) con.prepareStatement("DELETE FROM cliente WHERE idCliente=? ");
          ps.setString(1,txtidcliente.getText());
       
          
          int res=ps.executeUpdate();
            
                      
          if(res>0){
              limpiar();
              JOptionPane.showMessageDialog(null,"Registro Eliminado");
               con.close();
              
          }else{
               limpiar();
            JOptionPane.showMessageDialog(null,"No se encuentra el Registro");
            con.close();
        }
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Su Documento de Identificacion ya esta Registrado. ");
        }   
        
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Aclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aclientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActulizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtpapellido;
    private javax.swing.JTextField txtsapellido;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
