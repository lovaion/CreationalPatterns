package AbstractFactory;

public abstract class AbstractFactory {

    public abstract Automobile createBerlina();
    public abstract Automobile createFurgoncino();
    public abstract Automobile createMammasa();

    public abstract Automobile creaAuto(String tipo);}
