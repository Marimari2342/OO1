public class Pedido {
    
    //variables de instancia
    private OpcionesPago pago;
    private OpcionesEnvio envio;
    private Producto producto;
    private int cant;

    //constructor
    public Pedido(OpcionesPago pago, OpcionesEnvio envio, Producto producto, int cant){
        this.pago=pago;
        this.envio=envio;
        this.producto=producto;
        this.cant=cant;
    }

    //metodos
    public Producto getProducto(){
        return this.producto;
    }

    public OpcionesPago getPago(){
        return this.pago;
    }

    public OpcionesEnvio getEnvio(){
        return this.envio;
    }

    public int getCant(){
        return this.cant;
    }

    /* 3.Calcular el costo total de un pedido. Dado un pedido, se retorna su costo total que se
    calcula de la siguiente forma: (precio final en base a la forma de pago seleccionada) +
    (costo de envío en base a la forma de envío seleccionada). */
    public double calcularCostoPedido(){
        return this.pago.precioFinal(this.getProducto().getPrecio())*this.getCant()+this.getEnvio().costoEnvio();
    }
}
