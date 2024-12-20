package unlp.oo1.bag;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BagImpl<T> extends AbstractCollection<T> implements Bag<T> {

    //variable de instancia
    private Map<T, Integer> elements;// Mapa que mantiene las cardinalidades de los elementos

    //constructor
    /*Usamos un HashMap<T, Integer> donde las claves son los elementos (T) y los valores son las 
    cardinalidades de esos elementos (Integer).*/
    public BagImpl() {
        this.elements = new HashMap<>();
    }

    //metodos
    /*Si el elemento ya existe en el map, incrementamos su valor (la cardinalidad).
      Si el elemento no existe, lo agregamos con una cardinalidad de 1.*/
    @Override
    public boolean add(T element) {
        this.elements.put(element, this.elements.getOrDefault(element, 0) + 1);
        return true;
    }

    /*Devolvemos el valor asociado a la clave del elemento. Si no está en el map, devolvemos 0 
    (usando getOrDefault)*/
    @Override
    public int occurrencesOf(T element) {
        return this.elements.getOrDefault(element, 0);
    }

    /*Si el elemento está en el map, decrementamos su cardinalidad. Si la cardinalidad llega a 0, 
    eliminamos la clave del map.*/
    @Override
    public void removeOccurrence(T element) {
        if (this.elements.containsKey(element)) {
            int count = this.elements.get(element);
            if (count > 1) {
                this.elements.put(element, count - 1);  // Decrementamos la cardinalidad
            } else {
                this.elements.remove(element);  // Si la cardinalidad es 1, lo eliminamos
            }
        }
    }

    /*Eliminamos la clave y su valor del map.*/
    @Override
    public void removeAll(T element) {
        this.elements.remove(element);
    }

    /*Iteramos sobre los valores del map (las cardinalidades) y sumamos todas las cantidades para 
    obtener el tamaño total del Bag.*/
    @Override
    public int size() {
        int totalSize = 0;
        for (int count : this.elements.values()) {
            totalSize += count;  // Suma las cardinalidades de todos los elementos
        }
        return totalSize;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Iterator<Map.Entry<T, Integer>> entryIterator = elements.entrySet().iterator();
            private Map.Entry<T, Integer> currentEntry;
            private int remainingCount;

            @Override
            public boolean hasNext() {
                return remainingCount > 0 || entryIterator.hasNext();
            }

            @Override
            public T next() {
                if (remainingCount == 0) {
                    currentEntry = entryIterator.next();
                    remainingCount = currentEntry.getValue();
                }
                remainingCount--;
                return currentEntry.getKey();
            }

            @Override
            public void remove() {
                removeOccurrence(currentEntry.getKey());
            }
        };
    }
}
