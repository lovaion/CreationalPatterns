package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Concessionaria concessionaria = new ConcessionariaBerlina();
        concessionaria.createAuto();
        concessionaria.stampa();
        Concessionaria concessionaria1 = new ConcessionariaFurg();
        concessionaria1.createAuto();
        concessionaria1.stampa();
        Concessionaria concessionaria2 = new ConcessionariaMammasa();
        concessionaria2.createAuto();
        concessionaria2.stampa();
    }
}
