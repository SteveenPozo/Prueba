package dibujarlineas;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DibujarLineas extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        
        Scene scene = new Scene(root, 300, 250, Color.LIGHTGRAY);
        
        Line l1 = new Line(30, 20, 130, 20);
        l1.setStroke(Color.RED);
        
        Line l2 = new Line(130, 20, 130, 120);
        l2.setStroke(Color.RED);
        
        Line l3 = new Line(30, 120, 130, 120);
        l3.setStroke(Color.RED);
        
        Line l4 = new Line(30, 20, 30, 120);
        l4.setStroke(Color.RED);
        
        Line l5 = new Line(10, 40, 110, 40);
        l5.setStroke(Color.RED);
        
        Line l6 = new Line(110, 40, 110, 140);
        l6.setStroke(Color.RED);
        
        Line l7 = new Line(10, 140, 110, 140);
        l7.setStroke(Color.RED);
        
        Line l8 = new Line(10, 40, 10, 140);
        l8.setStroke(Color.RED);
        
        Line l9 = new Line(10, 40, 30, 20);
        l9.setStroke(Color.RED);
        
        Line l10 = new Line(110, 40, 130, 20);
        l10.setStroke(Color.RED);
        
        Line l11 = new Line(10, 140, 30, 120);
        l11.setStroke(Color.RED);
        
        Line l12 = new Line(110, 140, 130, 120);
        l12.setStroke(Color.RED);
        
      
        root.getChildren().add(l1);
        root.getChildren().add(l2);
        root.getChildren().add(l3);
        root.getChildren().add(l4);
        root.getChildren().add(l5);
        root.getChildren().add(l6);
        root.getChildren().add(l7);
        root.getChildren().add(l8);
        root.getChildren().add(l9);
        root.getChildren().add(l10);
        root.getChildren().add(l11);
        root.getChildren().add(l12);
        
        System.out.println("Este programa crea un cubo");
     
        primaryStage.setTitle("Líneas");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }

    public static void main(String[] args) {
        launch(args);
    }
}
