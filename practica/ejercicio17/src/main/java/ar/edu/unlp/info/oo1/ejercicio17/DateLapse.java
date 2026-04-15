package ar.edu.unlp.info.oo1.ejercicio17;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {

	//variables de instancia
	private LocalDate from;
	private long sizeInDays;
	
	//constructor
	public DateLapse(LocalDate from, long sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}
	
	//metodos
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.from.plusDays(this.sizeInDays);
	}
	
	public long sizeDays() {
		return this.sizeInDays;
	}
	
	public boolean includesDate(LocalDate f) {
		return !f.isBefore(this.from) && !f.isAfter(this.getTo());
	}	
	
	//retorna true si al menos incluye una fecha solapada
	public boolean overlaps(DateLapse periodo) {
	    return this.getFrom().isBefore(periodo.getTo()) && periodo.getFrom().isBefore(this.getTo());
	}
	

	public long diasHastaInicio() {
		if (this.from.isBefore(LocalDate.now())) {
			return 0; // ya empezó o está en curso
		}
		return ChronoUnit.DAYS.between(LocalDate.now(),this.from);
	}
}
