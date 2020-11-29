import javax.swing.*;

public class Main {
    public static final int WINDOWWIDTH = 1800;
    public static final int WINDOWHEIGHT = 950;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(WINDOWWIDTH, WINDOWHEIGHT);
        // SELEZIONO L'ALGORITMO DI ORDINAMENTO DA ME SCELTO


        Object[] scelte = {"Bubble sort", "Selection sort", "Insertion sort"};
        Object scelta = JOptionPane.showInputDialog(null, "Scegli l'algoritmo di ordinamento", "Scelta", JOptionPane.INFORMATION_MESSAGE, null, scelte, scelte[0]);
        AlgoritmiOrdinamento scelto = null;
        if (scelta != null) {
            if (scelta.toString().equals("Bubble sort"))
                scelto = new BubbleSort();
            else if (scelta.toString().equals("Selection sort"))
                scelto = new SelectionSort();
            else if (scelta.toString().equals("Insertion sort"))
                scelto = new InsertionSort();
        }
        //la dimensione del vettore
        int dimensione = 0;
        // SELEZIONO LA DIMENSIONE DEL VETTORE
        boolean corretto = false;
        while (!corretto) {
            corretto = true;
            String dim = JOptionPane.showInputDialog("Inserisci la grandezza del vettore");
            dimensione = Integer.parseInt(dim);
            if (dimensione > WINDOWWIDTH) {
                JOptionPane.showMessageDialog(frame,
                        "Valore " + dimensione + " troppo grande. Inserisci un valore inferiore a: "
                                + WINDOWWIDTH,
                        "Errore",
                        JOptionPane.WARNING_MESSAGE);
                corretto = false;
            }
        }

        Elementi elementi = new Elementi();
        elementi.creaListaDisordinata(dimensione);
        elementi.setAlgoritmiOrdinamento(scelto);
        Visualizer visualizer = Visualizer.getVisualizer(elementi.getListaNonOrdinata());
        Thread t1 = new Thread(visualizer);
        t1.start();
        frame.add(visualizer);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        elementi.getNumeri();
    }


}
