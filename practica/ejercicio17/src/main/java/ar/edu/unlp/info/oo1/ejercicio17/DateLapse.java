package ar.edu.unlp.info.oo1.ejercicio17;
import java.time.LocalDate;

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
		return (!f.isBefore(this.from) && !f.isAfter(this.getTo()));
	}	
}
