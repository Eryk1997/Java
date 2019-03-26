public class Firm {
    public static void main(String[] argv)
    {
        Employee employee = new Employee("Wlodek","Zięba",3000);
        System.out.println("Imie: "+employee.getName());
        System.out.println("Nazwisko: "+employee.getSurname());
        System.out.println("Wypłata: "+employee.getSalary());

        Boss[] boss = new Boss[1];

        boss[0]=new Boss();
        System.out.println("Imie: " + boss[0].getName());
        System.out.println("Nazwisko: " + boss[0].getSurname());
        System.out.println("Wypłata: " + boss[0].getSalary());
        System.out.println("Premia: " + boss[0].getBonus());

        boss[0].setName("Tadeusz");
        boss[0].setSurname("Kowalski");
        boss[0].setSalary(10000);
        boss[0].setBonus(2000);
        for (Boss b : boss)
            System.out.println(b.getName() + " " + b.getSurname() + " " + b.getSalary() + " " + b.getBonus());
    }
}
