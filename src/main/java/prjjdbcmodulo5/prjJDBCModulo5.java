/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjjdbcmodulo5;

import pkgController.ctlLogin;
import pkgModel.clsDAOUser;
import pkgView.frmLogin;

/**
 *
 * @author thomy
 */
public class prjJDBCModulo5 {
    public static void main(String[] args) {
        frmLogin vista = new frmLogin();
        ctlLogin controlador = new ctlLogin(vista);
        vista.setVisible(true);
    }
}
