/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
//import Conexion.Conexion;
import Conexion.ConexionBD;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author Jiro
 */
public class VentanaTablaReportes extends VentanaControladaAbstract {

    /**
     * Creates new form VentanaTablaReportes
     */
    private DefaultTableModel modelo;
    Calendar c;
    public VentanaTablaReportes() {
        initComponents();
        this.modelo = new DefaultTableModel();
        this.c = Calendar.getInstance();
        this.modelo.setRowCount(0);
        this.jTable1.setEnabled(false);
        setLocationRelativeTo(null);
        this.btnBuscar.setVisible(false);
    /*
    
    this.lbl1.setVisible(false);
    this.lbl2.setVisible(false);
    this.lbl3.setVisible(false);
    this.lbl4.setVisible(false);
    this.lbl5.setVisible(false);
    this.lbl6.setVisible(false);
    this.txtfd1.setVisible(false);
    this.txtfd2.setVisible(false);
    this.txtfm1.setVisible(false);
    this.txtfm2.setVisible(false);
    this.txtfy1.setVisible(false);
    this.txtfy2.setVisible(false);
    
    */
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
        fechacompleta1 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fechacompleta2 = new javax.swing.JFormattedTextField();
        btnBuscar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Ingrese intervalo de fecha (dd/mm/yyyy)");

        fechacompleta1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        fechacompleta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechacompleta1KeyTyped(evt);
            }
        });

        jLabel2.setText("entre fecha:");

        jLabel3.setText("y fecha:");

        fechacompleta2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        fechacompleta2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechacompleta2KeyTyped(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechacompleta1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechacompleta2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(btnVolver)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fechacompleta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(fechacompleta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnVolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.fechacompleta1.setText(null);
        this.fechacompleta2.setText(null);
        this.superCtrl.muestraVentanaReportes(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        if (this.fechacompleta1.getText().length() < 1 || this.fechacompleta2.getText().length() < 1 ) {
      JOptionPane.showMessageDialog(this, "No puede dejar campos en blanco", "Alerta", 2);
    }
    else if (validafecha(this.fechacompleta1.getText()) && validafecha(this.fechacompleta2.getText()) && fecha(this.fechacompleta1.getText(), this.fechacompleta2.getText())) {
      try {
        this.modelo.setRowCount(0);
        PreparedStatement st = null;
        ResultSet rt = null;
        ConexionBD con = new ConexionBD();
        Connection cn = con.getConexion();
        String sql = "SELECT nombre_completo(id_paciente) as nombre,fecha_hora_pc FROM consultas NATURAL JOIN paciente where consultas.fecha_hora_pc BETWEEN to_date(?,'DD/MM/YY') and to_date(?,'DD/MM/YY')+1 order by fecha_hora_pc ASC";
        st = cn.prepareStatement(sql);
        st.setString(1, this.fechacompleta1.getText());
        st.setString(2, this.fechacompleta2.getText());
         // System.out.println("aqui1");
        rt = st.executeQuery();
         // System.out.println("aqui2");
        ResultSetMetaData rsMd = rt.getMetaData();
        int cantcolumnas = rsMd.getColumnCount();
         // System.out.println("aqui3");
         // System.out.println(cantcolumnas);
        while (rt.next()) {
           // System.out.println("aqui bucle1");
          Object[] filas = new Object[cantcolumnas];
           // System.out.println(filas);
          for (int i = 0; i < cantcolumnas; i++) {
              //System.out.println("aqui bucle2");
            filas[i] = rt.getObject(i + 1);
          }
            //System.out.println("aqui4");
          this.modelo.addRow(filas);
        } 
          //System.out.println("aqui5");
        this.jTable1.setModel(this.modelo);
      } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Ocurrio un error durante la consulta");
      } 
    } else if (!validafecha(this.fechacompleta1.getText())) {
      JOptionPane.showMessageDialog(this, "Ingrese fecha inicial valida", "Alerta", 2);
    } else if (!validafecha(this.fechacompleta2.getText())) {
      JOptionPane.showMessageDialog(this, "Ingrese fecha final valida", "Alerta", 2);
    } else if (!fecha(this.fechacompleta1.getText(), this.fechacompleta2.getText())) {
      JOptionPane.showMessageDialog(this, "Ingrese fecha inicial menor a la final", "Alerta", 2);
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void fechacompleta1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechacompleta1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || c=='/') {
            if (this.fechacompleta1.getText().length() < 10) {
                if (this.fechacompleta1.getText().length() == 2 && c!='/') {
                    this.fechacompleta1.setText(this.fechacompleta1.getText() + "/");
                } else if (this.fechacompleta1.getText().length() == 5&& c!='/') {
                    this.fechacompleta1.setText(this.fechacompleta1.getText() + "/");
                }
            } else if (this.fechacompleta1.getText().length() > 9) {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_fechacompleta1KeyTyped

    private void fechacompleta2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechacompleta2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)|| c=='/') {
            if (this.fechacompleta2.getText().length() < 10) {
                if (this.fechacompleta2.getText().length() == 2&& c!='/') {
                    this.fechacompleta2.setText(this.fechacompleta2.getText() + "/");
                } else if (this.fechacompleta2.getText().length() == 5&& c!='/') {
                    this.fechacompleta2.setText(this.fechacompleta2.getText() + "/");
                }
            } else if (this.fechacompleta2.getText().length() > 9) {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_fechacompleta2KeyTyped

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
            java.util.logging.Logger.getLogger(VentanaTablaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTablaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTablaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTablaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaTablaReportes().setVisible(true);
            }
        });
    }

private boolean validafecha(final String fecha) {
        String[] fecha2 = fecha.split("/");
        String dia = fecha2[0];
        String mes = fecha2[1];
        String annio = fecha2[2];
        System.out.println(dia);
        System.out.println(mes);
        System.out.println(annio);
        /*Date dt = new Date();
        int dia2 = dt.getDate();
        int mes2 = dt.getMonth() + 1;
        int annio2 = dt.getYear() + 1900;//*/
        final SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            formatoFecha.setLenient(false);
            formatoFecha.parse(dia + "/" + mes + "/" + annio);
            System.out.println("validafecha: fecha valida");
            return true;
        } catch (ParseException e) {
            System.out.println("validafecha: error al parcear fecha");
            return false;
        }/*
        if (Integer.parseInt(annio) <= annio2) {
            if (Integer.parseInt(annio) == annio2) {
                if (Integer.parseInt(mes) > mes2) {
                    System.out.println("validafecha: mes ingresado mayor al actual");
                    return false;
                }
                if (Integer.parseInt(dia) > dia2) {
                    System.out.println("validafecha: dia ingresado mayor al actual");
                    return false;
                }
            } else if (Integer.parseInt(annio) < annio2 - 100) {
                System.out.println("validafecha: año ingresado menor a 1900");
                return false;
            }
            System.out.println("validafecha: año ingresado menor al actual");
            return true;
        }
        return false;//*/
    }
