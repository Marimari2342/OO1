
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Empleado {
    
    //variables de instancia
    private String nombre;
    private String apellido;
    private String cuil;
    private LocalDate nacimiento;
    private int cantHijos;
    private List <Contrato> contratos;

    //constructor
    public Empleado(String nombre, String apellido, String cuil, LocalDate nacimiento, int hijos){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cuil=cuil;
        this.nacimiento=nacimiento;
        this.cantHijos=hijos;
        this.contratos=new LinkedList<Contrato>();
    }
    
    //metodo
}
