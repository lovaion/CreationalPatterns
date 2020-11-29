public class ProduttoreChitarre extends Produttore {


    public ProduttoreChitarre() {
        nome = "Gianfrancesco";
    }

    @Override
    public void makeImpostazioni() {
        strumento.setCosto(100);
        strumento.setMarca("Ibanez");
        strumento.setProduttore(nome);
        strumento.setTipo("Chitarra");
    }
}
