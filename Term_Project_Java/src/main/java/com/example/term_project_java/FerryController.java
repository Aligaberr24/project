package com.example.term_project_java;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FerryController {
    @FXML
    private AnchorPane ferrybox;
    @FXML
    private ChoiceBox<String> deptime=new ChoiceBox<>();
    @FXML
    private TextField stops;
    public Ferry F=new Ferry();
    @FXML
    private TextField persontext;
    @FXML
    private CheckBox checkbox;
    @FXML
    private ChoiceBox <String> From=new ChoiceBox<>();
    @FXML
    private ChoiceBox <String> Too=new ChoiceBox<>();

    public void Startt()
    {

        String temp;
        int i;
        int q=F.Stations.size();
        if(From.getItems().isEmpty()==true) {
            for (i = 0; i < q; i++) {
                temp = F.Stations.get(i);
                From.getItems().add(temp);
            }
        }
    }
    public void Starttt()
    {
        if(deptime.getItems().isEmpty()==true)
        {
            deptime.getItems().add("12:30");
            deptime.getItems().add("15:30");
            deptime.getItems().add("19:30");
            deptime.getItems().add("00:30");
        }
    }

    public void Start()
    {
        String temp;
        int i;
        int q=F.Stations.size();
        if(Too.getItems().isEmpty()==true) {
            for (i = 0; i < q; i++) {
                temp = F.Stations.get(i);
                Too.getItems().add(temp);
            }
        }
    }
    public void condition()
    {
        if (From.getValue()==Too.getValue()){
            Too.getSelectionModel().clearSelection();
        }
    }
    public void money()
    {
        F.stops=Integer.parseInt(stops.getText());
        F.price=F.price +F.stops*-2;
        F.price=F.price+Integer.parseInt(persontext.getText())*3.75;
        if(checkbox.isSelected()==true)
        {
            F.price=F.price+2.5;
        }

    }
    public void ButtonCLick()
    {
        if(stops.getText()!=null && persontext.getText()!=null) {
            money();
        }
        Ferryfinalcontroller.ferry=F;
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Ferry-final.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 200);
            Stage stage=new Stage();
            stage.setScene(scene);
            stage.setFullScreen(true);
            stage.show();
        }
        catch (Exception e)
        {

        }
    }




}
