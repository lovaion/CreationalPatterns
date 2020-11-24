import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;

public class Controller {
    public String tipologiaScelta;
    public Label calabrese;
    public Label napoletana;
    public Label annuncioScelti;
    public ImageView pizzaImmagine;
    public ImageView patatineImmagine;
    public Button bottone;
    private Pizzeria pizzeria;
    public static final String CALABRESE = "Calabrese";
    public static final String NAPOLETANA = "Napoletana";
    private MediaPlayer mediaPlayer;


    public void initialize() {

    pizzaImmagine.setOnMouseClicked(event -> {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Pizza: " + tipologiaScelta);
        alert.setHeaderText("Ecco gli ingredienti della tua pizza");
        alert.setContentText(pizzeria.ingredientiPizza());
        alert.showAndWait();
    });

    patatineImmagine.setOnMouseClicked(event -> {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Pizza: " + tipologiaScelta);
        alert.setHeaderText("Ecco gli ingredienti delle tue patatine");
        alert.setContentText(pizzeria.ingredientiPatatine());
        alert.showAndWait();
    });

    }

    public void sceltaCalabrese(MouseEvent mouseEvent) {
        pizzeria = new Pizzeria(new CalabriaFactory());
        tipologiaScelta = CALABRESE;
        calabrese.setTextFill(Color.RED);
        napoletana.setTextFill(Color.GRAY);
        annuncioScelti.setVisible(true);
        bottone.setDisable(false);
        bottone.setVisible(true);
        pizzaImmagine.setVisible(false);
        patatineImmagine.setVisible(false);
    }

    public void sceltaNapoletana(MouseEvent mouseEvent) {
        pizzeria = new Pizzeria(new NapoliFactory());
        tipologiaScelta = NAPOLETANA;
        calabrese.setTextFill(Color.GRAY);
        napoletana.setTextFill(Color.RED);
        annuncioScelti.setVisible(true);
        bottone.setDisable(false);
        bottone.setVisible(true);
        pizzaImmagine.setVisible(false);
        patatineImmagine.setVisible(false);
    }

    public void generaProdotti(ActionEvent actionEvent) {
        pizzeria.creaPatatine();
        pizzeria.creaPizza();
        switch (tipologiaScelta) {
            case CALABRESE:
                pizzaImmagine.setImage(new Image(String.valueOf(getClass().getResource("Resources/calabrese.png"))));
                patatineImmagine.setImage(new Image(String.valueOf(getClass().getResource("Resources/patatineCalabresi.png"))));
                break;
            case NAPOLETANA:
                pizzaImmagine.setImage(new Image(String.valueOf(getClass().getResource("Resources/pizzaNapoletana.png"))));
                patatineImmagine.setImage(new Image(String.valueOf(getClass().getResource("Resources/patateNapoletane.png"))));
                break;
        }
        pizzaImmagine.setVisible(true);
        patatineImmagine.setVisible(true);
        musica(tipologiaScelta);
    }

    public void musica(String musica) {
        switch (musica) {
            case Controller.CALABRESE:
                String file = String.valueOf(getClass().getResource("Resources/tarantellaCalabrese.mp3"));
                Media media = new Media(file);
                mediaPlayer = new MediaPlayer(media);
                mediaPlayer.stop();
                break;
            case Controller.NAPOLETANA:
                String file2 = String.valueOf(getClass().getResource("Resources/tarantellaNapoletana.mp3"));
                Media media2 = new Media(file2);
                mediaPlayer = new MediaPlayer(media2);
                mediaPlayer.stop();
                break;
        }
        mediaPlayer.setVolume(0.2);
        mediaPlayer.play();

    }

}
