/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModel;

import java.sql.ResultSet;

/**
 *
 * @author thomy
 */
public class clsDAOUser {

    private clsConnection conn;
    private clsUser user;

    public clsDAOUser() {
        conn = new clsConnection();
        user = new clsUser();
    }

    public boolean val() {
        try {
            String SQL = "SELECT * FROM tb_user WHERE nickname='" + user.getNickname() + "' AND password='" + user.getPassword() + "'";
            ResultSet rs = null;
            rs = conn.ProcessSQL(SQL);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public ResultSet select() {
        try {
            String SQL = "SELECT * FROM tb_user";
            return getConn().ProcessSQL(SQL);
        } catch (Exception e) {
            System.out.println("Error: select");
        }
        return null;
    }

    public ResultSet select(String id) {
        try {
            String SQL = "SELECT * FROM tb_user WHERE id = '"+getUser().getId()+ "'";
            ResultSet rs = getConn().ProcessSQL(SQL);
            if (rs.next()) {
                return rs;
            }
        } catch (Exception e) {
            System.out.println("Error: select");
        }
        return null;
    }
    
    public boolean insert_user() {
        if (this.select(getUser().getId()) == null) {
            return this.insert();
        }
        else {
            return this.update();
        }
    }
    
    public boolean insert() {
        String SQL = "INSERT INTO tb_user VALUES ('"+getUser().getId()+"', '"+getUser().getName()+"', '"+getUser().getNickname()+"', '"+getUser().getPassword()+"')";
        if (getConn().ProcessIUDSQL(SQL) == 0) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public boolean update() {
        String SQL = "UPDATE tb_user SET name='"+getUser().getName()+"', nickname='"+getUser().getNickname()+"', password='"+getUser().getPassword()+"' WHERE id='"+getUser().getId()+"'";
        if (getConn().ProcessIUDSQL(SQL) == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public clsConnection getConn() {
        return conn;
    }

    public void setConn(clsConnection conn) {
        this.conn = conn;
    }

    public clsUser getUser() {
        return user;
    }

    public void setUser(clsUser user) {
        this.user = user;
    }
}
