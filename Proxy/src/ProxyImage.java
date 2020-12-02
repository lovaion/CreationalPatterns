import javafx.scene.image.Image;

public class ProxyImage implements ImageInterface{

    RealImage realImage;
    String pathImmagine;


    public ProxyImage(String path) {
        realImage = null;
        pathImmagine = path;
    }

    @Override
    public Image loadImage() {
        realImage = new RealImage(pathImmagine);

        return realImage.loadImage();
    }
}
