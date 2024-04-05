/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Conexion.ConexionBD;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.sql.CallableStatement;
/**
 *
 * @author Jiro
 */
public class buscar extends VentanaControladaAbstract {
    ConexionBD con;
    PreparedStatement st = null;
    private DefaultTableModel modelo = new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
               "ID", "Paciente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        }; 
        JPopupMenu popup;
        

    /**
     * Creates new form buscar
     */
    public buscar() {
        //this.modelo.addColumn("Nombre");
        //this.modelo.addColumn("Apellido");
        initComponents();
        setLocationRelativeTo(null);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);

        popup = new JPopupMenu();
        JMenuItem menuItem = new JMenuItem("Modificar");
        menuItem.addActionListener(this);
        popup.add( menuItem );
        JMenuItem menuItem2 = new JMenuItem("Eliminar");
        menuItem2.addActionListener(this);
        popup.add( menuItem2 );
        
        jTable1.addMouseListener( new MouseAdapter(){
            public void mousePressed(MouseEvent e)
            {
                //System.out.println("pressed");
            }

            public void mouseReleased(MouseEvent e)
            {
                if (e.isPopupTrigger())
                {
                    JTable source = (JTable)e.getSource();
                    int row = source.rowAtPoint( e.getPoint() );
                    int column = source.columnAtPoint( e.getPoint() );

                    if (! source.isRowSelected(row))
                        source.changeSelection(row, column, false, false);

                    popup.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        /*jTable1.setPreferredScrollableViewportSize(jTable1.getPreferredSize());
        getContentPane().add( new JScrollPane(jTable1) );//*/
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Modificar")) {
            System.out.println(e.getActionCommand());
            Component c = (Component) e.getSource();
            JPopupMenu popup = (JPopupMenu) c.getParent();
            JTable table = (JTable) popup.getInvoker();
            //System.out.println(table.getSelectedRow() + " : " + table.getSelectedColumn());
            String dato=String.valueOf(this.modelo.getValueAt(table.getSelectedRow(),0));
            System.out.println(dato);
            
            //this.superCtrl.muestraVentanaModificarPacientes(true);
            this.superCtrl.setClave(dato);
            this.limpiar();
            this.superCtrl.muestraVentanaModificarPacientes(false);
            
            
        } else if (e.getActionCommand().equals("Eliminar")) {
            System.out.println(e.getActionCommand());
            Component c = (Component) e.getSource();
            JPopupMenu popup = (JPopupMenu) c.getParent();
            JTable table = (JTable) popup.getInvoker();
            //System.out.println(table.getSelectedRow() + " : " + table.getSelectedColumn());
            String dato=String.valueOf(this.modelo.getValueAt(table.getSelectedRow(),0));
            System.out.println(dato);
            this.superCtrl.setClave(dato);
            if (JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar al paciente?\nSe eliminaran todos los registros donde aparezca este paciente\nESTA ACCION NO SE PUEDE DESHACER", "Alerta!", 0, 2) == 0) {
                this.con = new ConexionBD();
                final Connection cn = this.con.getConexion();
                //String sql = "DELETE FROM consultas WHERE id_paciente=?";
                String sql="{call paquetepaciente.delpaciente(?)}";
                
                try {
                    CallableStatement statement = cn.prepareCall(sql);
                    statement.setString(1, this.superCtrl.getClave());
                    boolean f;
                    f=statement.execute();
                    System.out.println(f);
                    //proc.setString(1, "lisa");
                    //cs.execute();
                    //(this.st = cn.prepareStatement(sql)).setString(1, this.superCtrl.getClave());
                    //this.st.executeQuery();
                    /*sql = "DELETE FROM cuestionario WHERE id_paciente=?";
                    (this.st = cn.prepareStatement(sql)).setString(1, this.superCtrl.getClave());
                    this.st.executeUpdate();
                    sql = "DELETE FROM paciente WHERE id_paciente=? ";
                    (this.st = cn.prepareStatement(sql)).setString(1, this.superCtrl.getClave());
                    this.st.executeUpdate();//*/
                    cn.close();
                    this.con.desconectar();
                    this.st.close();
                    this.limpiar();
                    JOptionPane.showMessageDialog(this, "Se ha eliminado con exito!", "Atencion", 1);
                    //this.superCtrl.muestraVentanaPacientes(true);
                }
                catch (HeadlessException | NumberFormatException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
                }
            }
        }

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar por nombre");

        jTable1.setModel(this.modelo);
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        final String sql = "SELECT id_paciente,nombre_completo(id_paciente) as nombre from paciente where upper(nombre) LIKE upper(?) or upper(apellidos) LIKE upper(?) order by id_paciente DESC";
        this.con = new ConexionBD();
        Connection cn = this.con.getConexion();
        st = null;
        ResultSet rt = null;
        

        ///*
        try {
            //System.out.println("1");
            this.modelo.setRowCount(0);
            //System.out.println("2");
            st = cn.prepareStatement(sql);
            //System.out.println("3");
            st.setString(1, "%"+this.jTextField1.getText()+"%");
            //System.out.println("4");
            st.setString(2,"%"+ this.jTextField1.getText()+"%");
            //System.out.println("5");
            //System.out.println(st.getParameterMetaData());
            rt = st.executeQuery();
            //System.out.println("6");
            ResultSetMetaData rsMd = rt.getMetaData();
            //System.out.println("7");
            int cantcolumnas = rsMd.getColumnCount();
            //System.out.println("8");
            //System.out.println(rsMd.getColumnCount());
            //System.out.println(rsMd.toString());
            //System.out.println(cantcolumnas);
            //System.out.println("aqui");
            int nfilas=0;
            while (rt.next()) {
                //System.out.println("1");
                Object[] filas = new Object[cantcolumnas];
                for (int i = 0; i < cantcolumnas; i++) {
                    filas[i] = rt.getObject(i + 1);
                    nfilas++;
                    //System.out.println(filas[i]);
                }
                //System.out.println("aqui2");
                this.modelo.addRow(filas);
            }
            if (nfilas>0){
                jTable1.changeSelection(0, 1, false, false);
            }
            //this.jTable1.setModel(this.modelo);
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            
            jTable1.getColumnModel().getColumn(1).sizeWidthToFit();
            
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            //jTable1.getColumnModel().getColumn(2).setResizable(false);
            //jTable1.setEnabled(false);

            

//*/
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error durante la consulta");
            e.printStackTrace();
        }
        //*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this.rootPane, "Ingrese solo letras", "Atenci�n", 1);
        }else if (Character.isLowerCase(validar)) {
            evt.setKeyChar(Character.toUpperCase(validar));
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.limpiar();
        this.superCtrl.muestraVentanaPacientes(true);
    }//GEN-LAST:event_jButton2ActionPerformed
private void limpiar() {
    this.modelo.setRowCount(0);
    this.jTextField1.setText(null);
    
  }
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
            java.util.logging.Logger.getLogger(buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
