package Singletone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Automobile> c = new ArrayList<Automobile>();
        AbstractFactory ff = AbstractFactory.getInstance("Singletone.FiatFactory");
        AbstractFactory fordf = AbstractFactory.getInstance("Singletone.FordFactory");
        AbstractFactory fiatFake = AbstractFactory.getInstance("Singletone.FiatFactory");
        AbstractFactory bestemmia = new FiatFactory();
        c.add(ff.creaAuto("Berlina"));
        System.out.println(c);

        System.out.println(ff);
        System.out.println(bestemmia);


    }
}
