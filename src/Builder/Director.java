package Builder;

public class Director {
    /*
    Nel costruttore gli viene passato il builder.
    Ha un metodo creaProdotto void e nel crea prodotto c'è scritto come fare il prodotto
     */

    private BuilderParola builderParola;

    public Director(BuilderParola builder) {
        builderParola = builder;
    }

    public void creaParola(){
        builderParola.creaVocale('a');
        builderParola.creaConsonante('l');
        builderParola.creaVocale('e');
        builderParola.creaConsonante('x');
    }

    public String getParola(){
        return builderParola.getParola();
    }
}
