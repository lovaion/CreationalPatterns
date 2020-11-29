public class Venditore {

    private Produttore produttore;

    public void creaStrumento(){
        produttore.creaStrumento();
        produttore.makeImpostazioni();
    }
    public Strumento getStrumento(){
        return produttore.getStrumento();

    }


    public void setProduttore(Produttore produttore) {
        this.produttore = produttore;
    }

}
