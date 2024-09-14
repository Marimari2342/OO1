package ar.edu.unlp.info.oo1.ejercicio2;

import java.util.List;

public class Balanza {

    private List <Producto> productos;

    /*accessors necesarios (pista: todos menos los setters de balanza)*/
    //getters
    public int getCantidadDeProductos(){
        return this.productos.size(); //me retorna la cantidad de productos en la lista
    }

    public double getPrecioTotal() {
        double total = 0.0;
        for (Producto producto : this.productos) {
            total += producto.getPrecio();
        }
        return total; //me retorna el precio total de todos los productos en la lista
    }


    public double getPesoTotal(){
        double total = 0.0;
        for (Producto producto : this.productos) {
            total += producto.getPeso();
        }
        return total; //me retorna el peso total de todos los productos en la lista
    }

    /*balanza mejorada*/
    public List<Producto> getProductos(){
        return this.productos;
    }

    //metodos
    /*la balanza puede poner en cero todos sus valores*/
    public void ponerEnCero(){
        productos.clear(); //vacio la lista
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto); //agrego a la lista de productos
    }

    /*la balanza emite un ticket que indica el número de productos 
    considerados, peso total, precio total.*/
    public Ticket emitirTicket(){
        Ticket ticket = new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal());
        return ticket;
    }
}
