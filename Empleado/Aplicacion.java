import java.util.*;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Aplicacion{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in); // Creamos scanner
        
        //Pedimos los datos al empleado
        System.out.println("Digite su nombre: ") ;
        String nombre = input.nextLine();
        
        System.out.println("Digite su apellido: ");
        String apellido = input.nextLine();
        
        System.out.println("Digite su salario: ");
        double salario = input.nextDouble();
        
        System.out.println("Digite su genero (M:masculino - F:femenino): ") ;
        char genero = input.next().charAt(0);
        System.out.println('\n');
        
        //Fecha Nacimiento
        System.out.println("Porfavor acontinuacion ingrese su FECHA DE NACIMIENTO.");
        System.out.println("Dia: ");
        int dia_nac = input.nextInt();
        System.out.println("Mes(1-12): ");
        int mes_nac = input.nextInt();
        System.out.println("Año: ");
        int año_nac = input.nextInt();
        System.out.println('\n');
        
        //Fecha Ingreso
        System.out.println("Porfavor acontinuacion ingrese su FECHA DE INGRESO.");
        System.out.println("Dia: ");
        int dia_ing = input.nextInt();
        System.out.println("Mes(1-12): ");
        int mes_ing = input.nextInt();
        System.out.println("Año: ");
        int año_ing = input.nextInt();
        
        //Creamos los objetos Empleado y Fecha
        Empleado emp = new Empleado(nombre, apellido, salario, genero );
        Fecha fech_nac = new Fecha (dia_nac , mes_nac , año_nac) ;
        Fecha fech_ing = new Fecha (dia_ing , mes_ing , año_ing) ;
        
        //Fecha actual
        Calendar fech_act = new GregorianCalendar();
        int año_act = fech_act.get(Calendar.YEAR);
        int mes_act = fech_act.get(Calendar.MONTH)+1;
        int dia_act = fech_act.get(Calendar.DAY_OF_MONTH);
        
        //Calculo de dias trabajados
        int dia_trab = (dia_act - fech_ing.getDia());
        int mes_trab = ((mes_act - fech_ing.getMes())*30);
        int año_trab = ((año_act - fech_ing.getAño())*360);
        int dias_trab = año_trab + mes_trab + dia_trab ; 
        
        
        
        
        
        System.out.println('\n') ;
        
        //Impresion de datos.
        System.out.println("DATOS EMPLEADO.");
        System.out.println("Nombre: " + emp.getNom());
        System.out.println("Apellido: " + emp.getApe());
        System.out.println("Salario: $ " + emp.getSal());
        System.out.println("Genero: " + emp.getGen());
        System.out.println("Prestaciones del empleado: $ " + emp.getPres());
        System.out.println("FECHA DE NACIMIENTO: "+ fech_nac.getDia() + " / " + fech_nac.getMes() + " / " + fech_nac.getAño());
        System.out.println("FECHA DE INGRESO: "+ fech_ing.getDia() + " / " + fech_ing.getMes() + " / " + fech_ing.getAño());
        Calendar c1 = GregorianCalendar.getInstance();
        System.out.println("FECHA ACTUAL: "+c1.getTime().toLocaleString());
        System.out.println('\n');
        System.out.println("Teniendo en cuenta(Año comercial = 360dias y 1mes = 30dias).");
        System.out.println("El empleado "+ emp.getNom() +" "+ emp.getApe() + " tiene un total de " + dias_trab + " dias trabajados hasta la fecha actual.");
        System.out.println('\n');
        System.out.println('\n');
        
    }
}
