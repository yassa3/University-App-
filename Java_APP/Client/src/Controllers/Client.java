/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Controllers.LoginController;
import Scenes.LoginBase;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Yassa Rashad
 */
public class Client extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        LoginBase root = new LoginBase();
        
        Scene scene = new Scene(root);
        LoginController log_control = new LoginController(stage, root);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
