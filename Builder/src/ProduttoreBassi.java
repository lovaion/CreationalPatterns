public class ProduttoreBassi extends Produttore {


    public ProduttoreBassi() {
        nome = "Mario Giorgionio";
    }

    @Override
    public void makeImpostazioni() {
        strumento.setCosto(90);
        strumento.setMarca("Epiphone");
        strumento.setProduttore(nome);
        strumento.setTipo("Basso");
    }
}
