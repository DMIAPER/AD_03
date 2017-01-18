/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaropa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DRDRA
 */
public class Empleados extends javax.swing.JFrame {

    /**
     * Creates new form Empleados
     */
    public Empleados() {
        initComponents();
    }
    
    //Conexion a la base de datos ACCESS tienda de ropa
    private Connection Conexion(){
        //se crea una con objeto conexion
        Connection conex=null;
        
        try {
            //se indica el directorio de la base de datos
            String connectionUrl = "C:\\tareas\\tarea03\\tiendaropa.mdb";
            //Se obtine la conexión
            Connection con=DriverManager.getConnection("jdbc:ucanaccess://"+connectionUrl);
            conex = con;
        } catch (SQLException ex) {
            Logger.getLogger(AppTienda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //se comparte la conexion con el resto de la clase.
        return conex;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTNumero = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/application-exit.png"))); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRAR EMPLEADOS");

        jLabel2.setText("Nombre del empleado:");

        jTNombre.setText("Nombre y Apellidos");

        jLabel3.setText("Número de telefono:");

        jTNumero.setText("Número");

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTNombre)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 184, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //al pulsar el boton salir cierra la ventana
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //se registra el empleado. 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        //variable auxiliar
        int aux=0;
        
        //se obtienen los valores de los campos
        String nombre = jTNombre.getText();
        String numero = jTNumero.getText();
        
        //se comprueba que en el campo valor se obtenga un numero
        Pattern pat = Pattern.compile("\\D");
        Matcher mat = pat.matcher(numero);
       
        //si el campo es igual a Nombre y apellidos muestra un error
        if(nombre.equals("Nombre y Apellidos")){
            JOptionPane.showMessageDialog(null, "Debe introducir el nombre y apellidos para el empleado");
            aux=1;
        }
        
        //si el campo es igual a Numero o no continen numeros muestra un error
        if(numero.equals("Número")){
            JOptionPane.showMessageDialog(null, "Debe introducir un número de teléfono");
            aux=1;
        }else if(mat.matches()){
            JOptionPane.showMessageDialog(null, "Debe introducir un número de teléfono");
            aux=1;
        }
               
        //si hay errores en los campos muestra un mensaje, si no ejecuta el registro del empleado
        if(aux==1){
            JOptionPane.showMessageDialog(null, "Compruebe que ha rellenado los campos correctamente");
        }else{
            try{
                Connection con = this.Conexion();
                
                PreparedStatement sentencia;
                sentencia = con.prepareStatement("INSERT INTO empleados VALUES (?,?,?) ");
                
                int telefono = Integer.parseInt(numero);
                          
                sentencia.setInt(1,0);
                sentencia.setString(2,nombre);
                sentencia.setInt(3, telefono);
                
                sentencia.executeUpdate();
              
                JOptionPane.showMessageDialog(null, "Se ha registrado el nuevo empleado.");
                
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTNumero;
    // End of variables declaration//GEN-END:variables
}
