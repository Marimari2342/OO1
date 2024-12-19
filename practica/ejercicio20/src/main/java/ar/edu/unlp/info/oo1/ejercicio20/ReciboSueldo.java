import java.time.LocalDate;

public class ReciboSueldo {
    
    //variables de instancia
    private String nombre;
    private String apellido;
    private String cuil;
    private int antiguedad;
    private LocalDate fechaRecibo;
    private double monto;

    //constructor
    public ReciboSueldo(String nombre, String apellido, String cuil, int antig, double monto){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cuil=cuil;
        this.antiguedad=antig;
        this.fechaRecibo=LocalDate.now();
        this.monto=monto;
    }
}
