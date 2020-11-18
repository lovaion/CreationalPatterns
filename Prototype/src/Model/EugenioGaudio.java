package Model;

import javafx.scene.image.Image;

public class EugenioGaudio extends Assessore {

    private int height;
    private int width;
    public Image immagine = new Image(String.valueOf(getClass().getResource("../resources/eugenioGaudio.png")));



    public EugenioGaudio(EugenioGaudio a) {
        super(a);
        this.height = a.height;
        this.width = a.width;
    }

    public EugenioGaudio() {
        super();
    }


    @Override
    public Assessore clone() {
        return new EugenioGaudio(this);
    }

    @Override
    public Image getImage() {
        return immagine;
    }
}
