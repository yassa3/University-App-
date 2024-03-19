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
public class DtoDepartment {
    private String Department_Name;
    private String Department_Code;

    public DtoDepartment(String Department_Name, String Department_Code) {
        this.Department_Name = Department_Name;
        this.Department_Code = Department_Code;
    }

    public DtoDepartment(String Department_Code) {
        this.Department_Code = Department_Code;
    }

    public String getDepartment_Name() {
        return Department_Name;
    }

    public void setDepartment_Name(String Department_Name) {
        this.Department_Name = Department_Name;
    }

    public String getDepartment_Code() {
        return Department_Code;
    }

    public void setDepartment_Code(String Department_Code) {
        this.Department_Code = Department_Code;
    }
    
}
