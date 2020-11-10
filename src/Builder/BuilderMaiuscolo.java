package Builder;

public class BuilderMaiuscolo extends BuilderParola {

    @Override
    public void creaConsonante(char c) {
        parola += Character.toUpperCase(c);
    }

    @Override
    public void creaVocale(char c) {
        parola += Character.toUpperCase(c);
    }


}
