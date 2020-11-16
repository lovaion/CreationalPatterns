import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Controller implements MouseListener {

    AdattatoreAdapter ad = new AdattatoreAdapter();
    JTextField testoMod;
    public Controller(JTextField testo) {
        testoMod = testo;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object o = e.getSource();
        JButton b = null;
        String testo = "";

        if (o instanceof JButton){
            b = (JButton) o;
        }

        if (b!=null){
            testo = b.getText();
        }

        if (testo.equals("3V")) {
            Volt v3 = ad.get3Volt();
            testoMod.setText("V3 volts usando l'adattatore: " +v3.getVolts());
        }
        else if (testo.equals("12V")) {
            Volt v12 = ad.get12Volt();
            testoMod.setText("V12 volts usando l'adattatore: " +v12.getVolts());
        }
        else if (testo.equals("120V")) {
            Volt v120 = ad.get120Volt();
            testoMod.setText("V120 volts usando l'adattatore: " +v120.getVolts());
        }

        }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
