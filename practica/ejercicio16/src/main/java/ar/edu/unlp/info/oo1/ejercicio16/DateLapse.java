package ar.edu.unlp.info.oo1.ejercicio16;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {

	//variables de instancia
	private LocalDate from;
	private LocalDate to;
	
	//constructor
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	//metodos
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	
	public long sizeDays() {
		return ChronoUnit.DAYS.between(this.from, this.to);
	}
	
	public boolean includesDate(LocalDate f) {
		return (!f.isBefore(this.from) && !f.isAfter(this.to));
	}	
}
