public class MySingleton {

    private static MySingleton singleton = null;
    private int numero = 0;
    private MySingleton(){
        System.out.println("Singleton istanziato");
    }

    public static MySingleton getInstance(){
        if (singleton == null){
            singleton = new MySingleton();
        }
        else
            System.out.println("Singleton già generato, può esistere una sola istanza.");

        return singleton;
    }

    public void plusNum(){
        numero++;
    }

    public int getNum(){
        return numero;
    }



}
