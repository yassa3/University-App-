/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Date;

/**
 *
 * @author Yassa Rashad
 */
public class DtoStudent {
    private String FName;
    private String LName;
    private String Email;
    private Date DoB;
    private String Gender;
    private String City;
    private String Street;
    private String Semester;
    private double GPA;
    private String Department_Code;

    public DtoStudent(String FName, String LName, String Email, Date DoB, String Gender, String City, String Street, String Semester, String Department_Code) {
        this.FName = FName;
        this.LName = LName;
        this.Email = Email;
        this.DoB = DoB;
        this.Gender = Gender;
        this.City = City;
        this.Street = Street;
        this.Semester = Semester;
        this.Department_Code = Department_Code;
    }

    public DtoStudent(String Email, String City, String Street, String Semester, String Department_Code) {
        this.Email = Email;
        this.City = City;
        this.Street = Street;
        this.Semester = Semester;
        this.Department_Code = Department_Code;
    }

    public DtoStudent(String FName, String LName, String Email, String Semester, String Department_Code, String Gender) {
        this.FName = FName;
        this.LName = LName;
        this.Email = Email;
        this.Gender = Gender;
        this.Semester = Semester;
        this.Department_Code = Department_Code;
    }
    

    public DtoStudent(String Email, String Semester) {
        this.Email = Email;
        this.Semester = Semester;
    }


    public DtoStudent(String Email) {
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

    public Date getDoB() {
        return DoB;
    }

    public void setDoB(Date DoB) {
        this.DoB = DoB;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getDepartment_Code() {
        return Department_Code;
    }

    public void setDepartment_Code(String Department_Code) {
        this.Department_Code = Department_Code;
    }
    
   
    
}
