public class ProduttoreFlauti extends Produttore {

    public ProduttoreFlauti() {
        nome = "Franceschino";
    }

    @Override
    public void makeImpostazioni() {
        strumento.setCosto(100);
        strumento.setMarca("Ibanez");
        strumento.setProduttore(nome);
        strumento.setTipo("Flauto");
    }
}
