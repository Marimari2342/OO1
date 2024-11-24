package ar.edu.unlp.info.oo1.ej12_volumen;

public class PrismaRectangular extends Pieza{
 
    //Variables de instancia
    private int ladoMayor;
    private int ladoMenor;
    private int altura;

    //Constructor
    public PrismaRectangular(int ladoMayor, int ladoMenor, int altura, String material, String color){
        super(material, color);
        this.ladoMayor=ladoMayor;
        this.ladoMenor=ladoMenor;
        this.altura=altura;
    }

    //Getters y Setters
    public void setLadoMayor(int lado){
        this.ladoMayor=lado;
    }

    public void setLadoMenor(int lado){
        this.ladoMenor=lado;
    }

    public void setAltura(int altura){
        this.altura=altura;
    }

    public int getLadoMayor(){
        return this.ladoMayor;
    }

    public int getLadoMenor(){
        return this.ladoMenor;
    }

    public int getAltura(){
        return this.altura;
    }
    
    //Metodos
    public double getVolumen(){
        //l1*l2*h
        return this.ladoMayor*this.ladoMenor*this.altura;
    }
    
    public double getSuperficie(){
        //2×(l1×l2+l1×h+l2×h)
        return 2*(this.ladoMayor*this.ladoMenor+this.ladoMayor*this.altura+this.ladoMenor*this.altura);
    }
}
