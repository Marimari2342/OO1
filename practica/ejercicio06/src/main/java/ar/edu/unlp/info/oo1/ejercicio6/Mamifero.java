package ar.edu.unlp.info.oo1.ejercicio6;

public class Mamifero {
    
    private String identificador;
    private String especie;
    private java.time.LocalDate nacimiento;
    private Mamifero madre;
    private Mamifero padre;

    public Mamifero() {
    }

    public Mamifero(String unNombre) {
        this.identificador=unNombre;
    }


    //getters
    public String getIdentificador(){
        return this.identificador;
    }

    public String getEspecie(){
        return this.especie;
    }

    public java.time.LocalDate getFechaNacimiento(){
        return this.nacimiento;
    }

    public Mamifero getMadre(){
        return this.madre;
    }

    public Mamifero getPadre(){
        return this.padre;
    }

    //setters
    public void setIdentificador(String identificador){
        this.identificador=identificador;
    }

    public void setEspecie(String especie){
        this.especie=especie;
    }

    public void setFechaNacimiento(java.time.LocalDate fecha){
        this.nacimiento=fecha;
    }

    public void setMadre(Mamifero madre){
        this.madre=madre;
    }

    public void setPadre(Mamifero padre){
        this.padre=padre;
    }

    //otros metodos
    public Mamifero getAbueloMaterno(){
        if (this.madre!=null){
            return this.madre.getPadre();
        }
        else return null;
    }

    public Mamifero getAbuelaMaterna(){
        if (this.madre!=null){
            return this.madre.getMadre();
        }
        else return null;
    }

    public Mamifero getAbueloPaterno(){
        if (this.padre!=null){
            return this.padre.getPadre();
        }
        else return null;
    }

    public Mamifero getAbuelaPaterna(){
        if (this.padre!=null){
            return this.padre.getMadre();
        }
        else return null;
    }

    //reviso si los padres son el ancestro pasado como parámetro
    public Boolean tieneComoAncestroA(Mamifero unMamifero){
        return verAncestro(this.madre,unMamifero)||(verAncestro(this.padre,unMamifero));
    }

    /*me fijo si encuentro el mamifero, y si tiene algun ancestro reviso eso, 
    así hasta quedarme sin ancestros*/
    public Boolean verAncestro(Mamifero ancestro, Mamifero unMamifero){
        if (ancestro!=null){
            return unMamifero.equals(ancestro)||ancestro.tieneComoAncestroA(unMamifero);
        } else
        return false;
    }
}
