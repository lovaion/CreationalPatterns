package Builder;
public abstract class BuilderParola {
    protected String parola = "";
    /*
    Il prodotto è una stringa
    Noi abbiamo il builder che crea la consonante e la vocale, ma i diversi builder sono
    diversi modi di costurire l'oggetto, quindi bisogna fare 2 builder che creano gli oggetti in modo diverso

    I builder concreti creano il prodotto mano a mano
     */
    public void creaConsonante(char c){}
    public void creaVocale(char c){};

    public String getParola(){
        return parola;
    }
}
