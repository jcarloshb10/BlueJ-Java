import java.util.Scanner;
public class divisible
{  
    public static void main(String[] args)
    {
       Scanner teclado= new Scanner(System.in);
       int n1,n2; 
       System.out.println("Digite el primer numero:");
       n1 = teclado.nextInt();  
       System.out.println("Digite el segundo numero:");
       n2 = teclado.nextInt();
       
       if(n1%n2==0)
       {
        System.out.println("El primer numero ("+n1+") si es divisible entre el segundo numero ("+n2+").");
       }
       else
       {
       System.out.println("El primer numero ("+n2+") no es divisible entre el segundo numero ("+n2+")."); 
       }
       
        
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
 
    }
    
}
