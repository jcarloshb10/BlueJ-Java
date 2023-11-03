
public class rectángulo
{
    private double lado1,lado2,area;

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
    public double getarea()
    {
        area=lado1*lado2;
        return area;
    }
}

