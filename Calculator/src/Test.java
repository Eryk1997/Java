import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] argv)
    {
       EventQueue.invokeLater(new Runnable() {
           @Override
           public void run() {
               new MyFrame();
           }
       });
    }
}

