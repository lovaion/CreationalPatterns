import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Adapter");
        frame.setSize(800,800);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout());
        JTextField testo = new JTextField("Vuoto");
        testo.setEditable(false);
        JButton v3 = new JButton("3V");
        JButton v12 = new JButton("12V");
        JButton v120 = new JButton("120V");

        Controller controller = new Controller(testo);
        v3.addMouseListener(controller);
        v12.addMouseListener(controller);
        v120.addMouseListener(controller);

        panel.add(v3);
        panel.add(v12);
        panel.add(v120);
        panel.add(testo);
        panel.setBackground(Color.black);
        frame.add(panel);

        frame.setVisible(true);

    }

    public static Volt getVolt(AdattatoreAdapter ad, int i) {
        switch(i){
            case 3:
                return ad.get3Volt();
            case 12:
                return ad.get12Volt();
            case 120:
                return ad.get120Volt();
            default:
                return ad.get120Volt();
        }
    }
}
