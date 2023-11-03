
public class Rectangulo
{
    private double lado1,lado2;

    public Rectangulo(double l1,double l2){
        lado1=l1;
        lado2=l2;
    }
    public Rectangulo(double l1)
    {
        this (l1, 1.0);
    }
    public Rectangulo()
    {
        this (10, 10);
    }
    public void setl1 (double l1)
    {
        lado1=l1;
    } 
    public double getl1 ()
    {
        return lado1;
    } 
    public void setl2 (double l2)
    {
        lado2=l2;
    }
    public double getl2 ()
    {
        return lado2;
    }
    public double area()
    {
        return lado1*lado2;
    }
}

