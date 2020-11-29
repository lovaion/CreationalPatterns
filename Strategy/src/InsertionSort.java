import java.util.Vector;

public class InsertionSort implements AlgoritmiOrdinamento {
    @Override
    public Vector<Integer> sort(Vector<Integer> numeriDisordinati) {
        long start = System.currentTimeMillis();
            for (int i = 1; i < numeriDisordinati.size(); i++) {
                int current = numeriDisordinati.get(i);
                int j = i - 1;
                while(j >= 0 && current < numeriDisordinati.get(j)) {
                    numeriDisordinati.set(j + 1, numeriDisordinati.get(j));
                    j--;
                }
                numeriDisordinati.set(j + 1, current);
                Visualizer.getVisualizer(numeriDisordinati).selected = current;
                try {
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        System.out.println("Tempo di esecuzione:" + (System.currentTimeMillis() - start));
        return numeriDisordinati;

    }
}
