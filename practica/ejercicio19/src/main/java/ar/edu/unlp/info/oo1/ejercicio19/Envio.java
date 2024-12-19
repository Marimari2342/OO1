
import java.time.LocalDate;

public abstract class Envio {

    //variables de instancia
    private LocalDate fechaDespacho;
    private String direccionOrigen;
    private String direccionDestino;
    private double peso;

    //constructor
    public Envio (String origen, String destino, double peso){
        this.fechaDespacho=LocalDate.now();
        this.direccionOrigen=origen;
        this.direccionDestino=destino;
        this.peso=peso;
    }

    //metodos

    public double getPeso(){
        return this.peso;
    }

    public LocalDate getFechaDespacho(){
        return this.fechaDespacho;
    }
    
    public abstract double precioEnvio();

}
