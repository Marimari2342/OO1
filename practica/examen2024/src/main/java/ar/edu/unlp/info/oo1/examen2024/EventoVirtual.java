import java.time.LocalDate;

public class EventoVirtual extends Evento{

    //Variables de instancia 
    private double montoFijo;

    //Constructor
    public EventoVirtual(String nombre, LocalDate fecha, String tema, double precioInsc, double precioRem, double montoFijo) {
        super(nombre, fecha, tema, precioInsc, precioRem);
        this.montoFijo = montoFijo;
    }

    //Metodos
    public double getPrecio(LocalDate fecha){
        
    }
}
