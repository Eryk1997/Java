import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Random;

public class ButtonPanel extends JPanel implements ActionListener {
    public static final int WIDTH = 500;
    public static final int HEIGHT = 200;
    private JButton buttonColor;
    private JButton buttonMine;
    private JButton buttonClick;

    Random generator = new Random();
    private int chooseColor=0;

    public ButtonPanel()
    {
        buttonColor = new JButton("Random color");
        buttonMine = new JButton("Mine color");
        buttonClick = new JButton("Click");

        buttonClick.addActionListener(this);
        buttonMine.addActionListener(this);
        buttonColor.addActionListener(this);
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(buttonColor);
        add(buttonMine);
        add(buttonClick);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        chooseColor=generator.nextInt(3);

        Object source = e.getSource();

        if(source == buttonColor) {
            switch (chooseColor) {
                case 0:
                    setBackground(Color.GREEN);
                    break;
                case 1:
                    setBackground(Color.BLUE);
                    break;
                case 2:
                    setBackground(Color.RED);
                    break;
                default:
                    System.out.println("Niepoprawne dane");
            }
        }

        if(source == buttonMine)
            setBackground(Color.CYAN);

        if(source == buttonClick) {
            buttonClick.setText("Wciśnięty");
        }
        else {
            buttonClick.setText("Nie wciśnięty");
        }
    }
}
