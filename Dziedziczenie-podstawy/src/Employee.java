public class Employee {
    private String name;
    private String surname;
    private int salary;

    public Employee()
    {
        name="";
        surname="";
        salary=0;
    }

    public Employee(String n,String s,int sa)
    {
        this.name=n;
        this.surname=s;
        this.salary=sa;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setName(String n)
    {
        this.name=n;
    }

    public void setSurname(String s)
    {
        this.surname=s;
    }

    public void setSalary(int s)
    {
        this.salary=s;
    }


}
