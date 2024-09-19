package main.java.ar.edu.unlp.info.oo1.ej4_figuras;

public class Cuerpo3D {
    
    private double altura;
	private Figura caraBasal;

    //getters
    public double getAltura(){
        return this.altura;
    }

    //setters
    public void setAltura(double altura){
        this.altura=altura;
    }

    public void setCaraBasal(Figura figura){
        this.caraBasal=figura;
    }

    //metodos
        public double getVolumen(){ //volumen = base (cara basal) por altura 
        return this.caraBasal.getArea() * this.altura;
    }

    public double getSuperficieExterior(){ //SupEx = area + perimetro por altura
        return (2 * this.caraBasal.getArea() + this.caraBasal.getPerimetro() * this.altura);
    }
}
