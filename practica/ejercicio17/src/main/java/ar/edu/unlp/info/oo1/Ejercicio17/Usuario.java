import java.util.LinkedList;
import java.util.List;

public class Usuario {
    
    //variables de instancia
    private String nombre;
    private String direccion;
    private String dni;
    private List<Propiedad> propiedades;
    

    //constructor
    public Usuario(String nombre, String direccion, String dni){
        this.nombre=nombre;
        this.direccion=direccion;
        this.dni=dni;
        this.propiedades=new LinkedList<Propiedad>();
    }

    //metodos
    public void crearReserva(Reserva reserva, DateLapse periodo){
        reserva.getPropiedad().consultaDisponibilidad(periodo) ? reserva.getPropiedad().crearReserva(reserva): System.out.println("Periodo no disponible");;
    }
}
