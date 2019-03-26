public class Point2D {
    private double x;
    private double y;

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double _x)
    {
        this.x=_x;
    }

    public void setY(double _y)
    {
        this.y=_y;
    }

    Point2D()
    {
        x=0;
        y=0;
    }

    Point2D(double _x,double _y)
    {
        this.x=_x;
        this.y=_y;
    }

}
