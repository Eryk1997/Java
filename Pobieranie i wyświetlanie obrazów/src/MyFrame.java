import javax.swing.*;

public class MyFrame  extends JFrame {
    public MyFrame()
    {
        super("Program obrazków");
        JPanel obrazPanel = new MyPanel();
        add(obrazPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
