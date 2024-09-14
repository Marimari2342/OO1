package ar.edu.unlp.info.oo1.ejercicio2;

import java.util.List;

public class Balanza {

    private int cantidadDeProductos;
    private double precioTotal;
    private double pesoTotal;
    private List <Producto> productos;

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

    /*balanza mejorada*/
    public List<Producto> getProductos(){
        return this.productos;
    }

    //metodos
    /*la balanza puede poner en cero todos sus valores*/
    public void ponerEnCero(){
        this.cantidadDeProductos=0;
        this.precioTotal=0;
        this.pesoTotal=0;
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    /*la balanza emite un ticket que indica el número de productos 
    considerados, peso total, precio total.*/
    public Ticket emitirTicket(){
        Ticket ticket = new Ticket();
        return ticket;
    }
}
