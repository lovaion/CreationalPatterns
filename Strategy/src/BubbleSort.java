import java.util.Vector;

public class BubbleSort implements AlgoritmiOrdinamento {
    @Override
    public Vector<Integer> sort(Vector<Integer> numeriDisordinati) {
        long start = System.currentTimeMillis();
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < numeriDisordinati.size() - 1; i++) {
                if (numeriDisordinati.get(i) > numeriDisordinati.get(i + 1)) {
                    Visualizer.getVisualizer(numeriDisordinati).selected = i - 1;
                    int temp = numeriDisordinati.get(i);
                    numeriDisordinati.set(i, i + 1);
                    numeriDisordinati.set(i + 1, temp);
                    sorted = false;
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Tempo di esecuzione:" + (end - start));
        return numeriDisordinati;
    }
}
