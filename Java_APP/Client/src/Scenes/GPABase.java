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

public class GPABase extends AnchorPane {

    protected final ImageView imageView;
    protected final Button Students;
    protected final Button Courses;
    protected final Button Doctors;
    protected final Button Departments;
    protected final Label user_label1010;
    protected final TextField Email_txt;
    protected final Reflection reflection;
    protected final Button cgpa_btn;
    protected final Text err_txt;
    protected final Button sgpa_btn;
    protected final Text sgpa_txt;
    protected final Text cgpa_txt;
    protected final Label user_label10101;
    protected final TextField semester_txt;
    protected final Reflection reflection0;

    public GPABase() {

        imageView = new ImageView();
        Students = new Button();
        Courses = new Button();
        Doctors = new Button();
        Departments = new Button();
        user_label1010 = new Label();
        Email_txt = new TextField();
        reflection = new Reflection();
        cgpa_btn = new Button();
        err_txt = new Text();
        sgpa_btn = new Button();
        sgpa_txt = new Text();
        cgpa_txt = new Text();
        user_label10101 = new Label();
        semester_txt = new TextField();
        reflection0 = new Reflection();

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

        user_label1010.setLayoutX(97.0);
        user_label1010.setLayoutY(272.0);
        user_label1010.setPrefHeight(45.0);
        user_label1010.setPrefWidth(215.0);
        user_label1010.setText("Student Email");
        user_label1010.setFont(new Font("System Bold", 25.0));

        Email_txt.setLayoutX(418.0);
        Email_txt.setLayoutY(279.0);
        Email_txt.setPrefHeight(32.0);
        Email_txt.setPrefWidth(261.0);
        Email_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection.setBottomOpacity(0.1);
        reflection.setTopOffset(0.1);
        reflection.setTopOpacity(0.25);
        Email_txt.setEffect(reflection);

        cgpa_btn.setLayoutX(132.0);
        cgpa_btn.setLayoutY(590.0);
        cgpa_btn.setMnemonicParsing(false);
        cgpa_btn.setPrefHeight(45.0);
        cgpa_btn.setPrefWidth(145.0);
        cgpa_btn.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 17; -fx-font-weight: bold;");
        cgpa_btn.setText("CGPA");
        cgpa_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        cgpa_btn.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        err_txt.setFill(javafx.scene.paint.Color.RED);
        err_txt.setLayoutX(205.0);
        err_txt.setLayoutY(562.0);
        err_txt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        err_txt.setStrokeWidth(0.0);
        err_txt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        err_txt.setWrappingWidth(343.6708984375);
        err_txt.setFont(new Font("System Bold", 20.0));

        sgpa_btn.setLayoutX(476.0);
        sgpa_btn.setLayoutY(590.0);
        sgpa_btn.setMnemonicParsing(false);
        sgpa_btn.setPrefHeight(45.0);
        sgpa_btn.setPrefWidth(145.0);
        sgpa_btn.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 17; -fx-font-weight: bold;");
        sgpa_btn.setText("SGPA");
        sgpa_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        sgpa_btn.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        sgpa_txt.setLayoutX(441.0);
        sgpa_txt.setLayoutY(511.0);
        sgpa_txt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        sgpa_txt.setStrokeWidth(0.0);
        sgpa_txt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        sgpa_txt.setWrappingWidth(215.0000035762787);
        sgpa_txt.setFont(new Font("System Bold", 20.0));

        cgpa_txt.setLayoutX(97.0);
        cgpa_txt.setLayoutY(510.0);
        cgpa_txt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        cgpa_txt.setStrokeWidth(0.0);
        cgpa_txt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        cgpa_txt.setWrappingWidth(214.9999976158142);
        cgpa_txt.setFont(new Font("System Bold", 20.0));

        user_label10101.setLayoutX(97.0);
        user_label10101.setLayoutY(363.0);
        user_label10101.setPrefHeight(45.0);
        user_label10101.setPrefWidth(215.0);
        user_label10101.setText("Semester");
        user_label10101.setFont(new Font("System Bold", 25.0));

        semester_txt.setLayoutX(418.0);
        semester_txt.setLayoutY(370.0);
        semester_txt.setPrefHeight(32.0);
        semester_txt.setPrefWidth(261.0);
        semester_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection0.setBottomOpacity(0.1);
        reflection0.setTopOffset(0.1);
        reflection0.setTopOpacity(0.25);
        semester_txt.setEffect(reflection0);

        getChildren().add(imageView);
        getChildren().add(Students);
        getChildren().add(Courses);
        getChildren().add(Doctors);
        getChildren().add(Departments);
        getChildren().add(user_label1010);
        getChildren().add(Email_txt);
        getChildren().add(cgpa_btn);
        getChildren().add(err_txt);
        getChildren().add(sgpa_btn);
        getChildren().add(sgpa_txt);
        getChildren().add(cgpa_txt);
        getChildren().add(user_label10101);
        getChildren().add(semester_txt);

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

    public String getEmail_txt() {
        return Email_txt.getText();
    }

    public Button getCgpa_btn() {
        return cgpa_btn;
    }

    public Button getSgpa_btn() {
        return sgpa_btn;
    }

    public String getSemester_txt() {
        return semester_txt.getText();
    }
    public void setCGPA(double cgpa){
        cgpa_txt.setText(String.valueOf(cgpa));
    }
    public void setSGPA(double sgpa){
        sgpa_txt.setText(String.valueOf(sgpa));
    }
    
    public void setErr(String err){
        err_txt.setText(err);
    }
}
