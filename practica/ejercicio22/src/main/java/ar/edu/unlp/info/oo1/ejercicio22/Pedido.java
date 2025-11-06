package ar.edu.unlp.info.oo1.ejercicio22;

public abstract class Pedido {
	
	//variables de instancia
	private String email;
	private Envio tipoEntrega;
	
	
	//constructor
	public Pedido(String email, Envio entrega) {
		this.email = email;
		this.tipoEntrega = entrega;
	}
	
	//metodos
	public abstract double calcularCostoPedido();
	
	public long calcularTiempoEntrega() {
		return this.tipoEntrega.tiempoEntrega();
	}
}
