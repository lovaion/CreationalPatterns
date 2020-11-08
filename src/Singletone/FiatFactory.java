package Singletone;

public class FiatFactory extends AbstractFactory {


    @Override
    public Automobile createBerlina() {
        return new FiatBerlina();
    }

    @Override
    public Automobile createFurgoncino() {
        return new FiatFurgoncino();
    }

    @Override
    public Automobile createMammasa() {
        return new FiatMammasa();
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
