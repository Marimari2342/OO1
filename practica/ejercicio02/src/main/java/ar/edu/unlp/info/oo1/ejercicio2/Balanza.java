package ar.edu.info.unlp.oo;

public class Balanza {

    private int cantidadDeProductos;
    private double precioTotal;
    private double pesoTotal;

    /*accessors necesarios (pista: todos menos los setters de balanza)*/
    //getters
    public int getCantidadDeProductos(){
        return this.cantidadDeProductos;
    }

    public double getPrecioTotal(){
        return this.precioTotal;
    }

    public double getPesoTotal(){
        return this.pesoTotal;
    }

    //metodos
    /*la balanza puede poner en cero todos sus valores*/
    public void ponerEnCero(){
        this.cantidadDeProductos=0;
        this.precioTotal=0;
        this.pesoTotal=0;
    }

    public void agregarProducto(producto Producto){

    }

    /*la balanza emite un ticket que indica el número de productos 
    considerados, peso total, precio total.*/
    public Ticket emitirTicket(){
        Ticket ticket = new Ticket();
        return ticket;
    }
}
