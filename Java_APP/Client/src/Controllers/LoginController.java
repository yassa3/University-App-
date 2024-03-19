/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DB.DtoStudent;
import Scenes.LoginBase;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import org.json.JSONObject;

/**
 *
 * @author Yassa Rashad
 */
public class LoginController {
    Socket server;
    DataInputStream ear;
    PrintStream mouth;
    String IP = "127.0.0.1";
    public LoginController(Stage s,LoginBase lb){
        lb.getLogin().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        try {               
                        server = new Socket(IP, 5000);
                        mouth = new PrintStream(server.getOutputStream());
                        ear = new DataInputStream(server.getInputStream()); 
                        if (lb.getUser_txt().isEmpty() || lb.getPass_txt().isEmpty())
                            lb.setErr("Please Enter your user name and email");
                        else {
                            lb.setErr("");
                        Gson gson = new Gson();
                        JsonObject J_obj = new JsonObject();
                        J_obj.addProperty("key", "Login");
                        J_obj.addProperty("value1",lb.getUser_txt());
                        J_obj.addProperty("value2",lb.getPass_txt());
                        mouth.println(J_obj);
                        new Thread() {
                            public void run() {
                                while (true) {

                                    try {
                                        String data = ear.readLine();
                                        if (data == null) {
                                            System.out.println("Server closed the connection.");
                                            break;
                                        }
                                        JSONObject J_obj = new JSONObject(data);
                                        String key = J_obj.getString("key");
                                        Gson gson = new Gson();
                                        String value = J_obj.getString("value");
                                        if ("R".equals(key)) {
                                            if ("1".equals(value)){
                                                Platform.runLater(() -> {
                                                    SceneController sceneController = new SceneController(s);
                                                    sceneController.switchToStudentsControllerScene();
                                                });
                                            }
                                            else
                                                lb.setErr("Invalid User Name or Password");
                                        };
                                        } catch (IOException ex) {
                                        Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                             }.start();

                        } 
                        }catch (IOException ex) {
                            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
    }
}
