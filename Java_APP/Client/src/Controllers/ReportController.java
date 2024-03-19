/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DB.DtoCourse;
import DB.DtoStudent;
import Scenes.ReportBase;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import org.json.JSONObject;

/**
 *
 * @author Yassa Rashad
 */
public class ReportController {
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
    final TableView<DtoStudent>[] finalTableView_students = new TableView[]{new TableView<>()};
    final ArrayList<DtoStudent>[] finalstudents = new ArrayList[]{null};
    final TableColumn<DtoStudent, String>[] finalTableColumnFName = new TableColumn[]{null};
    final TableColumn<DtoStudent, String>[] finalTableColumnLName = new TableColumn[]{null};
    final TableColumn<DtoStudent, String>[] finalTableColumnStudentSemester = new TableColumn[]{null};
    final TableColumn<DtoStudent, String>[] finalTableColumnStudentEmail = new TableColumn[]{null};
    final TableColumn<DtoStudent, String>[] finalTableColumnStudntDeptCode = new TableColumn[]{null};
    ArrayList<DtoCourse> courses =new ArrayList<>();
    ArrayList<DtoStudent> students =new ArrayList<>();
    public ReportController(Stage s,ReportBase rb){
        rb.getShow_btn().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        try {               
                        server = new Socket(IP, 5000);
                        mouth = new PrintStream(server.getOutputStream());
                        ear = new DataInputStream(server.getInputStream()); 
                        Gson gson = new Gson();
                        String json = gson.toJson("Report");
                        JsonObject J_obj = new JsonObject();
                        J_obj.addProperty("key", "ShowReportCourses");
                        J_obj.addProperty("value",json);
                        finalTableView_courses[0].getItems().clear();
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
                                                    finalTableView_courses[0]=rb.getCourse_view();
                                                    finalTableColumnCourseCode[0]=rb.getCode_col();
                                                    finalTableColumnCourseName[0]=rb.getName_col();
                                                    finalTableColumnCourseSemester[0]=rb.getSemester_col();
                                                    finalTableColumnCourseHours[0]=rb.getHours_col();
                                                    finalTableColumnCourseDeptCode[0]=rb.getDept_code_col();
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
                                        Logger.getLogger(ReportController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                             }.start();
                             
                        } catch (IOException ex) {
                            Logger.getLogger(ReportController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
        });
        rb.getReport_btn().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        try {        
                            finalTableView_students[0].getItems().clear();
                        DtoCourse selectedCourse =finalTableView_courses[0].getSelectionModel().getSelectedItem();
                        server = new Socket(IP, 5000);
                        mouth = new PrintStream(server.getOutputStream());
                        ear = new DataInputStream(server.getInputStream()); 
                        DtoCourse course = new DtoCourse(selectedCourse.getCourse_Code());
                        Gson gson = new Gson();
                        String json = gson.toJson(course);
                        JsonObject J_obj = new JsonObject();
                        J_obj.addProperty("key", "ShowReport");
                        J_obj.addProperty("value",json);
                        rb.setGpa_txt("");
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
                                            
                                            JSONObject J_obj = new JSONObject(data);
                                            String key = J_obj.getString("key");
                                            Gson gson = new Gson();
                                            if ("R".equals(key)) {
                                                String value1 = J_obj.getString("value1");
                                                String value2 = J_obj.getString("value2");
                                                Type itemListType = new TypeToken <ArrayList<DtoStudent>> (){}.getType();
                                                students =gson.fromJson (value1 ,itemListType);
                                                if (students != null && value2 != null){
                                                    rb.setGpa_txt(value2);
                                                    finalTableView_students[0].getItems().clear();
                                                    finalstudents[0]=students;
                                                    finalTableView_students[0]=rb.getStudent_view();
                                                    finalTableColumnFName[0]=rb.getFname_col();
                                                    finalTableColumnLName[0]=rb.getLname_col();
                                                    finalTableColumnStudentEmail[0]=rb.getEmail_col();
                                                    finalTableColumnStudentSemester[0]=rb.getSemester_student_col();
                                                    finalTableColumnStudntDeptCode[0]=rb.getStudent_dept_code_col();
                                                    finalTableColumnFName[0].setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getFName()));
                                                    finalTableColumnLName[0].setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getLName()));
                                                    finalTableColumnStudentEmail[0].setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmail()));
                                                    finalTableColumnStudentSemester[0].setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSemester()));
                                                    finalTableColumnStudntDeptCode[0].setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDepartment_Code()));
                                                    finalTableView_students[0].getItems().addAll(finalstudents[0]);
                                                    finalTableView_students[0].getColumns().setAll(finalTableColumnFName[0], finalTableColumnLName[0],finalTableColumnStudentEmail[0],finalTableColumnStudentSemester[0],finalTableColumnStudntDeptCode[0]);
                                                    
                                                }
                                                
                                                else {
                                                    System.out.println("Error");
                                                }
                                            }
                                        });
                                        } catch (IOException ex) {
                                        Logger.getLogger(ReportController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                             }.start();
                             
                        } catch (IOException ex) {
                            Logger.getLogger(ReportController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
        });
        rb.getStudents().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    sceneController.switchToStudentsControllerScene();
                    
                }
        });
        rb.getDoctors().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneDoctorsController();
                    } catch (IOException ex) {
                        Logger.getLogger(ReportController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
        rb.getCourses().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneCoursesController();
                    } catch (IOException ex) {
                        Logger.getLogger(ReportController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
        rb.getDepartments().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    SceneController sceneController = new SceneController(s);
                    try {
                        sceneController.switchtosceneDepartmentsController();
                    } catch (IOException ex) {
                        Logger.getLogger(ReportController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
        });
    
    }
}
