import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    //att
    public boolean first = true;
    public boolean color = true;
    //const
    public Window() {
        this.setTitle("BAM v2");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel multiPanel = new JPanel();

        GridLayout layout = new GridLayout(1, 2);

        multiPanel.setLayout(layout);
        multiPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,10));



        multiPanel.add(new HealthBar(this));
        multiPanel.add(new HealthBar(this));

        this.add(multiPanel);
        this.pack();
        this.setVisible(true);


    }
    //meth
    //getsett

    public boolean isFirst(){
        return first;
    }

    public void setFirst(){
        this.first = !this.first;
    }

    public boolean isColor(){
        return color;
    }

    public void setColor(){
        this.color = !this.color;
    }
}
