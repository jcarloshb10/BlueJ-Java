import java.util.Scanner;

public class Vocales
{
    public static void main (String [] args){
        Scanner tel = new Scanner(System.in); 
        System.out.println("ES O NO UNA VOCAL ") ;
        System.out.println("Por favor ingrese una letra: ") ;
        
        char letra = tel.next().charAt(0);
        
        switch (letra){
            case 'a':
            System.out.println("La letra ingresada si es una vocal") ;
            break;
            case 'e':
            System.out.println("La letra ingresada si es una vocal") ;
            break;
            case 'i':
            System.out.println("La letra ingresada si es una vocal") ;
            break;
            case 'o':
            System.out.println("La letra ingresada si es una vocal");
            break;
            case 'u':
            System.out.println("La letra ingresada si es una vocal");
            break;
            default: 
            System.out.println("La letra ingresada no es una vocal");
        }
    }
}
