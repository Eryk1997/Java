public class Test {
    public static void main(String[] argv)
    {
        Car car = new Car();
        Bike bike = new Bike();

        car.road(20);
        car.stop();
        car.drift();

        bike.road(40);
        bike.stop();
        bike.jamp();

        Car[] cars = new Car[10];
        for (int i=0;i<10;i++)
        {
            cars[i]=new Car();
            cars[i].road(i*10);

        }
    }
}
