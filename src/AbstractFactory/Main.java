package AbstractFactory;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Automobile> c = new ArrayList<Automobile>();
        AbstractFactory FF = new FiatFactory();
        AbstractFactory FordF = new FordFactory();
        c.add(FF.createBerlina());
        c.add(FordF.createFurgoncino());
        c.add(FordF.creaAuto("Mammasa"));
        System.out.println(c);

    }
}
