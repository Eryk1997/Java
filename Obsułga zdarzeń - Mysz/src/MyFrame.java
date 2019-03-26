import javax.swing.*;

public class MyFrame extends JFrame {

    MyFrame()
    {
        super("Mouse Test");

        add(new MouseTestPanel());
        setBounds(0,0,800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
