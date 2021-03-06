/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pkgModel.clsDAOProduct;
import pkgModel.clsProduct;
import pkgView.frmLogin;
import pkgView.frmMenu;
import pkgView.frmProduct;
import pkgView.frmUsers;

/**
 *
 * @author thomy
 */
public class ctlMenu implements ActionListener {

    frmUsers vista_users;
    frmMenu vista_menu;

    public ctlMenu(frmMenu vista) {
        this.vista_menu = vista;
        this.vista_menu.getBtnLogout().addActionListener(this);
        this.vista_menu.getBtnUser().addActionListener(this);
        this.vista_menu.getBtnProducts().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "Users": {
                ctlUsers controller_user = new ctlUsers(new frmUsers());
                controller_user.show_frame();
            }
            case "Products": {
                ctlProduct controller_product = new ctlProduct(new clsDAOProduct(), new frmProduct());
                controller_product.show_frame();
                break;
            }
            case "Logout": {
                this.vista_menu.dispose();
                new ctlLogin(new frmLogin()).show_frame();
                break;
            }
        }
    }
    
    public void show_frame() {
        vista_menu.setVisible(true);
    }
}
