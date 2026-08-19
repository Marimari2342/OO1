package enunciado.examen2023noviembre;

public class MontañistaAmateur extends Escalador {
	
	//constructor
	public MontañistaAmateur (String nombre) {
		super(nombre);
	}
	//metodos
	//si el valor de la suma total de pedidos historicos es mayor al doble del pedido actual aplico 5%
	public double descuentoHistorialPedido(Pedido actual) {
		double suma = this.historialPedidos.stream().mapToDouble(pedido -> pedido.cotizar()).sum();
		return (actual.cotizar()*2 < suma)?0.05:0;
	}
}
