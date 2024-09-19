# Orientacion a Objetos I - Ejercicios Practicos


## 🟡 Ejercicio 1 --> WallPost

### Primera parte

***Se está construyendo una red social como Facebook o Twitter. Debemos definir una clase Wallpost con los siguientes atributos: un texto que se desea publicar, cantidad de likes (“me gusta”) y una marca que indica si es destacado o no. La clase es subclase de Object.***

***Para realizar este ejercicio, utilice el recurso que se encuentra en el sitio de la cátedra (o que puede descargar desde acá). Para importar el proyecto, siga los pasos explicados en el documento “Trabajando con proyectos Maven, importar un proyecto”. Allí verá que existe la interface Wallpost y la clase WallpostImpl que implementa la interfaz anterior. Una vez importado, dentro del mismo, debe completar la clase WallPostImpl e implementar el protocolo definido en la interfaz Wallpost***

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Enlace a la resolución de la [*Primera Parte*](/practica/ejercicio01/src/main/java/ar/edu/unlp/oo1/ejercicio1/impl/WallPostImpl.java) del ejercicio 1.

</details>

### Segunda parte

***Utilice los tests provistos por la cátedra para comprobar que su implementación de Wallpost es correcta. Estos se encuentran en el mismo proyecto, en la carpeta test, clase WallPostTest.***

### Tercera parte

***Una vez que su implementación pasa los tests de la primera parte puede utilizar la ventana que se muestra a continuación, la cual permite inspeccionar y manipular el post (definir su texto, hacer like / dislike y marcarlo como destacado).***

## 🟡 Ejercicio 2 --> Balanza Electrónica

***En términos generales, la Balanza electrónica recibe productos (uno a uno), y calcula dos totales: peso total y precio total. Además la balanza puede poner en cero todos sus valores.***

***La balanza no guarda los productos. Luego emite un ticket que indica el número de productos considerados, peso total, precio total.***

***Cree un nuevo proyecto Maven llamado balanzaElectronica, siguiendo los pasos del documento “Trabajando con proyectos Maven, crear un proyecto Maven nuevo”. En el paquete correspondiente, programe las clases que se muestran a continuación.***

***Para realizar este ejercicio, utilice el recurso que se encuentra en el sitio de la cátedra. En este caso, se trata de dos clases, BalanzaTest y ProductoTest, las cuales debe agregar dentro del paquete tests. Haga las modificaciones necesarias para que el proyecto no tenga errores.***

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Balanza.java

~~~java
package ar.edu.unlp.oo1.ejercicio2;

public class Balanza {

    private int cantidadDeProductos;
    private double precioTotal;
    private double pesoTotal;

    /*accessors necesarios (pista: todos menos los setters de balanza)*/
    //getters
    public int getCantidadDeProductos(){
        return this.cantidadDeProductos;
    }

    public double getPrecioTotal(){
        return this.precioTotal;
    }

    public double getPesoTotal(){
        return this.pesoTotal;
    }

    //metodos
    /*la balanza puede poner en cero todos sus valores*/
    public void ponerEnCero(){
        this.cantidadDeProductos=0;
        this.precioTotal=0;
        this.pesoTotal=0;
    }

    public void agregarProducto(Producto producto){
        this.cantidadDeProductos++;
        this.precioTotal+=producto.getPrecio();
        this.pesoTotal+=producto.getPeso();
    }

    /*la balanza emite un ticket que indica el número de productos 
    considerados, peso total, precio total.*/
    public Ticket emitirTicket(){
        Ticket ticket = new Ticket();
        return ticket;
    }
}
~~~

Producto.java

~~~java
package ar.edu.unlp.oo1.ejercicio2;

public class Producto {
    
    private double peso;
    private double precioPorKilo;
    private String descripcion;

    /*accessors necesarios (pista: todos menos los setters de balanza)*/
    //getters
    public double getPeso(){
        return this.peso;
    }

