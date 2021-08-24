/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModel;

/**
 *
 * @author thomy
 */
public class clsProduct {

    private int id;
    private String description;
    private double cost;
    private double price;

    public clsProduct() {
    }

    public clsProduct(int id, String description, double cost, double price) {
        this.id = id;
        this.description = description;
        this.cost = cost;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return getId() + " " + getDescription() + " " + getCost() + " " + getPrice();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
