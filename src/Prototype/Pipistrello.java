package Prototype;

public class Pipistrello extends OggettiHalloween {

    @Override
    public String getOggetto() {
        return "Pipistrello";
    }

    @Override
    public Integer getX() {
        return X;
    }

    @Override
    public Integer getY() {
        return Y;
    }

    @Override
    public void setX(Integer x) {
        X = x;
    }

    @Override
    public void setY(Integer y) {
        Y = y;
    }

    @Override
    public OggettiHalloween cloneMio() {
        OggettiHalloween prototipo = null;
        try {
            prototipo  = (OggettiHalloween) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototipo;
    }
}
