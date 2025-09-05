package ar.edu.unlp.info.oo1.ejercicio03;

public class Item {

	//variables
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	//constructor
	public Item(String detalle, int cant, double costoUni) {
		this.detalle = detalle;
		this.cantidad = cant;
		this.costoUnitario = costoUni;
	}
	
	//getters y setters
	public String getDetalle() {
		return this.detalle;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	public void setCantidad(int cant) {
		this.cantidad = cant;
	}
	
	public void setCostoUnitario(double costoU) {
		this.costoUnitario = costoU;
	}
	
	//metodos
	public double costo() {
		return this.costoUnitario*this.cantidad;
	}
}
