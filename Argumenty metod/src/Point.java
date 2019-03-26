public class Point {
    private int x;
    private int y;

    Point(int _x,int _y)
    {
        this.x=_x;
        this.y=_y;
    }

    public void upX(Point p)
    {
        p.x++;
    }
    public void upY(Point p)
    {
        p.y++;
    }
    public void setX(int value)
    {
        this.x-=value;
    }
    public void setY(int value)
    {
        this.y-=value;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void show(Point point)
    {

            System.out.println(point.getX() + " " + point.getY());
    }

}
