/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import pkgModel.clsDAOUser;
import pkgView.frmLogin;
import pkgView.frmMenu;

/**
 *
 * @author thomy
 */
public class ctlLogin implements ActionListener {

    clsDAOUser modelo;
    frmLogin vista;
    frmMenu menu;

    public ctlLogin(frmLogin vista) {
        this.modelo = new clsDAOUser();
        this.vista = vista;
        this.vista.getBtnLogin().addActionListener(this);
        this.vista.getBtnExit().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "Login": {
                modelo.getUser().setNickname(this.vista.getTxtNickname().getText());
                modelo.getUser().setPassword(this.vista.getTxtPassword().getText());
                if (modelo.val() == true) {
                    vista.setVisible(false);
                    ctlMenu controller_menu = new ctlMenu(new frmMenu());
                    new pkgModel.clsDAOLog(modelo.getUser().getNickname()).insert();
                    controller_menu.show_frame();
                } else {
                    JOptionPane.showMessageDialog(vista, "Invalid user.");
                }
                break;
            }
            case "Exit": {
                System.exit(0);
                break;
            }
        }
    }
    public void show_frame(){
        vista.setVisible(true);
    }
}
