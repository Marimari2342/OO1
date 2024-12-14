import java.time.LocalDate;

public interface DateLapseInterfaz {
    LocalDate getFrom();                    // Retorna la fecha de inicio
    int sizeInDays();                       // Retorna cantidad días entre las fechas 'from' y 'to'
    boolean includesDate(LocalDate other);  // Verifica si la fecha está dentro del intervalo
}
