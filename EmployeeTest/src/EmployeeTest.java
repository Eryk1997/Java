public class EmployeeTest {
    public static void main(String[] args){
        //Wstawienie trzech obiektów pracowników do tablicy staff
        Employee[] staff = new Employee[3];
        Employee[] xx =new Employee[2];

        staff[0] = new Employee("Robert Janocha",5000,1971,11,1);
        staff[1] = new Employee("Wojtek Gęsiak",7500,1998,2,22);
        staff[2] = new Employee("Anna Nowak",3000,1975,5,15);

        //Zwiększenie pensji o 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        //Wyświetlenie wszystkich informacji
        for (Employee e : staff) {
            System.out.print("Name=" + e.getName() + "  salary=" + e.getSalary() + "   hireDay=" + e.getHireDay());
            System.out.println("   id=" + e.getNextId());
            e.setId();
        }

        //Wywołanie metody statycznej
        int n = Employee.getNextId();
        System.out.println("Następny dostępny identyfikator=" + n);
    }

}