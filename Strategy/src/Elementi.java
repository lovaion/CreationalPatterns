import com.sun.deploy.config.VerboseDefaultConfig;

import java.util.Random;
import java.util.Vector;

public class Elementi {

    private Vector<Integer> numeri;
    private AlgoritmiOrdinamento algoritmiOrdinamento;


    public Elementi() {
        numeri = new Vector<>();
    }

    public void creaListaDisordinata(int size) {
        Vector<Integer> temp = new Vector<>();
        numeri.setSize(size);
        temp.setSize(size);
        for (int i = 0; i < numeri.size(); i++) {
            numeri.set(i, i);
            temp.set(i,i);
        }
        Random random = new Random();
        for (int i = 0; i < numeri.size(); i++) {
            int temporaneo = random.nextInt(temp.size());
            numeri.set(i, temp.get(temporaneo));
            temp.remove(temporaneo);
        }
    }

    public void setAlgoritmiOrdinamento(AlgoritmiOrdinamento algoritmiOrdinamento){
        this.algoritmiOrdinamento = algoritmiOrdinamento;
    }

    public Vector<Integer> getNumeri(){
        return algoritmiOrdinamento.sort(numeri);
    }

    public Vector<Integer> getListaNonOrdinata(){
        return numeri;
    }


}
