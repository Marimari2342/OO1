package ar.edu.unlp.info.oo1.ej12_volumen;

import java.util.ArrayList;
import java.util.List;

/** Una empresa siderúrgica quiere introducir en su sistema de gestión nuevos cálculos de volumen y
superficie exterior para las piezas que produce. El volumen le sirve para determinar cuánto material
ha utilizado. La superficie exterior le sirve para determinar la cantidad de pintura que utilizó
para pintar las piezas.*/

public class ReporteDeConstruccion {
    
    //Variables de instancia
    private List<Pieza> piezas;

    //Constructor
    public ReporteDeConstruccion(){
        this.piezas = new ArrayList<Pieza>();
    }

    //Metodos
    public void agregarPieza (Pieza pieza){
        this.piezas.add(pieza);
    }

    public List<Pieza> getPiezas(){
        return piezas;
    }

    /* recibe un material como parámetro y devuelve un double con la cantidad de material usado */
    public Double volumenDeMaterial(String material){
        return  this.piezas.stream().filter(pieza ->pieza.getMaterial().equals(material))
                .mapToDouble(pieza ->pieza.getVolumen()).sum();
    }
    /* stream() --> convierte la colección en un stream, que permite aplicar operaciones funcionales
     como filtros o mapeos sobre los elementos de la colección.

     * filter(pieza ->pieza.getMaterial().equals(material)) --> aplica un filtro sobre el stream, 
     seleccionando solo las piezas con el mismo material pasado como parámetro.

     * mapToDouble(pieza ->pieza.getVolumen()) --> transforma el stream de piezas filtradas en un 
     stream de valores primitivos double, obteniendo el volumen de cada pieza con getVolumen()

     * sum() --> suma todos los volumenes de las piezas filtradas y mapeadas
     */


    /* recibe un color como parámetro y devuelve un double con la superficie total de todas las
    piezas pintadas con ese color */
    public Double superficieDeColor(String color){
        return  this.piezas.stream().filter(pieza -> pieza.getColor().equals(color))
                .mapToDouble(pieza -> pieza.getSuperficie()).sum();
    }
    /* --Similar al método anterior-- */
}
