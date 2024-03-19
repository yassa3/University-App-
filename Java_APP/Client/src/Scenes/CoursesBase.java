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

public class CoursesBase extends AnchorPane {

    protected final ImageView imageView;
    protected final Button Students;
    protected final Button Courses;
    protected final Button Doctors;
    protected final Button Departments;
    protected final Button delete_Course;
    protected final Button Report;
    protected final Button Update;
    protected final Label user_label10;
    protected final Label user_label102;
    protected final Label user_label105;
    protected final Label user_label1010;
    protected final TextField cname_txt;
    protected final Reflection reflection;
    protected final TextField dept_code_txt;
    protected final Reflection reflection0;
    protected final TextField code_txt;
    protected final Reflection reflection1;
    protected final TextField semester_txt;
    protected final Reflection reflection2;
    protected final Button Enter;
    protected final Text err_txt;
    protected final Label user_label1051;
    protected final TextField hours_txt;
    protected final Reflection reflection3;

    public CoursesBase() {

        imageView = new ImageView();
        Students = new Button();
        Courses = new Button();
        Doctors = new Button();
        Departments = new Button();
        delete_Course = new Button();
        Report = new Button();
        Update = new Button();
        user_label10 = new Label();
        user_label102 = new Label();
        user_label105 = new Label();
        user_label1010 = new Label();
        cname_txt = new TextField();
        reflection = new Reflection();
        dept_code_txt = new TextField();
        reflection0 = new Reflection();
        code_txt = new TextField();
        reflection1 = new Reflection();
        semester_txt = new TextField();
        reflection2 = new Reflection();
        Enter = new Button();
        err_txt = new Text();
        user_label1051 = new Label();
        hours_txt = new TextField();
        reflection3 = new Reflection();

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

        delete_Course.setLayoutX(77.0);
        delete_Course.setLayoutY(588.0);
        delete_Course.setMnemonicParsing(false);
        delete_Course.setPrefHeight(45.0);
        delete_Course.setPrefWidth(145.0);
        delete_Course.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 18; -fx-font-weight: bold;");
        delete_Course.setText("Delete Course");
        delete_Course.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        delete_Course.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        Report.setLayoutX(77.0);
        Report.setLayoutY(420.0);
        Report.setMnemonicParsing(false);
        Report.setPrefHeight(45.0);
        Report.setPrefWidth(145.0);
        Report.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 18; -fx-font-weight: bold;");
        Report.setText("Report");
        Report.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        Report.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        Update.setLayoutX(77.0);
        Update.setLayoutY(261.0);
        Update.setMnemonicParsing(false);
        Update.setPrefHeight(45.0);
        Update.setPrefWidth(145.0);
        Update.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 18; -fx-font-weight: bold;");
        Update.setText("Update Info");
        Update.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        Update.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        user_label10.setLayoutX(256.0);
        user_label10.setLayoutY(262.0);
        user_label10.setPrefHeight(45.0);
        user_label10.setPrefWidth(198.0);
        user_label10.setText("Course Name");
        user_label10.setFont(new Font("System Bold", 25.0));

        user_label102.setLayoutX(256.0);
        user_label102.setLayoutY(596.0);
        user_label102.setPrefHeight(45.0);
        user_label102.setPrefWidth(210.0);
        user_label102.setText("Department Code");
        user_label102.setFont(new Font("System Bold", 25.0));

        user_label105.setLayoutX(256.0);
        user_label105.setLayoutY(515.0);
        user_label105.setPrefHeight(45.0);
        user_label105.setPrefWidth(198.0);
        user_label105.setText("Hours");
        user_label105.setFont(new Font("System Bold", 25.0));

        user_label1010.setLayoutX(256.0);
        user_label1010.setLayoutY(347.0);
        user_label1010.setPrefHeight(45.0);
        user_label1010.setPrefWidth(198.0);
        user_label1010.setText("Course Code");
        user_label1010.setFont(new Font("System Bold", 25.0));

        cname_txt.setLayoutX(476.0);
        cname_txt.setLayoutY(269.0);
        cname_txt.setPrefHeight(32.0);
        cname_txt.setPrefWidth(261.0);
        cname_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection.setBottomOpacity(0.1);
        reflection.setTopOffset(0.1);
        reflection.setTopOpacity(0.25);
        cname_txt.setEffect(reflection);

        dept_code_txt.setLayoutX(476.0);
        dept_code_txt.setLayoutY(603.0);
        dept_code_txt.setPrefHeight(32.0);
        dept_code_txt.setPrefWidth(261.0);
        dept_code_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection0.setBottomOpacity(0.1);
        reflection0.setTopOffset(0.1);
        reflection0.setTopOpacity(0.25);
        dept_code_txt.setEffect(reflection0);

        code_txt.setLayoutX(476.0);
        code_txt.setLayoutY(354.0);
        code_txt.setPrefHeight(32.0);
        code_txt.setPrefWidth(261.0);
        code_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection1.setBottomOpacity(0.1);
        reflection1.setTopOffset(0.1);
        reflection1.setTopOpacity(0.25);
        code_txt.setEffect(reflection1);

        semester_txt.setLayoutX(476.0);
        semester_txt.setLayoutY(435.0);
        semester_txt.setPrefHeight(32.0);
        semester_txt.setPrefWidth(261.0);
        semester_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection2.setBottomOpacity(0.1);
        reflection2.setTopOffset(0.1);
        reflection2.setTopOpacity(0.25);
        semester_txt.setEffect(reflection2);

        Enter.setLayoutX(404.0);
        Enter.setLayoutY(770.0);
        Enter.setMnemonicParsing(false);
        Enter.setPrefHeight(45.0);
        Enter.setPrefWidth(145.0);
        Enter.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 17; -fx-font-weight: bold;");
        Enter.setText("Enter");
        Enter.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        Enter.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        err_txt.setFill(javafx.scene.paint.Color.RED);
        err_txt.setLayoutX(299.0);
        err_txt.setLayoutY(721.0);
        err_txt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        err_txt.setStrokeWidth(0.0);
        err_txt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        err_txt.setWrappingWidth(354.6708984375);
        err_txt.setFont(new Font("System Bold", 20.0));

        user_label1051.setLayoutX(256.0);
        user_label1051.setLayoutY(429.0);
        user_label1051.setPrefHeight(45.0);
        user_label1051.setPrefWidth(198.0);
        user_label1051.setText("Semester");
        user_label1051.setFont(new Font("System Bold", 25.0));

        hours_txt.setLayoutX(476.0);
        hours_txt.setLayoutY(515.0);
        hours_txt.setPrefHeight(32.0);
        hours_txt.setPrefWidth(261.0);
        hours_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection3.setBottomOpacity(0.1);
        reflection3.setTopOffset(0.1);
        reflection3.setTopOpacity(0.25);
        hours_txt.setEffect(reflection3);

        getChildren().add(imageView);
        getChildren().add(Students);
        getChildren().add(Courses);
        getChildren().add(Doctors);
        getChildren().add(Departments);
        getChildren().add(delete_Course);
        getChildren().add(Report);
        getChildren().add(Update);
        getChildren().add(user_label10);
        getChildren().add(user_label102);
        getChildren().add(user_label105);
        getChildren().add(user_label1010);
        getChildren().add(cname_txt);
        getChildren().add(dept_code_txt);
        getChildren().add(code_txt);
        getChildren().add(semester_txt);
        getChildren().add(Enter);
        getChildren().add(err_txt);
        getChildren().add(user_label1051);
        getChildren().add(hours_txt);

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

    public Button getDelete_Course() {
        return delete_Course;
    }

    public Button getReport() {
        return Report;
    }

    public Button getUpdate() {
        return Update;
    }

    public String getCname_txt() {
        return cname_txt.getText();
    }

    public String getDept_code_txt() {
        return dept_code_txt.getText();
    }

    public String getCode_txt() {
        return code_txt.getText();
    }

    public String getSemester_txt() {
        return semester_txt.getText();
    }

    public Button getEnter() {
        return Enter;
    }

    public String getHours_txt() {
        return hours_txt.getText();
    }
    
    public void setErr(String err){
        err_txt.setText(err);
    }
}
