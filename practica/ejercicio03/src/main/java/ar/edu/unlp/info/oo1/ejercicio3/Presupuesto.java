
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
    private java.time.LocalDate fecha;
    private String cliente;
    private List <Item> items; 

    //constructor
    public Presupuesto(){
        this.fecha=LocalDate.now();
        this.items=new ArrayList<Item>();
    }

    //getters
    public java.time.LocalDate getFecha(){
        return this.fecha;
    }

    public String getCliente(){
        return this.cliente;
    }

    //setters
    public void setFecha(java.time.LocalDate fecha){
        this.fecha=fecha;
    }

    public void setCliente(String cliente){
        this.cliente=cliente;
    }

    //metodos
    /*Agrega un item a la lista de items*/
    public void agregarItem(Item item){
        this.items.add(item);
    }

    /*calcula el costo total teniendo en cuenta todos los items de la lista*/
    public double calcularTotal() {
        double total = 0.0;
        for (Item item : this.items) {
            total += item.costo();
        }
        return total;
    }
}
