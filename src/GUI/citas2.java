/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.EventQueue;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;
import java.awt.LayoutManager;
import javax.swing.GroupLayout;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.util.Calendar;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Conexion.ConexionBD;
import java.util.Date;
/**
 *
 * @author Jiro
 */
public class citas2 extends VentanaControladaAbstract {
    private ConexionBD con;
    private PreparedStatement st;
    private ResultSet rt;
    private int g;
    private int res;
    private int last;
    private int id_c=0;
    private Calendar c = Calendar.getInstance();

    /**
     * Creates new form citas2
     */
    public citas2() {
        
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orgDental = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        diagnostico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        costo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        anticipo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        adeudo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fecha_actual = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        hora = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        proxcita = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        orgDental.setModel(new DefaultComboBoxModel(new String[] { "N/A", "INCISIVO CENTRAL",
            "INCISIVO LATERAL",
            "CANINO",
            "PRIMER PREMOLAR",
            "SEGUNDO PREMOLAR",
            "PRIMER MOLAR",
            "SEGUNDO MOLAR",
            "TERCER MOLAR"}));
orgDental.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        orgDentalActionPerformed(evt);
    }
    });

    jLabel1.setText("Organo dental:");

    jLabel2.setText("Diagnostico:");

    diagnostico.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            diagnosticoActionPerformed(evt);
        }
    });
    diagnostico.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            diagnosticoKeyTyped(evt);
        }
    });

    jLabel3.setText("Costo:");

    costo.setText("0");
    costo.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            costoFocusLost(evt);
        }
    });
    costo.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            costoKeyTyped(evt);
        }
    });

    jLabel4.setText("Anticipo:");

    anticipo.setText("0");
    anticipo.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            anticipoFocusLost(evt);
        }
    });
    anticipo.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            anticipoKeyTyped(evt);
        }
    });

    jLabel5.setText("Adeudo:");

    adeudo.setText("0");

    jLabel7.setText("Fecha de creacion:");

    fecha_actual.setText("22/05/22");

    jLabel9.setText("Proxima cita:");

    jLabel10.setText("Ej. 26/01/2022");

    jLabel11.setText("Hora:");

    hora.setModel(new javax.swing.SpinnerNumberModel(9, 9, 17, 1));
    hora.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            horaKeyTyped(evt);
        }
    });

    jLabel12.setText("Hrs.");

    proxcita.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
    proxcita.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            proxcitaFocusLost(evt);
        }
    });
    proxcita.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            proxcitaKeyTyped(evt);
        }
    });

    jButton1.setText("Regresar");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    jButton2.setText("Crear");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    jLabel13.setText("Paciente:");

    jLabel14.setText("Victor Manuel Jimenez Rosas//");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jButton1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addContainerGap())
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(jLabel9)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7))
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(adeudo)
                                .addComponent(anticipo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel12))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(proxcita, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10))
                                .addComponent(fecha_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel13)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel14))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(orgDental, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGap(83, 83, Short.MAX_VALUE))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(13, 13, 13)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13)
                .addComponent(jLabel14))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(orgDental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(anticipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(adeudo))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(fecha_actual))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9)
                .addComponent(jLabel10)
                .addComponent(proxcita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel11)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel12))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1)
                .addComponent(jButton2))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orgDentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgDentalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgDentalActionPerformed

    private void diagnosticoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diagnosticoKeyTyped
        // TODO add your handling code here:
         if (this.diagnostico.getText().length() >=49) {
             evt.consume();
         }
    }//GEN-LAST:event_diagnosticoKeyTyped

    private void proxcitaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_proxcitaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_proxcitaFocusLost

    private void proxcitaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proxcitaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)||c=='/') {
            if (this.proxcita.getText().length() < 10) {
                if (this.proxcita.getText().length() == 2&& c!='/') {
                    this.proxcita.setText(this.proxcita.getText() + "/");
                } else if (this.proxcita.getText().length() == 5&& c!='/') {
                    this.proxcita.setText(this.proxcita.getText() + "/");
                }
            } else if (this.proxcita.getText().length() > 9) {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_proxcitaKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.con = new ConexionBD();
        Connection cn = this.con.getConexion();
        System.out.println(evt.getActionCommand());
        if ("agregar".equals(evt.getActionCommand())) {
            if((int)this.hora.getValue()<9||(int)this.hora.getValue()>17||this.proxcita.getText().length()<10||this.anticipo.getText().length()<1||this.costo.getText().length()<1||this.diagnostico.getText().length()<1||this.orgDental.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(this, "No puede dejar campos en blanco", "Alerta", 2);
            }else if (Integer.parseInt(this.costo.getText())-Integer.parseInt(this.anticipo.getText())<0){
                JOptionPane.showMessageDialog(this, "El anticipo no puede ser mayor al costo", "Alerta", 2);
            }else{
                try{
                     String sql ="select org_dental from consultas where fecha_hora_pc=to_date(?,'DD/MM/YYYY HH')";
                     (this.st = cn.prepareStatement(sql)).setString(1,this.proxcita.getText()+" "+(int)this.hora.getValue());
                     rt = st.executeQuery();
                if (rt.next()) {
                    if (rt.getString("org_dental") != null) {
                        JOptionPane.showMessageDialog(this, "Ya existe una cita en ese dia y hora señalada");
                    }else{
                        sql = "insert into consultas(id_paciente,org_dental,fecha_hora_actual,diagnostico,costo,anticipo,adeudo,fecha_hora_pc) values(?,?,to_date(?,'DD/MM/YYYY'),?,?,?,?,to_date(?,'DD/MM/YYYY HH'))";
                        (this.st = cn.prepareStatement(sql)).setString(1, this.superCtrl.getClave());
                        this.st.setString(2, this.orgDental.getSelectedItem().toString());
                        this.st.setString(3, this.fecha_actual.getText());
                        this.st.setString(4, this.diagnostico.getText());
                        this.st.setInt(5,Integer.parseInt(this.costo.getText()));
                        this.st.setInt(6,Integer.parseInt(this.anticipo.getText()));
                        this.st.setInt(7,Integer.parseInt(this.adeudo.getText()));
                        this.st.setString(8,this.proxcita.getText()+" "+(int)this.hora.getValue());
                        this.st.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Se creo", "Atenci\u00f3n", 1);
                        limpiar();
                        this.superCtrl.muestraVentanaCitas(true);
                    }
                }else{
                        sql = "insert into consultas(id_paciente,org_dental,fecha_hora_actual,diagnostico,costo,anticipo,adeudo,fecha_hora_pc) values(?,?,to_date(?,'DD/MM/YYYY'),?,?,?,?,to_date(?,'DD/MM/YYYY HH'))";
                        (this.st = cn.prepareStatement(sql)).setString(1, this.superCtrl.getClave());
                        this.st.setString(2, this.orgDental.getSelectedItem().toString());
                        this.st.setString(3, this.fecha_actual.getText());
                        this.st.setString(4, this.diagnostico.getText());
                        this.st.setInt(5,Integer.parseInt(this.costo.getText()));
                        this.st.setInt(6,Integer.parseInt(this.anticipo.getText()));
                        this.st.setInt(7,Integer.parseInt(this.adeudo.getText()));
                        this.st.setString(8,this.proxcita.getText()+" "+(int)this.hora.getValue());
                        this.st.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Se creo", "Atenci\u00f3n", 1);
                        limpiar();
                        this.superCtrl.muestraVentanaCitas(true);
                    }
                     
                }catch(HeadlessException | NumberFormatException | SQLException ex4){
                    JOptionPane.showMessageDialog(null, ex4.getMessage(), "Error", 0);
                    JOptionPane.showMessageDialog(this, "Ocurrio un error al crear");
                }
            }
            
        }else if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea modificar?\nESTA ACCION NO SE PUEDE DESHACER", "Alerta!", 0, 2) == 0) {
            if((int)this.hora.getValue()<9||(int)this.hora.getValue()>17||this.proxcita.getText().length()<10||this.anticipo.getText().length()<1||this.costo.getText().length()<1||this.diagnostico.getText().length()<1||this.orgDental.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(this, "No puede dejar campos en blanco", "Alerta", 2);
            }else if (Integer.parseInt(this.costo.getText())-Integer.parseInt(this.anticipo.getText())<0){
                JOptionPane.showMessageDialog(this, "El anticipo no puede ser mayor al costo", "Alerta", 2);
            }else{
                try{
                    String sql ="select id_paciente from consultas where fecha_hora_pc=to_date(?,'DD/MM/YYYY HH')";
                     (this.st = cn.prepareStatement(sql)).setString(1,this.proxcita.getText()+" "+(int)this.hora.getValue());
                     rt = st.executeQuery();
                if (rt.next()) {
                    if ( !this.superCtrl.getClave().equals(rt.getInt("id_paciente")+"")) {//
                        JOptionPane.showMessageDialog(this, "Ya existe una cita en ese dia y hora señalada");
                    }else{
                        sql = "UPDATE consultas SET org_dental=?,diagnostico=?,costo=?,anticipo=?,adeudo=?,fecha_hora_pc=to_date(?,'DD/MM/YYYY HH')  where id_consulta=?";
                        (this.st = cn.prepareStatement(sql)).setString(1, this.orgDental.getSelectedItem().toString());
                        this.st.setString(2, this.diagnostico.getText());
                        this.st.setInt(3,Integer.parseInt(this.costo.getText()));
                        this.st.setInt(4,Integer.parseInt(this.anticipo.getText()));
                        this.st.setInt(5,Integer.parseInt(this.adeudo.getText()));
                        this.st.setString(6,this.proxcita.getText()+" "+(int)this.hora.getValue());
                        this.st.setString(7, this.id_c+"");
                        this.st.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Se modifico", "Atenci\u00f3n", 1);
                        limpiar();
                        this.superCtrl.muestraVentanaCitas(true);
                    }
                }else{
                        sql = "UPDATE consultas SET org_dental=?,diagnostico=?,costo=?,anticipo=?,adeudo=?,fecha_hora_pc=to_date(?,'DD/MM/YYYY HH')  where id_consulta=?";
                        (this.st = cn.prepareStatement(sql)).setString(1, this.orgDental.getSelectedItem().toString());
                        this.st.setString(2, this.diagnostico.getText());
                        this.st.setInt(3,Integer.parseInt(this.costo.getText()));
                        this.st.setInt(4,Integer.parseInt(this.anticipo.getText()));
                        this.st.setInt(5,Integer.parseInt(this.adeudo.getText()));
                        this.st.setString(6,this.proxcita.getText()+" "+(int)this.hora.getValue());
                        this.st.setString(7, this.id_c+"");
                        this.st.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Se modifico", "Atenci\u00f3n", 1);
                        limpiar();
                        this.superCtrl.muestraVentanaCitas(true);
                    }
                
                }catch(HeadlessException | NumberFormatException | SQLException ex4){
                    JOptionPane.showMessageDialog(null, ex4.getMessage(), "Error", 0);
                    JOptionPane.showMessageDialog(this, "ocurrio un error al modificar");
                }
            }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void anticipoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_anticipoFocusLost
        // TODO add your handling code here:
        if (this.anticipo.getText().length()<1) {
            this.anticipo.setText("0");
        }else{
            if(Integer.parseInt(this.costo.getText())-Integer.parseInt(this.anticipo.getText())<=0){
                this.adeudo.setText("0");
            }else{
                this.adeudo.setText(Integer.parseInt(this.costo.getText())-Integer.parseInt(this.anticipo.getText())+"");
            }
        }
        
    }//GEN-LAST:event_anticipoFocusLost

    private void costoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_costoKeyTyped

    private void anticipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anticipoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_anticipoKeyTyped

    private void costoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_costoFocusLost
        // TODO add your handling code here:
        if (this.costo.getText().length()<1) {
            this.costo.setText("0");
        }else{
            if(Integer.parseInt(this.costo.getText())-Integer.parseInt(this.anticipo.getText())<=0){
                this.adeudo.setText("0");
            }else{
                this.adeudo.setText(Integer.parseInt(this.costo.getText())-Integer.parseInt(this.anticipo.getText())+"");
            }
        }
    }//GEN-LAST:event_costoFocusLost

    private void horaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_horaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_horaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limpiar();
        this.superCtrl.muestraVentanaCitas(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void diagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diagnosticoActionPerformed

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
            java.util.logging.Logger.getLogger(citas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(citas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(citas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(citas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new citas2().setVisible(true);
            }
        });*/
        try {
            for (final UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(citas2.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            Logger.getLogger(citas2.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            Logger.getLogger(citas2.class.getName()).log(Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            Logger.getLogger(citas2.class.getName()).log(Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new citas2().setVisible(true);
            }
        });
    }
  @Override
    public void actionPerformed(ActionEvent e) {}
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adeudo;
    private javax.swing.JTextField anticipo;
    private javax.swing.JTextField costo;
    private javax.swing.JTextField diagnostico;
    private javax.swing.JLabel fecha_actual;
    private javax.swing.JSpinner hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> orgDental;
    private javax.swing.JFormattedTextField proxcita;
    // End of variables declaration//GEN-END:variables


    public void modificar() {
        limpiar();
        this.jButton2.setText("Modificar");
        this.jButton2.setActionCommand("modificar");
        try {
            this.con = new ConexionBD();
            final Connection cn = this.con.getConexion();
            String sql = "SELECT nombre_completo(id_paciente) as nombre from paciente where id_paciente=? and rownum=1 order by id_paciente DESC";
            //SELECT * from paciente where id_paciente=? and rownum=1 order by id_paciente DESC
            (this.st = cn.prepareStatement(sql)).setString(1, this.superCtrl.getClave());
            this.rt = this.st.executeQuery();
            if (this.rt.next()) {
                this.jLabel14.setText(this.rt.getString("nombre"));
            }
            sql = "SELECT id_consulta,id_paciente,org_dental,to_char(consultas.fecha_hora_actual,'dd/MM/yyyy') as fecha_actual,diagnostico,costo,anticipo,adeudo,to_char(consultas.fecha_hora_pc,'dd/MM/yyyy') as fecha_pc,to_char(consultas.fecha_hora_pc,'HH') as hora_pc from consultas where id_paciente=? and rownum=1 order by id_paciente DESC";
            (this.st = cn.prepareStatement(sql)).setString(1, this.superCtrl.getClave());
             this.rt = this.st.executeQuery();
            if (this.rt.next()) {
                this.id_c=this.rt.getInt("id_consulta");
                this.superCtrl.setClave(this.rt.getString("id_paciente"));
                this.orgDental.setSelectedItem(this.rt.getString("org_dental"));
                this.diagnostico.setText(this.rt.getString("diagnostico"));
                this.costo.setText(this.rt.getInt("costo")+"");
                this.anticipo.setText(this.rt.getInt("anticipo")+"");
                this.adeudo.setText(this.rt.getInt("adeudo")+"");
                this.fecha_actual.setText(this.rt.getString("fecha_actual")+"");
                this.proxcita.setText(this.rt.getString("fecha_pc"));
                this.hora.setValue(Integer.parseInt(this.rt.getString("hora_pc")));
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error durante la consulta", "Alerta", 2);
            e.printStackTrace();
        }
    }
    private boolean validafecha(final String fecha) {
        String[] fecha2 = fecha.split("/");
        String dia = fecha2[0];
        String mes = fecha2[1];
        String annio = fecha2[2];
        System.out.println(dia);
        System.out.println(mes);
        System.out.println(annio);
        final SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            formatoFecha.setLenient(false);
            formatoFecha.parse(dia + "/" + mes + "/" + annio);
            System.out.println("validafecha: fecha valida");
            return true;
        } catch (ParseException e) {
            System.out.println("validafecha: error al parcear fecha");
            return false;
        }
    }
    public void agregar() {
        limpiar();
        Date now = new Date(System.currentTimeMillis());
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat hour = new SimpleDateFormat("HH:mm:ss");
        this.fecha_actual.setText(date.format(now));
        try {
            this.con = new ConexionBD();
            final Connection cn = this.con.getConexion();
            final String sql = "SELECT nombre_completo(id_paciente) as nombre from paciente where id_paciente=? and rownum=1 order by id_paciente DESC";
            //SELECT * from paciente where id_paciente=? and rownum=1 order by id_paciente DESC
            (this.st = cn.prepareStatement(sql)).setString(1, this.superCtrl.getClave());
            this.rt = this.st.executeQuery();
            if (this.rt.next()) {
                this.jLabel14.setText(this.rt.getString("nombre"));
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error durante la consulta", "Alerta", 2);
        }
        this.jButton2.setText("Agregar");
        this.jButton2.setActionCommand("agregar");
    }
    private void limpiar(){
        this.jLabel14.setText(null);
        this.orgDental.setSelectedItem(null);
        this.diagnostico.setText(null);
        this.costo.setText("0");
        this.anticipo.setText("0");
        this.adeudo.setText("0");
        this.fecha_actual.setText(null);
        this.proxcita.setText(null);
        this.hora.setValue(9);
    }
}
