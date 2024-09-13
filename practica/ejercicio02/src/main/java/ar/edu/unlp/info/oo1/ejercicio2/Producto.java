package ar.edu.info.unlp.oo;

public class Producto {
    
    private double peso;
    private double precioPorKilo;
    private String descripcion;

    /*accessors necesarios (pista: todos menos los setters de balanza)*/
    //getters
    public double getPeso(){
        return this.peso;
    }

    public double getPrecioPorKilo(){
        return this.precioPorKilo;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    //setters
    public void setPeso(double peso){
        this.peso=peso;
    }

    public void setPrecioPorKilo(double precioPorKilo){
        this.precioPorKilo=precioPorKilo;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

    //metodos
    public double getPrecio(){
        return this.precioPorKilo*this.peso;
    }
}
