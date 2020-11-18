package Model;

import javafx.scene.image.Image;

public class Skandenberg extends Assessore {


    private int height;
    private int width;
    private Image immagine = new Image(String.valueOf(getClass().getResource("../resources/skandenberg.png")));


    public Skandenberg(Skandenberg a) {
        super(a);
        this.height = a.height;
        this.width = a.width;
    }

    public Skandenberg() {
        super();
    }

    @Override
    public Assessore clone() {
        return new Skandenberg(this);
    }

    @Override
    public Image getImage() {
        return immagine;
    }
}
