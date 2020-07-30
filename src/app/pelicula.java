/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import static app.clientes.getConection;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author JESUS
 */
public class pelicula extends javax.swing.JFrame {
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
    public pelicula() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
     private void limpiar(){
         txtidpelicula.setText(null);
         txttitulo.setText(null);
         cbxtipo.setSelectedIndex(0);
         cbxcategoria.setSelectedIndex(0);
         txtactor.setText(null);
         txtprecio.setText(null);
         txtstock.setText(null);
         txtsaldo.setText(null);
     }
     
    
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
        txtidpelicula = new javax.swing.JTextField();
        txttitulo = new javax.swing.JTextField();
        txtactor = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        cbxtipo = new javax.swing.JComboBox<>();
        cbxcategoria = new javax.swing.JComboBox<>();
        txtstock = new javax.swing.JTextField();
        txtsaldo = new javax.swing.JTextField();
        btnRpelicula = new javax.swing.JButton();
        btnlimpiarp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REGISTRO DE PELICULA");

        jLabel2.setText("ID_PELICULA:");

        jLabel3.setText("TITULO:");

        jLabel4.setText("TIPO:");

        jLabel5.setText("CATEGORIA:");

        jLabel6.setText("ACTOR PRINCIPAL:");

        jLabel7.setText("PRECIO ACTUAL:");

        jLabel8.setText("STROCK:");

        jLabel9.setText("SALDO:");

        cbxtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Comedia", "Acción", "Terror", "" }));

        cbxcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Estreno", "Normal", "Clasico", "" }));

        btnRpelicula.setText("Registrar");
        btnRpelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRpeliculaActionPerformed(evt);
            }
        });

        btnlimpiarp.setText("limpiar");
        btnlimpiarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1)
                .addContainerGap(284, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRpelicula)
                        .addGap(26, 26, 26)
                        .addComponent(btnlimpiarp))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtidpelicula)
                        .addComponent(txttitulo)
                        .addComponent(txtactor)
                        .addComponent(txtprecio)
                        .addComponent(cbxtipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxcategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtstock, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addComponent(txtsaldo)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidpelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(cbxcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRpelicula)
                    .addComponent(btnlimpiarp))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRpeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRpeliculaActionPerformed
        // TODO add your handling code here:
        
         Connection con=null;
        
        
      
        try{
          con = getConection();   
          ps= (PreparedStatement) con.prepareStatement("INSERT INTO cliente(idPelicula,titulo,tipo,categoria,precioActual,stock,saldo) VALUE(?,?,?,?,?,?,?)");
          ps.setString(1,txtidpelicula.getText());
          ps.setString(2,txttitulo.getText());
          ps.setString(3,cbxtipo.getSelectedItem().toString());
          ps.setString(4,cbxcategoria.getSelectedItem().toString());
          ps.setString(5,txtactor.getText());
          ps.setInt(6,Integer.parseInt(txtprecio.getText()));
          ps.setInt(7,Integer.parseInt(txtstock.getText()));
          ps.setInt(8,Integer.parseInt(txtsaldo.getText()));
          
          int res=ps.executeUpdate();
          if(res>0){
              limpiar();
              JOptionPane.showMessageDialog(null,"Registro Existoso");
               con.close();
              
          }else{
               limpiar();
            JOptionPane.showMessageDialog(null,"Fallo en el Registro");
            con.close();
        }
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
        
        
        
    }//GEN-LAST:event_btnRpeliculaActionPerformed

    private void btnlimpiarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarpActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnlimpiarpActionPerformed

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
            java.util.logging.Logger.getLogger(pelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRpelicula;
    private javax.swing.JButton btnlimpiarp;
    private javax.swing.JComboBox<String> cbxcategoria;
    private javax.swing.JComboBox<String> cbxtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtactor;
    private javax.swing.JTextField txtidpelicula;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtsaldo;
    private javax.swing.JTextField txtstock;
    private javax.swing.JTextField txttitulo;
    // End of variables declaration//GEN-END:variables
}
