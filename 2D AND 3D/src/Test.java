import org.omg.PortableServer.POA;

public class Test {
    public static void main(String[] argv)
    {
        Point2D point2D = new Point2D(5,2);
        Point3D point3D = new Point3D(2,1,3);

        System.out.println(point2D.getX()+","+point2D.getY());
        System.out.println(point3D.getX()+","+point3D.getY()+","+point3D.getZ());


    }
}
