package ar.edu.unlp.info.oo1.ejercicio22;
import java.util.LinkedList;

public class PedidoSuper extends Pedido{

	//variables de instancia
	private boolean cuponDescuento;
	private LinkedList<Supermercado> lista;
	
	//constructor
	public PedidoSuper(String email, Envio entrega, boolean cupon) {
		super(email, entrega);
		this.cuponDescuento = cupon;
		this.lista = new LinkedList<>();
	}
	
	//metodos
	public double calcularCostoPedido() {
		double costo = this.lista.stream().mapToDouble(prod -> prod.getPrecio()).sum();
		return (this.cuponDescuento) ? costo*0.9 : costo; 
	}
	
	public double calcularPesoPedido() {
		return this.lista.stream().mapToDouble(prod -> prod.getPesoKg()).sum();
	}

	public void agregarProducto(Supermercado producto) {
		if (this.calcularPesoPedido()<=35) {
			lista.add(producto);
		}
	}
}
