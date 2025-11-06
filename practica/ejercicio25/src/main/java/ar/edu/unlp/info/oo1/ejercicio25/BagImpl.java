package ar.edu.unlp.info.oo1.ejercicio25;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BagImpl<T> extends AbstractCollection<T> implements Bag<T> {

    Map<T, Integer> elements;

    public BagImpl() {
        this.elements = new HashMap<T,Integer>();
    }

    // Agrega un elemento al Bag, incrementando en 1 su cardinalidad.
    @Override
    public boolean add(T element) {
        if (this.elements.containsKey(element)) {
        	this.elements.put(element,this.elements.get(element)+1); //si ya existe incremento cantidad
        }
        else {
        	this.elements.put(element, 1); //sino es el primero (pongo cont en 1)
        }
        return true;
    }

    // Devuelve la cardinalidad del elemento. Sí el elemento no está en el Bag, devuelve 0.
    @Override
    public int occurrencesOf(T element) {
    	return this.elements.getOrDefault(element, 0);
    }

    // Elimina una referencia del elemento del Bag. Sí el elemento no está en el Bag, no hace nada.
    @Override
    public void removeOccurrence(T element) {
        if (this.elements.containsKey(element)) {
        	if(this.elements.get(element)>1) {
        		this.elements.put(element, this.elements.get(element)-1);
        	} else {
        		this.elements.remove(element);
        	}
        }
    }

    // Elimina el elemento del Bag. Sí el elemento no está en el Bag, no hace nada.
    @Override
    public void removeAll(T element) {
        this.elements.remove(element);
    }

    // Devuelve el número total de elementos en el Bag.
    @Override
    public int size() {
        return this.elements.entrySet().stream().mapToInt(el -> occurrencesOf(el.getKey())).sum();
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
