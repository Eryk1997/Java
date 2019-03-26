public class Bike implements Vehicle {
    @Override
    public void road(int values)
    {
        System.out.println("Jedziesz rowerem z prędkością: " + values);
    }

    @Override
    public void stop()
    {
        System.out.println("Zatrzymujesz rower");
    }

    public void jamp()
    {
        System.out.println("Skaczesz na rowerze");
    }
}