private boolean fecha(String fecha1, String fecha2) {
    String[] fechaa = fecha1.split("/");
        String dia1 = fechaa[0];
        String mes1 = fechaa[1];
        String annio1 = fechaa[2];
    String[] fechab = fecha2.split("/");
        String dia2 = fechab[0];
        String mes2 = fechab[1];
        String annio2 = fechab[2];
    if (Integer.parseInt(annio1) <= Integer.parseInt(annio2)) {
      if (Integer.parseInt(annio1) == Integer.parseInt(annio2)) {
        if (Integer.parseInt(mes1) > Integer.parseInt(mes2)) {
            System.out.println("fecha: mes1 mayor al mes2");
            return false;
        }else if (Integer.parseInt(mes1) == Integer.parseInt(mes2)&&Integer.parseInt(dia1) > Integer.parseInt(dia2)) {
            System.out.println("fecha: mes1 igual al mes2 y dia1 mayor a dia2");
            return false;
        }
      } else if (Integer.parseInt(annio1) < Integer.parseInt(annio1) - 100 || Integer.parseInt(annio2) > Integer.parseInt(annio2) + 100) {
            System.out.println("fecha: jamas deberia entrar aqui");
            return false;
      } 
    } else {
        System.out.println("fecha: año1 mayor o igual al año2");
      return false;
    } 
    System.out.println("fecha: intervalo correcto");
    return true;
  }
