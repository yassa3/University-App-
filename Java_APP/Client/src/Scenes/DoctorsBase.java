package Scenes;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class DoctorsBase extends AnchorPane {

    protected final ImageView imageView;
    protected final Button Students;
    protected final Button Courses;
    protected final Button Doctors;
    protected final Button Departments;
    protected final Button delete_btn;
    protected final Button delete_course_btn;
    protected final Button Add_Course_btn;
    protected final Label user_label10;
    protected final Label user_label102;
    protected final Label user_label105;
    protected final Label user_label1010;
    protected final TextField fname_txt;
    protected final Reflection reflection;
    protected final TextField dept_code_txt;
    protected final Reflection reflection0;
    protected final TextField lname_txt;
    protected final Reflection reflection1;
    protected final TextField email_txt;
    protected final Reflection reflection2;
    protected final Button Enter;
    protected final Text err_txt;

    public DoctorsBase() {

        imageView = new ImageView();
        Students = new Button();
        Courses = new Button();
        Doctors = new Button();
        Departments = new Button();
        delete_btn = new Button();
        delete_course_btn = new Button();
        Add_Course_btn = new Button();
        user_label10 = new Label();
        user_label102 = new Label();
        user_label105 = new Label();
        user_label1010 = new Label();
        fname_txt = new TextField();
        reflection = new Reflection();
        dept_code_txt = new TextField();
        reflection0 = new Reflection();
        lname_txt = new TextField();
        reflection1 = new Reflection();
        email_txt = new TextField();
        reflection2 = new Reflection();
        Enter = new Button();
        err_txt = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
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

        delete_btn.setLayoutX(67.0);
        delete_btn.setLayoutY(578.0);
        delete_btn.setMnemonicParsing(false);
        delete_btn.setPrefHeight(45.0);
        delete_btn.setPrefWidth(145.0);
        delete_btn.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 18; -fx-font-weight: bold;");
        delete_btn.setText("Delete Doctor");
        delete_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        delete_btn.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        delete_course_btn.setLayoutX(67.0);
        delete_course_btn.setLayoutY(410.0);
        delete_course_btn.setMnemonicParsing(false);
        delete_course_btn.setPrefHeight(45.0);
        delete_course_btn.setPrefWidth(145.0);
        delete_course_btn.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 18; -fx-font-weight: bold;");
        delete_course_btn.setText("Delete Course");
        delete_course_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        delete_course_btn.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        Add_Course_btn.setLayoutX(67.0);
        Add_Course_btn.setLayoutY(251.0);
        Add_Course_btn.setMnemonicParsing(false);
        Add_Course_btn.setPrefHeight(45.0);
        Add_Course_btn.setPrefWidth(145.0);
        Add_Course_btn.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 18; -fx-font-weight: bold;");
        Add_Course_btn.setText("Add Course");
        Add_Course_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        Add_Course_btn.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        user_label10.setLayoutX(246.0);
        user_label10.setLayoutY(252.0);
        user_label10.setPrefHeight(45.0);
        user_label10.setPrefWidth(198.0);
        user_label10.setText("First Name");
        user_label10.setFont(new Font("System Bold", 25.0));

        user_label102.setLayoutX(246.0);
        user_label102.setLayoutY(586.0);
        user_label102.setPrefHeight(45.0);
        user_label102.setPrefWidth(210.0);
        user_label102.setText("Department Code");
        user_label102.setFont(new Font("System Bold", 25.0));

        user_label105.setLayoutX(246.0);
        user_label105.setLayoutY(468.0);
        user_label105.setPrefHeight(45.0);
        user_label105.setPrefWidth(198.0);
        user_label105.setText("Email");
        user_label105.setFont(new Font("System Bold", 25.0));

        user_label1010.setLayoutX(246.0);
        user_label1010.setLayoutY(358.0);
        user_label1010.setPrefHeight(45.0);
        user_label1010.setPrefWidth(198.0);
        user_label1010.setText("Last Name");
        user_label1010.setFont(new Font("System Bold", 25.0));

        fname_txt.setLayoutX(466.0);
        fname_txt.setLayoutY(259.0);
        fname_txt.setPrefHeight(32.0);
        fname_txt.setPrefWidth(261.0);
        fname_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection.setBottomOpacity(0.1);
        reflection.setTopOffset(0.1);
        reflection.setTopOpacity(0.25);
        fname_txt.setEffect(reflection);

        dept_code_txt.setLayoutX(466.0);
        dept_code_txt.setLayoutY(593.0);
        dept_code_txt.setPrefHeight(32.0);
        dept_code_txt.setPrefWidth(261.0);
        dept_code_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection0.setBottomOpacity(0.1);
        reflection0.setTopOffset(0.1);
        reflection0.setTopOpacity(0.25);
        dept_code_txt.setEffect(reflection0);

        lname_txt.setLayoutX(466.0);
        lname_txt.setLayoutY(365.0);
        lname_txt.setPrefHeight(32.0);
        lname_txt.setPrefWidth(261.0);
        lname_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection1.setBottomOpacity(0.1);
        reflection1.setTopOffset(0.1);
        reflection1.setTopOpacity(0.25);
        lname_txt.setEffect(reflection1);

        email_txt.setLayoutX(466.0);
        email_txt.setLayoutY(475.0);
        email_txt.setPrefHeight(32.0);
        email_txt.setPrefWidth(261.0);
        email_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection2.setBottomOpacity(0.1);
        reflection2.setTopOffset(0.1);
        reflection2.setTopOpacity(0.25);
        email_txt.setEffect(reflection2);

        Enter.setLayoutX(394.0);
        Enter.setLayoutY(760.0);
        Enter.setMnemonicParsing(false);
        Enter.setPrefHeight(45.0);
        Enter.setPrefWidth(145.0);
        Enter.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 17; -fx-font-weight: bold;");
        Enter.setText("Enter");
        Enter.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        Enter.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        err_txt.setFill(javafx.scene.paint.Color.RED);
        err_txt.setLayoutX(289.0);
        err_txt.setLayoutY(711.0);
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
        getChildren().add(delete_btn);
        getChildren().add(delete_course_btn);
        getChildren().add(Add_Course_btn);
        getChildren().add(user_label10);
        getChildren().add(user_label102);
        getChildren().add(user_label105);
        getChildren().add(user_label1010);
        getChildren().add(fname_txt);
        getChildren().add(dept_code_txt);
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

    public Button getDelete_btn() {
        return delete_btn;
    }

    public Button getDelete_course_btn() {
        return delete_course_btn;
    }

    public Button getAdd_Course_btn() {
        return Add_Course_btn;
    }

    public String getFname_txt() {
        return fname_txt.getText();
    }

    public String getDept_code_txt() {
        return dept_code_txt.getText();
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
