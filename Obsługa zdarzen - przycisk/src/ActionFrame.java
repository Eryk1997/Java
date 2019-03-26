import javax.swing.*;

public class ActionFrame extends JFrame {
    public ActionFrame()
    {
        JPanel buttonPanel = new ButtonPanel();
        add(buttonPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
