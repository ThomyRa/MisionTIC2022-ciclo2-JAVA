/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgView.pkgGraph;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;
import pkgModel.clsDAOProduct;

/**
 *
 * @author thomy
 */
public class clsGraphProducts extends Application{
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Products Pie Chart.");
        stage.setWidth(500);

        java.util.ArrayList list = new clsDAOProduct().statistics();

        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(list);
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Products");
        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void init(String[] args) {
        launch(args);
    }
}
