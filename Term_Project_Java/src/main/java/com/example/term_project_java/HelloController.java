package com.example.term_project_java;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import javafx.scene.effect.Effect;
import javafx.application.Application;
public class HelloController {
    @FXML
    private Label welcomeText;
    Stage stage=new Stage();


    @FXML
   private Button button1;

    @FXML
    private Label broccoli;


        public void BusHover() {
            ColorAdjust blackout = new ColorAdjust();
            blackout.setBrightness(-1.0);
        }
        public void BusClick()
        {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("bus-view.fxml"));
            try {
                Scene scene = new Scene(fxmlLoader.load());
                stage.setScene(scene);
                stage.setFullScreen(true);
                stage.show();

            }
            catch (Exception e)
            {

            }
        }


    public void TrainClick()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("train-view.fxml"));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.setFullScreen(true);
            stage.show();

        }
        catch (Exception e)
        {

        }
    }
    public void PlaneClick()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("plane-view.fxml"));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.setFullScreen(true);
            stage.show();

        }
        catch (Exception e)
        {

        }
    }
    public void FerryClick()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ferry-view.fxml"));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.setFullScreen(true);
            stage.show();

        }
        catch (Exception e)
        {

        }
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    protected void onButtonButtonClick()
    {

    }
}