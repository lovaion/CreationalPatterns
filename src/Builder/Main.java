package Builder;

public class Main {
    public static void main(String[] args) {
   // BuilderMaiuscolo builder = new BuilderMaiuscolo();
    BuilderParola builder = new BuilderCharPlusOne();
    Director director = new Director(builder);

    director.creaParola();
    System.out.println(director.getParola());
    }

}
