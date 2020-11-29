import java.util.Vector;

public class SelectionSort implements AlgoritmiOrdinamento {
    @Override
    public Vector<Integer> sort(Vector<Integer> numeriDisordinati) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < numeriDisordinati.size(); i++) {
            int min = numeriDisordinati.get(i);
            int minId = i;
            for (int j = i+1; j < numeriDisordinati.size(); j++) {
                if (numeriDisordinati.get(j) < min) {
                    min = numeriDisordinati.get(j);
                    minId = j;
                }
            }
            // swap
            int temp = numeriDisordinati.get(i);
            numeriDisordinati.set(i, min);
            numeriDisordinati.set(minId, temp);
            Visualizer.getVisualizer(numeriDisordinati).selected = min;
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Tempo di esecuzione:" + (end- start));
        return numeriDisordinati;
    }
}
