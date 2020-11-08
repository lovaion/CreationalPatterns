package AbstractFactory;

public class FordFactory extends AbstractFactory {
    @Override
    public Automobile createBerlina() {
        return new FordBerlina();
    }

    @Override
    public Automobile createFurgoncino() {
        return new FordFurgoncino();
    }

    @Override
    public Automobile createMammasa() {
        return new FordMammasa();
    }

    @Override
    public Automobile creaAuto(String tipo) {
        if (tipo.equals("Berlina"))
            return createBerlina();
        else if (tipo.equals("Furgoncino"))
            return createFurgoncino();
        else
            return createMammasa();
    }
}
