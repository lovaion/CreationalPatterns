package Singletone;

import java.lang.reflect.InvocationTargetException;

public abstract class AbstractFactory {

    private static AbstractFactory absFactory;

    public static AbstractFactory getInstance(String tipo){
        if (absFactory == null){
            try {
                // In base alla stringa che si passa capisce quale classe creare
                absFactory = (AbstractFactory) Class.forName(tipo).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return absFactory;
    }

    public abstract Automobile createBerlina();
    public abstract Automobile createFurgoncino();
    public abstract Automobile createMammasa();
    public abstract Automobile creaAuto(String tipo);}

