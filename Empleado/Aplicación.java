import java.util.Scanner;
public class Aplicación
{
    
  private String nombre, apellido, genero; private int salario;
  private Fechas fecha_nac, fecha_ingr;
  
  public Aplicación(String nom, String apelli, String gene,int sal)
  {
        nombre=nom;
        apellido=apelli;
        genero=gene;
        salario=sal;
  }
    
  public Aplicación (String nom, String apelli, String gene)
  {
      this(nom,apelli,gene,80);
  } 
    
  public static void main(String[] args) {
       //Empleado emp=new Empleado(); 
       Scanner sn=new Scanner(System.in);
       
       
        System.out.println("Escribe un nombre: ");
        String nombre=sn.nextLine();
        System.out.println("El nombre escrito ha sido "+nombre);
        //emp.getNom(nombre);
        
        System.out.println("Escribe un apellido: ");
        String apellido=sn.nextLine();
        System.out.println("El apellido escrito ha sido "+apellido);
 
       System.out.println("Ingrese genero:");
       String genero= sn.nextLine();
       System.out.println("El genero escrito ha sido "+genero);
       
        System.out.println("Escribe un numero: ");
        int salario=sn.nextInt();
        System.out.println("El numeo escrito ha sido "+salario);
 
    }
    
}
