package ar.edu.unlp.info.oo1.ej25;

public class Vacunacion extends ServicioMedico {
    
    //variables de instancia
    private String nombreVacuna;
    private double precioVacuna;

    //constructor
    public Vacunacion(Mascota mascota, MedicoVeterinario medico, String nombre, double precio){
        super(mascota, medico);
        this.nombreVacuna = nombre;
        this.precioVacuna = precio;
    }

    //metodos
    public double getPrecioVacuna(){
        return this.precioVacuna;
    }

    public String getNombreVacuna(){
        return this.nombreVacuna;
    }

    @Override
    protected double costoMateriales(){
        return 500;
    }

    @Override
    protected double otrosCostos(){
        return this.getPrecioVacuna();
    }
}