    public double getPrecioPorKilo(){
        return this.precioPorKilo;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    //setters
    public void setPeso(double peso){
        this.peso=peso;
    }

    public void setPrecioPorKilo(double precioPorKilo){
        this.precioPorKilo=precioPorKilo;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

    //metodos
    public double getPrecio(){
        return this.precioPorKilo*this.peso;
    }
}
~~~

Ticket.java

~~~java
package ar.edu.unlp.oo1.ejercicio2;

public class Ticket {
    
    private java.time.LocalDate fecha;
    private int cantidadDeProductos;
    private double pesoTotal;
    private double precioTotal;

    /*accessors necesarios (pista: todos menos los setters de balanza)*/
    //constructor
    public Ticket(int cantidadDeProductos, double pesoTotal, double precioTotal) {
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
		this.fecha = LocalDate.now();
	}

    //getters
    public java.time.LocalDate getFecha(){
        return this.fecha;
    }

    public int getCantidadDeProductos(){
        return this.cantidadDeProductos;
    }

    public double getPesoTotal(){
        return this.pesoTotal;
    }

    public double getPrecioTotal(){
        return this.precioTotal;
    }
    
    //setters
    public void setFecha(java.time.LocalDate fecha){
        this.fecha=fecha;
    }

    public void setCantidadDeProductos(int productos){
        this.cantidadDeProductos=productos;
    }

    public void setPesoTotal(double pesoTotal){
        this.pesoTotal=pesoTotal;
    }

    public void setPrecioTotal(double precioTotal){
        this.precioTotal=precioTotal;
    }

    //metodos
    public double impuesto(){
        return this.precioTotal*0.21;
    }
}
~~~

</details>

## 🟡 Ejercicio 3 --> Presupuestos

***Un presupuesto se utiliza para detallar los precios de un conjunto de productos que se desean adquirir. Se realiza para una fecha específica y es solicitado por un cliente, proporcionando una visión de los costos asociados.***

* ***Implemente:***

***Defina el proyecto Ejercicio 3 - Presupuesto y dentro de él implemente las clases que se observan en el diagrama. Ambas son subclases de Object.***

* ***Discuta y reflexione***

***Preste atención a los siguientes aspectos: ¿Cuáles son las variables de instancia de cada clase? ¿Qué variables inicializa? ¿De qué formas se puede realizar esta inicialización? ¿Qué ventajas y desventajas encuentra en cada una de ellas?***

* ***Probando su código:***

***Utilice los tests provistos  para confirmar que su implementación ofrece la funcionalidad esperada. En este caso, se trata de dos clases: ItemTest y PresupuestoTest, que debe agregar dentro del paquete tests Haga las modificaciones necesarias para que el proyecto no tenga errores. Siéntase libre de explorar las clases de test para intentar entender qué es lo que hacen.***

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Presupuesto.java

~~~java
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
    private java.time.LocalDate fecha;
    private String cliente;
    private List <Item> items; 

    //constructor
    public Presupuesto(){
        this.fecha=LocalDate.now();
        this.items=new ArrayList<Item>();
    }

    //getters
    public java.time.LocalDate getFecha(){
        return this.fecha;
    }

    public String getCliente(){
        return this.cliente;
    }

    //setters
    public void setFecha(java.time.LocalDate fecha){
        this.fecha=fecha;
    }

    public void setCliente(String cliente){
        this.cliente=cliente;
    }

    //metodos
    /*Agrega un item a la lista de items*/
    public void agregarItem(Item item){
        this.items.add(item);
    }

    /*calcula el costo total teniendo en cuenta todos los items de la lista*/
    public double calcularTotal() {
        double total = 0.0;
        for (Item item : this.items) {
            total += item.costo();
        }
        return total;
    }
}
~~~

Item.java

~~~java
public class Item {
    private String detalle;
    private int cantidad;
    private double costoUnitario;

    //constructor
    public Item(String unDetalle,int unaCant,double unCostoUnitario){
        this.detalle=unDetalle;
        this.cantidad=unaCant;
        this.costoUnitario=unCostoUnitario;
    }

    //getters
    public String getDetalle(){
        return this.detalle;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public double getCostoUnitario(){
        return this.costoUnitario;
    }

    //setters
    public void setDetalle(String detalle){
        this.detalle=detalle;
    }

    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }

    public void setCostoUnitario(double costoUnitario){
        this.costoUnitario=costoUnitario;
    }

    //metodos
    /*me devuelve el costo total calculando cantidad por costo unitario*/
    public double costo(){
        return this.getCantidad()*this.getCostoUnitario();
    }
}
~~~

</details>

## 🟡 Ejercicio 4 --> Balanza Mejorada

***Realizando el ejercicio de los presupuestos, aprendimos que un objeto puede tener una colección de otros objetos. Con esto en mente, ahora queremos mejorar la balanza implementada  en el ejercicio 2.***

### Tarea 1

***Mejorar la balanza para que recuerde los productos ingresados (los mantenga en una colección). Analice de qué forma puede realizarse este nuevo requerimiento e implemente el mensaje:***

~~~
public List<Producto> getProductos()
~~~

***que retorna todos los productos ingresados a la balanza (en la compra actual, es decir, desde la última vez que se la puso a cero). ¿Qué cambio produce este nuevo requerimiento en en la implementación del mensaje ponerEnCero()? ¿Es necesario, ahora, almacenar los totales en la balanza? ¿Se pueden obtener estos valores de otra forma?***

### Tarea 2

***Con esta nueva funcionalidad, podemos enriquecer al Ticket, haciendo que él también conozca a los productos (a futuro podríamos imprimir el detalle). Ticket también debería entender el mensaje  public List<Producto> getProductos().***

***¿Qué cambios cree necesarios en Ticket para que pueda conocer a los productos? ¿Estos cambios modifican las responsabilidades ya asignadas de realizar cálculo del precio total?. ¿El ticket adquiere nuevas responsabilidades que antes no tenía?***

### Tarea 3

***Después de hacer estos cambios, ¿siguen pasando los tests? ¿Está bien que sea así?***

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Balanza.java

~~~java
package ar.edu.unlp.info.oo1.ejercicio2;

import java.util.List;

public class Balanza {

