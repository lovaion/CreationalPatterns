package Prototype;


public class Decorazione implements Cloneable {

    String tipo;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public Decorazione cloneMio(){
        Decorazione prototipo = null;
        try {
            prototipo = (Decorazione) this.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prototipo;
    }

}
