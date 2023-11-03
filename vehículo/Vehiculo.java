import java.util.Scanner;
public class Vehiculo
{

    public static void metodoCondicionales(String []args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Método If-Else-If");
        System.out.println("¿Qué clase de vehículo tiene?");
        System.out.println("a) tractomula");
        System.out.println("b) camión");
        System.out.println("c) bus");
        System.out.println("d) automóvil");
        char vehiculo=teclado.next().charAt(0);
        if(vehiculo=='a')
        {
            System.out.println("Debe pagar $25.000 de peaje.");
        }
        else if(vehiculo=='b')
        {
            System.out.println("Debe pagar $20.000 de peaje.");
        }
        else if(vehiculo=='c')
        {
            System.out.println("Debe pagar $16.000 de peaje.");
        }
        else if(vehiculo=='d')
        {
            System.out.println("Debe pagar $10.000 de peaje.");
        }
        else
        {
            System.out.println("No existe ese modelo, verifique bien.");
        }
    }
    
    public static void metodoSwitch(String []args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Método switch");
        System.out.println("¿Qué clase de vehículo tiene?");
        System.out.println("a) tractomula");
        System.out.println("b) camión");
        System.out.println("c) bus");
        System.out.println("d) automóvil");
        char vehiculo=teclado.next().charAt(0);
    switch(vehiculo)
    {
        case 'a':
        {
            System.out.println("Debe pagar $25.000 de peaje.");
            break;
        }
        case 'b':
        {
            System.out.println("Debe pagar $20.000 de peaje.");
            break;
        }
        case 'c':
        {
            System.out.println("Debe pagar $16.000 de peaje.");
            break;
        }
        case 'd':
        {
            System.out.println("Debe pagar $10.000 de peaje.");
            break;
        }
        default:
        {
            System.out.println("No existe ese modelo, verifique bien.");
            break;
        }
    }
    }
}
