
public class triángulo
{
    private double base,altura,area;

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
    public double getarea()
    {
        area=(base*altura)/2;
        return area;
    }

}