    private List <Producto> productos;

    /*accessors necesarios (pista: todos menos los setters de balanza)*/
    //getters
    public int getCantidadDeProductos(){
        return this.productos.size(); //me retorna la cantidad de productos en la lista
    }

    public double getPrecioTotal() {
        double total = 0.0;
        for (Producto producto : this.productos) {
            total += producto.getPrecio();
        }
        return total; //me retorna el precio total de todos los productos en la lista
    }


    public double getPesoTotal(){
        double total = 0.0;
        for (Producto producto : this.productos) {
            total += producto.getPeso();
        }
        return total; //me retorna el peso total de todos los productos en la lista
    }

    /*balanza mejorada*/
    public List<Producto> getProductos(){
        return this.productos;
    }

    //metodos
    /*la balanza puede poner en cero todos sus valores*/
    public void ponerEnCero(){
        productos.clear(); //vacio la lista
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto); //agrego a la lista de productos
    }

    /*la balanza emite un ticket que indica el número de productos 
    considerados, peso total, precio total.*/
    public Ticket emitirTicket(){
        Ticket ticket = new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal());
        return ticket;
    }
}
~~~

</details>

## 🟡 Ejercicio 5 --> Figuras y Cuerpos

### Figuras en 2D

***En Taller de Programación definió clases para representar figuras geométricas.Retomaremos ese ejercicio para trabajar con Cuadrados y Círculos. El siguiente diagrama de clases documenta los mensajes que estos objetos deben entender.***

### Cuerpos en 3D

***Ahora que tenemos las clases Círculo y Cuadrado, podemos usarlos para construir cuerpos en 3D y calcular su volumen y superficie o área exterior. Vamos a pensar a un cilindro como "un cuerpo que tiene una figura 2D como cara basal y que tiene una altura (vea la siguiente imagen)". Si en el lugar de la figura2D tuviera un círculo, se formaría el siguiente cuerpo 3D.***

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Figura.java

~~~java
package main.java.ar.edu.unlp.info.oo1.ej4_figuras;

public interface Figura {
    public double getPerimetro();
    public double getArea();
}
~~~

Circulo.java

~~~java
package main.java.ar.edu.unlp.info.oo1.ej4_figuras;

public class Circulo implements Figura {

    private double radio;

    //getters
    public double getRadio(){
        return this.radio;
    }

    public double getDiametro(){
        return this.radio * 2;
    }

    //setters
    public void setRadio(double radio){
        this.radio=radio;
    }

    public void setDiametro(double diametro){
        this.radio=diametro / 2;
    }

    //metodos
    @Override
    public double getPerimetro(){
        return  2 * Math.PI * this.radio;
    }

    @Override
    public double getArea(){
        return Math.PI * this.radio * this.radio;
    }
}
~~~

Cuadrado.java

~~~java
package main.java.ar.edu.unlp.info.oo1.ej4_figuras;

public class Cuadrado implements Figura{
    
    private double lado;

    //getters
    public double getLado(){
        return this.lado;
    }

    //setters
    public void setLado(double lado){
        this.lado=lado;
    }

    //metodos
    @Override
    public double getPerimetro(){
        return  4 * this.lado;
    }

    @Override
    public double getArea(){
        return this.lado * this.lado;
    }
}
~~~

Cuerpo3D.java

~~~java
package main.java.ar.edu.unlp.info.oo1.ej4_figuras;

public class Cuerpo3D {
    
    private double altura;
	private Figura caraBasal;

    //getters
    public double getAltura(){
        return this.altura;
    }

    //setters
    public void setAltura(double altura){
        this.altura=altura;
    }

    public void setCaraBasal(Figura figura){
        this.caraBasal=figura;
    }

    //metodos
        public double getVolumen(){ //volumen = base (cara basal) por altura 
        return this.caraBasal.getArea() * this.altura;
    }

    public double getSuperficieExterior(){ //SupEx = area + perimetro por altura
        return (2 * this.caraBasal.getArea() + this.caraBasal.getPerimetro() * this.altura);
    }
}
~~~

</details>

## 🟡 Ejercicio 6 --> Genealogía salvaje

En una reserva de vida salvaje, los cuidadores quieren llevar registro detallado de los animales que cuidan y sus familias. Para ello nos han pedido ayuda.

### Complete el diseño e implemente

Modelar una solución en objetos e implementar la clase Mamífero (como subclase de Object). El siguiente diagrama de clases (incompleto) nos da una idea de los mensajes que un mamífero entiende. Proponga una solución para el método <code>tieneComoAncestroA(...)</code> y deje la implementación para el final y discuta su solución con el ayudante. 

<details><summary> <code> Respuesta 🖱 </code></summary><br>

~~~java

~~~

</details>