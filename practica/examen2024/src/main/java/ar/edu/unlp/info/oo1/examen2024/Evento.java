import java.time.LocalDate;

public abstract class Evento {
    
    //variables de instancia
    private String nombre;
    private LocalDate fecha;
    private String temaPrincipal;
    private double precioInscripcion;
    private double precioRemera;

    //Constructor
    public Evento (String nombre, LocalDate fecha, String tema, double precioInsc, double precioRem){
        this.nombre = nombre;
        this.fecha = fecha;
        this.temaPrincipal = tema;
        this.precioInscripcion = precioInsc;
        this.precioRemera = precioRem;
    }

    //Metodos
    public abstract double getPrecio(LocalDate fecha);

    public LocalDate getFecha(){
        return this.fecha;
    }

}
