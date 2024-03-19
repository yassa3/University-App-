package Scenes;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.sql.Date;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class StudentsBase extends AnchorPane {

    protected final ImageView imageView;
    protected final Button Students;
    protected final Button Courses;
    protected final Button Doctors;
    protected final Button Departments;
    protected final Label user_label10;
    protected final Button delete;
    protected final Button Grades;
    protected final Button Enroll;
    protected final Button Update;
    protected final Button Gpa;
    protected final Label user_label101;
    protected final Label user_label102;
    protected final Label user_label103;
    protected final Label user_label104;
    protected final Label user_label105;
    protected final Label user_label106;
    protected final Label user_label107;
    protected final Label user_label108;
    protected final Label user_label109;
    protected final Label user_label1010;
    protected final TextField fname_txt;
    protected final Reflection reflection;
    protected final DatePicker date_txt;
    protected final TextField street_txt;
    protected final Reflection reflection0;
    protected final TextField semester_txt;
    protected final Reflection reflection1;
    protected final TextField dept_code_txt;
    protected final Reflection reflection2;
    protected final TextField city_txt;
    protected final Reflection reflection3;
    protected final TextField phone2_txt;
    protected final Reflection reflection4;
    protected final TextField phone1_txt;
    protected final Reflection reflection5;
    protected final TextField gender_txt;
    protected final Reflection reflection6;
    protected final TextField lname_txt;
    protected final Reflection reflection7;
    protected final TextField email_txt;
    protected final Reflection reflection8;
    protected final Button Enter;
    protected final Text err_txt;

    public StudentsBase() {

        imageView = new ImageView();
        Students = new Button();
        Courses = new Button();
        Doctors = new Button();
        Departments = new Button();
        user_label10 = new Label();
        delete = new Button();
        Grades = new Button();
        Enroll = new Button();
        Update = new Button();
        Gpa = new Button();
        user_label101 = new Label();
        user_label102 = new Label();
        user_label103 = new Label();
        user_label104 = new Label();
        user_label105 = new Label();
        user_label106 = new Label();
        user_label107 = new Label();
        user_label108 = new Label();
        user_label109 = new Label();
        user_label1010 = new Label();
        fname_txt = new TextField();
        reflection = new Reflection();
        date_txt = new DatePicker();
        street_txt = new TextField();
        reflection0 = new Reflection();
        semester_txt = new TextField();
        reflection1 = new Reflection();
        dept_code_txt = new TextField();
        reflection2 = new Reflection();
        city_txt = new TextField();
        reflection3 = new Reflection();
        phone2_txt = new TextField();
        reflection4 = new Reflection();
        phone1_txt = new TextField();
        reflection5 = new Reflection();
        gender_txt = new TextField();
        reflection6 = new Reflection();
        lname_txt = new TextField();
        reflection7 = new Reflection();
        email_txt = new TextField();
        reflection8 = new Reflection();
        Enter = new Button();
        err_txt = new Text();

        setId("AnchorPane");
        setPrefHeight(900.0);
        setPrefWidth(800.0);

        imageView.setFitHeight(900.0);
        imageView.setFitWidth(800.0);
        imageView.setImage(new Image(getClass().getResource("Images/Students.png").toExternalForm()));

        Students.setLayoutX(67.0);
        Students.setLayoutY(74.0);
        Students.setMnemonicParsing(false);
        Students.setPrefHeight(45.0);
        Students.setPrefWidth(145.0);
        Students.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 18; -fx-font-weight: bold;");
        Students.setText("Students");
        Students.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        Students.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        Courses.setLayoutX(423.0);
        Courses.setLayoutY(74.0);
        Courses.setMnemonicParsing(false);
        Courses.setPrefHeight(45.0);
        Courses.setPrefWidth(145.0);
        Courses.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 18; -fx-font-weight: bold;");
        Courses.setText("Courses");
        Courses.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        Courses.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        Doctors.setLayoutX(246.0);
        Doctors.setLayoutY(74.0);
        Doctors.setMnemonicParsing(false);
        Doctors.setPrefHeight(45.0);
        Doctors.setPrefWidth(145.0);
        Doctors.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 18; -fx-font-weight: bold;");
        Doctors.setText("Doctors");
        Doctors.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        Doctors.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        Departments.setLayoutX(596.0);
        Departments.setLayoutY(74.0);
        Departments.setMnemonicParsing(false);
        Departments.setPrefHeight(45.0);
        Departments.setPrefWidth(145.0);
        Departments.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 18; -fx-font-weight: bold;");
        Departments.setText("Departments");
        Departments.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        Departments.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        user_label10.setLayoutX(246.0);
        user_label10.setLayoutY(167.0);
        user_label10.setPrefHeight(45.0);
        user_label10.setPrefWidth(198.0);
        user_label10.setText("First Name");
        user_label10.setFont(new Font("System Bold", 25.0));

        delete.setLayoutX(67.0);
        delete.setLayoutY(607.0);
        delete.setMnemonicParsing(false);
        delete.setPrefHeight(45.0);
        delete.setPrefWidth(145.0);
        delete.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 17; -fx-font-weight: bold;");
        delete.setText("Delete Student");
        delete.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        delete.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        Grades.setLayoutX(67.0);
        Grades.setLayoutY(390.0);
        Grades.setMnemonicParsing(false);
        Grades.setPrefHeight(45.0);
        Grades.setPrefWidth(145.0);
        Grades.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 18; -fx-font-weight: bold;");
        Grades.setText("Grades");
        Grades.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        Grades.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        Enroll.setLayoutX(67.0);
        Enroll.setLayoutY(276.0);
        Enroll.setMnemonicParsing(false);
        Enroll.setPrefHeight(45.0);
        Enroll.setPrefWidth(145.0);
        Enroll.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 18; -fx-font-weight: bold;");
        Enroll.setText("Enroll Courses");
        Enroll.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        Enroll.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        Update.setLayoutX(67.0);
        Update.setLayoutY(166.0);
        Update.setMnemonicParsing(false);
        Update.setPrefHeight(45.0);
        Update.setPrefWidth(145.0);
        Update.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 18; -fx-font-weight: bold;");
        Update.setText("Update Info");
        Update.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        Update.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        Gpa.setLayoutX(67.0);
        Gpa.setLayoutY(495.0);
        Gpa.setMnemonicParsing(false);
        Gpa.setPrefHeight(45.0);
        Gpa.setPrefWidth(145.0);
        Gpa.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 18; -fx-font-weight: bold;");
        Gpa.setText("GPA");
        Gpa.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        Gpa.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        user_label101.setLayoutX(246.0);
        user_label101.setLayoutY(549.0);
        user_label101.setPrefHeight(45.0);
        user_label101.setPrefWidth(198.0);
        user_label101.setText("City");
        user_label101.setFont(new Font("System Bold", 25.0));

        user_label102.setLayoutX(246.0);
        user_label102.setLayoutY(731.0);
        user_label102.setPrefHeight(45.0);
        user_label102.setPrefWidth(210.0);
        user_label102.setText("Department Code");
        user_label102.setFont(new Font("System Bold", 25.0));

        user_label103.setLayoutX(246.0);
        user_label103.setLayoutY(607.0);
        user_label103.setPrefHeight(45.0);
        user_label103.setPrefWidth(198.0);
        user_label103.setText("Street");
        user_label103.setFont(new Font("System Bold", 25.0));

        user_label104.setLayoutX(246.0);
        user_label104.setLayoutY(334.0);
        user_label104.setPrefHeight(45.0);
        user_label104.setPrefWidth(198.0);
        user_label104.setText("Dob");
        user_label104.setFont(new Font("System Bold", 25.0));

        user_label105.setLayoutX(246.0);
        user_label105.setLayoutY(277.0);
        user_label105.setPrefHeight(45.0);
        user_label105.setPrefWidth(198.0);
        user_label105.setText("Email");
        user_label105.setFont(new Font("System Bold", 25.0));

        user_label106.setLayoutX(246.0);
        user_label106.setLayoutY(496.0);
        user_label106.setPrefHeight(45.0);
        user_label106.setPrefWidth(198.0);
        user_label106.setText("Phone2");
        user_label106.setFont(new Font("System Bold", 25.0));

        user_label107.setLayoutX(246.0);
        user_label107.setLayoutY(668.0);
        user_label107.setPrefHeight(45.0);
        user_label107.setPrefWidth(198.0);
        user_label107.setText("Semester");
        user_label107.setFont(new Font("System Bold", 25.0));

        user_label108.setLayoutX(246.0);
        user_label108.setLayoutY(442.0);
        user_label108.setPrefHeight(45.0);
        user_label108.setPrefWidth(198.0);
        user_label108.setText("Phone1");
        user_label108.setFont(new Font("System Bold", 25.0));

        user_label109.setLayoutX(246.0);
        user_label109.setLayoutY(391.0);
        user_label109.setPrefHeight(45.0);
        user_label109.setPrefWidth(198.0);
        user_label109.setText("Gender");
        user_label109.setFont(new Font("System Bold", 25.0));

        user_label1010.setLayoutX(246.0);
        user_label1010.setLayoutY(224.0);
        user_label1010.setPrefHeight(45.0);
        user_label1010.setPrefWidth(198.0);
        user_label1010.setText("Last Name");
        user_label1010.setFont(new Font("System Bold", 25.0));

        fname_txt.setLayoutX(466.0);
        fname_txt.setLayoutY(174.0);
        fname_txt.setPrefHeight(32.0);
        fname_txt.setPrefWidth(261.0);
        fname_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection.setBottomOpacity(0.1);
        reflection.setTopOffset(0.1);
        reflection.setTopOpacity(0.25);
        fname_txt.setEffect(reflection);

        date_txt.setLayoutX(466.0);
        date_txt.setLayoutY(341.0);
        date_txt.setPrefHeight(31.0);
        date_txt.setPrefWidth(261.0);
        date_txt.setStyle("-fx-background-color: transparent;");

        street_txt.setLayoutX(466.0);
        street_txt.setLayoutY(614.0);
        street_txt.setPrefHeight(32.0);
        street_txt.setPrefWidth(261.0);
        street_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection0.setBottomOpacity(0.1);
        reflection0.setTopOffset(0.1);
        reflection0.setTopOpacity(0.25);
        street_txt.setEffect(reflection0);

        semester_txt.setLayoutX(466.0);
        semester_txt.setLayoutY(675.0);
        semester_txt.setPrefHeight(32.0);
        semester_txt.setPrefWidth(261.0);
        semester_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection1.setBottomOpacity(0.1);
        reflection1.setTopOffset(0.1);
        reflection1.setTopOpacity(0.25);
        semester_txt.setEffect(reflection1);

        dept_code_txt.setLayoutX(466.0);
        dept_code_txt.setLayoutY(738.0);
        dept_code_txt.setPrefHeight(32.0);
        dept_code_txt.setPrefWidth(261.0);
        dept_code_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection2.setBottomOpacity(0.1);
        reflection2.setTopOffset(0.1);
        reflection2.setTopOpacity(0.25);
        dept_code_txt.setEffect(reflection2);

        city_txt.setLayoutX(466.0);
        city_txt.setLayoutY(556.0);
        city_txt.setPrefHeight(32.0);
        city_txt.setPrefWidth(261.0);
        city_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection3.setBottomOpacity(0.1);
        reflection3.setTopOffset(0.1);
        reflection3.setTopOpacity(0.25);
        city_txt.setEffect(reflection3);

        phone2_txt.setLayoutX(466.0);
        phone2_txt.setLayoutY(503.0);
        phone2_txt.setPrefHeight(32.0);
        phone2_txt.setPrefWidth(261.0);
        phone2_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection4.setBottomOpacity(0.1);
        reflection4.setTopOffset(0.1);
        reflection4.setTopOpacity(0.25);
        phone2_txt.setEffect(reflection4);

        phone1_txt.setLayoutX(466.0);
        phone1_txt.setLayoutY(449.0);
        phone1_txt.setPrefHeight(32.0);
        phone1_txt.setPrefWidth(261.0);
        phone1_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection5.setBottomOpacity(0.1);
        reflection5.setTopOffset(0.1);
        reflection5.setTopOpacity(0.25);
        phone1_txt.setEffect(reflection5);

        gender_txt.setLayoutX(466.0);
        gender_txt.setLayoutY(398.0);
        gender_txt.setPrefHeight(32.0);
        gender_txt.setPrefWidth(261.0);
        gender_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection6.setBottomOpacity(0.1);
        reflection6.setTopOffset(0.1);
        reflection6.setTopOpacity(0.25);
        gender_txt.setEffect(reflection6);

        lname_txt.setLayoutX(466.0);
        lname_txt.setLayoutY(231.0);
        lname_txt.setPrefHeight(32.0);
        lname_txt.setPrefWidth(261.0);
        lname_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection7.setBottomOpacity(0.1);
        reflection7.setTopOffset(0.1);
        reflection7.setTopOpacity(0.25);
        lname_txt.setEffect(reflection7);

        email_txt.setLayoutX(466.0);
        email_txt.setLayoutY(284.0);
        email_txt.setPrefHeight(32.0);
        email_txt.setPrefWidth(261.0);
        email_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection8.setBottomOpacity(0.1);
        reflection8.setTopOffset(0.1);
        reflection8.setTopOpacity(0.25);
        email_txt.setEffect(reflection8);

        Enter.setLayoutX(384.0);
        Enter.setLayoutY(823.0);
        Enter.setMnemonicParsing(false);
        Enter.setPrefHeight(45.0);
        Enter.setPrefWidth(145.0);
        Enter.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 17; -fx-font-weight: bold;");
        Enter.setText("Enter");
        Enter.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        Enter.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        err_txt.setFill(javafx.scene.paint.Color.RED);
        err_txt.setLayoutX(279.0);
        err_txt.setLayoutY(808.0);
        err_txt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        err_txt.setStrokeWidth(0.0);
        err_txt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        err_txt.setWrappingWidth(354.6708984375);
        err_txt.setFont(new Font("System Bold", 20.0));

        getChildren().add(imageView);
        getChildren().add(Students);
        getChildren().add(Courses);
        getChildren().add(Doctors);
        getChildren().add(Departments);
        getChildren().add(user_label10);
        getChildren().add(delete);
        getChildren().add(Grades);
        getChildren().add(Enroll);
        getChildren().add(Update);
        getChildren().add(Gpa);
        getChildren().add(user_label101);
        getChildren().add(user_label102);
        getChildren().add(user_label103);
        getChildren().add(user_label104);
        getChildren().add(user_label105);
        getChildren().add(user_label106);
        getChildren().add(user_label107);
        getChildren().add(user_label108);
        getChildren().add(user_label109);
        getChildren().add(user_label1010);
        getChildren().add(fname_txt);
        getChildren().add(date_txt);
        getChildren().add(street_txt);
        getChildren().add(semester_txt);
        getChildren().add(dept_code_txt);
        getChildren().add(city_txt);
        getChildren().add(phone2_txt);
        getChildren().add(phone1_txt);
        getChildren().add(gender_txt);
        getChildren().add(lname_txt);
        getChildren().add(email_txt);
        getChildren().add(Enter);
        getChildren().add(err_txt);

    }

    public Button getStudents() {
        return Students;
    }

    public Button getCourses() {
        return Courses;
    }

    public Button getDoctors() {
        return Doctors;
    }

    public Button getDepartments() {
        return Departments;
    }

    public Button getDelete() {
        return delete;
    }

    public Button getGrades() {
        return Grades;
    }

    public Button getEnroll() {
        return Enroll;
    }

    public Button getUpdate() {
        return Update;
    }

    public Button getGpa() {
        return Gpa;
    }

    public String getFname_txt() {
        return fname_txt.getText();
    }

    public Date getDate_txt() {
        LocalDate localDate = date_txt.getValue();
        if (localDate != null) {
            java.util.Date utilDate = java.util.Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            return new Date(utilDate.getTime());
        } else {
            return null;
        }
    }

    public String getStreet_txt() {
        return street_txt.getText();
    }

    public String getSemester_txt() {
        return semester_txt.getText();
    }

    public String getDept_code_txt() {
        return dept_code_txt.getText();
    }

    public String getCity_txt() {
        return city_txt.getText();
    }

    public String getPhone2_txt() {
        return phone2_txt.getText();
    }

    public String getPhone1_txt() {
        return phone1_txt.getText();
    }

    public String getGender_txt() {
        return gender_txt.getText();
    }

    public String getLname_txt() {
        return lname_txt.getText();
    }

    public String getEmail_txt() {
        return email_txt.getText();
    }

    public Button getEnter() {
        return Enter;
    }
    
    public void setErr(String err){
        err_txt.setText(err);
    }
    
}
