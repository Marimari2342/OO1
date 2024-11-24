package ar.edu.unlp.info.oo1.ej12_volumen;

public abstract class Pieza {
    
    //Variables de instancia
    private String material;
    private String color;

    //Constructor
    public Pieza (String material, String color){
        this.material=material;
        this.color=color;
    }

    //Metodos
    public String getMaterial(){
        return this.material;
    }

    public String getColor(){
        return this.color;
    }

    //Metodos abstractos (volumen y superficie dependen del tipo y tamaño de pieza)

    public abstract double getVolumen();
    
    public abstract double getSuperficie();
}
