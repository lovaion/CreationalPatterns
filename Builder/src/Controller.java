import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller {


    public ImageView immagine;
    public Label informazioni;
    public Label scelta;
    public ComboBox comboList;
    private Venditore mario;
    public void initialize() {
        mario = new Venditore();
        ObservableList<String> list = FXCollections.observableArrayList("Chitarra", "Basso", "Flauto");
        comboList.setItems(list);
    }

    public void select(ActionEvent actionEvent) {
        String s = comboList.getSelectionModel().getSelectedItem().toString();
        scelta.setText(s);
        switch (s){
            case "Chitarra":{
                mario.setProduttore(new ProduttoreChitarre());
                mario.creaStrumento();
                break;
            }
            case "Basso":{
                mario.setProduttore(new ProduttoreBassi());
                mario.creaStrumento();
                break;
            }
            case "Flauto":{
                mario.setProduttore(new ProduttoreFlauti());
                mario.creaStrumento();
                break;
            }
        }
        informazioni.setVisible(true);
        immagine.setImage(new Image(String.valueOf(getClass().getResource("resources/"+s+".png")),150,150, true, true));
    }

    public void showInfo(MouseEvent mouseEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Info ");
        alert.setHeaderText("Queste sono i dettagli dello strumento");
        alert.setContentText(mario.getStrumento().toString());
        alert.showAndWait();
    }
}

