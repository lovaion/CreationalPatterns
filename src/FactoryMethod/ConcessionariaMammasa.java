package FactoryMethod;

public class ConcessionariaMammasa extends Concessionaria{

    @Override
    public void createAuto() {
        auto = new Mammasa();
        auto.setMarca(auto.getTipologia());
        auto.setTarga("AF445MU");
    }
}
