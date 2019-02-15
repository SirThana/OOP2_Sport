package sample.controller;

import java.awt.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.*;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import sample.model.Speler;
import sample.model.Team;


public class Controller {

    @FXML
    private TextField veld_naam;
    @FXML
    private TextField veld_achternaam;
    @FXML
    private TextField veld_leeftijd;
    @FXML
    private TextField veld_teamNaam;


    public void naamVeld(InputMethodEvent inputMethodEvent) {

    }

    public void achternaamVeld(ActionEvent actionEvent) {
    }

    public void leeftijdVeld(ActionEvent actionEvent) {
    }

    public void bsnVeld(MouseEvent mouseEvent) {
    }


        public void maakAanSpeler(){

        String naam = veld_naam.getText();
        String achternaam = veld_achternaam.getText();
        int leeftijd = Integer.parseInt(veld_leeftijd.getText());

        Speler a = new Speler(naam,achternaam,leeftijd);
        System.out.println(a.toString());


    }

        public void maakAanTeam(){
        String teamNaam = veld_teamNaam.getText();
        Team b = new Team(teamNaam);
            System.out.println(b.getTeamNaam());

        }


    public void textVeldObject(MouseEvent mouseEvent) {


    }

    public void veldTeamNaam(ActionEvent actionEvent) {
    }

    public void labelTeamNaam(MouseEvent mouseEvent) {
    }
}


