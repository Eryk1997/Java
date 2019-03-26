import java.awt.*;
import java.net.MalformedURLException;

public class Test {
    public static void main(String[] argv) throws Exception
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame();
            }
        });
    }
}
