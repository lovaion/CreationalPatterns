package FactoryMethod;

public class ConcessionariaFurg extends Concessionaria {
    @Override
    public void createAuto() {
        auto = new Furgoncino();
        auto.setMarca(auto.getTipologia());
        auto.setTarga("AF445ME");
    }
}
