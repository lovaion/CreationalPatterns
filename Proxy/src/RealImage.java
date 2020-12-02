import javafx.scene.image.Image;

import javax.swing.text.html.ImageView;

public class RealImage implements ImageInterface {

    Image picture;


    public RealImage(String path) {
        this.picture = new Image(path, 150,150,true,true);
    }

    @Override
    public Image loadImage() {
        return picture;
    }
}
