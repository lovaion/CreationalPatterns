package FactoryMethod.model;

public class ConcessionariaBerlina extends  Concessionaria{
    @Override
    public Automobile createAuto(String marca) {
        Automobile auto = new Berlina();
        auto.setMarca(marca);
        auto.setTarga("AF445MA");
        return auto;
        //viene associata ad un auto nel controller
    }

}
