public abstract class Produttore {


    protected Strumento strumento;
    protected String nome;
    public void creaStrumento(){
        strumento = new Strumento();
        System.out.println(strumento + "E' stato creato");
    }

    public Strumento getStrumento(){
        return strumento;
    }

    public abstract void makeImpostazioni();

}
