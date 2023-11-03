import java.util.Scanner;
public class Aplicacion
{
     
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        long nu1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero:");
        long nu2 = teclado.nextInt();
        System.out.println("Ingrese la operacion a realizarse:");
        char operacion = teclado.next().charAt(0);
        Calculadora operar = new Calculadora(nu1,nu2);
        
        switch(operacion)
        {
            case '+':
            {
                System.out.println("El resultado es: "+ operar.GetSuma(nu1,nu2));
                break;
            }
            case '-':
            {
                System.out.println("El resultado es: "+ operar.GetResta(nu1,nu2));
                break;
            }
            case '*':
            {
                System.out.println("El resultado es: "+ operar.GetProducto(nu1,nu2));
                break;
            }
            case '/':
            {
                System.out.println("El resultado es: "+ operar.GetDivision(nu1,nu2));
                break;
            }
            case '%':
            {
                System.out.println("El resultado es: "+ operar.GetModulo(nu1,nu2));
                break;
            } 
            default:
            {
                System.out.println("No corresponde a ninguna operacion. ");
                break;
            }
        }
    }

}
