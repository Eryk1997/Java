public class Test {
    public static void main(String[] argv)
    {
        Nurse nurse = new Nurse("Anna","Nowak",2500);
        Doctor doctor = new Doctor("Wojtek","Gęsiak",10000);
        doctor.setBonus(5000);
        nurse.setOvertime(13);

        Nurse nurse1 = new Nurse("Anna","Nowak",2500,16);
        Doctor doctor2 = new Doctor("Wojtek","Gęsiak",10000,2000);

        System.out.println(nurse.getName()+ " " + nurse.getSurname()+ " " + nurse.getSalary()+ " " +nurse.getOvertime());
        System.out.println(doctor.getName()+ " " + doctor.getSurname()+ " " + doctor.getSalary()+ " " + doctor.getBonus());

        System.out.println(nurse1.getName()+ " " + nurse1.getSurname()+ " " + nurse1.getSalary()+ " " +nurse1.getOvertime());
        System.out.println(doctor2.getName()+ " " + doctor2.getSurname()+ " " + doctor2.getSalary()+ " " + doctor2.getBonus());
    }
}
