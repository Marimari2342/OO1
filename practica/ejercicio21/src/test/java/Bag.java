/*Un Bag (bolsa) es una colección que permite almacenar elementos sin ningún orden específico y 
admite elementos repetidos. Este objeto requiere un buen tiempo de respuesta para conocer la 
cardinalidad de sus elementos, y por esa razón almacena la cardinalidad de cada elemento (cantidad 
de veces que fue agregado en la bolsa). Por ejemplo, sí agregamos 3 veces un objeto en la bolsa, y 
luego eliminamos 1 referencia, la cardinalidad de ese objeto en la bolsa es 2.
El protocolo de la interface Bag<T> es:*/
import java.util.Collection;

public interface Bag<T> extends Collection<T> {

    @Override
    boolean add(T element); //Agrega un elemento al Bag, incrementando en 1 su cardinalidad.

    int occurrencesOf(T element); //Devuelve cardinalidad del elemento. Sí el elemento no está en el Bag, devuelve 0.

    void removeOccurrence(T element); //Elimina una referencia del elemento del Bag. Sí el elemento no está en el Bag, no hace nada.

    void removeAll(T element); //Elimina el elemento del Bag. Sí el elemento no está en el Bag, no hace nada.

    @Override
    int size(); //Devuelve el número total de elementos en el Bag, es decir, la suma de todas las cardinalidades de todos sus elementos.
}
