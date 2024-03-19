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
public class DtoStudentPhones {
    private String Email;
    private String oldPhone;
    private String newPhone;

    public DtoStudentPhones(String Email, String newPhone) {
        this.Email = Email;
        this.newPhone = newPhone;
    }

    public DtoStudentPhones(String Email, String oldPhone, String newPhone) {
        this.Email = Email;
        this.oldPhone = oldPhone;
        this.newPhone = newPhone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getOldPhone() {
        return oldPhone;
    }

    public void setOldPhone(String oldPhone) {
        this.oldPhone = oldPhone;
    }

    public String getNewPhone() {
        return newPhone;
    }

    public void setNewPhone(String newPhone) {
        this.newPhone = newPhone;
    }
    
    
    
}
