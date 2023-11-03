import java.util.Scanner;
public class persona
{
    
   // private long telefono;
    private String[] nombre;
    //private char nombre;
    /*public static void main()
    {
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Ingrese la cadena:");
       String nombre = sc.nextLine();
        
        //System.out.println("Ingrese el telefono:");
        //long telefono = tel;
        //System.out.println(nombre);
        
    }*/
    public persona()
    {
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Ingrese la cadena:");
       String nombre = sc.nextLine();
       
       // telefono=tel;
        //direccion=dir;
        //nombre=nom;
    }
    /*
    public persona(long tel,char dir)
    {
        this(tel, dir, Carlos);
    }*/    
   /* public void setNom()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cadena:");
       String nombre = sc.nextLine();
      //nombre=nom;
    }
    */
    public char getNom(String[] nombre)
    {
       System.out.println(nombre);
    }
    /*
    public void setTeléfono()
    {
      telefono=tel;
    }
    public long getTeléfono()
    {
      return telefono;
    }
    public void setDirección()
    {
      direccion=dir;
    }
    public char getDirección()
    {
      return direccion;
    } 
    public char info(String[] args)
    {
      return nombre;
    }*/ 
    
}
