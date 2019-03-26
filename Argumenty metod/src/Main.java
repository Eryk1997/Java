public class Main {
    public static void main(String[] argv)
    {
//        Point point = new Point();
//        point.x=5;
//        point.y=5;
//
//        Test.replace(point);
//        System.out.println("współrzedne to:"+point.x+","+point.y);
        Point point = new Point(5,10);
        point.upX(point);
        point.setX(5);
        point.setY(10);
        System.out.println(point.getX()+" "+point.getY());
        point.show(point);
    }
}
