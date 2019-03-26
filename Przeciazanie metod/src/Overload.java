public class Overload {
    int add(int a,int b)
    {
        System.out.print("int: ");
        return a+b;
    }
    double add(double a,double b)
    {
        System.out.print("double: ");

        return a+b;
    }

    String add(String a,String b)
    {
        System.out.print("String: ");

        return a+b;
    }


}
