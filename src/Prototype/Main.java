package Prototype;

public class Main {
    public static void main(String[] args) {

       GestoreDecorazioni gesDec = new GestoreDecorazioni(new Zucca("Rosso"));

       OggettiHalloween zucca1 = gesDec.creaDecorazione1();
       System.out.println(zucca1.getDec().getTipo());


    }
}
