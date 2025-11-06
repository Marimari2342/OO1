package ar.edu.unlp.info.oo1.ejercicio18;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class EvenNumberSet implements Set<Integer> {

	//variable
	private Set<Integer> numeros;
	
	//constructor
	public EvenNumberSet() {
		this.numeros = new HashSet<>();
	}
	
	//metodos 
	public boolean add(Integer num) {
		if((int)num%2==0) {
			return this.numeros.add(num);
		}
		else
			return false;
	}

	@Override
	public int size() {
		return this.numeros.size();
	}

	@Override
	public boolean isEmpty() {
		return this.numeros.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return this.numeros.contains(o);
	}

	@Override
	public Iterator<Integer> iterator() {
		return this.numeros.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.numeros.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return this.numeros.toArray(a);
	}

	@Override
	public boolean remove(Object o) {
		return this.numeros.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return this.numeros.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		return this.numeros.addAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return this.numeros.retainAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return this.numeros.removeAll(c);
	}

	@Override
	public void clear() {
		this.numeros.clear();
	}
}
