
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
    private Contrato contratoActivo;

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
    public void agregarContrato(Contrato contrato){
        this.contratos.add(contrato);
        if (contrato.activo()){
            this.contratoActivo=contrato;
        }
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getCuil(){
        return this.cuil;
    }

    public int getAntiguedad(){
        return this.contratos.stream()
                .mapToInt(contratos -> contratos.antiguedadContrato())
                .sum();
    }

    public double calcularMonto(){
        return this.contratoActivo.calcularMonto()*this.montoAntiguedad();
    }

    public double montoAntiguedad(){
        int aux = this.getAntiguedad();
        if (aux>=20){
            return 2;
        }else if (aux>=15){
            return 1.7;
        }else if (aux>=10){
            return 1.5;
        }else if (aux>=5){
            return 1.3;
        }else return 1;
    }

    public ReciboSueldo generarRecibo(){
        //necesito antiguedad --> buscar la fecha más vieja de ingreso a la empresa.
        int ant=this.getAntiguedad();
        //necesito monto --> lo calculo en otro metodo (LO HAGO MAÑANA)
        double monto=this.calcularMonto();
        //creo recibo
        ReciboSueldo recibo = new ReciboSueldo(this.getNombre(), this.getApellido(), this.getCuil(), ant, monto);
        return recibo; //lo retorno
    }
}
