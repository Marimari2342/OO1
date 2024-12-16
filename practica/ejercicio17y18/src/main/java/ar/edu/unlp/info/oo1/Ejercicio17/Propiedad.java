import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Propiedad {
    
    //variables de instancia
    private String direccion;
    private String descripcion;
    private double precio;
    private List<Reserva> reservas;
    private Cancelacion politCancelacion;

    //constructor
    public Propiedad(String direccion, String descripcion, double precio, Cancelacion politCanc){
        this.direccion=direccion;
        this.descripcion=descripcion;
        this.precio=precio;
        this.reservas = new LinkedList<Reserva>();
        this.politCancelacion = politCanc;
    }

    //metodos
    public boolean consultaDisponibilidad(DateLapse periodo){
        Iterator<Reserva> iterator = reservas.iterator(); // Obtener un iterador de la lista de reservas
        while (iterator.hasNext()) { // Mientras haya elementos en el iterador
            Reserva reserva = iterator.next(); // Obtener el siguiente elemento de la lista
            if (reserva.getFecha().estaOcupada(periodo)) { // Verificar si la reserva ocupa el periodo
                return false; // Si la propiedad está ocupada, retornar false
            }
        }
        return true; // Si no se encontró ninguna reserva que ocupe el periodo, retornar true
    }

    public void crearReserva(Reserva reserva){
        if (this.consultaDisponibilidad(reserva.getFecha())){
            this.reservas.add(reserva);
        }
    }

    public void cancelarReserva(Reserva reserva){
        if (!reserva.getFecha().includesDate(LocalDate.now())){
            reservas.remove(reserva);
        }
        else System.out.println("No se puede cancelar reserva en curso");
    }

    public double calcularIngreso(DateLapse periodo){
        return reservas.stream()    //stream de reservas
                .filter(reserva -> (reserva.getFecha().getFrom().isAfter(periodo.getFrom()) 
                 && reserva.getFecha().getTo().isBefore(periodo.getTo()))) //filtro por periodo
                .mapToDouble(reserva -> reserva.calcularPrecio()) //calculo precio
                .sum()*0.75; //sumo y aplico el 75
    }   
}
