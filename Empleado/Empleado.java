public class Empleado{
    //Atributos
    private String nombre , apellido ; 
    private double salario;
    private double prestaciones;
    private char genero;
    
    //Constructor con parametros
    public Empleado(String nombre , String apellido , double salario , char genero){
        this.nombre = nombre ; 
        this.apellido = apellido ; 
        this.genero = genero ; 
        this.salario = salario ;
        this.prestaciones= (salario*0.0735);
    }
    
    //constructor por defecto
    public Empleado(){
    }
    
    //setters y getters
    public void setNom (String nomb ){
        this.nombre=nomb;
    }
    public String getNom (){
        return nombre ;
    }
    public void setApe ( String ape ){
        this.apellido = ape ;
    }
    public String getApe (){
        return apellido ; 
    }
    public void setGen ( char gen){
        this.genero = gen ; 
    }
    public char getGen (){
        return genero ; 
    }
    public void setSal ( double sal ){
        this.salario = sal ;
        this.prestaciones = (this.salario*0.735) ; 
    }
    public double getSal (){
        return salario ; 
    }
    public double getPres(){
        return prestaciones;
    }
}
