/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModel;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author thomy
 */
public interface intConnection {
    public void LoadDriver();
    public ResultSet ProcessSQL(String SQL);
    public int ProcessIUDSQL(String SQL);
    public Connection getConnection();
}
