import javafx.scene.image.Image;

public abstract class Assessore implements Cloneable {
    private int height;
    private int width;
    Image immagine = null;


    public Assessore(Assessore a){
        this.height = a.height;
        this.width = a.width;
        this.immagine = a.immagine;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Assessore() {
        height = 150;
        width = 150;
    }


    public abstract Assessore clone();

    public abstract Image getImage();

}
