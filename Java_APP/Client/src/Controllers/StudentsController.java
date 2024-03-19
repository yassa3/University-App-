/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DB.DtoStudent;
import DB.DtoStudentPhones;
import Scenes.StudentsBase;
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
public class StudentsController {
    Socket server;
    DataInputStream ear;
    PrintStream mouth;
    String IP = "127.0.0.1";
    public StudentsController(Stage s,StudentsBase sb){
        sb.getEnter().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        try {               
                        server = new Socket(IP, 5000);
                        mouth = new PrintStream(server.getOutputStream());
                        ear = new DataInputStream(server.getInputStream()); 
                        if (sb.getFname_txt().isEmpty() || sb.getEmail_txt().isEmpty()||sb.getGender_txt().isEmpty() ||sb.getCity_txt().isEmpty() ||sb.getStreet_txt().isEmpty() ||sb.getSemester_txt().isEmpty() ||sb.getDept_code_txt().isEmpty() || sb.getPhone1_txt().isEmpty())
                            sb.setErr("Please Enter the required data");
                        else {
                            sb.setErr("");
                        DtoStudent student = new DtoStudent(sb.getFname_txt(),sb.getLname_txt(),sb.getEmail_txt(),sb.getDate_txt(),sb.getGender_txt(),sb.getCity_txt(),sb.getStreet_txt(),sb.getSemester_txt(),sb.getDept_code_txt());
                        DtoStudentPhones studentphone1 = new DtoStudentPhones(sb.getEmail_txt(),sb.getPhone1_txt());
                        DtoStudentPhones studentphone2 = new DtoStudentPhones(sb.getEmail_txt(),sb.getPhone2_txt());
                        Gson gson = new Gson();
                        String json1 = gson.toJson(student);
                        String json2 = gson.toJson(studentphone1);
                        String json3 = gson.toJson(studentphone2);
                        JsonObject J_obj = new JsonObject();
                        J_obj.addProperty("key", "AddStudent");
                        J_obj.addProperty("value1",json1);
                        J_obj.addProperty("value2",json2);
                        J_obj.addProperty("value3",json3);
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
                                                sb.setErr("");
                                                Platform.runLater(() -> {
                                                    Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
                                                    infoAlert.setHeaderText(null);
                                                    infoAlert.setContentText("Added Successfully");
                                                    Stage stage = (Stage) sb.getScene().getWindow();
                                                    infoAlert.initOwner(stage);
                                                    double centerX = stage.getX() + stage.getWidth() / 2;
                                                    double centerY = stage.getY() + stage.getHeight() / 2;
                                                    infoAlert.setX(centerX - infoAlert.getWidth() / 2);
                                                    infoAlert.setY(centerY - infoAlert.getHeight() / 2);
                                                    infoAlert.showAndWait();
                                                });
                                            }
                                            else
                                                sb.setErr("This Student already exist");
                                        }
                                        } catch (IOException ex) {
                                        Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                             }.start();
                        }
                        } catch (IOException ex) {
                            Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
        });
        sb.getStudents().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    sceneController.switchToStudentsControllerScene();
                    
                }
        });
        sb.getDoctors().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneDoctorsController();
                    } catch (IOException ex) {
                        Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
        sb.getCourses().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneCoursesController();
                    } catch (IOException ex) {
                        Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
        sb.getDepartments().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneDepartmentsController();
                    } catch (IOException ex) {
                        Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
        sb.getUpdate().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    sceneController.switchToUpdateStudentControllerScene();
                    
                }
        });
        sb.getEnroll().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneEnrollmentController();
                    } catch (IOException ex) {
                        Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
        sb.getGrades().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneCourseGpaController();
                    } catch (IOException ex) {
                        Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
        sb.getGpa().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    sceneController.switchToGPAController();
                    
                }
        });
        sb.getDelete().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtoscenesceneDeleteStudentController();
                    } catch (IOException ex) {
                        Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
    };
}
