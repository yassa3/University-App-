/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DB.DtoDoctor;
import Scenes.DoctorsBase;
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
public class DoctorsController {
    Socket server;
    DataInputStream ear;
    PrintStream mouth;
    String IP = "127.0.0.1";
    public DoctorsController(Stage s,DoctorsBase docb){
        docb.getEnter().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        try {               
                        server = new Socket(IP, 5000);
                        mouth = new PrintStream(server.getOutputStream());
                        ear = new DataInputStream(server.getInputStream()); 
                        if (docb.getFname_txt().isEmpty() ||docb.getEmail_txt().isEmpty() ||docb.getDept_code_txt().isEmpty())
                            docb.setErr("Please Enter the required data");
                        else {
                            docb.setErr("");
                        DtoDoctor doctor = new DtoDoctor(docb.getFname_txt(),docb.getLname_txt(),docb.getEmail_txt(),docb.getDept_code_txt());
                        Gson gson = new Gson();
                        String json = gson.toJson(doctor);
                        JsonObject J_obj = new JsonObject();
                        J_obj.addProperty("key", "AddDoctor");
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
                                            if ("1".equals(value)){
                                                docb.setErr("");
                                                Platform.runLater(() -> {
                                                    Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
                                                    infoAlert.setHeaderText(null);
                                                    infoAlert.setContentText("Added Successfully");
                                                    Stage stage = (Stage) docb.getScene().getWindow();
                                                    infoAlert.initOwner(stage);
                                                    double centerX = stage.getX() + stage.getWidth() / 2;
                                                    double centerY = stage.getY() + stage.getHeight() / 2;
                                                    infoAlert.setX(centerX - infoAlert.getWidth() / 2);
                                                    infoAlert.setY(centerY - infoAlert.getHeight() / 2);
                                                    infoAlert.showAndWait();
                                                });
                                            }
                                            else
                                                docb.setErr("This Doctor already exist");
                                        }
                                        } catch (IOException ex) {
                                        Logger.getLogger(DoctorsController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                             }.start();
                        }
                        } catch (IOException ex) {
                            Logger.getLogger(DoctorsController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
        });
        docb.getStudents().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    sceneController.switchToStudentsControllerScene();
                    
                }
        });
        docb.getDoctors().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneDoctorsController();
                    } catch (IOException ex) {
                        Logger.getLogger(DoctorsController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
        docb.getCourses().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneCoursesController();
                    } catch (IOException ex) {
                        Logger.getLogger(DoctorsController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
        docb.getDepartments().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneDepartmentsController();
                    } catch (IOException ex) {
                        Logger.getLogger(DoctorsController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
        docb.getAdd_Course_btn().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    sceneController.switchToAddDoctorCourseScene();
                    
                }
        });
        docb.getDelete_course_btn().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneDeleteDoctorCourseController();
                    } catch (IOException ex) {
                        Logger.getLogger(DoctorsController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
        docb.getDelete_btn().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    sceneController.switchtosceneDeleteDoctorController();
                    
                }
        });
    
    }
}
