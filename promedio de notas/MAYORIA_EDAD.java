import java.util.Scanner;
public class MAYORIA_EDAD
{ 
    public static void main(String[] args)
    {
            Scanner teclado = new Scanner(System.in); 
            
            double suma=0,promedio=0;  
            int contador=0,edad;
            boolean promediomayor18=false;
            
            while(!promediomayor18)
            {

                System.out.println("DIGITE LA EDAD # "+(contador+1)+":");
                edad = teclado.nextInt();
                
                suma=suma+edad;
                contador++; 
                promedio=suma/(contador);
                System.out.println("EL PROMEDIO ACTUAL DE "+contador+" EDAD(ES) ES: "+promedio);               
                
                if(promedio<18)
                {
                    promediomayor18=true;
                }  
                
            }
                  
            System.out.println("EL PROMEDIO FINAL DE "+contador+" EDAD(ES) ES: "+promedio); 
    }
}