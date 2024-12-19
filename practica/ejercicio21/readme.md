# Ejercicio 21. Bag

## Primera parte

Un Map en Java es una colección que asocia objetos que actúan cómo claves (keys), a otros objetos que actúan cómo valores (values). En otros lenguajes también se llaman Dictionary (Diccionario). Cada clave está vinculada a un único valor; no pueden existir claves duplicadas en un mapa, aunque sí podrían haber valores repetidos. A los pares clave-valor se los denomina entradas (entries).

Para definir un Map, es necesario indicar el tipo que tendrán sus claves y valores: por ejemplo, una variable de tipo Map</String, Integer/> define un mapa en donde sus claves son de tipo String, y sus valores de tipo Integer. Observe que Map</K, V/> es una interfaz.


#### a) Lea la documentación de Map en Java y responda:

* ¿Qué implementaciones provee Java para utilizar un Map? ¿Cuáles de ellas son destinadas a uso general?

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Java provee varias implementaciones de la interfaz `Map`, cada una con características y comportamientos distintos. Las implementaciones más comunes son:

1. **`HashMap<K, V>`**:
   - Implementación basada en una tabla hash.
   - No garantiza el orden de los elementos.
   - Es eficiente para la mayoría de las operaciones (insertar, eliminar, buscar) con un tiempo promedio de O(1).
   - **Uso general**.

2. **`TreeMap<K, V>`**:
   - Implementación basada en un árbol rojo-negro.
   - Mantiene las claves ordenadas según su orden natural o un comparador proporcionado.
   - Las operaciones básicas tienen un tiempo de O(log n).
   - **Uso general** cuando se necesita un orden de las claves.

3. **`LinkedHashMap<K, V>`**:
   - Implementación basada en una tabla hash, pero que mantiene el orden de inserción de las claves.
   - Es una opción cuando se necesita mantener el orden de inserción o el orden de acceso (si se configura para hacerlo).
   - **Uso general**.

4. **`Hashtable<K, V>`**:
   - Una implementación más antigua de `Map` (ha sido reemplazada en gran parte por `HashMap`).
   - Es sincrónica, lo que significa que es adecuada para aplicaciones multihilo, aunque generalmente no se recomienda por sus problemas de rendimiento.
   - No permite claves ni valores nulos.
   - **Obsoleta en muchos casos**.

5. **`ConcurrentHashMap<K, V>`**:
   - Similar a `Hashtable`, pero con un enfoque más eficiente para escenarios concurrentes.
   - Permite un alto rendimiento en situaciones multihilo al dividir el mapa en segmentos.

------------------------

</details>

* Investigue cómo consultar sí un mapa contiene una determinada clave (key). Explique qué métodos deben implementar las claves para que esto funcione correctamente

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Para consultar si un mapa contiene una determinada clave, se puede usar el método `containsKey(Object key)`, que devuelve `true` si la clave está presente en el mapa.

**Ejemplo**:
```java
Map<String, Integer> map = new HashMap<>();
map.put("clave1", 10);
map.put("clave2", 20);

boolean tieneClave = map.containsKey("clave1");  // Devuelve true
boolean tieneClaveInexistente = map.containsKey("claveInexistente");  // Devuelve false
```

**Métodos que deben implementar las claves**:
Para que el método `containsKey` funcione correctamente, las claves deben implementar adecuadamente los métodos `equals(Object)` y `hashCode()`. Esto se debe a que `HashMap` y otras implementaciones basadas en tablas hash dependen de estas dos funciones para comparar las claves y verificar su existencia. En el caso de `TreeMap`, se necesita que las claves implementen `Comparable` (o se les proporcione un `Comparator`) para poder ordenarlas correctamente.

------------------------

</details>

* ¿Con qué método se puede recuperar el objeto asociado a una clave? ¿Qué pasa sí la clave no existe en el mapa?

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Para recuperar el valor asociado a una clave en el mapa, se utiliza el método `get(Object key)`. Si la clave no existe, devuelve `null`.

**Ejemplo**:
```java
Integer valor = map.get("clave1");  // Devuelve 10
Integer valorInexistente = map.get("claveInexistente");  // Devuelve null
```

Si la clave no existe en el mapa, `get` devuelve `null`, por lo que es importante verificar si la clave está presente usando `containsKey` antes de intentar recuperar un valor si se desea evitar `null`.

------------------------

</details>

* Investigue cómo agregar claves y valores a un mapa. ¿Qué pasa sí la clave ya se encontraba en el mapa? ¿Permite agregar claves y/o valores nulos? 

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Para agregar una clave y su valor asociado a un mapa, se usa el método `put(K key, V value)`.

**Comportamiento cuando la clave ya existe**:
- Si la clave ya está en el mapa, el valor previamente asociado a esa clave se reemplaza por el nuevo valor.
- Si la clave no existe, se agrega una nueva entrada.

