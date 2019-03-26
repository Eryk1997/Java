import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(){
    super("Hello World");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(true);                               //zablokowanie zmiany rozmiaru okna
    setLocation(2000,200);                        //lokalizacja
    setSize(500,400);                            //rozmiar okna

    setLayout(new FlowLayout(FlowLayout.CENTER));

    ImageIcon icon = new ImageIcon("/home/eryk/Pobrane/gtr.jpg");   //utworzenie obiektu icon oraz przypisanie adresu

    add(new JButton(icon));
    add(new JButton("Przycisk 1"));
    add(new JButton("Przycisk 2"));
    add(new JButton("Przycisk 3"));

//    setLayout(new GridLayout(2,5));    // ustawia przyciski w 2 wierszach max 5 kolumn
//    for (int i=1;i<=10;i++)
//        add(new JButton(""+i));
    //pack();                         //automatyczne dopasowanie do przycisków
    setVisible(true);                                  //ukrycie w przypadku false
    }
}
