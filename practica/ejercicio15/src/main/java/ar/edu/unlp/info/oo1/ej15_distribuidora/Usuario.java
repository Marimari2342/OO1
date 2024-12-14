import java.util.LinkedList;
import java.util.List;

public class Usuario {
    
    //variables de instancia
    private String nombre;
    private String domicilio;
    private List<Factura> facturas;
    private List<Consumo> consumos;

    //constructor
    public Usuario(String nombre, String domicilio){
        this.nombre=nombre;
        this.domicilio=domicilio;
        facturas = new LinkedList<Factura>();
        consumos = new LinkedList<Consumo>();
    }

    //metodos
    public void agregarConsumo(Consumo consumo){
        consumos.add(consumo);
    }

    public void agregarFactura(Factura factura){
        facturas.add(factura);
    }

    /*Para emitir la factura de un cliente se tiene en cuenta solo su último consumo registrado.*/
    public Consumo ultimoConsumo(){
        return this.consumos.isEmpty() ? null: this.consumos.get(this.consumos.size()-1);
    }
}
