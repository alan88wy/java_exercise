public class Oblong {

    private double length;
    private double height;

    public Oblong(double length, double height)
    {
        this.length = length;
        this.height = height;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getLength()
    {
        return this.length;
    }

    public double getHeight()
    {
        return this.height;
    }

    public double calculateArea()
    {
        return this.length * this.height;
    }

    public double calculatePerimeter()
    {
        return 2 * (this.length + this.height);
    }
        
}
