import java.time.LocalDate;

public class CancelacionModerada implements Cancelacion {
    
    //metodos
    public double reembolso(Reserva reserva){
        int cant=reserva.getFecha().diasQueFaltan(LocalDate.now());
        if (reserva.getFecha().includesDate(LocalDate.now())||cant<2){
            return 0;
        }
        return cant>=7 ? reserva.calcularPrecio(): reserva.calcularPrecio()*0.5;
    }
}