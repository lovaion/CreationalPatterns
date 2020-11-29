public class Strumento {

    private String marca = "";
    private float costo = 0;
    private String produttore = "";
    private String tipo = "";

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public void setCosto(float costo) {
        this.costo = costo;
    }


    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    @Override
    public String toString() {
        return "Strumento{" +
                "marca='" + marca + '\'' +
                ", costo=" + costo +
                ", produttore='" + produttore + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
