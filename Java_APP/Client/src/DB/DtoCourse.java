/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author Yassa Rashad
 */
public class DtoCourse {
    private String Course_Name;
    private String Course_Code;
    private int Hours;
    private String Semester;
    private String Department_Code;

    public DtoCourse(String Course_Name, String Course_Code, int Hours, String Semester, String Department_Code) {
        this.Course_Name = Course_Name;
        this.Course_Code = Course_Code;
        this.Hours = Hours;
        this.Semester = Semester;
        this.Department_Code = Department_Code;
    }

    public DtoCourse(String Course_Code, int Hours, String Semester, String Department_Code) {
        this.Course_Code = Course_Code;
        this.Hours = Hours;
        this.Semester = Semester;
        this.Department_Code = Department_Code;
    }
    
    public DtoCourse(String Course_Code) {
        this.Course_Code = Course_Code;
    }

    public String getCourse_Name() {
        return Course_Name;
    }

    public void setCourse_Name(String Course_Name) {
        this.Course_Name = Course_Name;
    }

    public String getCourse_Code() {
        return Course_Code;
    }

    public void setCourse_Code(String Course_Code) {
        this.Course_Code = Course_Code;
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int Hours) {
        this.Hours = Hours;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getDepartment_Code() {
        return Department_Code;
    }

    public void setDepartment_Code(String Department_Code) {
        this.Department_Code = Department_Code;
    }
    
    
}
