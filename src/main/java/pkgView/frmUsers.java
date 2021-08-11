/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgView;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author thomy
 */
public class frmUsers extends javax.swing.JFrame {

    /**
     * Creates new form frmUsers
     */
    public frmUsers() {
        initComponents();
    }
    
    public JButton getBtnNew() {
        return btnNew;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public JButton getBtnClose() {
        return btnClose;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public JTextField getTxtNickname() {
        return txtNickname;
    }

    public JTextField getTxtPassword() {
        return txtPassword;
    }

    public JList getList() {
        return List;
    }

    public JButton getBtnGraph() {
        return btnGraph;
    }

    public JButton getBtnExport() {
        return btnExport;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        lblId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblNickname = new javax.swing.JLabel();
        txtNickname = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnGraph = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNew.setBackground(new java.awt.Color(244, 47, 99));
        btnNew.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setText("New");
        jPanel1.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 120, -1));

        btnSave.setBackground(new java.awt.Color(244, 47, 99));
        btnSave.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 120, -1));

        btnClose.setBackground(new java.awt.Color(244, 47, 99));
        btnClose.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("Close");
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 120, -1));

        List.setBackground(new java.awt.Color(32, 33, 35));
        List.setForeground(new java.awt.Color(51, 102, 204));
        jScrollPane1.setViewportView(List);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 3, 334, 530));

        lblId.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        lblId.setForeground(new java.awt.Color(51, 102, 204));
        lblId.setText("ID");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 80, -1));

        lblName.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        lblName.setForeground(new java.awt.Color(51, 102, 204));
        lblName.setText("Name");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 80, -1));

        txtId.setBackground(new java.awt.Color(32, 33, 35));
        txtId.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setBorder(null);
        txtId.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 220, -1));

        txtName.setBackground(new java.awt.Color(32, 33, 35));
        txtName.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        txtName.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 220, -1));

        lblNickname.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        lblNickname.setForeground(new java.awt.Color(51, 102, 204));
        lblNickname.setText("Nickname");
        jPanel1.add(lblNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 80, -1));

        txtNickname.setBackground(new java.awt.Color(32, 33, 35));
        txtNickname.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        txtNickname.setForeground(new java.awt.Color(255, 255, 255));
        txtNickname.setBorder(null);
        txtNickname.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 220, -1));

        lblPassword.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(51, 102, 204));
        lblPassword.setText("Password");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 80, -1));

        txtPassword.setBackground(new java.awt.Color(32, 33, 35));
        txtPassword.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 220, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 220, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 220, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 220, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 220, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/thomy/Google Drive/Training/2021/mision_tic_2022/c2_programacion_basica/c2-mision-tic-2022/semana2/reto2/informeReto2/misiontic.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        btnGraph.setBackground(new java.awt.Color(244, 47, 99));
        btnGraph.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        btnGraph.setForeground(new java.awt.Color(255, 255, 255));
        btnGraph.setText("Graph");
        jPanel1.add(btnGraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 120, -1));

        btnExport.setBackground(new java.awt.Color(244, 47, 99));
        btnExport.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setText("Export");
        jPanel1.add(btnExport, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnGraph;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
