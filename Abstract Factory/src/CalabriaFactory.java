public class CalabriaFactory implements PizzaFactory {
    @Override
    public Pizza creaPizza() {
        return new PizzaCalabrese();
    }

    @Override
    public Patatine creaPatatine() {
        return new PatatineCalabresi();
    }
}
