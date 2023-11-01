
import java.util.Scanner;
public class Mayor_de_3
{
    public static void main(String[] args)
    {
       Scanner teclado= new Scanner(System.in);
       int n1,n2,n3; 
       System.out.println("Digite el primer numero:");
       n1 = teclado.nextInt();  
       System.out.println("Digite el segundo numero:");
       n2 = teclado.nextInt();
       System.out.println("Digite el segundo numero:");
       n3 = teclado.nextInt();
       
       if(n1>=n2 && n1>=n3)
       {
           System.out.println("El primer numero es el mayor");
       }
       else 
       {
           if(n2>n3)
           {
               System.out.println("El segundo numero es el mayor"); 
           }
           else
           {
               System.out.println("El tercer numero es el mayor"); 
           }
                 
           }
       }
  }

