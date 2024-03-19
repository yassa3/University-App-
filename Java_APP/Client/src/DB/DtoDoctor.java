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
public class DtoDoctor {
    private String FName;
    private String LName;
    private String Email;
    private String Department_Code;

    public DtoDoctor(String FName, String LName, String Email, String Department_Code) {
        this.FName = FName;
        this.LName = LName;
        this.Email = Email;
        this.Department_Code = Department_Code;
    }

    public DtoDoctor(String Email) {
        this.Email = Email;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDepartment_Code() {
        return Department_Code;
    }

    public void setDepartment_Code(String Department_Code) {
        this.Department_Code = Department_Code;
    }
    
}
