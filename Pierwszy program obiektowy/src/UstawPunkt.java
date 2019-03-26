public class UstawPunkt {
    public static void main(String[] argv)
    {
        Punkt punkt = new Punkt();
        punkt.setX(10);
        punkt.setY(20);
        System.out.println("Współrzędne punktu to "+punkt.getX()+","+punkt.getY());
    }
}
