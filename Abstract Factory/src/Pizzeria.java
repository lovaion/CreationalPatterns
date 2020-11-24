public class Pizzeria {

    private PizzaFactory fabbrica;
    private Pizza pizza;
    private Patatine patatine;

    public Pizzeria(PizzaFactory fabbrica){
        this.fabbrica = fabbrica;
    }

    public void creaPizza(){
        pizza = fabbrica.creaPizza();
    }

    public void creaPatatine(){
        patatine = fabbrica.creaPatatine();
    }

    public String ingredientiPatatine(){
        return patatine.getIngredienti();

    }

    public String ingredientiPizza(){
        return pizza.getIngredienti();
    }
}
