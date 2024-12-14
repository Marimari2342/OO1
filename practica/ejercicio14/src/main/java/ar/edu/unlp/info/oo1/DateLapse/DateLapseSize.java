import java.time.LocalDate;

public class DateLapseSize implements DateLapseInterfaz {
    
    //variables de instancia
    private LocalDate from;     //fecha de inicio del rango
    private int sizeInDays;     //diferencia de días

    //atributos
    public DateLapseSize (LocalDate from, int size){
        this.from=from;
        this.sizeInDays=size;
    }

    //metodos
    public LocalDate getFrom(){     // Retorna la fecha de inicio
        return this.from;
    }

    public int sizeInDays(){       // Retorna cantidad días entre las fechas 'from' y 'to'
        return this.sizeInDays;
    }

    public boolean includesDate(LocalDate other){ // Verifica si la fecha está dentro del intervalo
        LocalDate to = this.getFrom().plusDays(this.sizeInDays());
        return (other.isAfter(getFrom()) && other.isBefore(to));
    }

}
