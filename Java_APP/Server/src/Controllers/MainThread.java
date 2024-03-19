/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DB.DAO;
import DB.DtoCourse;
import DB.DtoDepartment;
import DB.DtoDoctor;
import DB.DtoHas;
import DB.DtoStudent;
import DB.DtoStudentPhones;
import DB.DtoTeach;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Yassa
 */
public class MainThread extends Thread{
    ServerSocket serverSocket;
    public MainThread() {
        try {
            serverSocket = new ServerSocket(5000);
        } catch (IOException ex) {
            Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void run() {
        try {
            while (true) {
                Socket ss = serverSocket.accept();
                new ChatHandler(ss);
            }
        } catch (IOException ex) {
            Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void closeServerSocket() {
        try {
            if (serverSocket != null && !serverSocket.isClosed()) {
                serverSocket.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
        class ChatHandler extends Thread{
            DataInputStream ear;
            PrintStream mouth;
            static String res = null;
            static String friend_name = null;
            static int barcod = 0;
            static ArrayList<ChatHandler> clientsVector = new ArrayList<ChatHandler>();
            public ChatHandler(Socket cs){
                try {
                    ear = new DataInputStream(cs.getInputStream());
                    mouth = new PrintStream(cs.getOutputStream());
                    clientsVector.add(this);
                    start();
                } catch (IOException ex) {
                    Logger.getLogger(ChatHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
                } 
            @Override
            public void run(){
                while(true)
                {
                    String str;
                    int response = 0;
                    String key = null;
                    String value = null;
                    String value1 = null;
                    String value2 = null;
                    String value3 = null;
                    Gson gson = null;
                    JSONObject J_obj = null;
                    String json = null;
                    DtoStudent student = null;
                    DtoStudentPhones studentphone1 = null;
                    DtoStudentPhones studentphone2 = null;
                    DtoCourse course = null;
                    DtoDepartment department = null;
                    DtoHas has = null;
                    DtoStudentPhones studentphone = null;
                    DtoDoctor doctor = null;
                    DtoTeach teach = null;
                    
                    try {
                        
                        str = ear.readLine();
                        J_obj = new JSONObject(str);
                        key = J_obj.getString("key");
                        gson = new Gson();
                        if ("Login".equals(key)){
                            value1 = J_obj.getString("value1");
                            value2 = J_obj.getString("value2");
                            if (value1.equals("root") && value2.equals("root")){
                                json = gson.toJson(1);
                            }
                            else
                                json = gson.toJson(0);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("AddStudent".equals(key)){
                            int response1 = 0;
                            int response2 = 0;
                            int response3 = 0;
                            value1 = J_obj.getString("value1");
                            value2 = J_obj.getString("value2");
                            value3 = J_obj.getString("value3");
                            student = gson.fromJson(value1, DtoStudent.class);
                            studentphone1 = gson.fromJson(value2, DtoStudentPhones.class);
                            studentphone2 = gson.fromJson(value3, DtoStudentPhones.class);
                            response1 = DAO.addStudent(student);
                            if (studentphone1.getNewPhone() != null)
                                response2 = DAO.addStudentPhones(studentphone1);
                            if (studentphone2.getNewPhone() != null)
                                response3 = DAO.addStudentPhones(studentphone2);
                            response = response1;
                            json = gson.toJson(response);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("AddCourse".equals(key)){
                            value = J_obj.getString("value");
                            course = gson.fromJson(value, DtoCourse.class);
                            response = DAO.addCourse(course);
                            json = gson.toJson(response);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("AddDoctor".equals(key)){
                            value = J_obj.getString("value");
                            doctor = gson.fromJson(value, DtoDoctor.class);
                            response = DAO.addDoctor(doctor);
                            json = gson.toJson(response);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("AddDepartment".equals(key)){
                            value = J_obj.getString("value");
                            department = gson.fromJson(value, DtoDepartment.class);
                            response = DAO.addDepartment(department);
                            json = gson.toJson(response);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("DeleteStudent".equals(key)){
                            value = J_obj.getString("value");
                            student = gson.fromJson(value, DtoStudent.class);
                            int res = DAO.selectStudentID(student.getEmail());
                            if (res != -1){
                                response = DAO.deleteStudent(student);
                                response = 1;
                            }
                            else
                                response = 0;
                            json = gson.toJson(response);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("DeleteCourse".equals(key)){
                            value = J_obj.getString("value");
                            course = gson.fromJson(value, DtoCourse.class);
                            int res = DAO.selectCourseID(course.getCourse_Code());
                            System.out.println(res);
                            if (res != -1){
                                response = DAO.deleteCourse(course);
                                response = 1;
                                System.out.println(response);
                            }
                            else
                                response = 0;
                            System.out.println(response);
                            json = gson.toJson(response);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("DeleteDoctor".equals(key)){
                            value = J_obj.getString("value");
                            doctor = gson.fromJson(value, DtoDoctor.class);
                            int res = DAO.selectDoctorID(doctor.getEmail());
                            if (res != -1){
                                response = DAO.deleteDoctor(doctor);
                                response = 1;
                            }
                            else
                                response = 0;
                            json = gson.toJson(response);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("DeleteDepartment".equals(key)){
                            value = J_obj.getString("value");
                            department = gson.fromJson(value, DtoDepartment.class);
                            int res = DAO.selectDepartmentID(department.getDepartment_Code());
                            if (res != -1){
                                response = DAO.deleteDepartment(department);
                            }
                            else
                                response = 2;
                            json = gson.toJson(response);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("UpdateStudent".equals(key)){
                            value1 = J_obj.getString("value1");
                            value2 = J_obj.getString("value2");
                            student = gson.fromJson(value1, DtoStudent.class);
                            studentphone = gson.fromJson(value2, DtoStudentPhones.class);
                            response = DAO.updateStudent(student,studentphone);
                            json = gson.toJson(response);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("UpdateCourse".equals(key)){
                            value = J_obj.getString("value");
                            course = gson.fromJson(value, DtoCourse.class);
                            response = DAO.updateCourse(course);
                            json = gson.toJson(response);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("ShowEnroll".equals(key)){
                            ArrayList<DtoCourse> courses =new ArrayList<>();
                            value = J_obj.getString("value");
                            student = gson.fromJson(value, DtoStudent.class);
                            courses = DAO.showSemesterCourses(student);
                            json = gson.toJson(courses);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("ShowCourseGrade".equals(key)){
                            ArrayList<DtoCourse> courses =new ArrayList<>();
                            value = J_obj.getString("value");
                            student = gson.fromJson(value, DtoStudent.class);
                            courses = DAO.showStudentCourses(student);
                            json = gson.toJson(courses);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("ShowAddDoctorCourse".equals(key)){
                            ArrayList<DtoCourse> courses =new ArrayList<>();
                            value = J_obj.getString("value");
                            doctor = gson.fromJson(value, DtoDoctor.class);
                            courses = DAO.showDoctorNotCourses(doctor);
                            json = gson.toJson(courses);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("ShowDeleteDoctorCourse".equals(key)){
                            ArrayList<DtoCourse> courses =new ArrayList<>();
                            value = J_obj.getString("value");
                            doctor = gson.fromJson(value, DtoDoctor.class);
                            courses = DAO.showDoctorCourses(doctor);
                            json = gson.toJson(courses);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("ShowReportCourses".equals(key)){
                            ArrayList<DtoCourse> courses =new ArrayList<>();
                            courses = DAO.showCourses();
                            json = gson.toJson(courses);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("CGPA".equals(key)){
                            value = J_obj.getString("value");
                            student = gson.fromJson(value, DtoStudent.class);
                            double cgpa = DAO.getCGPA(student);
                            json = gson.toJson(cgpa);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("SGPA".equals(key)){
                            value = J_obj.getString("value");
                            student = gson.fromJson(value, DtoStudent.class);
                            double sgpa = DAO.getSemesterGPA(student);
                            json = gson.toJson(sgpa);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("AddCourseDoctor".equals(key)){
                            value = J_obj.getString("value");
                            teach = gson.fromJson(value, DtoTeach.class);
                            response = DAO.addTeach(teach);
                            json = gson.toJson(response);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("DeleteCourseDoctor".equals(key)){
                            value = J_obj.getString("value");
                            teach = gson.fromJson(value, DtoTeach.class);
                            response = DAO.deleteTeach(teach);
                            json = gson.toJson(response);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("Enroll".equals(key)){
                            value = J_obj.getString("value");
                            has = gson.fromJson(value, DtoHas.class);
                            response = DAO.addTake(has);
                            json = gson.toJson(response);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("CourseGPA".equals(key)){
                            value = J_obj.getString("value");
                            has = gson.fromJson(value, DtoHas.class);
                            response = DAO.addHas(has);
                            json = gson.toJson(response);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value",json);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        else if ("ShowReport".equals(key)){
                            ArrayList<DtoStudent> students =new ArrayList<>();
                            value = J_obj.getString("value");
                            course = gson.fromJson(value, DtoCourse.class);
                            students = DAO.showStudents(course);
                            double avggpa = DAO.getCourseAVG_GPA(course);
                            String json1 = gson.toJson(students);
                            String json2 = gson.toJson(avggpa);
                            JsonObject J_obj_R = new JsonObject();
                            J_obj_R.addProperty("key", "R");
                            J_obj_R.addProperty("value1",json1);
                            J_obj_R.addProperty("value2",json2);
                            mouth.println(J_obj_R);
                            mouth.flush();
                        }
                        } catch (IOException ex) {
                        Logger.getLogger(ChatHandler.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(ChatHandler.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
            }       
        }
            
}
        

        

    

