package main.java.ar.edu.unlp.info.oo1.ej11_inversor;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
    //variables de instancia
    private String nombre;
	private List<Inversion> inversiones;

    //constructor 
    public Inversor(String nombre){
        this.nombre=nombre;
        this.inversiones = new ArrayList<Inversion>(); 
    }

    //getters
    public String getNombre(){
        return this.nombre;
    }

    public List<Inversion> getInversiones(){
        return this.inversiones;
    }

    //metodos
    public void agregarInversion(Inversion inversion){
        this.getInversiones().add(inversion);
    }

    /*El valor actual de las inversiones de un inversor es la suma de los valores 
    actuales de cada una de las inversiones en su cartera (su colección de 
    inversiones).*/
    public double valorActual(){
        return this.inversiones.stream()
                .mapToDouble(Inversion::valorActual)
                .sum();
    }

    /*Explicacion del metodo
     * this.inversiones.stream():
    Convierte la lista de inversiones (inversiones), que es un ArrayList<Inversion>,
    en un flujo (stream).
     * mapToDouble(Inversion::valorActual):
    Aplica el método valorActual() a cada elemento de la lista (es decir, a cada 
    objeto de tipo Inversion).
     * .sum():
    Suma todos los valores double generados por el paso anterior y devuelve el total.
     */
}
