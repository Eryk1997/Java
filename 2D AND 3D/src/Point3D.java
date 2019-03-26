public class Point3D extends Point2D {
    private double z;

    public void setZ(double _z)
    {
        this.z=_z;
    }

    public double getZ()
    {
        return z;
    }

    Point3D()
    {
        z=0;
    }
    Point3D(double _z)
    {
        z=_z;
    }

    Point3D(double _x,double _y,double _z)
    {
        z=_z;
        setX(_x);
        setY(_y);
    }


}
