/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModel;

import java.sql.ResultSet;
import java.util.ArrayList;
import javafx.scene.chart.PieChart;
import javax.swing.UIManager;

/**
 *
 * @author thomy
 */
public class clsDAOLog {

    private clsConnection conn;
    private clsLog log;

    public clsDAOLog() {
        conn = new clsConnection();
    }

    public clsDAOLog(String nickname) {
        conn = new clsConnection();
        this.log = new clsLog(nickname);
    }
    
    public ArrayList statistics() {
        ArrayList list = new ArrayList();
        ResultSet rs = select();
        try {
            while(rs.next()){
                list.add(new PieChart.Data(rs.getString(2), Double.parseDouble(rs.getString(1))));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public ResultSet select() {
        try {
            String SQL = "SELECT COUNT(nickname), nickname FROM tb_log GROUP BY nickname";
            return getConn().ProcessSQL(SQL);
        } catch (Exception e) {
            System.out.println("Error: select" + e.toString());
        }
        return null;
    }

    public boolean insert() {
        String SQL = "INSERT INTO tb_log VALUES (default, '" + log.getNickname() + "', CURDATE(), CURTIME())";
        if (getConn().ProcessIUDSQL(SQL) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public clsConnection getConn() {
        return conn;
    }

    public void setConn(clsConnection conn) {
        this.conn = conn;
    }
/*
    public clsLog getLog() {
        return log;
    }

    public void setLog(clsLog log) {
        this.log = log;
    }
*/
}
