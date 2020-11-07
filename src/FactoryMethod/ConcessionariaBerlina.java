package FactoryMethod;

public class ConcessionariaBerlina extends  Concessionaria{
    @Override
    public void createAuto() {
        auto = new Berlina();
        auto.setMarca(auto.getTipologia());
        auto.setTarga("AF445MA");

    }
}
