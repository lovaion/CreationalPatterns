package Prototype;

public abstract class OggettiHalloween implements Cloneable{

    protected Integer X;
    protected Integer Y;

    protected Decorazione dec;

    public abstract String getOggetto();
    public abstract Integer getX();
    public abstract Integer getY();
    public abstract void setX(Integer x);
    public abstract void setY(Integer y);

    public void setDec(Decorazione dec) {
        this.dec = dec;
    }

    public Decorazione getDec() {
        return dec;
    }

    public abstract OggettiHalloween cloneMio();
}
