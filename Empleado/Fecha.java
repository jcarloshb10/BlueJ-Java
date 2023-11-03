public class Fecha{
    //Atributos
    private int dia ;
    private int mes;
    private int año ;
    
    //Constructor con parametros
    public Fecha (int dia , int mes , int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    //getters
    public int getDia(){
        return dia ; 
    }
    public int getMes (){
        return mes ; 
    }
    public int getAño (){
        return año;
    }
}
