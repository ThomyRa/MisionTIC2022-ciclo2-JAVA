/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModel;

import java.sql.ResultSet;
import java.util.ArrayList;
import javafx.scene.chart.PieChart;
import javax.swing.JOptionPane;

/**
 *
 * @author thomy
 */
public class clsDAOProduct {
    
    private clsConnection conn;
    private clsProduct product;

    public clsDAOProduct() {
        conn = new clsConnection();
        product = new clsProduct();
    }
    
    public ResultSet select() {
        try {
            String SQL = "SELECT * FROM tb_product";
            return getConn().ProcessSQL(SQL);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: Insert." + e.toString());
        }
        return null;
    }
    
    public ResultSet select(int id) {
        try {
            String SQL = "SELECT * FROM tb_product WHERE ID = '" + product.getId() + "'";
            ResultSet rs = getConn().ProcessSQL(SQL);
            if (rs.next()) {
                return rs;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Select ID" + e.toString());
        }
        return null;
    }
    
    public boolean insertProduct() {
        if (this.select(getProduct().getId()) == null) {
            return this.insert();
        }
        else {
            return this.update();
        }
    }
    
    public boolean insert() {
        String SQL = "INSERT INTO tb_product VALUES (default, '" + product.getDescription() + "', '" + product.getCost() + "', '" + product.getPrice() + "')";
        if (getConn().ProcessIUDSQL(SQL) == 0) {
            return false;
        }
        return true;
    }
    
    public boolean update() {
        String SQL = "UPDATE tb_product SET descripcion='" + getProduct().getDescription()+ "', costo='" + getProduct().getCost()+ "', '" + getProduct().getPrice()+ "' WHERE ID = '" + getProduct().getId() + "'";
        if (getConn().ProcessIUDSQL(SQL) == 0) {
            return false;
        }
        return true;
    }
    
    public boolean delete() {
        String SQL = "DELETE FROM tb_product WHERE ID='" + getProduct().getId() + "'";
        if (getConn().ProcessIUDSQL(SQL) == 0) {
            return false;
        }
        return true;
    }
    
    public ArrayList statistics() {
        ArrayList list = new ArrayList();
        ResultSet rs = select();
        try {
            while(rs.next()){
                list.add(new PieChart.Data(rs.getString(2), Double.parseDouble(rs.getString(3))));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public clsConnection getConn() {
        return conn;
    }

    public void setConn(clsConnection conn) {
        this.conn = conn;
    }

    public clsProduct getProduct() {
        return product;
    }

    public void setProduct(clsProduct product) {
        this.product = product;
    }
    
    
}
