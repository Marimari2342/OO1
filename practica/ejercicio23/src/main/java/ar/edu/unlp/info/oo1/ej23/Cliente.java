import java.util.List;
import java.util.LinkedList;

public class Cliente extends Persona{
    
    //variables de instancia
    private List<Pedido> pedidos;

    //constructor
    public Cliente(String nombre, String direccion){
        super(direccion, direccion);
        pedidos = new LinkedList<Pedido>(); 
    }
    //metodos

    /* 1.Crear un pedido para un cliente: dado un cliente, una forma de pago, una forma de envío,
    un producto y la cantidad solicitada, se verifica sí hay unidades disponibles del producto: sí
    es así, se crea el pedido y se descuentan las unidades indicadas del producto. No hace
    nada si no hay suficientes unidades disponibles. */
    public void crearPedido(OpcionesPago pago, OpcionesEnvio envio, Producto producto, int cant){
        if (producto.verificarStock(cant)){
            pedidos.add(new Pedido(pago,envio,producto,cant));
            producto.descontarUnidades(cant);
        }
    }

    /* 2.Conocer la cantidad de productos pedidos por categoría: dado un cliente, se desea
    conocer cuántos productos por categoría ha pedido en la plataforma. Ejemplos de
    categorías son: “Electrodomésticos”, “Computadores”, “Hogar”, etc. */
    public int cantProdPedidosCategoria(String categoria){
        return (int) this.pedidos.stream()
        .filter(pedido -> pedido.getProducto().getCategoria().equals(categoria))
        .count();
    }
}
