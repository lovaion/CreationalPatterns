import javafx.scene.image.Image;

public class GinoStrada extends Assessore {

    private int height;
    private int width;
    private Image immagine = new Image(String.valueOf(getClass().getResource("/resources/ginoStrada.png")));


    public GinoStrada(GinoStrada a) {
        super(a);
        this.height = a.height;
        this.width = a.width;
    }

    public GinoStrada() {
        super();
    }

    @Override
    public Assessore clone() {
        return new GinoStrada(this);
    }
    @Override
    public Image getImage() {
        return immagine;
    }

}
