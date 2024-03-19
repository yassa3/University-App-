package Scenes;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class AddDoctorCourseBase extends AnchorPane {

    protected final ImageView imageView;
    protected final Button Students;
    protected final Button Courses;
    protected final Button Doctors;
    protected final Button Departments;
    protected final Label user_label1010;
    protected final TextField Email_txt;
    protected final Reflection reflection;
    protected final Button show_btn;
    protected final Text err_txt;
    protected final Button add_btn;
    protected final TableView course_view;
    protected final TableColumn code_col;
    protected final TableColumn name_col;
    protected final TableColumn semester_col;
    protected final TableColumn hours_col;
    protected final TableColumn dept_code_col;

    public AddDoctorCourseBase() {

        imageView = new ImageView();
        Students = new Button();
        Courses = new Button();
        Doctors = new Button();
        Departments = new Button();
        user_label1010 = new Label();
        Email_txt = new TextField();
        reflection = new Reflection();
        show_btn = new Button();
        err_txt = new Text();
        add_btn = new Button();
        course_view = new TableView();
        code_col = new TableColumn();
        name_col = new TableColumn();
        semester_col = new TableColumn();
        hours_col = new TableColumn();
        dept_code_col = new TableColumn();

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

        user_label1010.setLayoutX(77.0);
        user_label1010.setLayoutY(220.0);
        user_label1010.setPrefHeight(45.0);
        user_label1010.setPrefWidth(215.0);
        user_label1010.setText("Doctor Email");
        user_label1010.setFont(new Font("System Bold", 25.0));

        Email_txt.setLayoutX(418.0);
        Email_txt.setLayoutY(227.0);
        Email_txt.setPrefHeight(32.0);
        Email_txt.setPrefWidth(261.0);
        Email_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection.setBottomOpacity(0.1);
        reflection.setTopOffset(0.1);
        reflection.setTopOpacity(0.25);
        Email_txt.setEffect(reflection);

        show_btn.setLayoutX(196.0);
        show_btn.setLayoutY(714.0);
        show_btn.setMnemonicParsing(false);
        show_btn.setPrefHeight(45.0);
        show_btn.setPrefWidth(145.0);
        show_btn.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 17; -fx-font-weight: bold;");
        show_btn.setText("Show");
        show_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        show_btn.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        err_txt.setFill(javafx.scene.paint.Color.RED);
        err_txt.setLayoutX(224.0);
        err_txt.setLayoutY(692.0);
        err_txt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        err_txt.setStrokeWidth(0.0);
        err_txt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        err_txt.setWrappingWidth(354.6708984375);
        err_txt.setFont(new Font("System Bold", 20.0));

        add_btn.setLayoutX(461.0);
        add_btn.setLayoutY(714.0);
        add_btn.setMnemonicParsing(false);
        add_btn.setPrefHeight(45.0);
        add_btn.setPrefWidth(145.0);
        add_btn.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 17; -fx-font-weight: bold;");
        add_btn.setText("Add");
        add_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        add_btn.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        course_view.setLayoutX(77.0);
        course_view.setLayoutY(295.0);
        course_view.setPrefHeight(357.0);
        course_view.setPrefWidth(607.0);
        course_view.setStyle("-fx-background-color: #f3e9d7; -fx-border-color: #47180b; -fx-border-width: 2px; -fx-effect: dropshadow(gaussian, #000000, 10, 0.5, 0, 0);");

        code_col.setPrefWidth(116.0);
        code_col.setStyle("-fx-background-color: #b8ab76; -fx-text-fill: #ffffff; -fx-border-radius: 10;");
        code_col.setText("Course Code");

        name_col.setPrefWidth(153.0);
        name_col.setStyle("-fx-background-color: #b8ab76; -fx-text-fill: #ffffff; -fx-border-radius: 10;");
        name_col.setText("Course Name");

        semester_col.setPrefWidth(117.0);
        semester_col.setStyle("-fx-background-color: #b8ab76; -fx-text-fill: #ffffff; -fx-border-radius: 10;");
        semester_col.setText("Semester");

        hours_col.setPrefWidth(67.0);
        hours_col.setStyle("-fx-background-color: #b8ab76; -fx-text-fill: #ffffff; -fx-border-radius: 10;");
        hours_col.setText("Hours");

        dept_code_col.setPrefWidth(152.0);
        dept_code_col.setStyle("-fx-background-color: #b8ab76; -fx-text-fill: #ffffff; -fx-border-radius: 10;");
        dept_code_col.setText("Department Code");

        getChildren().add(imageView);
        getChildren().add(Students);
        getChildren().add(Courses);
        getChildren().add(Doctors);
        getChildren().add(Departments);
        getChildren().add(user_label1010);
        getChildren().add(Email_txt);
        getChildren().add(show_btn);
        getChildren().add(err_txt);
        getChildren().add(add_btn);
        course_view.getColumns().add(code_col);
        course_view.getColumns().add(name_col);
        course_view.getColumns().add(semester_col);
        course_view.getColumns().add(hours_col);
        course_view.getColumns().add(dept_code_col);
        getChildren().add(course_view);

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

    public Button getShow_btn() {
        return show_btn;
    }

    public Button getAdd_btn() {
        return add_btn;
    }

    public TableView getCourse_view() {
        return course_view;
    }

    public TableColumn getCode_col() {
        return code_col;
    }

    public TableColumn getName_col() {
        return name_col;
    }

    public TableColumn getSemester_col() {
        return semester_col;
    }

    public TableColumn getHours_col() {
        return hours_col;
    }

    public TableColumn getDept_code_col() {
        return dept_code_col;
    }
    public void setErr(String err){
        err_txt.setText(err);
    }
    
}
