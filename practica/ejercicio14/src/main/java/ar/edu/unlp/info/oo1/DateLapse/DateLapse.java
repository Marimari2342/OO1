import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements DateLapseInterfaz{
    
    //variables de instancia
    private LocalDate from; //fecha de inicio del rango
    private LocalDate to;   //fecha de fin del rango

    //constructor
    public DateLapse(LocalDate from, LocalDate to){
        this.from=from;
        this.to=to;
    }

    //metodos
    public LocalDate getFrom() {    //Retorna la fecha de inicio del rango
        return this.from;
    }

    public LocalDate getTo() {      //Retorna la fecha de fin del rango
        return this.to;
    }

    public int sizeInDays() {       //retorna cantidad de días entre las fechas 'from' y 'to'
        return (int) getFrom().until(getTo(), ChronoUnit.DAYS);
    }

    public boolean includesDate(LocalDate other) { //recibe un objeto LocalDate y retorna T/F si esta en el intervalo de tiempo
        return (other.isAfter(getFrom()) && other.isBefore(getTo()));
        /*No incluye los bordes, si los quiero incluir hago -->
        * return ((other.isAfter(getFrom())||other.isEqual(getFrom())) && (other.isBefore(getTo())||other.isEqual(getTo())));
        */
    }
}