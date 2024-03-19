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

public class DepartmentsBase extends AnchorPane {

    protected final ImageView imageView;
    protected final Button Students;
    protected final Button Courses;
    protected final Button Doctors;
    protected final Button Departments;
    protected final Button delete_dept_btn;
    protected final Label user_label10;
    protected final Label user_label1010;
    protected final TextField name_txt;
    protected final Reflection reflection;
    protected final TextField code_txt;
    protected final Reflection reflection0;
    protected final Button Enter;
    protected final Text err_txt;

    public DepartmentsBase() {

        imageView = new ImageView();
        Students = new Button();
        Courses = new Button();
        Doctors = new Button();
        Departments = new Button();
        delete_dept_btn = new Button();
        user_label10 = new Label();
        user_label1010 = new Label();
        name_txt = new TextField();
        reflection = new Reflection();
        code_txt = new TextField();
        reflection0 = new Reflection();
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

        delete_dept_btn.setLayoutX(67.0);
        delete_dept_btn.setLayoutY(353.0);
        delete_dept_btn.setMnemonicParsing(false);
        delete_dept_btn.setPrefHeight(47.0);
        delete_dept_btn.setPrefWidth(173.0);
        delete_dept_btn.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 17; -fx-font-weight: bold;");
        delete_dept_btn.setText("Delete Department");
        delete_dept_btn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        delete_dept_btn.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        user_label10.setLayoutX(250.0);
        user_label10.setLayoutY(273.0);
        user_label10.setPrefHeight(45.0);
        user_label10.setPrefWidth(223.0);
        user_label10.setText("Department Name");
        user_label10.setFont(new Font("System Bold", 25.0));

        user_label1010.setLayoutX(250.0);
        user_label1010.setLayoutY(428.0);
        user_label1010.setPrefHeight(45.0);
        user_label1010.setPrefWidth(215.0);
        user_label1010.setText("Department Code");
        user_label1010.setFont(new Font("System Bold", 25.0));

        name_txt.setLayoutX(486.0);
        name_txt.setLayoutY(279.0);
        name_txt.setPrefHeight(32.0);
        name_txt.setPrefWidth(261.0);
        name_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection.setBottomOpacity(0.1);
        reflection.setTopOffset(0.1);
        reflection.setTopOpacity(0.25);
        name_txt.setEffect(reflection);

        code_txt.setLayoutX(486.0);
        code_txt.setLayoutY(434.0);
        code_txt.setPrefHeight(32.0);
        code_txt.setPrefWidth(261.0);
        code_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0; -fx-font-color: asd;");

        reflection0.setBottomOpacity(0.1);
        reflection0.setTopOffset(0.1);
        reflection0.setTopOpacity(0.25);
        code_txt.setEffect(reflection0);

        Enter.setLayoutX(414.0);
        Enter.setLayoutY(670.0);
        Enter.setMnemonicParsing(false);
        Enter.setPrefHeight(45.0);
        Enter.setPrefWidth(145.0);
        Enter.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #ddcc9f; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 17; -fx-font-weight: bold;");
        Enter.setText("Enter");
        Enter.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        Enter.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        err_txt.setFill(javafx.scene.paint.Color.RED);
        err_txt.setLayoutX(309.0);
        err_txt.setLayoutY(613.0);
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
        getChildren().add(delete_dept_btn);
        getChildren().add(user_label10);
        getChildren().add(user_label1010);
        getChildren().add(name_txt);
        getChildren().add(code_txt);
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

    public Button getDelete_dept_btn() {
        return delete_dept_btn;
    }

    public String getName_txt() {
        return name_txt.getText();
    }

    public String getCode_txt() {
        return code_txt.getText();
    }

    public Button getEnter() {
        return Enter;
    }
    
    public void setErr(String err){
        err_txt.setText(err);
    }
    
}
