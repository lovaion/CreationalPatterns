package FactoryMethod;

public abstract class Concessionaria {

    protected Automobile auto;

    public abstract void createAuto(); // metodo fabbrica

    public void stampa(){
        System.out.println(this.auto);
    }

}
