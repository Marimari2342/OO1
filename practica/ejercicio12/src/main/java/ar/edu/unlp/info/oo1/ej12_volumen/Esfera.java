package ar.edu.unlp.info.oo1.ej12_volumen;

public class Esfera extends Pieza{
    
    //Variables de instancia
    private int radio;

    //Constructor
    public Esfera(int radio, String material, String color){
        super(material, color);
        this.radio=radio;
    }

    //Getters y Setters
    public void setRadio(int Radio){
        this.radio=radio;
    }

    public int getRadio(){
        return this.radio;
    }
    
    //Metodos
    public double getVolumen(){
        //4/3π r^3
        return 4/3*Math.PI*Math.pow(this.radio, 3);
    }
    
    public double getSuperficie(){
        //4π r^2
        return 4*Math.PI*Math.pow(this.radio, 2);
    }
}
