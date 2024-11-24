package ar.edu.unlp.info.oo1.ej12_volumen;

public class Cilindro extends Pieza{
    
    //Variables de instancia
    private int radio;
    private int altura;

    //Constructor
    public Cilindro(int radio, int altura, String material, String color){
        super(material, color);
        this.radio=radio;
        this.altura=altura;
    }

    //Getters y Setters
    public void setRadio(int radio){
        this.radio=radio;
    }

    public void setAltura(int altura){
        this.altura=altura;
    }

    public int getRadio(){
        return this.radio;
    }

    public int getAltura(){
        return this.altura;
    }

    //Metodos
    public double getVolumen(){
        //πr^2h
        return Math.PI*Math.pow(this.radio, 2)*this.altura;
    }
    
    public double getSuperficie(){
        //2πrh + 2πr^2
        return 2*Math.PI*this.radio*(this.altura+this.radio);

    }
}
