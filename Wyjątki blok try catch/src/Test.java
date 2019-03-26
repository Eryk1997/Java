import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//
//public class Test {
//
//    public int sum(int arg0,int... args)
//    {
//        int wynik=arg0;
//
//        for (int i=0;i<args.length;i++)
//            wynik+=args[i];
//
//        return wynik;
//    }


    public static void main(String[] argv) throws ArithmeticException
    {
//        int[] tab={1,2,3,4,5};
//        //Scanner read = new Scanner(System.in);
//        int index = -1;
//
////        System.out.println("Podaj indeks tablicy, który chcesz zobaczyć: ");
////        index=read.nextInt();
////
////
////        try {
////            System.out.println(tab[index]);
////        }
////        catch (ArrayIndexOutOfBoundsException e)
////        {
////            System.out.println("Niepoprawny parametr, rozmiar tablicy to: " + tab.length);
////        }
//
//        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("Który element tablicy chcesz zobaczyć: ");
//        boolean itIsTrue=false;
//
//        while (!itIsTrue)
//        {
//            try {
//                index=Integer.parseInt(read.readLine());
//            }
//            catch (NumberFormatException n)
//            {
//                System.out.println("Niepoprawne dane:"+ "\nKtóry element tablicy chcesz zobaczyć: ");
//            }
//            catch (IOException e)
//            {
//                System.out.println("Błąd odczytu danych");
//            }
//            itIsTrue=index==-1?false:true;
//        }
//        try {
//            System.out.println(tab[index-1]);
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("Niepoprwny parametr, rozmiar tablicy to: "+tab.length);
//        }


        int x=10;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj dzielnik:");
        y=sc.nextInt();
        if(y==0)
            throw new ArithmeticException("Nie można dzielić przez 0");
            else
                System.out.println(x/(double)y);

            //System.out.println("sum(3,3)" + sum(3,3));

    }
}
