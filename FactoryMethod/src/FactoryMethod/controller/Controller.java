package FactoryMethod.controller;

import FactoryMethod.model.Automobile;
import FactoryMethod.model.Concessionaria;
import FactoryMethod.model.ConcessionariaBerlina;
import FactoryMethod.model.ConcessionariaSport;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Controller {

    private String marcaScelta = "";
    private String modelloScelto = "";
    private Concessionaria c;
    private Automobile auto;


    @FXML
    private Label sportiva;

    @FXML
    private Label fiat;

    @FXML
    private Label berlina;

    @FXML
    private Label ford;

    @FXML
    void fiatCliccato(MouseEvent event) {
        fiat.setTextFill(Color.RED);
        ford.setTextFill(Color.GREY);
        marcaScelta = "fiat";
        berlina.setDisable(false);
        sportiva.setDisable(false);
    }

    public void fordCliccato(MouseEvent mouseEvent) {
        fiat.setTextFill(Color.GREY);
        ford.setTextFill(Color.RED);
        marcaScelta = "ford";
        berlina.setDisable(false);
        sportiva.setDisable(false);
    }

    public void berlinaClicked(MouseEvent mouseEvent) {
        berlina.setTextFill(Color.RED);
        sportiva.setTextFill(Color.GREY);
        modelloScelto = "berlina";
        c = new ConcessionariaBerlina();
    }

    public void sportivaClicked(MouseEvent mouseEvent) {
        sportiva.setTextFill(Color.RED);
        berlina.setTextFill(Color.GREY);
        modelloScelto = "sportiva";
        c = new ConcessionariaSport();

    }

    public void generaMacchina(MouseEvent mouseEvent) {
        if (!modelloScelto.equals("") && !marcaScelta.equals("")){
            auto = c.createAuto(marcaScelta);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Generazione..");
            alert.setHeaderText("Complimenti. Hai generato un auto");
            alert.setContentText(auto.toString());
            alert.showAndWait();
        }
    }
    @FXML
    public void initialize(){
        berlina.setDisable(true);
        sportiva.setDisable(true);
    }

}
