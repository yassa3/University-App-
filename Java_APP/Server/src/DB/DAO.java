/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

/**
 *
 * @author Yassa Rashad
 */
public class DAO {
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String DB_USER = "University";
    private static final String DB_PASSWORD = "787898";
    public static int  addStudent(DtoStudent student) throws SQLException{
        int result=0;
        Connection con =DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try (CallableStatement statement = con.prepareCall("{call INSERT_STUDENT_INFO(?, ?, ?, ?, ?, ?, ?, ?, ?)}")){
            statement.setString(1,student.getFName());
            statement.setString(2,student.getLName());
            statement.setString(3,student.getEmail());
            statement.setDate(4,student.getDoB());
            statement.setString(5,student.getGender());
            statement.setString(6,student.getSemester());
            statement.setString(7,student.getCity());
            statement.setString(8,student.getStreet());
            statement.setString(9,student.getDepartment_Code());
            result =statement.executeUpdate();
            con.close();
            statement.close();
        }
        catch (SQLException e) {
            result = 0;
        }
        
        return result;
    }
    public static int  addStudentPhones(DtoStudentPhones studentphone) throws SQLException{
        int result=0;
        Connection con =DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try (CallableStatement statement = con.prepareCall("{call INSERT_STUDENT_PHONES(?,?)}")){
            statement.setString(1,studentphone.getEmail());
            statement.setString(2,studentphone.getNewPhone());
            result =statement.executeUpdate();
            con.close();
            statement.close();
        }catch (SQLException e) {
            result = 0;
        }
        return result;
    }
    public static int  addDoctor(DtoDoctor doctor) throws SQLException{
        int result=0;
        Connection con =DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try (CallableStatement statement = con.prepareCall("{call INSERT_DOCTOR_INFO(?,?,?,?)}")){
            statement.setString(1,doctor.getFName());
            statement.setString(2,doctor.getLName());
            statement.setString(3,doctor.getEmail());
            statement.setString(4,doctor.getDepartment_Code());
            result =statement.executeUpdate();
            con.close();
            statement.close();
        }catch (SQLException e) {
            result = 0;
        }
        return result;
    }
    public static int  addCourse(DtoCourse course) throws SQLException{
        int result=0;
        Connection con =DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try (CallableStatement statement = con.prepareCall("{call INSERT_COURSE_INFO(?,?,?,?,?)}")){
            statement.setString(1,course.getCourse_Name());
            statement.setInt(2,course.getHours());
            statement.setString(3,course.getCourse_Code());
            statement.setString(4,course.getSemester());
            statement.setString(5,course.getDepartment_Code());
            result =statement.executeUpdate();
            con.close();
            statement.close();
        }catch (SQLException e) {
            result = 0;
        }
        return result;
    }
    public static int  addDepartment(DtoDepartment department) throws SQLException{
        int result=0;
        Connection con =DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try (CallableStatement statement = con.prepareCall("{call INSERT_DEPARTMENT_INFO(?,?)}")){
            statement.setString(1,department.getDepartment_Name());
            statement.setString(2,department.getDepartment_Code());
            result =statement.executeUpdate();
            con.close();
            statement.close();
        }catch (SQLException e) {
            result = 0;
        }
        return result;
    }
    public static int  deleteStudent(DtoStudent student) throws SQLException{
        int result=0;
        Connection con =DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try (CallableStatement statement = con.prepareCall("{call DELETE_STUDENT(?)}")){
            statement.setString(1,student.getEmail());
            result =statement.executeUpdate();
            con.close();
            statement.close();
        }catch (SQLException e) {
            result = 0;
        }
        return result;
    }
    public static int  deleteDoctor(DtoDoctor doctor) throws SQLException{
        int result=0;
        Connection con =DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try (CallableStatement statement = con.prepareCall("{call DELETE_DOCTOR(?)}")){
            statement.setString(1,doctor.getEmail());
            result =statement.executeUpdate();
            con.close();
            statement.close();
        }catch (SQLException e) {
            result = 0;
        }
        return result;
    }
    public static int  deleteCourse(DtoCourse course) throws SQLException{
        int result=0;
        Connection con =DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try (CallableStatement statement = con.prepareCall("{call DELETE_COURSE(?)}")){
            statement.setString(1,course.getCourse_Code());
            result =statement.executeUpdate();
            con.close();
            statement.close();
        }catch (SQLException e) {
            result = 0;
        }
        return result;
    }
    public static int  deleteDepartment(DtoDepartment department) throws SQLException{
        int result=-1;
        Connection con =DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try (CallableStatement statement = con.prepareCall("{call DELETE_DEPARTMENT(?)}")){
            statement.setString(1,department.getDepartment_Code());
            result =statement.executeUpdate();
            result = 1;
            con.close();
            statement.close();
        }catch (SQLException e) {
            result = 0;
        }
        return result;
    }
    public static int  updateStudent(DtoStudent student,DtoStudentPhones studentphone) throws SQLException{
        int result=0;
        Connection con =DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try (CallableStatement statement = con.prepareCall("{call UPD_STUDENT_INFO(?,?,?,?,?,?,?)}")){
            statement.setString(1,student.getEmail());
            statement.setString(2,studentphone.getOldPhone());
            statement.setString(3,studentphone.getNewPhone());
            statement.setString(4,student.getSemester());
            statement.setString(5,student.getCity());
            statement.setString(6,student.getStreet());
            statement.setString(7,student.getDepartment_Code());
            result =statement.executeUpdate();
            con.close();
            statement.close();
        }catch (SQLException e) {
            result = 0;
        }    
        return result;
    }
    public static int  updateCourse(DtoCourse course) throws SQLException{
        int result=0;
        Connection con =DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try (CallableStatement statement = con.prepareCall("{call UPD_COURSE_INFO(?,?,?,?)}")){
            statement.setString(1,course.getCourse_Code());
            statement.setInt(2,course.getHours());
            statement.setString(3,course.getSemester());
            statement.setString(4,course.getDepartment_Code());
            result =statement.executeUpdate();
            con.close();
            statement.close();
        }catch (SQLException e) {
            result = 0;
        }      
        return result;
    }
    public static int  addTake(DtoHas take) throws SQLException{
        int result=0;
        Connection con =DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try (CallableStatement statement = con.prepareCall("{call INSERT_TAKE(?,?)}")){
            statement.setString(1,take.getEmail());
            statement.setString(2,take.getCourse_Code());
            result =statement.executeUpdate();
            con.close();
            statement.close();
        }catch (SQLException e) {
            result = 0;
        }  
        return result;
    }
    public static int  addHas(DtoHas has) throws SQLException{
        int result=0;
        Connection con =DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try (CallableStatement statement = con.prepareCall("{call INSERT_HAS(?,?,?)}")){
            statement.setString(1,has.getEmail());
            statement.setString(2,has.getCourse_Code());
            statement.setString(3,has.getGrade());
            result =statement.executeUpdate();
            con.close();
            statement.close();
        }catch (SQLException e) {
            result = 0;
        }  
        return result;
    }
    public static int  addTeach(DtoTeach teach) throws SQLException{
        int result=0;
        Connection con =DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try (CallableStatement statement = con.prepareCall("{call INSERT_TEACH(?,?)}")){
            statement.setString(1,teach.getEmail());
            statement.setString(2,teach.getCourse_Code());
            result =statement.executeUpdate();
            con.close();
            statement.close();
        }catch (SQLException e) {
            result = 0;
        }  
        return result;
    }
    public static int  deleteTeach(DtoTeach teach) throws SQLException{
        int result=0;
        Connection con =DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try (CallableStatement statement = con.prepareCall("{call DELETE_TEACH(?,?)}")){
            statement.setString(1,teach.getEmail());
            statement.setString(2,teach.getCourse_Code());
            result =statement.executeUpdate();
            con.close();
            statement.close();
        }catch (SQLException e) {
            result = 0;
        } 
        return result;
    }
    public static Double getCGPA(DtoStudent student) throws SQLException {
        double CGPA = 0;
        Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        CallableStatement select = con.prepareCall("{? = call CALC_GPA(?)}");
        select.registerOutParameter(1, Types.DOUBLE);
        select.setString(2,student.getEmail());
        select.executeQuery();
        CGPA = select.getDouble(1);
        select.close();
        con.close();
        return CGPA;
    }
    public static Double getSemesterGPA(DtoStudent student) throws SQLException {
        double SemesterGPA = 0;
        int id = 0;
        id = selectStudentID(student.getEmail());
        Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        PreparedStatement ps_sel2 = con.prepareStatement("Select gpa from gpa_history where student_id = ? and semester = ?");
        ps_sel2.setInt(1,id);
        ps_sel2.setString(2,student.getSemester());
        ResultSet resultset2 = ps_sel2.executeQuery();
        while (resultset2.next()) {
            SemesterGPA = resultset2.getDouble(1);
        }
        ps_sel2.close();
        con.close();
        return SemesterGPA;
    }
    public static ArrayList<DtoCourse> showSemesterCourses(DtoStudent student) throws SQLException {
        ArrayList<DtoCourse> Courses = new ArrayList<>();
        String Code;
        String Semester = null;
        int id = 0;
        id = selectStudentID(student.getEmail());
        Connection con = DriverManager.getConnection(DB_URL,DB_USER, DB_PASSWORD);
        PreparedStatement semester = con.prepareStatement("select semester from students where student_id = ?");
        semester.setInt(1,id);
        ResultSet resultsetsem = semester.executeQuery();
        while (resultsetsem.next()) {
            Semester = resultsetsem.getString(1);
        }  
        PreparedStatement ps = con.prepareStatement("select course_code, course_name, semester, hours, department_id from courses c where c.course_id not in (select h.course_id from has h where h.student_id = ?) and c.semester = ?");
        ps.setInt(1,id);
        ps.setString(2,Semester);
        ResultSet resultset = ps.executeQuery();
        while (resultset.next()) {
            Code = selectDepartmentCode(resultset.getInt(5));
            Courses.add(new DtoCourse(resultset.getString(2),resultset.getString(1),resultset.getInt(4),resultset.getString(3),Code));
        }  
        ps.close();
        con.close();
        return Courses;
    }
    public static ArrayList<DtoCourse> showStudentCourses(DtoStudent student) throws SQLException {
        ArrayList<DtoCourse> Courses = new ArrayList<>();
        String Code;
        int id = 0;
        id = selectStudentID(student.getEmail());
        Connection con = DriverManager.getConnection(DB_URL,DB_USER, DB_PASSWORD);
        PreparedStatement ps = con.prepareStatement("select course_code,course_name,semester,hours,department_id from has h join courses c on h.course_id = c.course_id where student_id = ? and grade is null");
        ps.setInt(1,id);
        ResultSet resultset = ps.executeQuery();
        while (resultset.next()) {
            Code = selectDepartmentCode(resultset.getInt(5));
            Courses.add(new DtoCourse(resultset.getString(2),resultset.getString(1),resultset.getInt(4),resultset.getString(3),Code));
        }  
        ps.close();
        con.close();
        return Courses;
    }
    public static ArrayList<DtoCourse> showDoctorNotCourses(DtoDoctor doctor) throws SQLException {
        ArrayList<DtoCourse> Courses = new ArrayList<>();
        String Code;
        int id = 0;
        id = selectDoctorID(doctor.getEmail());
        Connection con = DriverManager.getConnection(DB_URL,DB_USER, DB_PASSWORD);
        PreparedStatement ps = con.prepareStatement("select course_code, course_name, semester, hours, department_id from courses c where c.course_id not in (select t.course_id from teach t where t.doctor_id = ?)");
        ps.setInt(1,id);
        ResultSet resultset = ps.executeQuery();
        while (resultset.next()) {
            Code = selectDepartmentCode(resultset.getInt(5));
            Courses.add(new DtoCourse(resultset.getString(2),resultset.getString(1),resultset.getInt(4),resultset.getString(3),Code));
        }  
        ps.close();
        con.close();
        return Courses;
    }
    public static ArrayList<DtoCourse> showCourses() throws SQLException {
        ArrayList<DtoCourse> Courses = new ArrayList<>();
        String Code;
        Connection con = DriverManager.getConnection(DB_URL,DB_USER, DB_PASSWORD);
        PreparedStatement ps = con.prepareStatement("select course_code,course_name,semester,hours,department_id from courses");
        ResultSet resultset = ps.executeQuery();
        while (resultset.next()) {
            Code = selectDepartmentCode(resultset.getInt(5));
            Courses.add(new DtoCourse(resultset.getString(2),resultset.getString(1),resultset.getInt(4),resultset.getString(3),Code));
        }  
        ps.close();
        con.close();
        return Courses;
    }
    public static ArrayList<DtoCourse> showDoctorCourses(DtoDoctor doctor) throws SQLException {
        ArrayList<DtoCourse> Courses = new ArrayList<>();
        String Code;
        int id = 0;
        id = selectDoctorID(doctor.getEmail());
        Connection con = DriverManager.getConnection(DB_URL,DB_USER, DB_PASSWORD);
        PreparedStatement ps = con.prepareStatement("select course_code,course_name,semester,hours,department_id from teach t join courses c on t.course_id = c.course_id where doctor_id = ?");
        ps.setInt(1,id);
        ResultSet resultset = ps.executeQuery();
        while (resultset.next()) {
            Code = selectDepartmentCode(resultset.getInt(5));
            Courses.add(new DtoCourse(resultset.getString(2),resultset.getString(1),resultset.getInt(4),resultset.getString(3),Code));
        }  
        ps.close();
        con.close();
        return Courses;
    }
    public static ArrayList<DtoStudent> showStudents(DtoCourse course) throws SQLException {
        ArrayList<DtoStudent> Students = new ArrayList<>();
        String Code;
        int id;
        id = selectCourseID(course.getCourse_Code());
        Connection con = DriverManager.getConnection(DB_URL,DB_USER, DB_PASSWORD);
        PreparedStatement ps = con.prepareStatement("select fname,lname,email,semester,department_id,gender from has h join students s on h.student_id = s.student_id where grade is not null and course_id = ?");
        ps.setInt(1,id);
        ResultSet resultset = ps.executeQuery();
        while (resultset.next()) {
            Code = selectDepartmentCode(resultset.getInt(5));
            Students.add(new DtoStudent(resultset.getString(1),resultset.getString(2),resultset.getString(3),resultset.getString(4),Code,resultset.getString(6)));
        }  
        ps.close();
        con.close();
        return Students;
    }
    public static Double getCourseAVG_GPA(DtoCourse course) throws SQLException {
        double AVG_GPA = 0;
        Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        CallableStatement select = con.prepareCall("{? = call CALC_COURSE_AVG_GPA(?)}");
        select.registerOutParameter(1, Types.DOUBLE);
        select.setString(2,course.getCourse_Code());
        select.executeQuery();
        AVG_GPA = select.getDouble(1);
        select.close();
        con.close();
        return AVG_GPA;
    }
    public static String selectDepartmentCode(int deptartment_id) throws SQLException {
        String Code = null;
        Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        PreparedStatement ps_sel = con.prepareStatement("select department_code from departments where department_id = ?");
        ps_sel.setInt(1,deptartment_id);
        ResultSet resultset = ps_sel.executeQuery();
        while (resultset.next()) {
            Code = resultset.getString(1);
        }
        ps_sel.close();
        con.close();
        return Code;
    }
    public static int selectStudentID(String email) throws SQLException {
        int id = -1;
        Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try(CallableStatement select = con.prepareCall("{? = call GET_STUDENT_ID(?)}")){
            select.registerOutParameter(1, Types.INTEGER);
            select.setString(2,email);
            select.executeQuery();
            id = select.getInt(1);
            select.close();
            con.close();
        }catch (SQLException e) {
            id = -1;
        } 
        return id;
    }
    public static int selectDoctorID(String email) throws SQLException {
        int id = -1;
        Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try(CallableStatement select = con.prepareCall("{? = call GET_DOCTOR_ID(?)}")){
            select.registerOutParameter(1, Types.INTEGER);
            select.setString(2,email);
            select.executeQuery();
            id = select.getInt(1);
            select.close();
            con.close();
        }catch (SQLException e) {
            id = -1;
        } 
        return id;
    }
    public static int selectCourseID(String code) throws SQLException {
        int id = -1;
        Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try(CallableStatement select = con.prepareCall("{? = call GET_COURSE_ID(?)}")){
            select.registerOutParameter(1, Types.INTEGER);
            select.setString(2,code);
            select.executeQuery();
            id = select.getInt(1);
            select.close();
            con.close();
        }catch (SQLException e) {
            id = -1;
        } 
        return id;
    }
    public static int selectDepartmentID(String code) throws SQLException {
        int id = -1;
        Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        try(CallableStatement select = con.prepareCall("{? = call GET_DEPT_ID(?)}")){
            select.registerOutParameter(1, Types.INTEGER);
            select.setString(2,code);
            select.executeQuery();
            id = select.getInt(1);
            select.close();
            con.close();
        }catch (SQLException e) {
            id = -1;
        } 
        return id;
    }
}
