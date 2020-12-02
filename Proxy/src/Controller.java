import com.sun.deploy.cache.JarSigningData;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Controller {


    public FlowPane flowPane;
    ArrayList<ImageViewInterface> album = new ArrayList<>();
    private long start;
    private long end;
    private JarSigningData Dialogs;

    public void initialize() {
        start = System.currentTimeMillis();

        List<String> choices = new ArrayList<>();
        choices.add("proxy");
        choices.add("real");

        ChoiceDialog<String> dialog = new ChoiceDialog<>("proxy", choices);
        dialog.setTitle("Input");
        dialog.setHeaderText("Chose the input");
        dialog.setContentText("Chose the loading type: ");

        Optional<String> result = dialog.showAndWait();


        for (int i = 0; i < 50; i++) {
            if (result.isPresent()) {
                if (result.get().equals("proxy"))
                    album.add(new ImageViewInterface(new ProxyImage(toString().valueOf(getClass().getResource("shinji.jpg")))));
                else
                    album.add(new ImageViewInterface(new RealImage(toString().valueOf(getClass().getResource("shinji.jpg")))));
            }
            else {
                System.out.println("Nessuna scelta effettuata");
                System.exit(1);
            }
        }

        album.forEach(sender -> {
            flowPane.getChildren().add(sender);
        });
        end = System.currentTimeMillis();
        System.out.println("Tempo di esecuzione: " + (end - start));
    }


    private class ImageViewInterface extends ImageView {

        ImageInterface soggetto;

        public ImageViewInterface(ImageInterface soggetto) {
            super();
            if (soggetto instanceof ProxyImage) {
                Image proxy = new Image(String.valueOf(getClass().getResource("proxy.png")), 150, 150, true, true);
                this.soggetto = soggetto;
                this.setImage(proxy);
                this.setOnMouseEntered(event -> this.setImage(soggetto.loadImage()));

            } else {
                this.soggetto = soggetto;
                this.setImage(soggetto.loadImage());
            }


        }
    }
}