**Ejemplo**:
```java
map.put("clave1", 10);  // Se agrega la clave "clave1" con valor 10
map.put("clave1", 20);  // Se reemplaza el valor asociado con "clave1" por 20
```

**¿Permite agregar claves y valores nulos?**
- `HashMap` permite claves y valores `null`, aunque solo puede haber una clave `null` en el mapa.
- `Hashtable` no permite claves ni valores `null`.

------------------------

</details>

* Determine cómo se pueden eliminar claves y valores de un mapa. ¿Es necesario controlar la presencia de alguno de ellos?

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Para eliminar una clave y su valor asociado, se usa el método `remove(Object key)`.

**Ejemplo**:
```java
map.remove("clave1");  // Elimina la clave "clave1" y su valor asociado
```

No es necesario verificar si la clave está presente antes de usar `remove`, ya que el método simplemente no hace nada si la clave no está presente.

------------------------

</details>

* Investigue cómo reemplazar un valor en un mapa

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Para reemplazar el valor asociado a una clave, se puede usar el método `replace(K key, V value)`.

**Ejemplo**:
```java
map.replace("clave1", 30);  // Reemplaza el valor asociado a "clave1" por 30
```

**Nota**: El método `replace` solo reemplaza el valor si la clave ya existe en el mapa. Si la clave no está presente, el método no realiza ningún cambio.

------------------------

</details>

* Teniendo en cuenta los métodos keySet(), values() y entrySet(), explique de qué formas se puede iterar un mapa ¿Es posible utilizar streams?

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Para iterar sobre un mapa, se pueden usar los métodos `keySet()`, `values()`, y `entrySet()`.

1. **`keySet()`**: Devuelve un conjunto de todas las claves del mapa.
   ```java
   for (String clave : map.keySet()) {
       System.out.println(clave);
   }
   ```

2. **`values()`**: Devuelve una colección de todos los valores del mapa.
   ```java
   for (Integer valor : map.values()) {
       System.out.println(valor);
   }
   ```

3. **`entrySet()`**: Devuelve un conjunto de pares clave-valor.
   ```java
   for (Map.Entry<String, Integer> entry : map.entrySet()) {
       System.out.println(entry.getKey() + " = " + entry.getValue());
   }
   ```

**¿Es posible usar streams?**
Sí, es posible usar streams para iterar y realizar operaciones sobre un mapa. Por ejemplo:
```java
map.entrySet().stream()
   .filter(entry -> entry.getValue() > 10)
   .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
```

Esto utiliza la API de Streams de Java para filtrar y procesar entradas en un mapa de manera funcional.

------------------------

</details>

#### b) Para practicar los mensajes investigados anteriormente, escriba un test de unidad que contenga lo siguiente:

* Cree un map un Map<String, Integer>, y agregue las tuplas (“Lionel Messi”, 111), (“Gabriel Batistuta”, 56), (“Kun Agüero”, 42)

* Elimine la entrada con clave “Kun Agüero” 

* Messi hizo 112 goles a día de la fecha; actualice la cantidad de goles 

* Intente repetir la clave “Gabriel Batistuta” y verifique que no es posible.

* Obtenga la cantidad total de goles 

<details><summary> <code> Respuesta 🖱 </code></summary><br>

~~~java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import java.util.HashMap;

public class GolesMapTest {

    private Map<String, Integer> jugadores;

    // creamos el mapa jugadores e insertamos las tuplas pedidas
    @BeforeEach
    public void setUp() {
        // Inicializar el mapa antes de cada prueba
        jugadores = new HashMap<>();
        jugadores.put("Lionel Messi", 111);
        jugadores.put("Gabriel Batistuta", 56);
        jugadores.put("Kun Agüero", 42);
    }

    // Usamos .remove() para eliminar la entrada de "Kun Agüero" y verificamos.
    @Test
    public void testEliminarJugador() {
        // Eliminar la entrada con clave "Kun Agüero"
        jugadores.remove("Kun Agüero");
        
        // Verificar que "Kun Agüero" ya no está en el mapa
        assertFalse(jugadores.containsKey("Kun Agüero"));
    }

    // Usamos put("Lionel Messi", 112) para actualizar el valor de goles de Messi y verificamos.
    @Test
    public void testActualizarGolesMessi() {
        // Actualizar la cantidad de goles de Messi
        jugadores.put("Lionel Messi", 112);
        
        // Verificar que el valor de goles de Messi ha sido actualizado
        assertEquals(112, jugadores.get("Lionel Messi"));
    }

    /*Intentamos agregar una nueva entrada con la misma clave "Gabriel Batistuta" pero con un valor 
     * diferente (60) y verificamos.*/
    @Test
    public void testRepetirClaveGabrielBatistuta() {
        // Intentar agregar una entrada con la misma clave "Gabriel Batistuta"
        jugadores.put("Gabriel Batistuta", 60); // Reemplaza el valor original
        
        // Verificar que el valor ha sido reemplazado y que no hay duplicados
        assertEquals(60, jugadores.get("Gabriel Batistuta"));
    }

