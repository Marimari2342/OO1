package main.java.ar.edu.unlp.info.oo1.ej4_figuras;

public class Cuadrado implements Figura{
    
    private double lado;

    //getters
    public double getLado(){
        return this.lado;
    }

    //setters
    public void setLado(double lado){
        this.lado=lado;
    }

    //metodos
    @Override
    public double getPerimetro(){
        return  4 * this.lado;
    }

    @Override
    public double getArea(){
        return this.lado * this.lado;
    }
}
