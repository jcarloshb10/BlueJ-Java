import java.util.Scanner;
public class CADENA
{
      
    public static void main(String []args)
    {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("INGRESE UNA CADENA:");
        cadena = teclado.nextLine();
        
        System.out.println(cadena.length());
        
        
    }

}
