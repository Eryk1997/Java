import java.time.LocalDate;

public class Employee {
    private static int nextId=1;

    private String name;
    private double salary;
    private LocalDate hireDay;
    private int id;

    public Employee(String n,double s,int year,int month,int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
        id = 0;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public int getId() {return id;}

    public void setId()
    {
        id = nextId;
        nextId++;
    }

    public static int getNextId(){return nextId;}

    public static void main(String[] args)  //test jednostkowy
    {
        Employee test = new Employee("Test",5000,2018,11,16);
        System.out.println(test.getName() + " " + test.getSalary());
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent/100;
        salary += raise;
    }

}
