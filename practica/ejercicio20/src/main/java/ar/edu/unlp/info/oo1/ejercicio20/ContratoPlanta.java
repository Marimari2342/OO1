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

    public double getSueldoMensual(){
        return this.sueldoMensual;
    }

    public double getMontoConyuge(){
        return this.montoConyuge;
    }

    public double getMontoHijos(){
        return this.montoHijos;
    }

    public int antiguedadContrato(){
        DateLapse aux = new DateLapse(this.fechaInicio, LocalDate.now());
        return aux.sizeInDays();
    }

    public boolean activo(){
        return true;
    }

    public double calcularMonto(){
        return this.getSueldoMensual()+this.getMontoConyuge()+this.getMontoHijos();
    }
}
