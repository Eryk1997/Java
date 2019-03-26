import java.util.ArrayList;

public class EqualsTest {
    public static void main(String argv[])
    {
//        Employee alice1= new Employee("Alicja Adamczuk",7500,1987,12,15);
//        Employee alice2= alice1;
//        Employee alice3= new Employee("Alicja Adamczuk",7500,1987,12,15);
//        Employee bob= new Employee("Bartosz Borowski",75132,1927,13,13);
//
//
//        System.out.println("Alice1 == alice2"+ (alice1==alice2));
//        System.out.println("Alice1 == alice3"+ (alice1==alice3));
//
//        System.out.println("Alice1.equals(alice3)"+ alice1.equals(alice3));
//
//        System.out.println("Alice1.equals(bob)"+ alice1.equals(bob));
//
//        System.out.println("bob.toString"+ bob);

        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("Eryk Janocha",7000,1975,12,2));
        staff.add(new Employee("Alber Nowak",2222,2,14,1));

        for (Employee e:staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println("name="+e.getName()+" salary="+e.getSalary()+" hireDay="+e.getHireDay());
    }
}
