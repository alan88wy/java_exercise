package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
// import javafx.scene.paint.Color;
// import javafx.scene.shape.Arc;
// import javafx.scene.shape.ArcType;
// import javafx.scene.shape.Circle;
// import javafx.scene.text.Font;
// import javafx.scene.text.Text;
// import javafx.scene.Group;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // Circle face = new Circle(125, 125, 80);
        // face.setFill(Color.YELLOW);
        // face.setStroke(Color.BLUE);

        // // create and configure the circle for the right eye 
        // Circle rightEye = new Circle(86, 100, 10); 
        // rightEye.setFill(Color.YELLOW); 
        // rightEye.setStroke(Color.BLUE);
                
        // // create and configure the circle for the left eye 
        // Circle leftEye = new Circle(162, 100, 10); 
        // leftEye.setFill(Color.YELLOW); 
        // leftEye.setStroke(Color.BLUE);
        // // create and configure a smiling mouth 
        // Arc mouth = new Arc(125, 150, 45, 35, 0, -180); 
        // mouth.setFill(Color.YELLOW); 
        // mouth.setStroke(Color.BLUE); mouth.setType(ArcType.OPEN);
        // // create and configure the text 
        // Text caption = new Text(80, 240, "Smiley Face"); 
        // caption.setFill(Color.BLUE); 
        // caption.setFont(Font.font("Verdana", 15));
        // // create a group that holds all the features 
        // Group root = new Group(face, rightEye, leftEye, mouth, caption);

        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}