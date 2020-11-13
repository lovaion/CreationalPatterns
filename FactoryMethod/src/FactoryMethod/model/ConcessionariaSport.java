package FactoryMethod.model;

public class ConcessionariaSport extends Concessionaria {
    @Override
    public Automobile createAuto(String marca) {
        Automobile auto = new Sportiva();
        auto.setMarca(marca);
        auto.setTarga("AF445ME");

        return auto;
    }

}
