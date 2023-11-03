
public class Triangulo
{
    private double base,altura;

    public Triangulo(double b,double al)
    {
        base=b;
        altura=al;
    }
    public Triangulo(double b)
    {
        this (b, 1.0);
    }
    public Triangulo()
    {
        this (10, 10);
    }
    public void setbase (double b)
    {
        base=b;
    } 
    public double getbase ()
    {
        return base;
    } 
    public void setaltura (double al)
    {
        altura=al;
    }
    public double getaltura ()
    {
        return altura;
    }
    public double area()
    {
        return (base*altura)/2;
    }

}
