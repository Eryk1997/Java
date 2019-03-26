public class Firm {
    public static void main(String[] argv)
    {
        Constructor[] constructor = new Constructor[3];
        String[] name = {"Eryk","Wojtek","Krystian"};
        String[] surname = {"Janocha","Gesiak","Mielec"};
        int[] age ={21,21,20};

        for (int i=0;i<3;i++)
            constructor[i] = new Constructor(name[i],surname[i],age[i]);
        for (Constructor c : constructor)
            System.out.println(c.getName()+" "+c.getSurname()+" "+c.getAge());

    }
}
