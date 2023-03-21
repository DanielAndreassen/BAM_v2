import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Class that draws the individual healtbar as well as healthbar background
 * */
public class HealthBar extends JPanel implements MouseListener {
    //att
    final int SIZE = 400;

    int healthbarSize = 300;

    Window myWindow;


    //const
    public HealthBar(Window window) { //general info about the healtbar JPanel
        myWindow = window;
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(SIZE, SIZE));
        this.addMouseListener(this);
    }
    //meth

    @Override
    public void paintComponent(Graphics g) { //draws things inside JPanel
        super.paintComponent(g);
        drawHealthbarBackground(g);
        if(myWindow.isColor()){
            if (myWindow.isFirst()) {
                drawHealthbarGreen(g);
            } else {
                drawHealthbarRed(g);
            }
            myWindow.setFirst();
            myWindow.setColor();
        }else {
            drawHealthbarRed(g);
        }


    }

    /*
            if (myWindow.isFirst()) {
                drawHealthbarGreen(g);
                myWindow.setFirst();
            } else {
                drawHealthbarRed(g);
            }
     */

    /*
    if (myWindow.first = true) {
            drawHealthbarGreen(g);
            myWindow.setFirst();
        }
        if(myWindow.first = false) {
            drawHealthbarRed(g);
            myWindow.first = true;
        }
     */

    public void drawHealthbarGreen(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(50, 150, healthbarSize, 100);
    }


    /*public void drawHealthbar(Graphics g) {
        if (myWindow.isFirst()) {
            g.setColor(Color.green);
        } else {
            g.setColor(Color.red);
        }
        myWindow.setFirst();

        g.fillRect(50, 150, healthbarSize, 100);
    }
    */


    public void drawHealthbarRed(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(50, 150, healthbarSize, 100);
    }



    public void drawHealthbarBackground(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(50, 150, 300, 100);
    }

    //getsett


    @Override
    public void mouseClicked(MouseEvent e) { //When mouse 1 is pressed over a healthcare, the healthcare will shrink a random amount.
        if (e.getButton() == MouseEvent.BUTTON1) {
            double dmg = Math.random();
            int dmgInt = (int) (dmg * 100);
            healthbarSize = healthbarSize -= dmgInt;
            repaint();
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
