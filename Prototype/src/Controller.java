import javafx.scene.canvas.Canvas;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class Controller {

    public VBox boxVerticale;
    public Canvas canvasDisegno;
    public ScrollPane scrollPane;
    private Image dipingere = null;
    private MediaPlayer player;





    public void dipingi(MouseEvent mouseEvent) {
        if (dipingere != null)
            canvasDisegno.getGraphicsContext2D().drawImage(dipingere, mouseEvent.getX()-dipingere.getWidth()/2, mouseEvent.getY()-dipingere.getHeight()/2);
    }


    public void initialize() {
        loadMusic();
        canvasDisegno.getGraphicsContext2D().drawImage(new Image(String.valueOf(getClass().getResource("/resources/ospedale.png"))), 0, 0);
        EugenioGaudio eug = new EugenioGaudio();
        GinoStrada gin = new GinoStrada();
        Skandenberg sk = new Skandenberg();
        ImageView skandenberg = new ImageView(sk.getImage());
        ImageView eugenio = new ImageView(eug.getImage());
        ImageView gino = new ImageView(gin.getImage());
        skandenberg.setOnMouseClicked(cliccato->{
            Skandenberg clonato = (Skandenberg) sk.clone();
            dipingere = clonato.getImage();        });
        eugenio.setOnMouseClicked(cliccato->{
            EugenioGaudio clonato = (EugenioGaudio) eug.clone();
            dipingere = clonato.getImage();
        });
        gino.setOnMouseClicked(cliccato->{
            GinoStrada clonato = (GinoStrada) gin.clone();
            dipingere = clonato.getImage();
        });

        
        boxVerticale.getChildren().add(skandenberg);
        boxVerticale.getChildren().add(eugenio);
        boxVerticale.getChildren().add(gino);

        /*Image sciagurato = new Image(String.valueOf(getClass().getResource("resources/sciagurato.jpg")));
        ImageView sciag = new ImageView(sciagurato);
        sciag.setOnMouseClicked(funzione1->{
            image1 = sciag.getImage();
        });
        boxVerticale.getChildren().add(sciag);
    */
    }

    public void loadMusic(){
        String file = getClass().getClassLoader().getResource("resources/aot.mp3").toString();
        Media media = new Media(file);
        player = new MediaPlayer(media);
        player.setVolume(0.2);
        player.play();
    }

}
