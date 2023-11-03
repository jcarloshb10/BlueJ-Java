import java.util.Scanner;
public class FUNCION
{
    public static void main(String[] args)
    {
            Scanner teclado = new Scanner(System.in); 
            
            int contador=0;
            double dato=0,funcion,resultado;  
                            
            do{            
                
                System.out.println("DIGITE EL DATO # "+(contador+1)+":");
                dato = teclado.nextDouble();
                if(dato<=0)
                {
                    System.out.println("ERROR MATEMATICOO, INGRESE UN VALOR POSITIVO");
                }
                
            }while(dato<=0);
                    
            resultado=Math.log10(dato)*dato;
            System.out.println("EL RESULTADO DE LA FUNCION ES: "+resultado); 
    }
    
}
