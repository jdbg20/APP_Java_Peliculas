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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JESUS
 */
public class informe extends javax.swing.JFrame {

public static final String URL="jdbc:mysql://localhost:3306/videotienda";
     public static final String USERNAME= "root";
     public static final String PASSWORD="";
     PreparedStatement ps,ps2;
     ResultSet rs; 
    private Connection con,con2;
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

    public informe() {
        initComponents();
    }

  DefaultTableModel tabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int Fila, int Colum) {
            return false;
        }
    };
   DefaultTableModel tabla2 = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int Fila, int Colum) {
            return false;
        }
    };
  public void limpiarP(){
      tabla.setRowCount(0);
      tabla.setColumnCount(0);
      click--;
  }
   public void limpiarC(){
      tabla2.setRowCount(0);
      tabla2.setColumnCount(0);
      click--;
  }
   
   
   
   
   
  public void cargarP(){
                tabla.addColumn("ID PELICUA");
                tabla.addColumn("TITULO");
                tabla.addColumn("TIPO");
                tabla.addColumn("CATEGORIA");
                tabla.addColumn("ACTOR PRINCIPAL");
                tabla.addColumn("PRECIO ACTUAL");
                tabla.addColumn("STOCK");
                tabla.addColumn("SALDO");
                this.jtpelicula.setModel(tabla);
  
                
  }
  public void cargarC(){
        tabla2.addColumn("ID CLIENTE");
        tabla2.addColumn("NOMBRE");
        tabla2.addColumn("PRIMER APELLIDO");
        tabla2.addColumn("SEGUND APELLIDO");
        tabla2.addColumn("DOCUMENTO");
        tabla2.addColumn("DIRECCIÓN");
        tabla2.addColumn("TELEFONO");
        tabla2.addColumn("CELULAR");
        this.jtcliente.setModel(tabla2);
    }
  String datos[] = new String[8];
  String datos2[] = new String[8];
  int click=0,clickc=0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtpelicula = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPelicula = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtcliente = new javax.swing.JTable();
        btncliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bntlimpiar = new javax.swing.JButton();
        bntlimpiar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtpelicula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtpelicula);

        jLabel1.setText("DETALLE DE PELICULA");

        jLabel2.setText("Filtrar:");

        btnPelicula.setText("Buscar");
        btnPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeliculaActionPerformed(evt);
            }
        });

        jtcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtcliente);

        btncliente.setText("Buscar");
        btncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclienteActionPerformed(evt);
            }
        });

        jLabel3.setText("LISTA DE CLIENTE");

        bntlimpiar.setText("Limpiar");
        bntlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntlimpiarActionPerformed(evt);
            }
        });

        bntlimpiar2.setText("Limpiar");
        bntlimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntlimpiar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(btncliente)
                        .addGap(29, 29, 29)
                        .addComponent(bntlimpiar2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPelicula)
                                .addGap(47, 47, 47)
                                .addComponent(bntlimpiar)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3))))
                .addContainerGap(358, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPelicula)
                    .addComponent(bntlimpiar)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncliente)
                    .addComponent(bntlimpiar2))
                .addContainerGap(186, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeliculaActionPerformed
               
        
        
        
       
       
        
        try{
            con = getConection();
           ps= (PreparedStatement) con.prepareStatement("SELECT * FROM pelicula"); 
           rs = ps.executeQuery();
           boolean b =true; 
           
              if(click==0){
            cargarP();
            click++;
        }else{
            JOptionPane.showMessageDialog(null,"La tabla esta cargada");
        }   
            
            while(rs.next()){
                datos[0]=rs.getString("idPelicula");
                datos[1]=rs.getString("titulo");
                datos[2]=rs.getString("tipo");
                datos[3]=rs.getString("categoria");
                datos[4]=rs.getString("actorPrincipal");
                datos[5]=rs.getString("precioActual");
                datos[6]=rs.getString("stock");
                datos[7]=rs.getString("saldo");
                tabla.addRow(datos);
                } 
            con.close();

        }catch(Exception a){
            JOptionPane.showMessageDialog(null, a);
        }
    }//GEN-LAST:event_btnPeliculaActionPerformed

    private void bntlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntlimpiarActionPerformed
        // TODO add your handling code here:
        
        
        limpiarP();
    }//GEN-LAST:event_bntlimpiarActionPerformed

    private void bntlimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntlimpiar2ActionPerformed
        limpiarC();
    }//GEN-LAST:event_bntlimpiar2ActionPerformed

    private void btnclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclienteActionPerformed
        
        
        
        
  
        
        try{
            con2 = getConection();
                ps2= (PreparedStatement) con2.prepareStatement("SELECT * FROM cliente"); 
           rs = ps2.executeQuery();
           
            if(clickc==0){
            cargarC();
            clickc++;
        }else{
            JOptionPane.showMessageDialog(null,"La tabla esta cargada");
        }   
           
           
           
            while(rs.next()){
                datos2[0]=rs.getString("idCliente");
                datos2[1]=rs.getString("nombre");
                datos2[2]=rs.getString("apellido1");
                datos2[3]=rs.getString("apellido2");
                datos2[4]=rs.getString("documento");
                datos2[5]=rs.getString("direccion");
                datos2[6]=rs.getString("telefono");
                datos2[7]=rs.getString("celular");
                tabla2.addRow(datos2);
                } 
            
con2.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnclienteActionPerformed

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
            java.util.logging.Logger.getLogger(informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new informe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntlimpiar;
    private javax.swing.JButton bntlimpiar2;
    private javax.swing.JButton btnPelicula;
    private javax.swing.JButton btncliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtcliente;
    private javax.swing.JTable jtpelicula;
    // End of variables declaration//GEN-END:variables
}
