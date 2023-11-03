
import java.util.Scanner;
public class CLASEA
{
    
    public String nombre;
    
    public void autenticar()
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Escribe un nombre: ");
        String nombre=sn.nextLine();
           
        /*CLASEA cd = new CLASEA();
            cd.autenticar();
           System.out.println("USUARIO = " + cd.getNombre()); */
    }

    public void getNombre(String nombre)
    {
     //return nombre;
     System.out.println(nombre);
    }
}
