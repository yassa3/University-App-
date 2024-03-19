package Scenes;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ReportBase extends AnchorPane {

    protected final ImageView imageView;
    protected final Button Students;
    protected final Button Courses;
    protected final Button Doctors;
    protected final Button Departments;
    protected final Button show_btn;
    protected final Text err_txt;
    protected final Button report_btn;
    protected final TableView course_view;
    protected final TableColumn code_col;
    protected final TableColumn name_col;
    protected final TableColumn semester_col;
    protected final TableColumn hours_col;
    protected final TableColumn dept_code_col;
    protected final TableView student_view;
    protected final TableColumn fname_col;
    protected final TableColumn lname_col;
    protected final TableColumn email_col;
    protected final TableColumn semester_student_col;
    protected final TableColumn student_dept_code_col;
    protected final Label user_label10;
    protected final Text gpa_txt;

    public ReportBase() {

        imageView = new ImageView();
        Students = new Button();
        Courses = new Button();
        Doctors = new Button();
        Departments = new Button();
        show_btn = new Button();
        err_txt = new Text();
        report_btn = new Button();
        course_view = new TableView();
        code_col = new TableColumn();
        name_col = new TableColumn();
        semester_col = new TableColumn();
        hours_col = new TableColumn();
        dept_code_col = new TableColumn();
        student_view = new TableView();
        fname_col = new TableColumn();
        lname_col = new TableColumn();
        email_col = new TableColumn();
        semester_student_col = new TableColumn();
        student_dept_code_col = new TableColumn();
        user_label10 = new Label();
        gpa_txt = new Text();

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

        show_btn.setLayoutX(328.0);
        show_btn.setLayoutY(389.0);
        show_btn.setMnemonicParsing(false);
        show_btn.setPrefHeight(45.0);
        show_btn.setPrefWidth(145.0);
        show_btn.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 17; -fx-font-weight: bold;");
        show_btn.setText("Show");
        show_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        show_btn.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        err_txt.setFill(javafx.scene.paint.Color.RED);
        err_txt.setLayoutX(223.0);
        err_txt.setLayoutY(781.0);
        err_txt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        err_txt.setStrokeWidth(0.0);
        err_txt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        err_txt.setWrappingWidth(354.6708984375);
        err_txt.setFont(new Font("System Bold", 20.0));

        report_btn.setLayoutX(328.0);
        report_btn.setLayoutY(799.0);
        report_btn.setMnemonicParsing(false);
        report_btn.setPrefHeight(45.0);
        report_btn.setPrefWidth(145.0);
        report_btn.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 17; -fx-font-weight: bold;");
        report_btn.setText("Report");
        report_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        report_btn.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        course_view.setLayoutX(88.0);
        course_view.setLayoutY(146.0);
        course_view.setPrefHeight(228.0);
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

        student_view.setLayoutX(88.0);
        student_view.setLayoutY(450.0);
        student_view.setPrefHeight(228.0);
        student_view.setPrefWidth(607.0);
        student_view.setStyle("-fx-background-color: #f3e9d7; -fx-border-color: #47180b; -fx-border-width: 2px; -fx-effect: dropshadow(gaussian, #000000, 10, 0.5, 0, 0);");

        fname_col.setPrefWidth(116.0);
        fname_col.setStyle("-fx-background-color: #b8ab76; -fx-text-fill: #ffffff; -fx-border-radius: 10;");
        fname_col.setText("First Name");

        lname_col.setPrefWidth(147.0);
        lname_col.setStyle("-fx-background-color: #b8ab76; -fx-text-fill: #ffffff; -fx-border-radius: 10;");
        lname_col.setText("Last Name");

        email_col.setPrefWidth(117.0);
        email_col.setStyle("-fx-background-color: #b8ab76; -fx-text-fill: #ffffff; -fx-border-radius: 10;");
        email_col.setText("Email");

        semester_student_col.setPrefWidth(73.0);
        semester_student_col.setStyle("-fx-background-color: #b8ab76; -fx-text-fill: #ffffff; -fx-border-radius: 10;");
        semester_student_col.setText("Semester");

        student_dept_code_col.setPrefWidth(152.0);
        student_dept_code_col.setStyle("-fx-background-color: #b8ab76; -fx-text-fill: #ffffff; -fx-border-radius: 10;");
        student_dept_code_col.setText("Department Code");

        user_label10.setLayoutX(217.0);
        user_label10.setLayoutY(690.0);
        user_label10.setPrefHeight(45.0);
        user_label10.setPrefWidth(184.0);
        user_label10.setText("Average GPA");
        user_label10.setFont(new Font("System Bold", 25.0));

        gpa_txt.setLayoutX(418.0);
        gpa_txt.setLayoutY(720.0);
        gpa_txt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        gpa_txt.setStrokeWidth(0.0);
        gpa_txt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        gpa_txt.setWrappingWidth(276.6708984375);
        gpa_txt.setFont(new Font("System Bold", 20.0));

        getChildren().add(imageView);
        getChildren().add(Students);
        getChildren().add(Courses);
        getChildren().add(Doctors);
        getChildren().add(Departments);
        getChildren().add(show_btn);
        getChildren().add(err_txt);
        getChildren().add(report_btn);
        course_view.getColumns().add(code_col);
        course_view.getColumns().add(name_col);
        course_view.getColumns().add(semester_col);
        course_view.getColumns().add(hours_col);
        course_view.getColumns().add(dept_code_col);
        getChildren().add(course_view);
        student_view.getColumns().add(fname_col);
        student_view.getColumns().add(lname_col);
        student_view.getColumns().add(email_col);
        student_view.getColumns().add(semester_student_col);
        student_view.getColumns().add(student_dept_code_col);
        getChildren().add(student_view);
        getChildren().add(user_label10);
        getChildren().add(gpa_txt);

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

    public Button getShow_btn() {
        return show_btn;
    }

    public Button getReport_btn() {
        return report_btn;
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

    public TableView getStudent_view() {
        return student_view;
    }

    public TableColumn getFname_col() {
        return fname_col;
    }

    public TableColumn getLname_col() {
        return lname_col;
    }

    public TableColumn getEmail_col() {
        return email_col;
    }

    public TableColumn getSemester_student_col() {
        return semester_student_col;
    }

    public TableColumn getStudent_dept_code_col() {
        return student_dept_code_col;
    }

    public Text getGpa_txt() {
        return gpa_txt;
    }
    public void setGpa_txt(String avggpa) {
        gpa_txt.setText(avggpa);
    }
    
    public void setErr(String err){
        err_txt.setText(err);
    }
}
