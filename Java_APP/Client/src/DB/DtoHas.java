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
public class DtoHas {
    private String Email;
    private String Course_Code;
    private String Grade;

    public DtoHas(String Email, String Course_Code, String Grade) {
        this.Email = Email;
        this.Course_Code = Course_Code;
        this.Grade = Grade;
    }

    public DtoHas(String Email, String Course_Code) {
        this.Email = Email;
        this.Course_Code = Course_Code;
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String getCourse_Code() {
        return Course_Code;
    }

    public void setCourse_Code(String Course_Code) {
        this.Course_Code = Course_Code;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }
    
}
