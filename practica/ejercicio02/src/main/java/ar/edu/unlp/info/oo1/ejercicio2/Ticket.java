package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Ticket {
    
    private java.time.LocalDate fecha;
    private int cantidadDeProductos;
    private double pesoTotal;
    private double precioTotal;

    /*accessors necesarios (pista: todos menos los setters de balanza)*/
    //constructor
    public Ticket(int cantidadDeProductos, double pesoTotal, double precioTotal) {
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
		this.fecha = LocalDate.now();
	}
    
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
    public void setFecha(java.time.LocalDate fecha){
        this.fecha=fecha;
    }

    public void setCantidadDeProductos(int productos){
        this.cantidadDeProductos=productos;
    }

    public void setPesoTotal(double pesoTotal){
        this.pesoTotal=pesoTotal;
    }

    public void setPrecioTotal(double precioTotal){
        this.precioTotal=precioTotal;
    }

    //metodos
    public double impuesto(){
        return this.precioTotal*0.21;
    }
}
