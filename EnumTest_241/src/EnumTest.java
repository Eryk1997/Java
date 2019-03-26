import java.util.Scanner;


enum Size
{
    SMALL("S"),MEDIUM("M"),LARGE("L"), EXTRA_LARGE("XL");
    private String abbreviation;
    private Size(String abbreviation) {this.abbreviation=abbreviation;}
    public String getAbbreviation() {return abbreviation;}
}


public class EnumTest {
    public static void main(String argv[])
    {
        Scanner read = new Scanner(System.in);
        for (;;) {
            System.out.println("(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
            System.out.print("Podaj rozmiar:");
            String input = read.next().toUpperCase();
            Size size = Enum.valueOf(Size.class, input);
            System.out.println("Rozmiar=" + size);
            System.out.println("skrót=" + size.getAbbreviation());
            if (size == Size.EXTRA_LARGE)
                System.out.println("Dobra robota -- nie pominąłeś znaku podkreślenia _.");


        }
    }
}
