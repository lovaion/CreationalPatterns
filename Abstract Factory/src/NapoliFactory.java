public class NapoliFactory implements PizzaFactory {
    @Override
    public Pizza creaPizza() {
        return new PizzaNapoletana();
    }

    @Override
    public Patatine creaPatatine() {
        return new PatatineNapoletane();
    }
}
