import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.*;

public class MyPanel extends JPanel {
    private BufferedImage image;
    private BufferedImage image2;
    private int imageHeight;
    private int imageWidth;

    public MyPanel()
    {
        super();
        File imageFile = new File("gtr.jpg");
        try{
            image = ImageIO.read(imageFile);
            URL imageUrl = new URL("https://files.tinypic.pl/i/00976/rtiy0mmscqq8.jpg");
            image2 = ImageIO.read(imageUrl);
        }
        catch (IOException e)
        {
            System.out.println("Bład odczytu obrazka z dysku");
            e.printStackTrace();
        }

        imageWidth = image.getWidth()*2;
        imageHeight = image.getHeight();

        Dimension dimension = new Dimension(imageWidth,imageHeight);
        setPreferredSize(dimension);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(image,0,0,this);
        g2D.drawImage(image2,image.getWidth(),0,null);
    }
}
