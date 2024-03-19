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

public class CourseGpaBase extends AnchorPane {

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
    protected final Button enter_btn;
    protected final TableView course_view;
    protected final TableColumn code_col;
    protected final TableColumn name_col;
    protected final TableColumn semester_col;
    protected final TableColumn hours_col;
    protected final TableColumn dept_code_col;
    protected final Label user_label10101;
    protected final TextField grade_txt;
    protected final Reflection reflection0;

    public CourseGpaBase() {

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
        enter_btn = new Button();
        course_view = new TableView();
        code_col = new TableColumn();
        name_col = new TableColumn();
        semester_col = new TableColumn();
        hours_col = new TableColumn();
        dept_code_col = new TableColumn();
        user_label10101 = new Label();
        grade_txt = new TextField();
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

        user_label1010.setLayoutX(77.0);
        user_label1010.setLayoutY(182.0);
        user_label1010.setPrefHeight(45.0);
        user_label1010.setPrefWidth(215.0);
        user_label1010.setText("Student Email");
        user_label1010.setFont(new Font("System Bold", 25.0));

        Email_txt.setLayoutX(423.0);
        Email_txt.setLayoutY(182.0);
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
        err_txt.setLayoutX(223.0);
        err_txt.setLayoutY(693.0);
        err_txt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        err_txt.setStrokeWidth(0.0);
        err_txt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        err_txt.setWrappingWidth(354.6708984375);
        err_txt.setFont(new Font("System Bold", 20.0));

        enter_btn.setLayoutX(461.0);
        enter_btn.setLayoutY(714.0);
        enter_btn.setMnemonicParsing(false);
        enter_btn.setPrefHeight(45.0);
        enter_btn.setPrefWidth(145.0);
        enter_btn.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 17; -fx-font-weight: bold;");
        enter_btn.setText("Enter");
        enter_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        enter_btn.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        course_view.setLayoutX(77.0);
        course_view.setLayoutY(240.0);
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

        user_label10101.setLayoutX(89.0);
        user_label10101.setLayoutY(610.0);
        user_label10101.setPrefHeight(45.0);
        user_label10101.setPrefWidth(215.0);
        user_label10101.setText("Grade");
        user_label10101.setFont(new Font("System Bold", 25.0));

        grade_txt.setLayoutX(423.0);
        grade_txt.setLayoutY(610.0);
        grade_txt.setPrefHeight(32.0);
        grade_txt.setPrefWidth(261.0);
        grade_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection0.setBottomOpacity(0.1);
        reflection0.setTopOffset(0.1);
        reflection0.setTopOpacity(0.25);
        grade_txt.setEffect(reflection0);

        getChildren().add(imageView);
        getChildren().add(Students);
        getChildren().add(Courses);
        getChildren().add(Doctors);
        getChildren().add(Departments);
        getChildren().add(user_label1010);
        getChildren().add(Email_txt);
        getChildren().add(show_btn);
        getChildren().add(err_txt);
        getChildren().add(enter_btn);
        course_view.getColumns().add(code_col);
        course_view.getColumns().add(name_col);
        course_view.getColumns().add(semester_col);
        course_view.getColumns().add(hours_col);
        course_view.getColumns().add(dept_code_col);
        getChildren().add(course_view);
        getChildren().add(user_label10101);
        getChildren().add(grade_txt);

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

    public Button getEnter_btn() {
        return enter_btn;
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

    public String getGrade_txt() {
        return grade_txt.getText();
    }
    
    public void setErr(String err){
        err_txt.setText(err);
    }
}
