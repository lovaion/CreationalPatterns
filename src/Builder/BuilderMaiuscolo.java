package Builder;

public class BuilderMaiuscolo extends BuilderParola {
    private String parola = "";

    @Override
    public void creaConsonante(char c) {
        parola += Character.toUpperCase(c);
    }

    @Override
    public void creaVocale(char c) {
        parola += Character.toUpperCase(c);
    }

    public String getParola() {
        return parola;
    }
}
