package main.java.ar.edu.unlp.info.oo1.ej4_figuras;

public class Circulo implements Figura {

    private double radio;

    //getters
    public double getRadio(){
        return this.radio;
    }

    public double getDiametro(){
        return this.radio * 2;
    }

    //setters
    public void setRadio(double radio){
        this.radio=radio;
    }

    public void setDiametro(double diametro){
        this.radio=diametro / 2;
    }

    //metodos

    @Override
    public double getPerimetro(){
        return  2 * Math.PI * this.radio;
    }

    @Override
    public double getArea(){
        return Math.PI * this.radio * this.radio;
    }

    
}
