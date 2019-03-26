import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

public class MouseTestPanel extends JPanel implements MouseListener,MouseMotionListener {

    private static final int DEFAULT_WIDTH = 800;
    private static final int DEFAULT_HEIGHT = 800;

    private int x,y;
    private Random random = new Random();
    int index=0;

    Point movingPoint;

    ArrayList<Point> points = new ArrayList<Point>();

    public MouseTestPanel()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
        setPreferredSize(new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT));
    }

//    @Override
//    public void mouseDragged(MouseEvent arg0)
//    {
//       // System.out.println("mouseDragged");
//    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
        //System.out.println("mouseMoved");
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
     //   System.out.println("mouseClicked");
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
       // System.out.println("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        //System.out.println("mouseExited");
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
    //    System.out.println("mousePressed");

        x = e.getX();
        y = e.getY();

        int x2,y2;

        if(e.getButton() == MouseEvent.BUTTON3)
        {
            Point toRemove = null;
            for (Point p:points)
            {
                x2=(int) p.getX();
                y2=(int) p.getY();
                if(x >= x2 && y >= y2 && x<=x2+10 && y<=y2+10)
                    toRemove = p;
            }
            points.remove(toRemove);
        }else if(e.getButton() != MouseEvent.BUTTON3)
        {
            int index =0;
            int size = points.size();
            Point p;
            while (movingPoint == null && index < size)
            {
                p = points.get(index);
                x2 = (int) p.getX();
                y2 = (int) p.getY();
                if(x >= x2 && y >= y2 && x<=x2+10 && y<=y2+10)
                    movingPoint = p;
                index++;
            }
        }

        if(movingPoint==null && e.getButton()==MouseEvent.BUTTON1)
        {
            x = e.getX();
            y = e.getY();
            points.add(new Point(x,y));
        }

      //  points.add(new Point(x,y));
        repaint();

    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
      //  System.out.println("mouseReleased");
        movingPoint = null;
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        if(movingPoint!=null)
        {
            movingPoint.x = e.getX();
            movingPoint.y = e.getY();
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2D= (Graphics2D) g;

        //g2D.setColor(Color.WHITE);
        g2D.fillRect(0,0,DEFAULT_WIDTH,DEFAULT_HEIGHT);
        //g2D.setColor(Color.BLACK);
        draw(g2D);
        drawRectangles(g2D);
    }


    private void drawRectangles(Graphics2D g2d)
    {
        int x;
        int y;
        for (Point p:points){
            x=(int) p.getX();
            y=(int) p.getY();
            g2d.fillRect(x,y,10,10);
        }
    }

    private void draw(Graphics2D g2D)
    {
        int value = random.nextInt(5);

        switch (value)
        {
            case 0:
                g2D.setColor(Color.WHITE);
                break;
            case 1:
                g2D.setColor(Color.CYAN);
                break;
            case 2:
                g2D.setColor(Color.BLUE);
                break;
            case 3:
                g2D.setColor(Color.RED);
                break;
            case 4:
                g2D.setColor(Color.GREEN);
                break;

        }

    }

}
