import java.util.ArrayList;

public class Array {
    public static void main(String argv[])
    {
        ArrayList<String> staff = new ArrayList<>();
        staff.add("Erykk");
        staff.ensureCapacity(100);
        System.out.println(staff.size());
        staff.trimToSize();   //zmienia rozmiar kontenera do takiego ile jest obiektów

        System.out.println(staff.get(0));
        staff.add("Wojtek");
        staff.set(1,"Eryk");
        System.out.println(staff.get(1));
//        ArrayList<E>(int 100);  //tworzy tablice o rozmiarze 100

        ArrayList<String> list = new ArrayList<String>();
       for(int i=0;i<10;i++)
       {
           list.add("x");
       }
       System.out.println("Rozmiar listy tablicy: " + list.size());
       String[] a = new String[list.size()];
       list.toArray(a);
//       int n = list.size()/2;
//       list.add(n,"mm");
//       for (String value:list)
//           System.out.println(value);
//        System.out.println();
//
//        list.set(list.size()/2,"Eryk");
//       for (String er:list)
//           System.out.println(er);
//
//       list.remove(list.size()/2);
//        for (String value:list)
//            System.out.println(value);
//        System.out.println();

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        System.out.println(integers.get(0));


    }
}
