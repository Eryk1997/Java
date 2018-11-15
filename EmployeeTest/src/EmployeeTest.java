import java.time.*;

public class EmployeeTest {
    public static void main(String[] args){
        //Wstawienie trzech obiektów pracowników do tablicy staff
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Robert Janocha",5000,1971,11,1);
        staff[1] = new Employee("Wojtek Gęsiak",7500,1998,2,22);
        staff[2] = new Employee("Anna Nowak",3000,1975,5,15);

        //Zwiększenie pensji o 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        //Wyświetlenie wszystkich informacji
        for (Employee e : staff)
            System.out.println("Name="+e.getName()+"  salary="+e.getSalary()+"   hireDay="+e.getHireDay());

    }

}

class Employee
{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n,double s,int year,int month,int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
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

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent/100;
        salary += raise;
    }

}
