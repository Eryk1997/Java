public class Firma {
    public static void main(String[] argv)
    {
        Employee[] employee = new Employee[3];
        //Employee employee2 = new Employee();
        //Employee employee3 = new Employee();

        String[] name = {"Eryk","Krystian","Adam"};
        String[] surname = {"Janocha","Mielec","Macura"};
        int[] age = {21,21,20};

        for(int i=0;i<3;i++)
        {
            employee[i] = new Employee();
            employee[i].setName(name[i]);
            employee[i].setSurname(surname[i]);
            employee[i].setAge(age[i]);
        }
        for(Employee e : employee)
            System.out.println(e.getName()+ " " + e.getSurname() + " " + e.getAge());

        //System.out.println(employee1.getName()+" "+employee1.getSurname()+" "+employee1.getAge());
        //System.out.println(employee2.getName()+" "+employee2.getSurname()+" "+employee2.getAge());

    }
}
