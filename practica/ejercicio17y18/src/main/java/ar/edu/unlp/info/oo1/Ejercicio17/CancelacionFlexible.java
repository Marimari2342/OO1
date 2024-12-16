import java.time.LocalDate;

public class CancelacionFlexible implements Cancelacion {
    
    //metodos
    public double reembolso(Reserva reserva){
        return reserva.getFecha().includesDate(LocalDate.now()) ? 0: reserva.calcularPrecio();
    }
}