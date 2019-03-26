import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class MyPanel extends JPanel
{
    public MyPanel()
    {
        setPreferredSize(new Dimension(400,400));
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        //prostokąt
        Rectangle2D rectangle = new Rectangle2D.Double(10,10,380,380);
        //kolo
        Ellipse2D circle = new Ellipse2D.Double(10,10,380,380);




        g2D.draw(rectangle);
        g2D.draw(circle);
    }

}
