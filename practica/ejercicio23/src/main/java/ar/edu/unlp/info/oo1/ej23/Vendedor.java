import java.util.LinkedList;
import java.util.List;

public class Vendedor extends Persona{
    
    //variables de instancia
    private List<Producto> productos;

    //constructor
    public Vendedor(String nombre, String direccion){
        super(nombre, direccion);
        this.productos=new LinkedList<Producto>();
    }
    
    //metodos
}
