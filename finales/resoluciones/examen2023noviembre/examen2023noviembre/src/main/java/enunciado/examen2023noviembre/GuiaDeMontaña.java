package enunciado.examen2023noviembre;

import java.util.List;

public class GuiaDeMontaña extends Escalador{

	//constructor
	public GuiaDeMontaña (String nombre) {
		super(nombre);
	}
	
	//metodos
	//si el valor del pedido actual es mayor al promedio de los tres ultimos pedidos aplico 7%
	public double descuentoHistorialPedido(Pedido actual) {
		if (historialPedidos.size() < 3) {
			return 0;
		}
		List<Pedido> ultimosTres = historialPedidos.subList(
				historialPedidos.size() - 3, 
				historialPedidos.size());
		double promedio = ultimosTres.stream().mapToDouble(pedido -> pedido.cotizar()).average().orElse(0);
		return (actual.cotizar() > promedio)?0.07:0;
	}
}
