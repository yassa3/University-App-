/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DB.DtoCourse;
import DB.DtoDoctor;
import DB.DtoTeach;
import Scenes.DeleteDoctorCourseBase;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Type;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import org.json.JSONObject;

/**
 *
 * @author Yassa Rashad
 */
public class DeleteDoctorCourseController {
    Socket server;
    DataInputStream ear;
    PrintStream mouth;
    String IP = "127.0.0.1";
    final TableView<DtoCourse>[] finalTableView_courses = new TableView[]{new TableView<>()};
    final ArrayList<DtoCourse>[] finalcourses = new ArrayList[]{null};
    final TableColumn<DtoCourse, String>[] finalTableColumnCourseCode = new TableColumn[]{null};
    final TableColumn<DtoCourse, String>[] finalTableColumnCourseName = new TableColumn[]{null};
    final TableColumn<DtoCourse, String>[] finalTableColumnCourseSemester = new TableColumn[]{null};
    final TableColumn<DtoCourse, Integer>[] finalTableColumnCourseHours = new TableColumn[]{null};
    final TableColumn<DtoCourse, String>[] finalTableColumnCourseDeptCode = new TableColumn[]{null};
    public DeleteDoctorCourseController(Stage s,DeleteDoctorCourseBase ddcb){
        ddcb.getDelete_btn().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        try {  
                        DtoCourse selectedCourse =finalTableView_courses[0].getSelectionModel().getSelectedItem();
                        server = new Socket(IP, 5000);
                        mouth = new PrintStream(server.getOutputStream());
                        ear = new DataInputStream(server.getInputStream()); 
                        if (ddcb.getEmail_txt().isEmpty())
                            ddcb.setErr("Please Enter doctor email");
                        else {
                            ddcb.setErr("");
                        DtoTeach teach = new DtoTeach(ddcb.getEmail_txt(),selectedCourse.getCourse_Code());
                        Gson gson = new Gson();
                        String json = gson.toJson(teach);
                        JsonObject J_obj = new JsonObject();
                        J_obj.addProperty("key", "DeleteCourseDoctor");
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
                                                ddcb.setErr("");
                                                Platform.runLater(() -> {
                                                    finalTableView_courses[0].getItems().remove(selectedCourse);
                                                    Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
                                                    infoAlert.setHeaderText(null);
                                                    infoAlert.setContentText("Deleted Successfully");
                                                    Stage stage = (Stage) ddcb.getScene().getWindow();
                                                    infoAlert.initOwner(stage);
                                                    double centerX = stage.getX() + stage.getWidth() / 2;
                                                    double centerY = stage.getY() + stage.getHeight() / 2;
                                                    infoAlert.setX(centerX - infoAlert.getWidth() / 2);
                                                    infoAlert.setY(centerY - infoAlert.getHeight() / 2);
                                                    infoAlert.showAndWait();
                                                });
                                            }
                                            else
                                                ddcb.setErr("Error");
                                        }
                                        } catch (IOException ex) {
                                        Logger.getLogger(DeleteDoctorCourseController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                             }.start();
                        }
                        } catch (IOException ex) {
                            Logger.getLogger(DeleteDoctorCourseController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
        });
        ddcb.getShow_btn().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        try {               
                        server = new Socket(IP, 5000);
                        mouth = new PrintStream(server.getOutputStream());
                        ear = new DataInputStream(server.getInputStream()); 
                        DtoDoctor doctor = new DtoDoctor(ddcb.getEmail_txt());
                        Gson gson = new Gson();
                        String json = gson.toJson(doctor);
                        JsonObject J_obj = new JsonObject();
                        J_obj.addProperty("key", "ShowDeleteDoctorCourse");
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
                                        Platform.runLater(() -> {
                                            ArrayList<DtoCourse> courses =new ArrayList<>();
                                            JSONObject J_obj = new JSONObject(data);
                                            String key = J_obj.getString("key");
                                            Gson gson = new Gson();
                                            String value = J_obj.getString("value");
                                            if ("R".equals(key)) {
                                                Type itemListType = new TypeToken <ArrayList<DtoCourse>> (){}.getType();
                                                courses =gson.fromJson (value ,itemListType);
                                                if (courses != null ){
                                                    finalTableView_courses[0].getItems().clear();
                                                    finalcourses[0]=courses;
                                                    finalTableView_courses[0]=ddcb.getCourse_view();
                                                    finalTableColumnCourseCode[0]=ddcb.getCode_col();
                                                    finalTableColumnCourseName[0]=ddcb.getName_col();
                                                    finalTableColumnCourseSemester[0]=ddcb.getSemester_col();
                                                    finalTableColumnCourseHours[0]=ddcb.getHours_col();
                                                    finalTableColumnCourseDeptCode[0]=ddcb.getDept_code_col();
                                                    finalTableColumnCourseCode[0].setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCourse_Code()));
                                                    finalTableColumnCourseName[0].setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCourse_Name()));
                                                    finalTableColumnCourseSemester[0].setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSemester()));
                                                    finalTableColumnCourseHours[0].setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getHours()).asObject());
                                                    finalTableColumnCourseDeptCode[0].setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDepartment_Code()));
                                                    finalTableView_courses[0].getItems().addAll(finalcourses[0]);
                                                    finalTableView_courses[0].getColumns().setAll(finalTableColumnCourseCode[0], finalTableColumnCourseName[0],finalTableColumnCourseSemester[0],finalTableColumnCourseHours[0],finalTableColumnCourseDeptCode[0]);
                                                }else {
                                                    System.out.println("Error");
                                                }
                                            }
                                        });
                                        } catch (IOException ex) {
                                        Logger.getLogger(DeleteDoctorCourseController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                             }.start();
                             
                        } catch (IOException ex) {
                            Logger.getLogger(DeleteDoctorCourseController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
        });
        ddcb.getStudents().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    sceneController.switchToStudentsControllerScene();
                    
                }
        });
        ddcb.getDoctors().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneDoctorsController();
                    } catch (IOException ex) {
                        Logger.getLogger(DeleteDoctorCourseController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
        ddcb.getCourses().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneCoursesController();
                    } catch (IOException ex) {
                        Logger.getLogger(DeleteDoctorCourseController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
        ddcb.getDepartments().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneDepartmentsController();
                    } catch (IOException ex) {
                        Logger.getLogger(DeleteDoctorCourseController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
    
    }
}
