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

public class UpdateStudentBase extends AnchorPane {

    protected final ImageView imageView;
    protected final Button Students;
    protected final Button Courses;
    protected final Button Doctors;
    protected final Button Departments;
    protected final Label user_label101;
    protected final Label user_label102;
    protected final Label user_label103;
    protected final Label user_label105;
    protected final Label user_label106;
    protected final Label user_label107;
    protected final Label user_label108;
    protected final TextField street_txt;
    protected final Reflection reflection;
    protected final TextField semester_txt;
    protected final Reflection reflection0;
    protected final TextField dept_code_txt;
    protected final Reflection reflection1;
    protected final TextField city_txt;
    protected final Reflection reflection2;
    protected final TextField newphone_txt;
    protected final Reflection reflection3;
    protected final TextField oldphone_txt;
    protected final Reflection reflection4;
    protected final TextField email_txt;
    protected final Reflection reflection5;
    protected final Button update_btn;
    protected final Text err_txt;

    public UpdateStudentBase() {

        imageView = new ImageView();
        Students = new Button();
        Courses = new Button();
        Doctors = new Button();
        Departments = new Button();
        user_label101 = new Label();
        user_label102 = new Label();
        user_label103 = new Label();
        user_label105 = new Label();
        user_label106 = new Label();
        user_label107 = new Label();
        user_label108 = new Label();
        street_txt = new TextField();
        reflection = new Reflection();
        semester_txt = new TextField();
        reflection0 = new Reflection();
        dept_code_txt = new TextField();
        reflection1 = new Reflection();
        city_txt = new TextField();
        reflection2 = new Reflection();
        newphone_txt = new TextField();
        reflection3 = new Reflection();
        oldphone_txt = new TextField();
        reflection4 = new Reflection();
        email_txt = new TextField();
        reflection5 = new Reflection();
        update_btn = new Button();
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

        user_label101.setLayoutX(113.0);
        user_label101.setLayoutY(428.0);
        user_label101.setPrefHeight(45.0);
        user_label101.setPrefWidth(198.0);
        user_label101.setText("City");
        user_label101.setFont(new Font("System Bold", 25.0));

        user_label102.setLayoutX(113.0);
        user_label102.setLayoutY(646.0);
        user_label102.setPrefHeight(45.0);
        user_label102.setPrefWidth(210.0);
        user_label102.setText("Department Code");
        user_label102.setFont(new Font("System Bold", 25.0));

        user_label103.setLayoutX(113.0);
        user_label103.setLayoutY(497.0);
        user_label103.setPrefHeight(45.0);
        user_label103.setPrefWidth(198.0);
        user_label103.setText("Street");
        user_label103.setFont(new Font("System Bold", 25.0));

        user_label105.setLayoutX(113.0);
        user_label105.setLayoutY(210.0);
        user_label105.setPrefHeight(45.0);
        user_label105.setPrefWidth(198.0);
        user_label105.setText("Email");
        user_label105.setFont(new Font("System Bold", 25.0));

        user_label106.setLayoutX(113.0);
        user_label106.setLayoutY(359.0);
        user_label106.setPrefHeight(45.0);
        user_label106.setPrefWidth(198.0);
        user_label106.setText("New Phone");
        user_label106.setFont(new Font("System Bold", 25.0));

        user_label107.setLayoutX(113.0);
        user_label107.setLayoutY(566.0);
        user_label107.setPrefHeight(45.0);
        user_label107.setPrefWidth(198.0);
        user_label107.setText("Semester");
        user_label107.setFont(new Font("System Bold", 25.0));

        user_label108.setLayoutX(113.0);
        user_label108.setLayoutY(287.0);
        user_label108.setPrefHeight(45.0);
        user_label108.setPrefWidth(198.0);
        user_label108.setText("Old Phone");
        user_label108.setFont(new Font("System Bold", 25.0));

        street_txt.setLayoutX(448.0);
        street_txt.setLayoutY(504.0);
        street_txt.setPrefHeight(32.0);
        street_txt.setPrefWidth(261.0);
        street_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection.setBottomOpacity(0.1);
        reflection.setTopOffset(0.1);
        reflection.setTopOpacity(0.25);
        street_txt.setEffect(reflection);

        semester_txt.setLayoutX(448.0);
        semester_txt.setLayoutY(573.0);
        semester_txt.setPrefHeight(32.0);
        semester_txt.setPrefWidth(261.0);
        semester_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection0.setBottomOpacity(0.1);
        reflection0.setTopOffset(0.1);
        reflection0.setTopOpacity(0.25);
        semester_txt.setEffect(reflection0);

        dept_code_txt.setLayoutX(447.0);
        dept_code_txt.setLayoutY(653.0);
        dept_code_txt.setPrefHeight(32.0);
        dept_code_txt.setPrefWidth(261.0);
        dept_code_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection1.setBottomOpacity(0.1);
        reflection1.setTopOffset(0.1);
        reflection1.setTopOpacity(0.25);
        dept_code_txt.setEffect(reflection1);

        city_txt.setLayoutX(448.0);
        city_txt.setLayoutY(435.0);
        city_txt.setPrefHeight(32.0);
        city_txt.setPrefWidth(261.0);
        city_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection2.setBottomOpacity(0.1);
        reflection2.setTopOffset(0.1);
        reflection2.setTopOpacity(0.25);
        city_txt.setEffect(reflection2);

        newphone_txt.setLayoutX(447.0);
        newphone_txt.setLayoutY(367.0);
        newphone_txt.setPrefHeight(32.0);
        newphone_txt.setPrefWidth(261.0);
        newphone_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection3.setBottomOpacity(0.1);
        reflection3.setTopOffset(0.1);
        reflection3.setTopOpacity(0.25);
        newphone_txt.setEffect(reflection3);

        oldphone_txt.setLayoutX(448.0);
        oldphone_txt.setLayoutY(294.0);
        oldphone_txt.setPrefHeight(32.0);
        oldphone_txt.setPrefWidth(261.0);
        oldphone_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection4.setBottomOpacity(0.1);
        reflection4.setTopOffset(0.1);
        reflection4.setTopOpacity(0.25);
        oldphone_txt.setEffect(reflection4);

        email_txt.setLayoutX(448.0);
        email_txt.setLayoutY(217.0);
        email_txt.setPrefHeight(32.0);
        email_txt.setPrefWidth(261.0);
        email_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection5.setBottomOpacity(0.1);
        reflection5.setTopOffset(0.1);
        reflection5.setTopOpacity(0.25);
        email_txt.setEffect(reflection5);

        update_btn.setLayoutX(351.0);
        update_btn.setLayoutY(781.0);
        update_btn.setMnemonicParsing(false);
        update_btn.setPrefHeight(45.0);
        update_btn.setPrefWidth(145.0);
        update_btn.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 17; -fx-font-weight: bold;");
        update_btn.setText("Update");
        update_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        update_btn.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        err_txt.setFill(javafx.scene.paint.Color.RED);
        err_txt.setLayoutX(246.0);
        err_txt.setLayoutY(755.0);
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
        getChildren().add(user_label101);
        getChildren().add(user_label102);
        getChildren().add(user_label103);
        getChildren().add(user_label105);
        getChildren().add(user_label106);
        getChildren().add(user_label107);
        getChildren().add(user_label108);
        getChildren().add(street_txt);
        getChildren().add(semester_txt);
        getChildren().add(dept_code_txt);
        getChildren().add(city_txt);
        getChildren().add(newphone_txt);
        getChildren().add(oldphone_txt);
        getChildren().add(email_txt);
        getChildren().add(update_btn);
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

    public String getNewphone_txt() {
        return newphone_txt.getText();
    }

    public String getOldphone_txt() {
        return oldphone_txt.getText();
    }

    public String getEmail_txt() {
        return email_txt.getText();
    }

    public Button getUpdate_btn() {
        return update_btn;
    }
    
    public void setErr(String err){
        err_txt.setText(err);
    }
    
}
