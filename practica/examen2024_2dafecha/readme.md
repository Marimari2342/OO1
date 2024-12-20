# EXAMEN OO1

## 2da Fecha 2024 

1. Describa el diseño de su solución utilizando un diagrama de clases UML.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

![umlExamen2daFecha2024](/practica/examen2024_2dafecha/examen2024UML.jpg)

</details>

2. Implemente en Java toda la funcionalidad antes descripta. Puede usar las clases implementadas en los ejerciios de la práctica: DateLapse, FilteredSet, Bag, según se requiera.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Ejercicio completo <code>[AQUI](/practica/examen2024_2dafecha/src/main/java/ar/edu/unlp/info/oo1/examen2024/)</code>

</details>

3. Diseño de los casos de prueba: Enfocándose en la funcionalidad que pemite subir el nivel de un personaje (todos los métodos de todas las clases involucradas en conseguir esa funcionalidad), detemine y enumere qué métodos testear, indicando clases y casos de prueba (teniendo en cuenta los conceptos de valores de borde y pariciones equivalentes). ldentifique claramente las particiones que encuentra y los valores de borde para cada caso.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

* Personaje --> Metodo subirNivel()

* Personaje --> Metodo mejorarHabilidad()

* Rol --> Metodo mejorarHabilidad()

---------------------

(1) Caso1: Personaje Humano con Rol Mago y nivel<7

(2) Caso2: Personaje Humano con Rol Guerrero y nivel<7

(3) Caso3: Personaje Humano con Rol Mago y nivel>=7

(4) Caso4: Personaje Humano con Rol Guerrero y nivel>=7

(5) Caso5: Personaje Orco con Rol Mago y nivel n tq (n%3<>0)

(6) Caso5: Personaje Orco con Rol Guerrero y nivel n tq (n%3<>0)

(7) Caso7: Personaje Orco con Rol Mago y nivel n tq (n%3=0)

(8) Caso8: Personaje Orco con Rol Guerrero y nivel n tq (n%3=0)

---------------------

(1)(2)(5)(6) --> el nivel se incrementa en 1, no mejora su habilidad.

(3)(7) --> el nivel se incrementa en 1, mejora habilidad inteligencia aumentándola 3/2*nivel.

(4)(8) --> el nivel se incrementa en 1, mejora habilidad fuerza aumentándola nivel/6.

</details>

4. Un ejemplo del código Java necesario para crear un humano con rol mago que se enfrenta con un orco con rol guerrero a las 22hs. Luego, el humano cambia su rol a guerrero y se enfrenta con el mismo orco guerrero a las 14 hs.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

~~~java
Humano humano = new Humano("juan", new Mago());
Orco orco = new Orco("pepe", new Guerrero());
humano.enfrentamiento(orco, 22);
humano.getRol(new Guerrero());
humano.enfrentamiento(orco, 14);
~~~

</details>