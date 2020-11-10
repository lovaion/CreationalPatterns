package Builder;

import java.util.Arrays;
import java.util.List;

public class BuilderCharPlusOne extends BuilderParola{
    private List<Character> vocali = Arrays.asList('a', 'e', 'i', 'o', 'u');

    @Override
    public void creaConsonante(char c) {

        if (Character.isUpperCase(c))
            c = Character.toLowerCase(c);

        if (c == 'z') {
            c = 'b';
            parola+=c;
            return;
        }
        c++;
        if (vocali.contains(c)) {
            c++;
            parola+=c;
            return;
        }
        parola+=c;
    }

    @Override
    public void creaVocale(char c) {
        int indice = vocali.indexOf(c);
        parola += vocali.get((indice + 1) %5);
    }

}
