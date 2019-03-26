import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame()
    {

        JPanel buttonPanel = new Calculator();
        add(buttonPanel);

        setPreferredSize(new Dimension(340,300));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
