
import java.time.LocalDate;

public class ContratoHoras implements Contrato{
    
    //variables de instancia
    private DateLapse periodo;
    private double precioHora;
    private int cantHoras;

    //constructor

    //metodo
    public LocalDate getFechaIngreso(){
        return this.periodo.getFrom();
    }

    public int antiguedadContrato(){
        return this.periodo.sizeInDays();
    }
}
