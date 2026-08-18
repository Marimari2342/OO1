package enunciado.examen2022febrero;

import java.util.List;
import java.util.LinkedList;

public class EpisodioPremium extends Episodio{

	//variables de instancia
	private double costo;
	private List<Episodio> episodiosBonus;
	
	//constructor
	public EpisodioPremium(double duracion, int cantEscuchas, double costo) {
		super(duracion,cantEscuchas);
		this.costo = costo;
		this.episodiosBonus = new LinkedList<Episodio>();
	}
	
	//metodos
	public void agregarBonus(Episodio bonus) {
		this.episodiosBonus.add(bonus);
	}
	
	@Override
	public double duracion() {
		double suma = this.episodiosBonus.stream().mapToDouble(bonus -> bonus.duracion()).sum();
		return (suma+super.duracion())/(this.episodiosBonus.size()+1);
	}
	
	@Override
	public int cantEscuchas() {
		return super.cantEscuchas()+this.episodiosBonus.stream().mapToInt(bonus -> bonus.cantEscuchas()).sum();
	}
	
	@Override
	public double puntaje() {
		return super.puntaje()*this.costo*10;
	}
}
