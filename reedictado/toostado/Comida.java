public class Comida extends Producto{
    
    //variables
    private boolean aptaVegano;
    private boolean aptaCeliaco;

    //constructor
    public Comida (String nombre, double precio, Promocion promocion, boolean aptaVegano, boolean aptaCeliaco){
        super(nombre,precio, promocion);
        this.aptaVegano=aptaVegano;
        this.aptaCeliaco=aptaCeliaco;
    }

    //metodos
    private boolean esAptoVegano(){
        return this.aptaVegano;
    }

    private boolean esAptoCeliaco(){
        return this.aptaCeliaco;
    }
}