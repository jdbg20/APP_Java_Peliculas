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
<<<<<<< HEAD
 * @author JESUS BARRIOS
=======
 * @author JESUS
>>>>>>> 6966dd7fd767c91a2b9ef8632c1d0aa9e0b929e2
 */
public class DetalleBoleto extends javax.swing.JFrame {

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
         txtboleto.setText(null);
         
         
     } 
    /**
     * Creates new form DetalleBoleto
     */
    public DetalleBoleto() {
        initComponents();
    }
    
    DefaultTableModel tabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int Fila, int Colum) {
            return false;
        }
    };
    
String dato[]= new String [6];
int click=0;
    public  void consulta(){
         try{
          con = getConection();   
          ps= (PreparedStatement) con.prepareStatement("SELECT * from detalleboleta");
          
            rs = ps.executeQuery();
            
            
            if(click==0){
                cargar();
               while(rs.next()){
                dato[0]=rs.getString("NroBoleta");
                dato[1]=rs.getString("idPelicula");
                dato[2]=rs.getString("precioAlquilado");
                dato[3]=rs.getString("devuelto");
                dato[4]=rs.getString("fechaDevolucion");
                dato[5]=rs.getString("diasMora");
                
                
                tabla.addRow(dato);
                }   
                
                click++;
                con.close();
            }else{
                JOptionPane.showMessageDialog(null,"Tabla Cargada");
                limpiarb();
            }
            
            
            
           
            
         
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }
    
  
    public  void cargar(){
    
        
        
        
        
        
        tabla.addColumn("N. BOLETA");
        tabla.addColumn("ID PELICULA");
        tabla.addColumn("PRECIO ALQUILADO");
        tabla.addColumn("DEVUELTO");
        tabla.addColumn("FECHA DE DEVOLUCIÓN");
        tabla.addColumn("DIAS DE MORA");
        this.jtclienteboleto.setModel(tabla);   
       
       
       
    
}
    
    public void limpiarb(){
      
      tabla.setColumnCount(0);
      tabla.setRowCount(0);
      click--;
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
        txtboleto = new javax.swing.JTextField();
        txtidpelicula = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        cbxdevuelto = new javax.swing.JComboBox<>();
        date = new com.toedter.calendar.JDateChooser();
        txtdia = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtclienteboleto = new javax.swing.JTable();
        btnconsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DETALLE BOLETO");

        jLabel2.setText("NroBoleto:");

        jLabel3.setText("IdPelicula:");

        jLabel4.setText("Precio Alquilado:");

        jLabel5.setText("Devuelto:");

        jLabel6.setText("Fecha De Devolución:");

        jLabel7.setText("Dias De Mora:");

        cbxdevuelto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleciona", "SI", "NO" }));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel8.setText("CLIENTES  CON BOLETOS ");

        jtclienteboleto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtclienteboleto.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jtclienteboleto);
        jtclienteboleto.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        btnconsulta.setText("Consultar");
        btnconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtboleto)
                                .addComponent(txtidpelicula)
                                .addComponent(txtprecio)
                                .addComponent(cbxdevuelto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(btnconsulta)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtboleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtidpelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxdevuelto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnRegistrar)
                .addGap(72, 72, 72)
                .addComponent(jLabel8)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnconsulta)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        try{
          con = getConection();   
          ps= (PreparedStatement) con.prepareStatement("INSERT INTO detalleboleta(NroBoleta,idPelicula,precioAlquilado,devuelto,fechaDevolucion,diasMora) VALUE(?,?,?,?,?,?)");
          ps.setString(1,txtboleto.getText());
          ps.setString(2,txtidpelicula.getText());
          ps.setInt(3,Integer.parseInt(txtprecio.getText()));
          ps.setString(4,cbxdevuelto.getSelectedItem().toString());
          ps.setDate(5,new java.sql.Date(date.getDate().getTime()));
          ps.setString(6,txtdia.getText());
          
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
            JOptionPane.showMessageDialog(null,"Cliente no se Encuentra Registrado");
            
        }   
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultaActionPerformed
        // TODO add your handling code here:
       
        
        
            
           
            consulta();
          
       
           
        
    }//GEN-LAST:event_btnconsultaActionPerformed

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
            java.util.logging.Logger.getLogger(DetalleBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleBoleto().setVisible(true);
               
              
            }
          
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnconsulta;
    private javax.swing.JComboBox<String> cbxdevuelto;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtclienteboleto;
    private javax.swing.JTextField txtboleto;
    private javax.swing.JTextField txtdia;
    private javax.swing.JTextField txtidpelicula;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
