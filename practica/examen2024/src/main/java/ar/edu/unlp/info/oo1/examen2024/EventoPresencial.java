import java.time.LocalDate;

import main.java.ar.edu.unlp.info.oo1.examen2024.Evento;

public class EventoPresencial extends Evento{

    //Constructor
    public EventoPresencial(String nombre, LocalDate fecha, String tema, double precioInsc, double precioRem) {
        super(nombre, fecha, tema, precioInsc, precioRem);
    }
    
    //Metodos
    /*dado un evento y una fecha retorna el precio de asistencia al evento para la fecha indicada.
    Para los presenciales es la suma del precio de la inscripción, el precio de la remera y la suma 
    de los precios totales de estadía en cada una de las sedes de ese evento. Cada sede tiene un 
    precio total que es el precio de estadía por día multiplicado por la cantidad de días del mismo.
    En ambos casos, si el evento se realiza el mismo día en que se hace la consulta, el precio de 
    inscripción tiene un recargo del 20%.

     */
    public double getPrecio(LocalDate fecha){
        
    }
}
