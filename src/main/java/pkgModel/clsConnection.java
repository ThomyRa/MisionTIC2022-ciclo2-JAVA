/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author thomy
 */
public final class clsConnection implements intConnection {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public clsConnection() {
        this.LoadDriver();
    }

    @Override
    public void LoadDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Error Driver:\n" + e.toString());
        }

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJDBCModulo5?user=thomy&password=thomy");

        } catch (Exception e) {
            System.out.println("Error Connection:\n" + e.toString());
        }

    }

    @Override
    public ResultSet ProcessSQL(String SQL) {
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);

            if (stmt.execute(SQL)) {
                rs = stmt.getResultSet();
            }
            return rs;
        } catch (Exception e) {
            System.out.println("Error Process SQL:\n" + e.toString());
        }
        return rs;
    }

    @Override
    public int ProcessIUDSQL(String SQL) {
        try {
            stmt = conn.createStatement();
            return stmt.executeUpdate(SQL);
        } catch (Exception e) {
            System.out.println("Error: processIUDSQL");
        }
        return 0;
    }

    @Override
    public Connection getConnection() {
        return this.conn;
    }

}
