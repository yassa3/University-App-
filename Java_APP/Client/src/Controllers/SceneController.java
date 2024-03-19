/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Scenes.AddDoctorCourseBase;
import Scenes.CourseGpaBase;
import Scenes.CoursesBase;
import Scenes.DeleteCourseBase;
import Scenes.DeleteDepartmentBase;
import Scenes.DeleteDoctorBase;
import Scenes.DeleteDoctorCourseBase;
import Scenes.DeleteStudentBase;
import Scenes.DepartmentsBase;
import Scenes.DoctorsBase;
import Scenes.EnrollmentBase;
import Scenes.GPABase;
import Scenes.LoginBase;
import Scenes.ReportBase;
import Scenes.StudentsBase;
import Scenes.UpdateCourseBase;
import Scenes.UpdateStudentBase;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Yassa Rashad
 */
public class SceneController {


    private Stage stage;
    private Scene scene;
    private Parent root;
    public SceneController(Stage stage) {
        this.stage = stage;
    }
    public void switchToAddDoctorCourseScene() {
            AddDoctorCourseBase root = new AddDoctorCourseBase();
            AddDoctorCourseController AddDoctorCoursecon = new AddDoctorCourseController(stage,root);
            Scene scene = new Scene(root);
            if (stage != null) {
                stage.setScene(scene);
                stage.show();
            } else {
                System.err.println("Error: Stage is not initialized.");
            }
       
    }
    public void switchtosceneCourseGpaController() throws IOException{
            CourseGpaBase root = new CourseGpaBase();
            CourseGpaController CourseGpaCon = new CourseGpaController(stage, root);
            Scene scene = new Scene(root);
            
            if (stage != null) {
                stage.setScene(scene);
                stage.show();
            } else {
                System.err.println("Error: Stage is not initialized.");
            }
        
    }
    public void switchtoscenelogin() throws IOException{
            LoginBase root = new LoginBase();
            LoginController loginController = new LoginController(stage, root);
            Scene scene = new Scene(root);
            
            if (stage != null) {
                stage.setScene(scene);
                stage.show();
            } else {
                System.err.println("Error: Stage is not initialized.");
            }
        
    }
    public void switchtosceneCoursesController() throws IOException{
            CoursesBase root = new CoursesBase();
            CoursesController CoursesCon = new CoursesController(stage, root);
            Scene scene = new Scene(root);
            if (stage != null) {
                stage.setScene(scene);
                stage.show();
            } else {
                System.err.println("Error: Stage is not initialized.");
            }
        
    }
    public void switchtosceneDeleteCourseController() throws IOException{
            DeleteCourseBase root = new DeleteCourseBase();
            DeleteCourseController DeleteCourseCon = new DeleteCourseController(stage, root);
            Scene scene = new Scene(root);
            if (stage != null) {
                stage.setScene(scene);
                stage.show();
            } else {
                System.err.println("Error: Stage is not initialized.");
            }
        
    }
    public void switchtosceneDeleteDepartmentController() throws IOException{
            DeleteDepartmentBase root = new DeleteDepartmentBase();
            DeleteDepartmentController DeleteDepartmentCon = new DeleteDepartmentController(stage, root);
            Scene scene = new Scene(root);
            if (stage != null) {
                stage.setScene(scene);
                stage.show();
            } else {
                System.err.println("Error: Stage is not initialized.");
            }
        
    }
    void switchtosceneDeleteDoctorController() {
        DeleteDoctorBase root = new DeleteDoctorBase();
        DeleteDoctorController DeleteDoctorCon = new DeleteDoctorController(stage, root);
        Scene scene = new Scene(root);
            if (stage != null) {
                stage.setScene(scene);
                stage.show();
            } else {
                System.err.println("Error: Stage is not initialized.");
            }
    }
    
    public void switchtosceneDeleteDoctorCourseController() throws IOException{
            DeleteDoctorCourseBase root = new DeleteDoctorCourseBase();
            DeleteDoctorCourseController DeleteDoctorCourseCon = new DeleteDoctorCourseController(stage, root);
            Scene scene = new Scene(root);
            if (stage != null) {
                stage.setScene(scene);
                stage.show();
            } else {
                System.err.println("Error: Stage is not initialized.");
            }
    }
    public void switchtoscenesceneDeleteStudentController() throws IOException{
            DeleteStudentBase root = new DeleteStudentBase();
            DeleteStudentController DeleteStudentCon = new DeleteStudentController(stage, root);
            Scene scene = new Scene(root);
            if (stage != null) {
                stage.setScene(scene);
                stage.show();
            } else {
                System.err.println("Error: Stage is not initialized.");
            }
        
    }
    
    public void switchtosceneDepartmentsController() throws IOException{
            DepartmentsBase root = new DepartmentsBase();
            DepartmentsController DepartmentsCon = new DepartmentsController(stage, root);
            Scene scene = new Scene(root);
            if (stage != null) {
                stage.setScene(scene);
                stage.show();
            } else {
                System.err.println("Error: Stage is not initialized.");
            }
        
    }      

    public void switchtosceneDoctorsController() throws IOException{
            DoctorsBase root = new DoctorsBase();
            DoctorsController DoctorsCon = new DoctorsController(stage, root);
            Scene scene = new Scene(root);
            if (stage != null) {
                stage.setScene(scene);
                stage.show();
            } else {
                System.err.println("Error: Stage is not initialized.");
            } 
    }
    public void switchtosceneEnrollmentController() throws IOException{
            EnrollmentBase root = new EnrollmentBase();
            EnrollmentController  EnrollmentCon = new EnrollmentController(stage, root);
            Scene scene = new Scene(root);
            if (stage != null) {
                stage.setScene(scene);
                stage.show();
            } else {
                System.err.println("Error: Stage is not initialized.");
            }
        
    }
    public void switchToGPAController(){
        GPABase root = new GPABase();
        GPAController GPACon = new GPAController(stage,root);
        Scene scene = new Scene(root);
            if (stage != null) {
                stage.setScene(scene);
                stage.show();
            } else {
                System.err.println("Error: Stage is not initialized.");
            }
        
    }
    public void switchToReportControllerScene(){
        ReportBase root = new ReportBase();
        ReportController ReportCon= new ReportController(stage,root);
        Scene scene = new Scene(root);
            if (stage != null) {
                stage.setScene(scene);
                stage.show();
            } else {
                System.err.println("Error: Stage is not initialized.");
            }
        
    }
    public void switchToStudentsControllerScene(){
        StudentsBase root = new StudentsBase();
        StudentsController StudentsCon= new StudentsController(stage,root);
        Scene scene = new Scene(root);
            if (stage != null) {
                stage.setScene(scene);
                stage.show();
            } else {
                System.err.println("Error: Stage is not initialized.");
            }
        
    }
    public void switchToUpdateCourseControllerScene(){
        UpdateCourseBase root = new UpdateCourseBase();
        UpdateCourseController UpdateCourseCon= new UpdateCourseController(stage,root);
        Scene scene = new Scene(root);
            if (stage != null) {
                stage.setScene(scene);
                stage.show();
            } else {
                System.err.println("Error: Stage is not initialized.");
            }
        
    }
    public void switchToUpdateStudentControllerScene(){
        UpdateStudentBase root = new UpdateStudentBase();
        UpdateStudentController UpdateStudentCon= new UpdateStudentController(stage,root);
        Scene scene = new Scene(root);
            if (stage != null) {
                stage.setScene(scene);
                stage.show();
            } else {
                System.err.println("Error: Stage is not initialized.");
            }
        
    }

}