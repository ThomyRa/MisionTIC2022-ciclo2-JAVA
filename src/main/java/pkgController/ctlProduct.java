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
import pkgModel.clsDAOProduct;
import pkgModel.clsProduct;
import pkgView.frmProduct;

/**
 *
 * @author thomy
 */
public class ctlProduct implements ActionListener{
    clsDAOProduct modelProduct;
    frmProduct viewProduct;

    public ctlProduct(clsDAOProduct modelProduct, frmProduct viewProduct) {
        this.modelProduct = new clsDAOProduct();
        this.viewProduct = new frmProduct();
        
        this.viewProduct.getBtnNew().addActionListener(this);
        this.viewProduct.getBtnSave().addActionListener(this);
        this.viewProduct.getBtnClose().addActionListener(this);
        this.viewProduct.getBtnGraph().addActionListener(this);
        this.viewProduct.getBtnExport().addActionListener(this);
        this.viewProduct.getBtnDelete().addActionListener(this);
        
        this.viewProduct.getjList().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list(evt);
            }
        });
        this.list();
    }
    
    public void list() {
        DefaultListModel<clsProduct> dlm = new DefaultListModel();
        java.sql.ResultSet rs = modelProduct.select();
        try {
            while (rs.next()) {
                dlm.addElement(new clsProduct(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4)));
            }
        } catch (Exception e) {
        }
        viewProduct.getjList().setModel(dlm);
    }
    
    public void list(java.awt.event.MouseEvent evt) {
        clsProduct result = (clsProduct) this.viewProduct.getjList().getSelectedValue();
        if (result instanceof clsProduct) {
            viewProduct.getTxtId().setText(String.valueOf(result.getId()));
            viewProduct.getTxtAreaDesc().setText(String.valueOf(result.getDescription()));
            viewProduct.getTxtCost().setText(String.valueOf(result.getCost()));
            viewProduct.getTxtPrice().setText(String.valueOf(result.getPrice()));
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "New": {
                viewProduct.getTxtId().setText("");
                viewProduct.getTxtAreaDesc().setText("");
                viewProduct.getTxtCost().setText("");
                viewProduct.getTxtPrice().setText("");
                break;
            }
            case "Save":{
                modelProduct.getProduct().setId(Integer.parseInt(viewProduct.getTxtId().getText()));
                modelProduct.getProduct().setDescription(viewProduct.getTxtAreaDesc().getText());
                modelProduct.getProduct().setCost(Double.parseDouble(viewProduct.getTxtCost().getText()));
                modelProduct.getProduct().setPrice(Double.parseDouble(viewProduct.getTxtPrice().getText()));
                
                if(modelProduct.insertProduct()) {
                    this.list();
                    JOptionPane.showMessageDialog(null, "The record has been saved succesfully.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "The record was not saved.");
                }
                break;
            }
            case "Delete": {
                modelProduct.getProduct().setId(Integer.parseInt(viewProduct.getTxtId().getText()));
                modelProduct.getProduct().setDescription(viewProduct.getTxtId().getText());
                modelProduct.getProduct().setCost(Double.parseDouble(viewProduct.getTxtId().getText()));
                modelProduct.getProduct().setCost(Double.parseDouble(viewProduct.getTxtId().getText()));
                
                if(modelProduct.delete()){
                    JOptionPane.showMessageDialog(viewProduct, "The record was deleted correctly");
                    viewProduct.getTxtId().setText("");
                    viewProduct.getTxtAreaDesc().setText("");
                    viewProduct.getTxtCost().setText("");
                    viewProduct.getTxtPrice().setText("");
                    this.list();
                }
                else{
                    JOptionPane.showMessageDialog(null, "The record was not deleted");
                }
                break;
            }
            case "Graph": {
                String[] args = null;
                new pkgView.pkgGraph.clsGraphProducts().init(args);
                break;
            }
            case "Export": {
                modelProduct.getProduct().setId(Integer.parseInt(viewProduct.getTxtId().getText()));
                modelProduct.getProduct().setDescription(viewProduct.getTxtAreaDesc().getText());
                modelProduct.getProduct().setCost(Double.parseDouble(viewProduct.getTxtCost().getText()));
                modelProduct.getProduct().setPrice(Double.parseDouble(viewProduct.getTxtPrice().getText()));

                new pkgModel.export.clsProductExportExcel().write(modelProduct.select());
                break;
            }
            case "Close": {
                this.viewProduct.dispose();
                break;
            }
        }
    }
    public void show_frame() {
        viewProduct.setVisible(true);
    }
}
