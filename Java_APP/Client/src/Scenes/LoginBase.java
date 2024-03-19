package Scenes;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class LoginBase extends AnchorPane {

    protected final ImageView imageView;
    protected final Label user_label;
    protected final Label pass_label;
    protected final TextField user_txt;
    protected final Reflection reflection;
    protected final PasswordField pass_txt;
    protected final Reflection reflection0;
    protected final Button login;
    protected final Label label;
    protected final InnerShadow innerShadow;
    protected final Text err_txt;

    public LoginBase() {

        imageView = new ImageView();
        user_label = new Label();
        pass_label = new Label();
        user_txt = new TextField();
        reflection = new Reflection();
        pass_txt = new PasswordField();
        reflection0 = new Reflection();
        login = new Button();
        label = new Label();
        innerShadow = new InnerShadow();
        err_txt = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(900.0);
        setPrefWidth(800.0);

        imageView.setFitHeight(900.0);
        imageView.setFitWidth(800.0);
        imageView.setImage(new Image(getClass().getResource("Images/Login.jpg").toExternalForm()));

        user_label.setLayoutX(105.0);
        user_label.setLayoutY(421.0);
        user_label.setPrefHeight(45.0);
        user_label.setPrefWidth(270.0);
        user_label.setText("User Name");
        user_label.setFont(new Font("System Bold Italic", 30.0));

        pass_label.setLayoutX(105.0);
        pass_label.setLayoutY(524.0);
        pass_label.setPrefHeight(45.0);
        pass_label.setPrefWidth(160.0);
        pass_label.setText("Password");
        pass_label.setFont(new Font("System Bold Italic", 30.0));

        user_txt.setLayoutX(361.0);
        user_txt.setLayoutY(434.0);
        user_txt.setPrefHeight(31.0);
        user_txt.setPrefWidth(301.0);
        user_txt.setPromptText("Enter your User Name");
        user_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0;");

        reflection.setBottomOpacity(0.1);
        reflection.setTopOffset(0.1);
        reflection.setTopOpacity(0.25);
        user_txt.setEffect(reflection);

        pass_txt.setLayoutX(361.0);
        pass_txt.setLayoutY(531.0);
        pass_txt.setPrefHeight(26.0);
        pass_txt.setPrefWidth(301.0);
        pass_txt.setPromptText("Enter your Password");
        pass_txt.setStyle("-fx-border-color: black; -fx-font-size: 15; -fx-font-style: italic; -fx-background-color: transparent; -fx-border-width: 0 0 1 0;");

        reflection0.setBottomOpacity(0.1);
        reflection0.setTopOffset(0.1);
        reflection0.setTopOpacity(0.25);
        pass_txt.setEffect(reflection0);

        login.setLayoutX(328.0);
        login.setLayoutY(697.0);
        login.setMnemonicParsing(false);
        login.setPrefHeight(45.0);
        login.setPrefWidth(145.0);
        login.setStyle("-fx-text-fill: black; -fx-border-color: black; -fx-cursor: hand; -fx-border-radius: 30; -fx-border-width: 2px; -fx-background-color: #dda462; -fx-padding: 8; -fx-background-radius: 30; -fx-font-size: 18; -fx-font-weight: bold;");
        login.setText("Login");
        login.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        login.setTextOverrun(javafx.scene.control.OverrunStyle.CLIP);

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setLayoutX(233.0);
        label.setLayoutY(312.0);
        label.setPrefHeight(36.0);
        label.setPrefWidth(336.0);
        label.setStyle("-fx-font-family: Arial; -fx-font-size: 30; -fx-text-fill: black; -fx-font-weight: bold; -fx-font-style: italic;");
        label.setText("Expecto Patronum!");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        innerShadow.setColor(Color.rgb(188, 167, 167));
        label.setEffect(innerShadow);

        err_txt.setFill(javafx.scene.paint.Color.RED);
        err_txt.setLayoutX(224.0);
        err_txt.setLayoutY(641.0);
        err_txt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        err_txt.setStrokeWidth(0.0);
        err_txt.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        err_txt.setWrappingWidth(354.6708984375);
        err_txt.setFont(new Font("System Bold", 20.0));

        getChildren().add(imageView);
        getChildren().add(user_label);
        getChildren().add(pass_label);
        getChildren().add(user_txt);
        getChildren().add(pass_txt);
        getChildren().add(login);
        getChildren().add(label);
        getChildren().add(err_txt);

    }

    public String getUser_txt() {
        return user_txt.getText();
    }

    public String getPass_txt() {
        return pass_txt.getText();
    }

    public Button getLogin() {
        return login;
    }
    
    public void setErr(String err){
        err_txt.setText(err);
    }
    
}