public void paciente() {
    this.modelo.setColumnCount(0);
    this.jLabel1.setVisible(false);
    this.jLabel2.setVisible(false);
    this.jLabel3.setVisible(false);
    this.fechacompleta1.setVisible(false);
    this.fechacompleta2.setVisible(false);
    this.btnBuscar.setVisible(false);
    this.modelo.addColumn("Id");
    this.modelo.addColumn("Nombre");
    this.modelo.addColumn("Telefono");
    this.modelo.addColumn("Motivo de Visita");
    
    try {
      this.modelo.setRowCount(0);
      PreparedStatement st = null;
      ResultSet rt = null;
      ConexionBD con = new ConexionBD();
      Connection cn = con.getConexion();
      String sql = "SELECT id_paciente, nombre_completo(id_paciente) as nombre,tel,motivo_visita FROM cuestionario NATURAL JOIN paciente";
      st = cn.prepareStatement(sql);
      rt = st.executeQuery();
      
      ResultSetMetaData rsMd = rt.getMetaData();
      int cantcolumnas = rsMd.getColumnCount();
      
      while (rt.next()) {
        Object[] filas = new Object[cantcolumnas];
        for (int i = 0; i < cantcolumnas; i++) {
          filas[i] = rt.getObject(i + 1);
        }
        this.modelo.addRow(filas);
      } 
      
      this.jTable1.setModel(this.modelo);
      
      TableColumnModel columnModel = this.jTable1.getColumnModel();
      
      columnModel.getColumn(0).setPreferredWidth(15);
      columnModel.getColumn(1).setPreferredWidth(250);
      columnModel.getColumn(2).setPreferredWidth(50);
      columnModel.getColumn(3).setPreferredWidth(250);
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(this, "Ocurrio un error durante la consulta");
    } 
  }
  public void adeudo() {
    this.modelo.setColumnCount(0);
    this.jLabel1.setVisible(false);
    this.jLabel2.setVisible(false);
    this.jLabel3.setVisible(false);
    this.fechacompleta1.setVisible(false);
    this.fechacompleta2.setVisible(false);
    this.btnBuscar.setVisible(false);
    this.modelo.addColumn("Nombre");
    this.modelo.addColumn("Adeudo");
    try {
      this.modelo.setRowCount(0);
      PreparedStatement st = null;
      ResultSet rt = null;
      ConexionBD con = new ConexionBD();
      Connection cn = con.getConexion();
      String sql = "select nombre_completo(paciente.id_paciente) as nombre,SUM(consultas.adeudo) AS adeudo FROM consultas LEFT JOIN paciente on consultas.id_paciente = paciente.id_paciente GROUP BY paciente.id_paciente,nombre,adeudo having adeudo>0";
      st = cn.prepareStatement(sql);
      rt = st.executeQuery();
      
      ResultSetMetaData rsMd = rt.getMetaData();
      int cantcolumnas = rsMd.getColumnCount();
      
      while (rt.next()) {
        Object[] filas = new Object[cantcolumnas];
        for (int i = 0; i < cantcolumnas; i++) {
          filas[i] = rt.getObject(i + 1);
        }
        this.modelo.addRow(filas);
      } 
      this.jTable1.setModel(this.modelo);
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(this, "Ocurrio un error durante la consulta");
    } 
  }
  public void citas() {
    this.modelo.setColumnCount(0);
    this.jLabel1.setVisible(false);
    this.jLabel2.setVisible(false);
    this.jLabel3.setVisible(false);
    this.fechacompleta1.setVisible(false);
    this.fechacompleta2.setVisible(false);
    this.btnBuscar.setVisible(false);
    this.modelo.addColumn("Nombre");
    this.modelo.addColumn("Cita");
    try {
      this.modelo.setRowCount(0);
      PreparedStatement st = null;
      ResultSet rt = null;
      ConexionBD con = new ConexionBD();
      Connection cn = con.getConexion();
      String sql = "SELECT nombre_completo(id_paciente) as nombre,fecha_hora_pc FROM consultas NATURAL JOIN paciente where to_date(TO_CHAR(consultas.fecha_hora_pc,'DD/MM/YY'))>=current_date order by fecha_hora_pc ASC";
      st = cn.prepareStatement(sql);
      rt = st.executeQuery();
      
      ResultSetMetaData rsMd = rt.getMetaData();
      int cantcolumnas = rsMd.getColumnCount();
      
      while (rt.next()) {
        Object[] filas = new Object[cantcolumnas];
        for (int i = 0; i < cantcolumnas; i++) {
          filas[i] = rt.getObject(i + 1);
        }
        this.modelo.addRow(filas);
      } 
      this.jTable1.setModel(this.modelo);
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(this, "Ocurrio un error durante la consulta");
    } 
  }
  public void citasxfecha() {
    this.modelo.setColumnCount(0);
    this.modelo.setRowCount(0);
    this.jLabel1.setVisible(true);
    this.jLabel2.setVisible(true);
    this.jLabel3.setVisible(true);
    this.fechacompleta1.setVisible(true);
    this.fechacompleta2.setVisible(true);
    this.btnBuscar.setVisible(true);
    this.modelo.addColumn("Nombre");
    this.modelo.addColumn("Cita");
  }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JFormattedTextField fechacompleta1;
    private javax.swing.JFormattedTextField fechacompleta2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}