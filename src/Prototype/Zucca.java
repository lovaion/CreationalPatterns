package Prototype;

public class Zucca extends OggettiHalloween {

    private String colore;

    public Zucca(String colore) {
        this.colore = colore;
        this.dec = new Decorazione();
    }

    @Override
    public String getOggetto() {
        return "Zucca";
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

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }

    @Override
    public OggettiHalloween cloneMio() {
        OggettiHalloween prototipo = null;
        try {
            prototipo = (OggettiHalloween) this.clone();
            prototipo.setDec(this.getDec().cloneMio());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return prototipo;
    }
}
