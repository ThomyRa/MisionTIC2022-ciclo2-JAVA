/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import pkgModel.clsDAOUser;
import pkgModel.clsUser;
import pkgView.frmMenu;
import pkgView.frmUsers;

/**
 *
 * @author thomy
 */
public class ctlUsers implements ActionListener {

    clsDAOUser modelo;
    frmUsers vista_users;

    public ctlUsers(frmUsers vista) {
        this.modelo = new clsDAOUser();
        this.vista_users = vista;
        this.vista_users.getBtnNew().addActionListener(this);
        this.vista_users.getBtnSave().addActionListener(this);
        this.vista_users.getBtnClose().addActionListener(this);
        this.vista_users.getBtnGraph().addActionListener(this);
        this.vista_users.getBtnExport().addActionListener(this);

        this.vista_users.getjList().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list(evt);
            }
        });
        this.list();
    }

    public void list() {
        DefaultListModel<clsUser> dlm = new DefaultListModel();
        java.sql.ResultSet rs = modelo.select();
        try {
            while (rs.next()) {
                dlm.addElement(new clsUser(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch (Exception e) {
        }
        vista_users.getjList().setModel(dlm);
    }

    public void list(java.awt.event.MouseEvent evt) {
        clsUser result = (clsUser) this.vista_users.getjList().getSelectedValue();
        if (result instanceof clsUser) {
            vista_users.getTxtId().setText(result.getId());
            vista_users.getTxtName().setText(result.getName());
            vista_users.getTxtNickname().setText(result.getNickname());
            vista_users.getTxtPassword().setText(result.getPassword());
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "New": {
                vista_users.getTxtId().setText("");
                vista_users.getTxtName().setText("");
                vista_users.getTxtNickname().setText("");
                vista_users.getTxtPassword().setText("");
                break;
            }
            case "Save": {
                modelo.getUser().setId(vista_users.getTxtId().getText());
                modelo.getUser().setName(vista_users.getTxtName().getText());
                modelo.getUser().setNickname(vista_users.getTxtNickname().getText());
                modelo.getUser().setPassword(vista_users.getTxtPassword().getText());
                
                if(modelo.insert()) {
                    JOptionPane.showMessageDialog(vista_users, "The record was saved succesfully.");
                    this.list();
                }
                else{
                    JOptionPane.showMessageDialog(vista_users, "The record was not saved.");
                }
                break;
            }
            case "Graph": {
                String[] args = null;
                new pkgView.pkgraph.graphUsers().init(args);
                break;
            }
            case "Export": {
                modelo.getUser().setId(vista_users.getTxtId().getText());
                modelo.getUser().setName(vista_users.getTxtName().getText());
                modelo.getUser().setNickname(vista_users.getTxtNickname().getText());
                modelo.getUser().setPassword(vista_users.getTxtPassword().getText());
                
                new pkgModel.export.ExcelWriter().write(modelo.select());
                break;
            }
            case "Close": {
                this.vista_users.dispose();
                break;
            }
        }
    }

    public void show_frame() {
        vista_users.setVisible(true);
    }
}
