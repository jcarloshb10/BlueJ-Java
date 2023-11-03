

public class Calculadora
{
    long n1,n2;
    
    public Calculadora (long n1, long n2){
        this.n1= n1; 
        this.n2= n2; 
    }
    public void SetOperaciones(long num1, long num2)
    {
        n1=num1;
        n2=num2;
    }
    public long GetSuma (long num1, long num2)
    {
        return n1 + n2;
    }
    public long GetResta (long num1, long num2)
    {
        return n1 - n2;
    }
    public long GetProducto (long num1, long num2)
    {
        return n1*n2;
    }
    public long GetDivision (long num1, long num2)
    {
        return n1/n2;
    }
    public long GetModulo (long num1, long num2)
    {
        return n1 % n2;
    }
}
