public class Car implements Vehicle {
    @Override
    public void road(int values)
    {
        System.out.println("Jedziesz z predkością: " + values);
    }

    @Override
    public void stop()
    {
        System.out.println("Zatrzymuje samochód");
    }

    public void drift()
    {
        System.out.println("Lecę bokiem");
    }


}
