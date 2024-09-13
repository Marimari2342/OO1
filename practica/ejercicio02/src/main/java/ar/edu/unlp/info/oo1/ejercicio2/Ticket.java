package ar.edu.info.unlp.oo;

public class Ticket {
    
    private java.time.LocalDate fecha;
    private int cantidadDeProductos;
    private double pesoTotal;
    private double precioTotal;

    /*accessors necesarios (pista: todos menos los setters de balanza)*/
    //getters
    public java.time.LocalDate getFecha(){
        return this.fecha;
    }

    public int getCantidadDeProductos(){
        return this.cantidadDeProductos;
    }

    public double getPesoTotal(){
        return this.pesoTotal;
    }

    public double getPrecioTotal(){
        return this.precioTotal;
    }
    
    //setters

    //metodos
}
