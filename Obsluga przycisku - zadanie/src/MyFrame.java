import javax.swing.*;

public class MyFrame extends JFrame {

    public MyFrame()
    {
        super("Test");

        JPanel buttonPanel = new ButtonPanel();
        add(buttonPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
