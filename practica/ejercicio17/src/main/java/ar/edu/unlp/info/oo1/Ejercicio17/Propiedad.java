import java.util.LinkedList;
import java.util.List;

import main.java.ar.edu.unlp.info.oo1.DateLapse.DateLapse;

public class Propiedad {
    
    //variables de instancia
    private String direccion;
    private String descripcion;
    private double precio;
    private List<Reserva> reservas;

    //constructor
    public Propiedad(String direccion, String descripcion, double precio){
        this.direccion=direccion;
        this.descripcion=descripcion;
        this.precio=precio;
        reservas = new LinkedList<Reserva>();
    }

    //metodos
    public boolean consultaDisponibilidad(DateLapse periodo){
        
    }

    public void crearReserva(Reserva reserva){
        this.reservas.add(reserva);
    }
}
