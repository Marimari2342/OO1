import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Personaje {
    
    //variables de instancia
    private String nombre;
    private int nivel;
    private double inteligencia;
    private double fuerza;
    private Rol rol;

    //constructor
    public Personaje(String nombre, Rol rol){
        this.nombre=nombre;
        this.nivel=1;
        this.rol=rol;
    }

    //metodos
    public Rol getRol(){
        return this.rol;
    }

    public double getFuerza(){
        return this.fuerza;
    }

    public double getInteligencia(){
        return this.inteligencia;
    }

    public double getNivel(){
        return this.nivel;
    }

    public void setInteligencia(double num){
        this.inteligencia=num;
    }

    public void setFuerza(double num){
        this.fuerza=num;
    }

    public void cambiarRol(Rol rol){
        this.rol=rol;
    }

    //1. determinar poder de ataque
    public abstract double determinarPoderAtaque(int horaDia);

    //2. subir un nivel
    public void subirNivel(){
        this.nivel++;
        this.mejorarHabilidad();
    }

    public abstract void mejorarHabilidad();

    //3. enfrentamiento Uno a UNo
    public void enfrentamiento(Personaje oponente, int horaDia){
        double p1=this.determinarPoderAtaque(horaDia);
        double p2=oponente.determinarPoderAtaque(horaDia);
        if (p1==p2){
            this.subirNivel();
            oponente.subirNivel();
        }else if (p1>p2){
            this.subirNivel();
        } else{
            oponente.subirNivel();
        }
    }

    //4. buscar oponentes de nivel similar
    public void buscarOponente(LinkedList<Personaje> personajes){
        List<Personaje> oponentes = personajes.stream()
        .filter(op -> (op.getNivel()==this.getNivel()&&op.determinarPoderAtaque(12)<5)||(Math.abs(op.getNivel()-this.getNivel())<=2))
        .collect(Collectors.toList());
    }
}
