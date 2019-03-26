public class Main {
    public static void main(String[] argv)
    {
        String text1="ERyk";
        String text2="Janocha";
        int z=1;
        int x=2;
        double c=3.2;
        double v=4.1;
        Overload overload = new Overload();
        System.out.println(overload.add(z,x));
        System.out.println(overload.add(c,v));
        System.out.println(overload.add(text1,text2));

    }
}
