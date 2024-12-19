import java.time.LocalDate;

public class ContratoPlanta implements Contrato{
    
    //variables de instancia
    private LocalDate fechaInicio;
    private double sueldoMensual;
    private double montoConyuge;
    private double montoHijos;

    //constructor

    //metodo
    public LocalDate getFechaIngreso(){
        return this.fechaInicio;
    }

    public int antiguedadContrato(){
        DateLapse aux = new DateLapse(this.fechaInicio, LocalDate.now());
        return aux.sizeInDays();
    }
}
