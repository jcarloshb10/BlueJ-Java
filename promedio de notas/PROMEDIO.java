import java.util.Scanner;
public class PROMEDIO
{ 
    public static void main(String[] args)
    {
            Scanner teclado = new Scanner(System.in); 
            
            float nota,suma=0,promedio=0;  
            int contador=0;
            
            System.out.println("DIGITE LA NOTA # "+(contador+1)+":");
            nota = teclado.nextFloat();
            
            while(nota!=-1)
            {
                suma=suma+nota;
                contador++;
                    
                System.out.println("DIGITE LA NOTA # "+(contador+1)+":");
                nota = teclado.nextFloat();
            }
            
            System.out.println("EL PROMEDIO ES:");
            promedio=suma/(contador);
            System.out.println(promedio);
            
    }
}
