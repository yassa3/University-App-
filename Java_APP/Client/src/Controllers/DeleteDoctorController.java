/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DB.DtoDoctor;
import Scenes.DeleteDoctorBase;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import org.json.JSONObject;

/**
 *
 * @author Yassa Rashad
 */
public class DeleteDoctorController {
    Socket server;
    DataInputStream ear;
    PrintStream mouth;
    String IP = "127.0.0.1";
    public DeleteDoctorController(Stage s,DeleteDoctorBase ddocb){
        ddocb.getDelete().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        try {               
                        server = new Socket(IP, 5000);
                        mouth = new PrintStream(server.getOutputStream());
                        ear = new DataInputStream(server.getInputStream()); 
                        if (ddocb.getEmail_txt().isEmpty())
                            ddocb.setErr("Please Enter doctor email");
                        else {
                            ddocb.setErr("");
                        Platform.runLater(() -> {
                            Alert warningAlert = new Alert(Alert.AlertType.WARNING);
                            warningAlert.setHeaderText(null);
                            warningAlert.setTitle("Warning");
                            warningAlert.setContentText("This will delete all data related to this doctor");
                            Stage stage = (Stage) ddocb.getScene().getWindow();
                            warningAlert.initOwner(stage);
                            double centerX = stage.getX() + stage.getWidth() / 2;
                            double centerY = stage.getY() + stage.getHeight() / 2;
                            warningAlert.setX(centerX - warningAlert.getWidth() / 2);
                            warningAlert.setY(centerY - warningAlert.getHeight() / 2);

                            Optional<ButtonType> result = warningAlert.showAndWait();
                            if (result.isPresent() && result.get() == ButtonType.OK) {
                                DtoDoctor doctor = new DtoDoctor(ddocb.getEmail_txt());
                                Gson gson = new Gson();
                                String json = gson.toJson(doctor);
                                JsonObject J_obj = new JsonObject();
                                J_obj.addProperty("key", "DeleteDoctor");
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
                                                        ddocb.setErr("");
                                                        Platform.runLater(() -> {
                                                            Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
                                                            infoAlert.setHeaderText(null);
                                                            infoAlert.setContentText("Deleted Successfully");
                                                            Stage stage = (Stage) ddocb.getScene().getWindow();
                                                            infoAlert.initOwner(stage);
                                                            double centerX = stage.getX() + stage.getWidth() / 2;
                                                            double centerY = stage.getY() + stage.getHeight() / 2;
                                                            infoAlert.setX(centerX - infoAlert.getWidth() / 2);
                                                            infoAlert.setY(centerY - infoAlert.getHeight() / 2);
                                                            infoAlert.showAndWait();
                                                        });
                                                    }
                                                    else
                                                        ddocb.setErr("This Doctor does not exist");
                                                }
                                                } catch (IOException ex) {
                                                Logger.getLogger(DeleteDoctorController.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        }
                                    }
                                     }.start();
                            }
                        });
                        }
                        }catch (IOException ex) {
                            Logger.getLogger(DeleteDoctorController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
        });
        ddocb.getStudents().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    sceneController.switchToStudentsControllerScene();
                    
                }
        });
        ddocb.getDoctors().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneDoctorsController();
                    } catch (IOException ex) {
                        Logger.getLogger(DeleteDoctorController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
        ddocb.getCourses().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneCoursesController();
                    } catch (IOException ex) {
                        Logger.getLogger(DeleteDoctorController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
        ddocb.getDepartments().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneDepartmentsController();
                    } catch (IOException ex) {
                        Logger.getLogger(DeleteDoctorController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
    
    }
}
