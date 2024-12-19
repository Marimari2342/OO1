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

    public double getPrecioHora(){
        return this.precioHora;
    }

    public int getCantHoras(){
        return this.cantHoras;
    }

    public int antiguedadContrato(){
        return this.periodo.sizeInDays();
    }

    public boolean activo(){
        return this.periodo.getTo().isAfter(LocalDate.now());
    }

    public double calcularMonto(){
        return this.getCantHoras()*this.getPrecioHora();
    }
}
