public class PersonaFisica extends Cliente {
    
    //variables de instancia
    private String dni;

    //constructor
    public PersonaFisica(String nombre, String direccion, String dni){
        super(nombre, direccion);
        this.dni=dni;
    }

    //metodos
    public double calcularMontoPagar(DateLapse periodo){
        return super.calcularMontoPagar(periodo)*0.9;
    }
}
