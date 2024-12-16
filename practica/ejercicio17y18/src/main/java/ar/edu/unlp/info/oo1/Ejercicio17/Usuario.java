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
        if (reserva.getPropiedad().consultaDisponibilidad(periodo)){
            reserva.getPropiedad().crearReserva(reserva);
        }
        else System.out.println("Periodo no disponible");
    }

    public void cancelarReserva(Reserva reserva){
        reserva.getPropiedad().cancelarReserva(reserva);
    }

    public double calcularIngreso(DateLapse periodo){
        return propiedades.stream() //stream de propiedades
                .mapToDouble(propiedad -> propiedad.calcularIngreso(periodo)) //mapeo y calculo
                .sum(); //sumo
    }
}
