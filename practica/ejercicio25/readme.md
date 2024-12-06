# Ejercicio25 - Veterinaria

Enunciado --> [<code>Aquí</code>](/practica/ejercicio25/enunciado25.pdf)

## Tareas

### Modele e implemente

* Diseño de su solución en un diagrama de clases UML.

![uml25](/practica/ejercicio25/uml25.jpg)

* Implementación en Java de la funcionalidad requerida.

Clases --> [<code>Aquí</code>](/practica/ejercicio25/src/main/java/ar/edu/unlp/info/oo1/ej25/)

### Pruebas automatizadas

* Diseñe los casos de prueba teniendo en cuenta los conceptos de valores de borde y particiones equivalentes vistos en la teoría.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

1. **Particiones equivalentes**: Se refiere a dividir el conjunto de posibles entradas en "partes" donde cada parte se espera que sea tratada de la misma forma. Si se prueba un valor de cualquier partición, se está probando todos los valores de esa partición.
   
2. **Valores de borde**: Se refiere a probar los valores más extremos de las particiones equivalentes, ya que son los más propensos a causar errores en el sistema.

------------------------

#### Clase: Mascota

#### Método: recaudacion(fecha: DateTipe): Real

#### Casos

1. En la fecha que se quiere consultar la mascota NO recibió servicios.

2. En la fecha que se quiere consultar la mascota recibió 1 servicio.

3. En la fecha que se quiere consultar la mascota recibió más de 1 servicio.

CASO 1 --> Cuando en la fecha que se quiere consultar la mascota no recibió servicios, en este caso retorna 0.

CASO 2 y 3 --> Cuando en la fecha que se quiere consultar la mascota recibió 1 o más servicios, en este caso retornaría el monto total recaudado.

------------------------

#### Clase: Guardería

#### Método: costoServicio(): Real

#### Casos

1. La guardería se usará 1 día.

2. La guardería se usará más de 1 día.

3. La mascota no tiene más de 5 servicios previos.

4. La mascota tiene 5 servicios previos.

5. La mascota tiene más de 5 servicios previos.

CASO (1-4), (2-4), (1-5), (2-5) --> Cuando la guardería se usó 1 o más días, y la mascota ha recibido 5 o más servicios previos, entonces retorna el monto con el descuento aplicado del 10%.

CASO (1-3), (2-3) --> Cuando la guardería se usó 1 o más días, y la mascota NO ha recibido 5 o más servicios previos, entonces retorna el monto total por el servicio ($500 * cantDías)

------------------------

#### Clase: ServicioMedico

#### Método: costoServicio(): Real

**NO ES NECESARIO** puesto que aunque varía el precio que se cobra dependiendo de que clase heredada lo llama, siempre se ejecuta de igual modo en la clase ServicioMedico.

</details>

* Implemente utilizando JUnit los tests automatizados diseñados en el punto anterior.

~~~java
public class MascotaTest {

    @Test
    public void testRecaudacionSinServicios() {
        // Caso 1: No tiene servicios en la fecha indicada
        LocalDate fechaNac = LocalDate.of(2014, 9, 5);
        Mascota mascota = new Mascota('Pipi', fechaNac, 'gato');
        LocalDate fecha = LocalDate.of(2024, 12, 6);
        assertEquals(0, mascota.recaudacion(fecha), "La recaudación debe ser 0 cuando no hay servicios en la fecha.");
    }

    @Test
    public void testRecaudacionConUnServicio() {
        // Caso 2: 1 servicio recibido en la fecha indicada
        LocalDate fechaNac = LocalDate.of(2014, 9, 5);
        Mascota mascota = new Mascota('Pipi', fechaNac, 'gato');
        Servicio servicio = new Guarderia(mascota.getNombre(), 1);
        mascota.agregarServicio(servicio);
        LocalDate fecha = LocalDate.of(2024, 12, 6);
        assertEquals(500, mascota.recaudacion(fecha), "La recaudación debe ser el monto del servicio.");
    }

    @Test
    public void testRecaudacionConVariosServicios() {
        // Caso 3: Más de 1 servicio recibido en la fecha indicada
        LocalDate fechaNac = LocalDate.of(2014, 9, 5);
        Mascota mascota = new Mascota('Pipi', fechaNac, 'gato');
        Servicio servicio1 = new Guarderia(mascota.getNombre(), 1);
        Servicio servicio2 = new Guarderia(mascota.getNombre(), 2);
        mascota.agregarServicio(servicio1);
        mascota.agregarServicio(servicio2);
        LocalDate fecha = LocalDate.of(2024, 12, 6);
        assertEquals(500 + 1000, mascota.recaudacion(fecha), "La recaudación debe ser la suma de los costos de los servicios.");
    }

    //falta testear con y sin descuento, pero es más de lo mismo..... 
}

~~~