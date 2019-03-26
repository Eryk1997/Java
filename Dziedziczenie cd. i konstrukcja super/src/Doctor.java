public class Doctor extends Employee {
    private double bonus;

    public Doctor(String name,String surname,double salary)
    {
        super(name,surname,salary);
        bonus=0;
    }
    public Doctor(String name,String surname,double salary,double bonus)
    {
        super(name,surname,salary);
        this.bonus=bonus;
    }

    public void setBonus(double bonus) {this.bonus=bonus; }
    public double getBonus() {return bonus;}

}
