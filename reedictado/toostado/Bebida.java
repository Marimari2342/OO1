public class Bebida extends Producto{
 
    //variables
    private boolean esCaliente;

    //constructor
    public Bebida(String nombre, double precio, Promocion promocion, boolean esCaliente){
        super(nombre, precio, promocion);
        this.esCaliente=esCaliente;
    }

    //metodos
    public boolean esCaliente(){
        return this.esCaliente;
    }

    public boolean esCafeFrio() {
        return this.getNombre().equals("café") && !this.esCaliente();
    }
}
