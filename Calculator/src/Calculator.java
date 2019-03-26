import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class Calculator extends JPanel implements ActionListener {

    public static final int HEIGHT = 50;
    public static final int WIDTH = 10;
    public static final int JUMP_HEIGHT = 50;
    public static final int JUMP_WIDTH = 80;
    public static final int SIZE_HEIGHT_BUTTON = 40;
    public static final int SIZE_WIDTH_BUTTON = 70;
    private double result=0;

    private JButton buttonAddition;
    private JButton buttonSubstraction;
    private JButton buttonMultiplication;
    private JButton buttonDivision;
    private JButton buttonValue0;
    private JButton buttonValue1;
    private JButton buttonValue2;
    private JButton buttonValue3;
    private JButton buttonValue4;
    private JButton buttonValue5;
    private JButton buttonValue6;
    private JButton buttonValue7;
    private JButton buttonValue8;
    private JButton buttonValue9;
    private JButton buttonComma;
    private JButton buttonResult;
    private JTextField textCalculator;

    private String text="";
    private String[] text1=null;
    private int operator=-1;


    public Calculator()
    {
        setLayout(null);

        textCalculator = new JTextField("");
        buttonAddition = new JButton("+");
        buttonSubstraction = new JButton("-");
        buttonMultiplication = new JButton("*");
        buttonDivision = new JButton("/");
        buttonComma = new JButton(",");
        buttonResult = new JButton("=");

        buttonValue0 = new JButton("0");
        buttonValue1 = new JButton("1");
        buttonValue2 = new JButton("2");
        buttonValue3 = new JButton("3");
        buttonValue4 = new JButton("4");
        buttonValue5 = new JButton("5");
        buttonValue6 = new JButton("6");
        buttonValue7 = new JButton("7");
        buttonValue8 = new JButton("8");
        buttonValue9 = new JButton("9");





        //pozycjonowanie
        textCalculator.setBounds(10,10,310,30);
        buttonAddition.setBounds(WIDTH,HEIGHT,SIZE_WIDTH_BUTTON,SIZE_HEIGHT_BUTTON);
        buttonSubstraction.setBounds(WIDTH,HEIGHT+JUMP_HEIGHT,SIZE_WIDTH_BUTTON,SIZE_HEIGHT_BUTTON);
        buttonMultiplication.setBounds(WIDTH,HEIGHT+2*JUMP_HEIGHT,SIZE_WIDTH_BUTTON,SIZE_HEIGHT_BUTTON);
        buttonDivision.setBounds(WIDTH ,HEIGHT+3*JUMP_HEIGHT,SIZE_WIDTH_BUTTON,SIZE_HEIGHT_BUTTON);
        buttonValue7.setBounds(WIDTH+JUMP_WIDTH,HEIGHT,SIZE_WIDTH_BUTTON,SIZE_HEIGHT_BUTTON);
        buttonValue8.setBounds(WIDTH+JUMP_WIDTH*2,HEIGHT,SIZE_WIDTH_BUTTON,SIZE_HEIGHT_BUTTON);
        buttonValue9.setBounds(WIDTH+JUMP_WIDTH*3,HEIGHT,SIZE_WIDTH_BUTTON,SIZE_HEIGHT_BUTTON);
        buttonValue4.setBounds(WIDTH+JUMP_WIDTH,HEIGHT+JUMP_HEIGHT,SIZE_WIDTH_BUTTON,SIZE_HEIGHT_BUTTON);
        buttonValue5.setBounds(WIDTH+JUMP_WIDTH*2,HEIGHT+JUMP_HEIGHT,SIZE_WIDTH_BUTTON,SIZE_HEIGHT_BUTTON);
        buttonValue6.setBounds(WIDTH+JUMP_WIDTH*3,HEIGHT+JUMP_HEIGHT,SIZE_WIDTH_BUTTON,SIZE_HEIGHT_BUTTON);
        buttonValue1.setBounds(WIDTH+JUMP_WIDTH,HEIGHT+JUMP_HEIGHT*2,SIZE_WIDTH_BUTTON,SIZE_HEIGHT_BUTTON);
        buttonValue2.setBounds(WIDTH+JUMP_WIDTH*2,HEIGHT+JUMP_HEIGHT*2,SIZE_WIDTH_BUTTON,SIZE_HEIGHT_BUTTON);
        buttonValue3.setBounds(WIDTH+JUMP_WIDTH*3,HEIGHT+JUMP_HEIGHT*2,SIZE_WIDTH_BUTTON,SIZE_HEIGHT_BUTTON);
        buttonValue0.setBounds(WIDTH+JUMP_WIDTH,HEIGHT+JUMP_HEIGHT*3,SIZE_WIDTH_BUTTON,SIZE_HEIGHT_BUTTON);
        buttonComma.setBounds(WIDTH+JUMP_WIDTH*2,HEIGHT+JUMP_HEIGHT*3,SIZE_WIDTH_BUTTON,SIZE_HEIGHT_BUTTON);
        buttonResult.setBounds(WIDTH+JUMP_WIDTH*3,HEIGHT+JUMP_HEIGHT*3,SIZE_WIDTH_BUTTON,SIZE_HEIGHT_BUTTON);

        add(textCalculator);
        add(buttonAddition);
        add(buttonSubstraction);
        add(buttonMultiplication);
        add(buttonDivision);
        add(buttonComma);
        add(buttonResult);
        add(buttonValue0);
        add(buttonValue1);
        add(buttonValue2);
        add(buttonValue3);
        add(buttonValue4);
        add(buttonValue5);
        add(buttonValue6);
        add(buttonValue7);
        add(buttonValue8);
        add(buttonValue9);

        buttonResult.addActionListener(this);
        buttonValue0.addActionListener(this);
        buttonValue1.addActionListener(this);
        buttonValue2.addActionListener(this);
        buttonValue3.addActionListener(this);
        buttonValue4.addActionListener(this);
        buttonValue5.addActionListener(this);
        buttonValue6.addActionListener(this);
        buttonValue7.addActionListener(this);
        buttonValue8.addActionListener(this);
        buttonValue9.addActionListener(this);
        buttonAddition.addActionListener(this);
        buttonSubstraction.addActionListener(this);
        buttonMultiplication.addActionListener(this);
        buttonDivision.addActionListener(this);
        buttonComma.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {


        Object source = e.getSource();

        if (source == buttonValue0)
        {
        textCalculator.setText("0");
        }

        else if(source== buttonValue1)
        {
            textCalculator.setText("1");
        }

        else if (source == buttonValue2)
        {
            textCalculator.setText("2");
        }

        else if (source == buttonValue3)
        {
            textCalculator.setText("3");
        }

        else if (source == buttonValue4)
        {
            textCalculator.setText("4");
        }

        else if (source == buttonValue5)
        {
            textCalculator.setText("5");
        }

        else if (source == buttonValue6)
        {
            textCalculator.setText("6");
        }

        else if (source == buttonValue7)
        {
            textCalculator.setText("7");
        }

        else if (source == buttonValue8)
        {
            textCalculator.setText("8");
        }

        else if (source == buttonValue9)
        {
            textCalculator.setText("9");
        }

        else if(source == buttonComma)
        {
            textCalculator.setText(".");
        }

        else if (source == buttonAddition)
        {
            textCalculator.setText("+");
            operator=1;
        }

        else if (source == buttonSubstraction)
        {
            textCalculator.setText("-");
            operator=2;
        }

        else if (source == buttonMultiplication)
        {
            textCalculator.setText("*");
            operator=3;
        }

        else if (source == buttonDivision)
        {
            textCalculator.setText("/");
            operator=4;
        }

          else if (source == buttonResult)
        {
            text1=text.split("([-+*/])");
            textCalculator.setText(text1[0]);
            result = Double.parseDouble(text1[0]);
            for (int i=1;i<text1.length;i++) {
            switch (operator)
            {
                    case 1:
                        result += Double.parseDouble(text1[i]);
                        break;
                    case 2:
                        result -= Double.parseDouble(text1[i]);
                        break;
                    case 3:
                        result *= Double.parseDouble(text1[i]);
                        break;
                    case 4:
                        result /= Double.parseDouble(text1[i]);
                        break;
                }
            }
            textCalculator.setText(String.valueOf(result));
            text="";
        }

            text += textCalculator.getText();
            textCalculator.setText(text);

    }

}
