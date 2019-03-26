public class Constructor {
    private String name;
    private String surname;
    private int age;

    Constructor(String n)
    {
        this.name=n;
        this.surname="Brak";
        this.age=0;
    }
    Constructor(String n,String s)
    {
        this.name=n;
        this.surname=s;
        this.age=0;
    }
    Constructor(String n,String s,int a)
    {
        this.name=n;
        this.surname=s;
        this.age=a;
    }

    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public int getAge()
    {
        return age;
    }

}
