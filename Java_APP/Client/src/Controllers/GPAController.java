/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DB.DtoStudent;
import DB.DtoStudentPhones;
import Scenes.GPABase;
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
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import org.json.JSONObject;

/**
 *
 * @author Yassa Rashad
 */
public class GPAController {
    Socket server;
    DataInputStream ear;
    PrintStream mouth;
    String IP = "127.0.0.1";
    public GPAController(Stage s,GPABase gb){
        gb.getCgpa_btn().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        try {               
                        server = new Socket(IP, 5000);
                        mouth = new PrintStream(server.getOutputStream());
                        ear = new DataInputStream(server.getInputStream()); 
                        if (gb.getEmail_txt().isEmpty())
                            gb.setErr("Please Enter student email");
                        else {
                            gb.setErr("");
                        DtoStudent student = new DtoStudent(gb.getEmail_txt());
                        Gson gson = new Gson();
                        String json = gson.toJson(student);
                        JsonObject J_obj = new JsonObject();
                        J_obj.addProperty("key", "CGPA");
                        J_obj.addProperty("value",json);
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
                                            if ("0".equals(value)){
                                                gb.setErr("Error");
                                            }
                                            else
                                                gb.setCGPA(Double.parseDouble(value));
                                        }
                                        } catch (IOException ex) {
                                        Logger.getLogger(GPAController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                             }.start();
                        }
                        } catch (IOException ex) {
                            Logger.getLogger(GPAController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
        });
        gb.getSgpa_btn().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        try {               
                        server = new Socket(IP, 5000);
                        mouth = new PrintStream(server.getOutputStream());
                        ear = new DataInputStream(server.getInputStream()); 
                        DtoStudent student = new DtoStudent(gb.getEmail_txt(),gb.getSemester_txt());
                        Gson gson = new Gson();
                        String json = gson.toJson(student);
                        JsonObject J_obj = new JsonObject();
                        J_obj.addProperty("key", "SGPA");
                        J_obj.addProperty("value",json);
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
                                            if ("0".equals(value)){
                                                gb.setErr("Please Enter Valid Data");
                                                
                                            }
                                            else
                                                gb.setSGPA(Double.parseDouble(value));
                                        }
                                        } catch (IOException ex) {
                                        Logger.getLogger(GPAController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                             }.start();

                        } catch (IOException ex) {
                            Logger.getLogger(GPAController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
        });
        gb.getStudents().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    sceneController.switchToStudentsControllerScene();
                    
                }
        });
        gb.getDoctors().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneDoctorsController();
                    } catch (IOException ex) {
                        Logger.getLogger(GPAController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
        gb.getCourses().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneCoursesController();
                    } catch (IOException ex) {
                        Logger.getLogger(GPAController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
        gb.getDepartments().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneDepartmentsController();
                    } catch (IOException ex) {
                        Logger.getLogger(GPAController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
    }
}
