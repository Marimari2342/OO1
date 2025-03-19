
import java.util.LinkedList;
import java.util.List;

public class Pedido {

    //variables
    private List<Producto> productos;
    private boolean retiro;
    private boolean pagado;

    //constructor
    public Pedido (boolean retiro){
        this.productos = new LinkedList<Producto>();
        this.retiro=retiro;
        this.pagado=false;
    }

    //metodos
    public void setRetiro(boolean retirar){
        this.retiro=retirar;
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public void setPagado(boolean pago){
        this.pagado=pago;
    }

    public double calcularCosto(){
        return this.productos.stream()
            .mapToDouble(prod -> prod.aplicarDescuento())
            .sum();
    }

    public boolean estaPago(){
        return this.pagado;
    }

    public boolean esParaRetirar(){
        return this.retiro;
    }
}
