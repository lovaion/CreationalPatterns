import com.sun.corba.se.impl.orb.PrefixParserAction;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Visualizer extends JPanel implements Runnable{

    private static Visualizer visualizer = null;

    private boolean sorted = false;
    private final Vector<Integer> arr;
    int xloc = 0, yloc = Main.WINDOWHEIGHT - 30, width;
    private int mannaia = 1;
    int selected = 0;


    private Visualizer(Vector<Integer> arr) {
        this.setBackground(Color.BLACK);
        this.arr = arr;
        if (arr.size() > Main.WINDOWHEIGHT)
            width = 1;
        else
            width = Main.WINDOWHEIGHT / arr.size() * 2;
        repaint();
    }

    public static Visualizer getVisualizer(Vector<Integer> arr) {
        if (visualizer == null) {
            visualizer = new Visualizer(arr);
        }
        return visualizer;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g) {
        for (int j : arr) {
            if (selected == j)
                g.setColor(Color.ORANGE);
            else
                g.setColor(Color.BLUE);
            if (Main.WINDOWHEIGHT / arr.size() != 0) {
                g.fillRect(xloc, yloc - j, width, j);
                xloc += width + 1;
            } else {
                g.fillRect(xloc, yloc - j/((arr.size() / Main.WINDOWHEIGHT)+1), width, j);
                if (mannaia %((arr.size()))!=0) {
                    xloc += 1;
                } else {
                    xloc += width + 1;
                }
                mannaia += 1;
            }
        }
        xloc = 0;
    }


    @Override
    public void run() {
        while (true) {
           /* try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            repaint();
        }
    }
}
