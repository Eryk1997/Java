public class ManagerTest {
    public static void main(String[] args)
    {
        //Tworzenie obiektu klasy Manager
        Manager boss = new Manager("Karol Mały",2000,1999,03,16);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        //Wstawienie obiektów klas Manager i Employee do tablicy staff

        staff[0] = boss;
        staff[1] = new Employee("Zygmunt Duży",2500,1999,7,4);
        staff[2] = new Employee("Edyta Nowak",3700,1990,6,5);

        //Wyświetlenie informacji o wszystkich obiektach klasy Employee
        for (Employee e : staff)
            System.out.println("Name=" + e.getName() + "   salary=" + e.getSalary());
    }
}
