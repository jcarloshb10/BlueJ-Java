
import java.util.Scanner;
public class mayor
{
      public static void main(String[] args)
    {
       Scanner teclado= new Scanner(System.in);
       int n1,n2; 
       System.out.println("Digite el primer numero:");
       n1 = teclado.nextInt();  
       System.out.println("Digite el segundo numero:");
       n2 = teclado.nextInt();
       
       if(n1>n2)
       {
        System.out.println("El primer numero ("+n1+") es mayor que el segundo numero ("+n2+").");
       }
       else if(n2>n1)
       {
       System.out.println("El segundo numero ("+n2+") es mayor que el primer numero ("+n1+")."); 
       }
  }
}
