
public class trapecio
{

    private double base_mayor,base_menor,altura,area;

    public void setB (double B)
    {
        base_mayor=B;
    } 
    public double getB ()
    {
        return base_mayor;
    } 
    public void setb (double b)
    {
        base_menor=b;
    }
    
    public double getb ()
    {
        return base_menor;
    }
    public void setal (double al)
    {
       altura=al;
    }
    
    public double getal ()
    {
        return altura;
    }
    public double getarea()
    {
        area=((base_mayor+base_menor)/2)*altura;
        return area;
    }
}
