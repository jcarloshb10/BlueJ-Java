
public class Circulo
{
    private double radio,area;

    public void setradio (double r )
    {
        radio=r;
    }
    public double getradio ()
    {
        return radio;
    } 
    public double getarea()
    {
        area=radio*3.14159;
        return area;
    }
}
