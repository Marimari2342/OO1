import java.time.LocalDate;

public interface Contrato {
    
    //metodo
    LocalDate getFechaIngreso();
    int antiguedadContrato();
    boolean activo();
    double calcularMonto();
}
