package ar.edu.unlp.info.oo1.ej13_correo;

public class Archivo {
    
    //Variables de instancia
    private String nombre;

    //Constructor
    public Archivo(String nombre){
        this.nombre=nombre;
    }

    //Getters y Setters
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    //Otros métodos  
    /* Para simplificar, asuma que el tamaño de un archivo es el largo de su nombre. */ 
    public int tamaño(){
        return this.nombre.length();
    } 
}
