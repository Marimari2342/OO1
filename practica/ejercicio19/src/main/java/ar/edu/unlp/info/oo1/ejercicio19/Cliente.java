import java.util.LinkedList;
import java.util.List;

public abstract class Cliente {
    
    //variables de instancia
    private String nombre;
    private String direccion;
    private List<Envio> envios;

    //constructor
    public Cliente (String nombre, String direccion){
        this.nombre=nombre;
        this.direccion=direccion;
        this.envios=new LinkedList<Envio>();
    }

    //metodos
    public void agregarEnvio(Envio envio){
        this.envios.add(envio);
    }

    public double calcularMontoPagar(DateLapse periodo){
        return this.envios.stream()
        .filter(envio -> periodo.includesDate(envio.getFechaDespacho()))
        .mapToDouble(envio -> envio.precioEnvio()).sum();
    }
}
