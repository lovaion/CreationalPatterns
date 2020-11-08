package AbstractFactory;

public abstract class Automobile {
    private String targa;
    private String marca;

    public abstract String getTipologia();

    @Override
    public String toString() {
        return  getTipologia() + " targa='" + targa + '\'' +
                ", marca='" + marca + '\'';
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