    /*Calculamos la suma total de los valores del mapa utilizando values() y un stream y verificamos*/
    @Test
    public void testCalcularTotalGoles() {
        // Calcular el total de goles (suma de los valores)
        int totalGoles = jugadores.values().stream().mapToInt(Integer::intValue).sum();
        
        // Verificar que el total de goles es correcto
        assertEquals(112 + 56 + 42, totalGoles);
    }
}
~~~
------------------------

</details>

#### c) Como se mencionó, cualquier objeto puede actuar como clave. Es decir, pueden ser instancias de clases definidas por el programador. Modele e implemente la clase Jugador con apellido y nombre. Escriba otro test de unidad similar al de la tarea 2, pero utilizando  Map</Jugador, Integer/>


## Segunda parte

Un Bag (bolsa) es una colección que permite almacenar elementos sin ningún orden específico y admite elementos repetidos. Este objeto requiere un buen tiempo de respuesta para conocer la cardinalidad de sus elementos, y por esa razón almacena la cardinalidad de cada elemento (cantidad de veces que fue agregado en la bolsa). Por ejemplo, sí agregamos 3 veces un objeto en la bolsa, y luego eliminamos 1 referencia, la cardinalidad de ese objeto en la bolsa es 2.

El protocolo de la interface Bag<T> es:

~~~java
public interface Bag<T> extends Collection<T> {
    /**
     * Agrega un elemento al Bag, incrementando en 1 su cardinalidad.
     */
    @Override
    boolean add(T element);

    /**
     * Devuelve la cardinalidad del elemento. Sí el elemento no está en el Bag,            
     * devuelve 0.
     */
    int occurrencesOf(T element);

    /**
     * Elimina una referencia del elemento del Bag. Sí el elemento no está en 
     * el Bag, no hace nada.
     */
    void removeOccurrence(T element);

    /**
     * Elimina el elemento del Bag. Sí el elemento no está en el Bag, no hace
     * nada
     */
    void removeAll(T element);

    /**
     * Devuelve el número total de elementos en el Bag, es decir, la suma de
     * todas las cardinalidades de todos sus elementos.
     */
    @Override
    int size();
}
~~~

Observe que la interfaz Bag<T> extiende Collection<T>. 


* Liste los métodos que debe contener una clase que implementa la interface Bag<T>.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Una clase que implemente la interfaz `Bag<T>` debe contener los siguientes métodos:

1. **`boolean add(T element)`**:
   - Agrega un elemento al Bag e incrementa en 1 su cardinalidad.

2. **`int occurrencesOf(T element)`**:
   - Devuelve la cardinalidad del elemento, es decir, el número de veces que el elemento está presente en el Bag. Si el elemento no está en el Bag, devuelve 0.

3. **`void removeOccurrence(T element)`**:
   - Elimina una referencia del elemento del Bag, es decir, decrementa su cardinalidad en 1. Si el elemento no está presente en el Bag, no hace nada.

4. **`void removeAll(T element)`**:
   - Elimina todas las referencias de un elemento en el Bag, es decir, pone su cardinalidad a 0. Si el elemento no está presente, no hace nada.

5. **`int size()`**:
   - Devuelve el número total de elementos en el Bag, es decir, la suma de las cardinalidades de todos los elementos.

------------------------

</details>

* Explique cómo implementaría un Bag<T> usando composición con un Map<K, V>. ¿De qué tipo tendrían que ser las claves y valores del Map?

<details><summary> <code> Respuesta 🖱 </code></summary><br>

La implementación de un `Bag<T>` usando composición con un `Map<K, V>` es una opción adecuada para gestionar las cardinalidades de los elementos, porque podemos almacenar el elemento como clave (`K`) y su cantidad (cardinalidad) como valor (`V`).

- Las **claves** del `Map` deben ser del tipo `T` (el tipo de los elementos que queremos almacenar en el Bag).
- Los **valores** del `Map` deben ser del tipo `Integer`, que representará la cantidad de veces que un elemento está presente en el Bag (su cardinalidad).

¿Cómo funciona?

- El **elemento** (`T`) es la clave.
- La **cardinalidad** (número de veces que aparece) es el valor (`Integer`).
- Al agregar un elemento al Bag, incrementamos el valor asociado a esa clave (la cardinalidad).
- Al eliminar una ocurrencia de un elemento, decrementamos el valor asociado a la clave.
- Cuando eliminamos todas las ocurrencias de un elemento, removemos la clave del `Map`.

------------------------

</details>

* Implemente la interfaz Bag<T>, utilizando AbstractCollection<T> como superclase, y componga con un Map<T, V> (utilizar la clase BagImpl).

<details><summary> <code> Respuesta 🖱 </code></summary><br>

```java
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
```
------------------------

</details>