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

---------------------

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

---------------------

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

---------------------

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

---------------------

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

---------------------

## 🟡 Ejercicio 6 --> Genealogía salvaje

En una reserva de vida salvaje, los cuidadores quieren llevar registro detallado de los animales que cuidan y sus familias. Para ello nos han pedido ayuda.

### Complete el diseño e implemente

Modelar una solución en objetos e implementar la clase Mamífero (como subclase de Object). El siguiente diagrama de clases (incompleto) nos da una idea de los mensajes que un mamífero entiende. Proponga una solución para el método <code>tieneComoAncestroA(...)</code> y deje la implementación para el final y discuta su solución con el ayudante. 

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Mamifero.java

~~~java
package ar.edu.unlp.info.oo1.ejercicio6;

public class Mamifero {
    
    private String identificador;
    private String especie;
    private java.time.LocalDate nacimiento;
    private Mamifero madre;
    private Mamifero padre;

    //constructores
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
~~~

</details>

### Pruebas automatizadas 

Siguiendo los ejemplos de ejercicios anteriores, ejecute las pruebas automatizadas provistas. 

---------------------

## 🟡 Ejercicio 7 --> Red de Alumbrado

Imagine una red de alumbrado donde cada farola está conectada a una o varias vecinas formando un [grafo conexo](https://es.wikipedia.org/wiki/Grafo_conexo). Cada una de las farolas tiene un interruptor. Es suficiente con encender o apagar una farola cualquiera para que se enciendan o apaguen todas las demás. Sin embargo, si se intenta apagar una farola apagada (o si se intenta encender una farola encendida) no habrá ningún efecto, ya que no se propagará esta acción hacia las vecinas.

La funcionalidad a proveer permite:

* Crear farolas (inicialmente están apagadas).

* Conectar farolas a tantas vecinas como uno quiera (conexiones bidireccionales). 

* Encender una farola (y obtener el efecto antes descrito).

* Apagar una farola (y obtener el efecto antes descrito).

### Modele e implemente

1. Realice el diagrama UML de clases de la solución al problema. 

![imagen](/practica/cosas/img01.png)

2. Implemente en Java, la clase Farola, como subclase de Object, con los métodos dados.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Farola.java

~~~java
package main.java.ar.edu.unlp.info.oo1.red_alumbrado;

import java.util.ArrayList;
import java.util.List;

public class Farola {
    
    private Boolean on;
    private List<Farola> neighbors;

    /*Crear una farola. Debe inicializarla como apagada*/
    public Farola (){
        this.neighbors = new ArrayList<Farola>(); //inicio sin vecinos
        this.on=false;
    }

    /*Crea la relación de vecinos entre las farolas. La relación de vecinos entre las
    farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola,
    al igual que otraFarola también se convertirá en vecina del receptor del mensaje*/
    public void pairWithNeighbor( Farola otraFarola ){
        if (!this.neighbors.contains(otraFarola)){ //pregunto así la op se hace una vez sola
            this.neighbors.add(otraFarola);
            otraFarola.pairWithNeighbor(this);
        }
    }

    /*Retorna sus farolas vecinas*/
    public List<Farola> getNeighbors (){
        return this.neighbors;
    }


    /*Si la farola no está encendida, la enciende y propaga la acción.*/
    public void turnOn(){
        if(!this.on){
            this.on=true;
            this.getNeighbors().stream().forEach(Farola::turnOn);
        }
    }

    /*Si la farola no está apagada, la apaga y propaga la acción.*/
    public void turnOff(){
        if(this.on){
            this.on=false;
            this.getNeighbors().stream().forEach(Farola::turnOff);
        }
    }

    /*Retorna true si la farola está encendida.*/
    public boolean isOn(){
        return this.on;
    }

    /*Retorna true si la farola está apagada.*/
    public boolean isOff(){
        return !this.on;
    }
}
~~~

</details>

### Verifique su solución con las pruebas automatizadas 

Utilice los tests provistos por la cátedra para probar las implementaciones del punto 2.

---------------------

## 🟡 Ejercicio 8 --> Method lookup con Empleados

Sea la jerarquía de Empleado como muestra la figura de la izquierda, cuya implementación de referencia se incluye en la tabla de la derecha. Analice cada uno de los siguientes fragmentos de código dados y resuelva las tareas indicadas abajo.

* Liste todos los métodos, indicando nombre y clase, que son ejecutados como resultado del envío del último mensaje de cada fragmento de código (por ejemplo, (1) método +aportes de la clase Empleado, (2) ...)

* ¿Qué valores tendrán las variables aportesDeAlan y sueldoBasicoDeAlan luego de ejecutar cada fragmento de código?


<details><summary> <code> Respuesta 🖱 </code></summary><br>

Empleado.java

~~~java
public double montoBasico(){
return 35000;}

public double aportes(){
return 13500;}

public double sueldoBasico(){
return this.montoBasico()+this.aportes();}
~~~

EmpleadoJerarquico.java (hereda de Empleado)

~~~java
public double sueldoBasico(){
return super.sueldoBasico()+this.bonoPorCategoria();}

public double montoBasico(){
return 45000;}

public double bonoPorCategoria(){
return 8000;}
~~~

Gerente.java (hereda de EmpleadoJerarquico)

~~~java
public double aportes(){
return this.montoBasico()*0.05;}

public double montoBasico(){
return 57000;}
~~~

Vemos estos dos casos:

* CASO 1

~~~java
Gerente alan = new Gerente("Alan Turing");
double aportesDeAlan = alan.aportes();
~~~

Los **metodos ejecutados** son:

(1) +aportes() de la clase Gerente.

(2) +montoBasico() de la clase Gerente (porque this.montoBasico() llama al método en Gerente).

El **valor de la variable** aportesDeAlan será de 57000*0.05 = 2850

* CASO 2

~~~java
Gerente alan = new Gerente("Alan Turing");
double sueldoBasicoDeAlan = alan.sueldoBasico();
~~~

Los **metodos ejecutados** son:

(1) +sueldoBasico() de la clase EmpleadoJerarquico (como en Gerente no tengo el metodo voy al padre EmpleadoJerarquico y tomo el metodo de ahi).

(2) +sueldoBasico() de la clase Empleado (porque super.sueldoBasico() en EmpleadoJerarquico llama a este método).

(3) +montoBasico() de la clase Empleado (llamado dentro de sueldoBasico() de Empleado).

(4) +aportes() de la clase Empleado (llamado dentro de sueldoBasico() de Empleado).

(5) +bonoPorCategoria() de la clase EmpleadoJerarquico (llamado dentro de sueldoBasico() de EmpleadoJerarquico).

El **valor de la variable** sueldoBasicoDeAlan será de 35000+13500+8000=56500

</details>

---------------------

## 🟡 Ejercicio 9 --> Cuenta con ganchos

Observe con detenimiento el diseño que se muestra en el siguiente diagrama. La clase cuenta es abstracta. El método puedeExtraer() es abstracto. Las clases CajaDeAhorro y CuentaCorriente son concretas y están incompletas.

### Tarea A

Complete la implementación de las clases CajaDeAhorro y CuentaCorriente para que se puedan efectuar depósitos, extracciones y transferencias teniendo en cuenta los siguientes criterios. 

* Las cajas de ahorro solo pueden extraer y transferir cuando cuentan con fondos suficientes. 

* Las extracciones, los depósitos y las transferencias desde cajas de ahorro tienen un costo adicional de 2% del monto en cuestión (téngalo en cuenta antes de permitir una extracción o transferencia desde caja de ahorro).

* Las cuentas corrientes pueden extraer aún cuando el saldo de la cuenta sea insuficiente. Sin embargo, no deben superar cierto límite por debajo del saldo. Dicho límite se conoce como límite de descubierto (algo así como el máximo saldo negativo permitido). Ese límite es diferente para cada cuenta (lo negocia el cliente con la gente del banco). 

* Cuando se abre una cuenta corriente, su límite descubierto es 0 (no olvide definir el constructor por default).

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Cuenta.java

~~~java
package ar.edu.unlp.info.oo1.ejercicio09;

public abstract class Cuenta {
    
    private double saldo; 

    public Cuenta(){
        this.saldo=0;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar (double monto){
        this.saldo+=monto;
    }

    protected void extraerSinControlar(double monto){
        this.saldo-=monto;
    }

    public boolean extraer(double monto){
        if (this.puedeExtraer(monto)){
            this.extraerSinControlar(monto);
            return true;
        }
        return false;
    }

    protected abstract boolean puedeExtraer(double monto);

    public boolean transferirACuenta(double monto, Cuenta cuentaDestino){
        if (this.puedeExtraer(monto)){
            this.extraerSinControlar(monto);
            cuentaDestino.depositar(monto);
            return true;
        }
        return false;
    }
}
~~~

CuentaCorriente.java

~~~java
package ar.edu.unlp.info.oo1.ejercicio09;

public class CuentaCorriente extends Cuenta{
    
    private double descubierto;

    /* Cuando se abre una cuenta corriente, su límite descubierto es 0 
    (no olvide definir el constructor por default) */
    public CuentaCorriente(){
        super();
        this.descubierto=0;
    }

    //metodos
    public double getDescubierto(){
        return this.descubierto;
    }

    public void setDescubierto(double monto){
        this.descubierto=monto;
    }

    /*Las cuentas corrientes pueden extraer aún cuando el saldo de la cuenta sea 
    insuficiente. Sin embargo, no deben superar cierto límite por debajo del saldo. 
    Dicho límite se conoce como límite de descubierto (algo así como el máximo saldo 
    negativo permitido). Ese límite es diferente para cada cuenta (lo negocia el 
    cliente con la gente del banco). */
    @Override
    protected boolean puedeExtraer(double monto){
        return (this.getDescubierto()+this.getSaldo()>=monto);
    }
}
~~~

CajaDeAhorro.java

~~~java
package ar.edu.unlp.info.oo1.ejercicio09;

public class CajaDeAhorro extends Cuenta {

    public CajaDeAhorro(){
        super();
    }

    /** Las cajas de ahorro solo pueden extraer y transferir cuando cuentan con
     * fondos suficientes.  */

    @Override
    protected boolean puedeExtraer(double monto){
        return (this.getSaldo() >= monto);
    }
    
    /*Las extracciones, los depósitos y las transferencias desde cajas de ahorro 
    tienen un costo adicional de 2% del monto en cuestión (téngalo en cuenta antes 
    de permitir una extracción o transferencia desde caja de ahorro). */

    @Override
    public boolean extraer(double monto){
        return super.extraer(monto*1.02);
    }

    @Override
    public void depositar(double monto){
        super.depositar(monto*0.98);
    }

    @Override
    public boolean transferirACuenta(double monto, Cuenta cuentaDestino){
        return super.transferirACuenta(monto*1.02, cuentaDestino);
    }

}
~~~

</details>

### Tarea B 

Reflexione, charle con el ayudante y responda a las siguientes preguntas.

(a) ¿Por qué cree que este ejercicio se llama "Cuenta con ganchos"? 

(b) En las implementaciones de los métodos extraer() y transferirACuenta()  que se ven en el diagrama, ¿quién es this? ¿Puede decir de qué clase es this?

(c) ¿Por qué decidimos que los métodos puedeExtraer() y extraerSinControlar tengan visibilidad "protegido"?

(d) ¿Se puede transferir de una caja de ahorro a una cuenta corriente y viceversa? ¿por qué? ¡Pruébelo!

(e)¿Cómo se declara en Java un método abstracto? ¿Es obligatorio implementarlo? ¿Qué dice el compilador de Java si una subclase no implementa un método abstracto que hereda?

<details><summary> <code> Respuesta 🖱 </code></summary><br>

* (a) El ejercicio se llama "Cuenta con ganchos" porque la clase abstracta <code>Cuenta</code> define una estructura básica y deja puntos de extensión ("ganchos") para que las subclases como <code>CajaDeAhorro</code> y <code>CuentaCorriente</code> implementen su propio comportamiento. En este caso, el "gancho" clave es el método abstracto <code>puedeExtraer()</code>, que debe ser implementado de forma diferente por cada subclase. Este patrón permite una implementación más flexible, donde el comportamiento específico se define en las subclases.

------------------------

* (b) En las implementaciones de los métodos <code>extraer()</code> y <code>transferirACuenta()</code> que se ven en el diagrama, this se refiere a la instancia de la clase actual desde la cual se llama al método. En este caso, this será una instancia concreta de una de las subclases que heredan de la clase abstracta <code>Cuenta</code>, es decir, será una instancia de <code>CajaDeAhorro</code> o <code>CuentaCorriente</code>, dependiendo de cuál esté utilizando el método.

------------------------

* (c) Los métodos <code>puedeExtraer()</code> y <code>extraerSinControlar()</code> tienen visibilidad "protegida" (protected) para que las subclases puedan acceder a ellos y redefinir su comportamiento según la lógica particular de cada tipo de cuenta. Al mismo tiempo, la visibilidad protegida impide que estas funciones sean accesibles desde fuera del paquete o desde otras clases que no hereden de <code>Cuenta</code>, limitando el acceso sólo a las clases relevantes.

------------------------

* (d) Sí, se puede transferir de una <code>CajaDeAhorro</code> a una <code>CuentaCorriente</code> y viceversa, ya que ambas clases heredan de la clase abstracta <code>Cuenta</code>, que tiene el método <code>transferirACuenta()</code> común. Mientras ambas cuentas implementen correctamente los métodos requeridos para controlar extracciones, depósitos y transferencias, no debería haber problemas en la transferencia entre ellas, siempre y cuando las condiciones de cada tipo de cuenta (como el costo adicional en las cajas de ahorro o el límite de descubierto en las cuentas corrientes) sean respetadas.

------------------------

* (e) Un método abstracto se declara utilizando la palabra clave <code>abstract</code> y no tiene cuerpo (no se implementa en la clase abstracta). Es obligatorio que todas las subclases implementen los métodos abstractos que heredan. Si una subclase concreta no implementa un método abstracto heredado, el compilador de Java generará un error, ya que esa subclase debe proporcionar una implementación o declararse también como abstracta.

</details>

### Tarea C

Escriba los tests de unidad que crea necesarios para validar que su implementación funciona adecuadamente.

---------------------

## 🟡 Ejercicio 10 --> Job Scheduler

El JobScheduler es un objeto cuya responsabilidad es determinar qué trabajo debe resolverse a continuación. El siguiente diseño ayuda a entender cómo funciona la implementación actual del JobScheduler.

* El mensaje <code>schedule(job: JobDescription)</code> recibe un job (trabajo) y lo agrega al final de la colección de trabajos pendientes.

* El mensaje <code>next()</code> determina cuál es el siguiente trabajo de la colección que debe ser atendido, lo retorna, y lo quita de la colección.

En la implementación actual del método <code>next()</code>, el JobScheduler utiliza el valor de la variable <code>strategy</code> para determinar cómo elegir el siguiente trabajo. Dicha implementación presenta dos serios problemas de diseño:

1. Secuencia de ifs (o sentencia switch/case) para implementar alternativas de un mismo comportamiento.

2. Código duplicado.

### Tareas

(a) Analice el código existente: utilice el código y los tests provistos por la cátedra y aplique lo aprendido (en particular en relación a herencia y polimorfismo) para eliminar los problemas mencionados. Siéntase libre de agregar nuevas clases como considere necesario. También puede cambiar la forma en la que los objetos se crean e inicializan. Asuma que una vez elegida una estrategia para un scheduler no puede cambiarse.

(b) Verifique su solución con las pruebas automatizadas: sus cambios probablemente hagan que los tests dejen de funcionar. Corríjalos y mejórelos como sea necesario.

---------------------

## 🟡 Ejercicio 11 --> El Inversor

Estamos desarrollando una aplicación móvil para que un inversor pueda conocer el estado de sus inversiones. El sistema permite manejar dos tipos de inversiones: Inversión en acciones e inversión en plazo fijo. Nuestro sistema representa al inversor y a cada uno de los tipos de inversiones con una clase.

* La clase InversionEnAcciones tiene las siguientes variables de instancia:
	
    ~~~
    String nombre;
	int cantidad;
	double valorUnitario;
    ~~~

* La clase PlazoFijo tiene las siguientes variables de instancia:
	
    ~~~
    LocalDate fechaDeConstitucion;
	double montoDepositado;
	double porcentajeDeInteresDiario;
    ~~~

* La clase Inversor tiene las siguientes variables de instancia:
	
    ~~~
    String nombre;
	List<?> inversiones;
    ~~~

La variable inversiones de la clase Inversor es una colección con instancias de cualquiera de las dos clases de inversiones que pueden estar mezcladas.
Cuando se quiere saber cuánto dinero representan las inversiones del inversor, se envía al mismo el mensaje valorActual().

### Tarea: Modele e implemente.

(a) Realice el diagrama UML de clases de la solución al problema.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

![diagramaUML](/practica/cosas/img02.png)

</details>

(b) Implemente en Java lo que considere necesario para que las instancias de Inversor entiendan el mensaje valorActual() teniendo en cuenta los siguientes criterios:

* El valor actual de las inversiones de un inversor es la suma de los valores actuales de cada una de las inversiones en su cartera (su colección de inversiones).  

* El valor actual de un PlazoFijo equivale al montoDepositado incrementado como corresponda por el porcentaje de interés diario, desde la fecha de constitución a la fecha actual (la del momento en el que se hace el cálculo).  

* El valor actual de una InversionEnAcciones se calcula multiplicando el número de acciones por el valor unitario de las mismas.

* Recordatorio: No olvide la inicialización.

### Tarea: Pruebas automatizadas

(c) Implemente los tests (JUnit) que considere necesarios.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Inversor.java

~~~java
package main.java.ar.edu.unlp.info.oo1.ej11_inversor;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
    //variables de instancia
    private String nombre;
	private List<Inversion> inversiones;

    //constructor 
    public Inversor(String nombre){
        this.nombre=nombre;
        this.inversiones = new ArrayList<Inversion>(); 
    }

    //getters
    public String getNombre(){
        return this.nombre;
    }

    public List<Inversion> getInversiones(){
        return this.inversiones;
    }

    //metodos
    public void agregarInversion(Inversion inversion){
        this.getInversiones().add(inversion);
    }

    /*El valor actual de las inversiones de un inversor es la suma de los valores 
    actuales de cada una de las inversiones en su cartera (su colección de 
    inversiones).*/
    public double valorActual(){
        return this.inversiones.stream()
                .mapToDouble(Inversion::valorActual)
                .sum();
    }

    /*Explicacion del metodo
     * this.inversiones.stream():
    Convierte la lista de inversiones (inversiones), que es un ArrayList<Inversion>,
    en un flujo (stream).
     * mapToDouble(Inversion::valorActual):
    Aplica el método valorActual() a cada elemento de la lista (es decir, a cada 
    objeto de tipo Inversion).
     * .sum():
    Suma todos los valores double generados por el paso anterior y devuelve el total.
     */
}
~~~

Inversion.java

~~~java
package main.java.ar.edu.unlp.info.oo1.ej11_inversor;

public interface Inversion {
    /*Si los métodos solo están declarados y no implementan un comportamiento, 
    es interfaz. Si implementan un comportamiento común a todos los hijos, es 
    clase abstracta. */
    public double valorActual();
}
~~~

InversionEnAcciones.java

~~~java
package main.java.ar.edu.unlp.info.oo1.ej11_inversor;

public class InversionEnAcciones implements Inversion{
    //variables de instancia
    private String nombre;
	private int cantidad;
	private double valorUnitario;

    public InversionEnAcciones(String nombre, int cant, double valor){
        this.nombre=nombre;
        this.cantidad=cant;
        this.valorUnitario=valor;
    }

    //getters
    public String getNombre(){
        return this.nombre;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public double getValorUnitario(){
        return this.valorUnitario;
    }

    //metodos
    /*El valor actual de una InversionEnAcciones se calcula multiplicando el 
    número de acciones por el valor unitario de las mismas. */
    @Override
    public double valorActual(){
        return this.getValorUnitario()*this.getCantidad();
    }
}
~~~

CuentaCorriente.java

~~~java
package main.java.ar.edu.unlp.info.oo1.ej11_inversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
    //variables de instancia
    private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;

    //constructor
    public PlazoFijo(LocalDate fecha, double monto, double interes){
        this.fechaDeConstitucion=fecha;
        this.montoDepositado=monto;
        this.porcentajeDeInteresDiario=interes;
    }

    //getters
    public LocalDate getFechaDeConstitucion() {
        return this.fechaDeConstitucion;
    }

    public double getMontoDepositado(){
        return this.montoDepositado;
    }

    public double getPorcentajeDeInteresDiario(){
        return this.porcentajeDeInteresDiario;
    }

    //metodos
    /*El valor actual de un PlazoFijo equivale al montoDepositado incrementado 
    como corresponda por el porcentaje de interés diario, desde la fecha de 
    constitución a la fecha actual (la del momento en el que se hace el cálculo). */
    @Override
    public double valorActual(){
        long cantDias = ChronoUnit.DAYS.between(this.getFechaDeConstitucion(), LocalDate.now());
        return this.getMontoDepositado()+this.getPorcentajeDeInteresDiario()*cantDias;
    }
}
~~~
</details>

---------------------

## 🟡 Ejercicio 12 --> Volumen y superficie de sólidos

Una empresa siderúrgica quiere introducir en su sistema de gestión nuevos cálculos de volumen y superficie exterior para las piezas que produce. El volumen le sirve para determinar cuánto material ha utilizado. La superficie exterior le sirve para determinar la cantidad de pintura que utilizó para pintar las piezas.

El siguiente diagrama UML muestra el diseño actual del sistema. En el mismo puede observarse que un ReporteDeConstruccion tiene la lista de las piezas que fueron construidas. Pieza es una clase abstracta.

![uml](/practica/cosas/img03.png)

### Tareas:

a) Complete el diseño e implemente: Su tarea es completar el diseño e implementarlo siguiendo las especificaciones que se exponen a continuación:

~~~java
getVolumenDeMaterial(nombreDeMaterial: String)
    /*Recibe como parámetro un nombre de material (un string, por ejemplo 'Hierro').
    Retorna la suma de los volúmenes de todas las piezas hechas en ese material*/

getSuperficieDeColor(unNombreDeColor: String)
    /*Recibe como parámetro un color (un string, por ejemplo 'Rojo'). Retorna la suma de
    las superficies externas de todas las piezas pintadas con ese color.*/
~~~ 

b) Pruebas automatizadas: Implemente los tests (JUnit) que considere necesarios.

c) Discuta con el ayudante: Es probable que note una similitud entre este ejercicio y el de "Figuras y cuerpos" que realizó anteriormente, ya que en ambos se pueden construir cilindros y prismas rectangulares. Sin embargo las implementaciones varían. Enumere las diferencias y similitudes entre ambos ejercicios y luego consulte con el ayudante.

Respuesta <code>[AQUI](/practica/ejercicio12/src/main/java/ar/edu/unlp/info/oo1/ej12_volumen/)</code>

---------------------

## 🟡 Ejercicio 13 --> Cliente de Correo

El diagrama de clases de UML que se muestra a continuación documenta parte del diseño simplificado de un cliente de correo electrónico.

![uml](/practica/cosas/img04.png)

### Tareas:

a) Modele e implemente

* Complete el diseño y el diagrama de clases UML.

* Implemente en Java de la funcionalidad requerida.

b) Pruebas automatizadas

* Diseñe los casos de prueba teniendo en cuenta los conceptos de valores de borde y particiones equivalentes vistos en la teoría.

* Implemente utilizando JUnit los tests automatizados diseñados en el punto anterior.

Respuesta <code>[AQUI](/practica/ejercicio13/src/main/java/ar/edu/unlp/info/oo1/ej13_correo/)</code>

---------------------

## 🟡 Ejercicio 14 --> Intervalo de tiempo

En Java, las fechas se representan normalmente con instancias de la clase java.time.LocalDate. Se pueden crear con varios métodos "static" como por ejemplo LocalDate.now().

* Investigue cómo hacer para crear una fecha determinada, por ejemplo 15/09/1972. 

<details><summary> <code> Respuesta 🖱 </code></summary><br>

~~~java
/*Para crear una fecha específica, se puede usar el método estático LocalDate.of(), pasando 
 *año, mes y día como parámetros*/
LocalDate fecha = LocalDate.of(1972, 9, 15);
~~~

</details>

* Investigue cómo hacer para determinar si la fecha de hoy se encuentra entre las fechas 15/12/1972 y 15/12/2032. Sugerencia: vea los métodos permiten comparar LocalDates y que retornan booleans.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

~~~java
/*Para comparar fechas, se pueden usar los métodos isBefore(), isAfter(), y isEqual()*/

//Fechas inicio y fin
LocalDate inicio = LocalDate.of(1972, 12, 15);
LocalDate fin = LocalDate.of(2032, 12, 15);

//Fecha actual
LocalDate fechaActual = LocalDate.now();

//Verificar si fecha actual se encuentra entre el intervalo dado
Boolean esta = (fechaActual.isAfter(inicio) && fechaActual.isBefore(fin));
~~~

</details>

* Investigue cómo hacer para calcular el número de días entre dos fechas. Lo mismo para el número de meses y de años Sugerencia: vea el método until.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

~~~java
/*El método until() de LocalDate permite calcular la diferencia entre dos fechas. Para obtener la
 *diferencia en días, meses o años, se puede usar este método junto con las unidades adecuadas de 
 *la clase java.time.temporal.ChronoUnit.*/

//Fechas
LocalDate fechaUno = LocalDate.of(1972, 12, 15);
LocalDate fechaDos = LocalDate.now();

// Calcular la diferencia en días
long dias = fechaUno.until(fechaDos, ChronoUnit.DAYS);


// Calcular la diferencia en meses
long meses = fechaUno.until(fechaDos, ChronoUnit.MONTHS);


// Calcular la diferencia en años
long años = fechaUno.until(fechaDos, ChronoUnit.YEARS);
~~~

</details>

Tenga en cuenta que los métodos de LocalDate colaboran con otros objetos que están definidos a partir de enums, clases e interfaces de java.time; por ejemplo java.time.temporal.ChronoUnit.DAYS

### Tareas:

(a) Implemente la clase DateLapse (Lapso de tiempo). Un objeto DateLapse representa el lapso de tiempo entre dos fechas determinadas. La primera fecha se conoce como “from” y la segunda como “to”. Una instancia de esta clase entiende los mensajes:

~~~java
public LocalDate getFrom() //Retorna la fecha de inicio del rango
public LocalDate getTo() //Retorna la fecha de fin del rango
public int sizeInDays() //retorna la cantidad de días entre la fecha 'from' y la fecha 'to'
public boolean includesDate(LocalDate other) //recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.
~~~

<details><summary> <code> Respuesta 🖱 </code></summary><br>

~~~java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
    
    //variables de instancia
    private LocalDate from; //fecha de inicio del rango
    private LocalDate to;   //fecha de fin del rango

    //constructor
    public DateLapse(LocalDate from, LocalDate to){
        this.from=from;
        this.to=to;
    }

    //metodos
    public LocalDate getFrom() {    //Retorna la fecha de inicio del rango
        return this.from;
    }

    public LocalDate getTo() {      //Retorna la fecha de fin del rango
        return this.to;
    }

    public int sizeInDays() {       //retorna cantidad de días entre las fechas 'from' y 'to'
        return (int) getFrom().until(getTo(), ChronoUnit.DAYS);
    }

    public boolean includesDate(LocalDate other) { //recibe un objeto LocalDate y retorna T/F si esta en el intervalo de tiempo
        return (other.isAfter(getFrom()) && other.isBefore(getTo()));
        /*No incluye los bordes, si los quiero incluir hago -->
        * return ((other.isAfter(getFrom())||other.isEqual(getFrom())) && (other.isBefore(getTo())||other.isEqual(getTo())));
        */
    }
}
~~~

</details>

b) Pruebas automatizadas

Diseñe los casos de prueba teniendo en cuenta los conceptos de valores de borde y particiones equivalentes vistos en la teoría.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Casos de prueba para Clase --> DateLapse

Método --> includesDate(LocalDate other) 

Casos (No incluyendo los bordes en la función)

1. La fecha pasada como parámetro se encuentra dentro del intervalo de tiempo determinado por From y To. --> En este caso retornaría TRUE

2. La fecha pasada como parámetro NO se encuentra dentro del intervalo de tiempo determinado por From y To. --> En este caso retornaría FALSE

3. La fecha pasada como parámetro es igual a la fecha From. --> En este caso retornaría FALSE

4. La fecha pasada como parámetro es igual a la fecha To. --> En este caso retornaría FALSE

</details>

Implemente utilizando JUnit los tests automatizados diseñados en el punto anterior

<details><summary> <code> Respuesta 🖱 </code></summary><br>

~~~java
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class DateLapseTest {

    // Test para verificar si la fecha está dentro del intervalo
    @Test
    public void testEstaEnIntervalo() {

        // Crear un rango de fechas
        DateLapse dateLapse = new DateLapse(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 12, 31));

        // Fecha dentro del intervalo
        LocalDate testDate = LocalDate.of(2020, 6, 15);

        // Verificar que la fecha está dentro del intervalo
        assertTrue(dateLapse.includesDate(testDate), "La fecha debe estar dentro del intervalo.");
    }

    // Test para verificar si la fecha está fuera del intervalo
    @Test
    public void testNOEstaEnIntervalo() {
        // Crear un rango de fechas
        DateLapse dateLapse = new DateLapse(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 12, 31));

        // Fecha fuera del intervalo
        LocalDate testDate = LocalDate.of(2021, 1, 1);

        // Verificar que la fecha no está dentro del intervalo
        assertFalse(dateLapse.includesDate(testDate), "La fecha no debe estar dentro del intervalo.");
    }

    // Test para verificar si la fecha es igual a 'From' (No inclusiva)
    @Test
    public void testBordeFrom() {
        // Crear un rango de fechas
        DateLapse dateLapse = new DateLapse(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 12, 31));

        // Fecha igual a la fecha 'From'
        LocalDate testDate = LocalDate.of(2020, 1, 1);

        // Verificar que la fecha no está dentro del intervalo (ya que 'From' no es inclusivo)
        assertFalse(dateLapse.includesDate(testDate), "La fecha no debe estar dentro del intervalo.");
    }

    // Test para verificar si la fecha es igual a 'To' (No inclusiva)
    @Test
    public void testBordeTo() {
        // Crear un rango de fechas
        DateLapse dateLapse = new DateLapse(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 12, 31));

        // Fecha igual a la fecha 'To'
        LocalDate testDate = LocalDate.of(2020, 12, 31);

        // Verificar que la fecha no está dentro del intervalo (ya que 'To' no es inclusivo)
        assertFalse(dateLapse.includesDate(testDate), "La fecha no debe estar dentro del intervalo.");
    }
}
~~~

</details>

### Ejercicio 14b) Intervalo de tiempo

Asumiendo que implementó la clase DateLapse con dos variables de instancia “from” y “to”, realice otra implementación de la clase para que su representación sea a través de los atributos “from” y “sizeInDays” y coloquela en otro paquete. Es decir, debe basar su nueva implementación en estas variables de instancia solamente.

Sugerencia: Considere definir una interfaz Java para que ambas soluciones la implementen.

Los cambios en la estructura interna de un objeto sólo deben afectar a la implementación de sus métodos. Estos cambios deben ser transparentes para quien le envía mensajes, no debe notar ningún cambio y seguir usándolo de la misma forma. Tenga en cuenta que los tests que implementó en el ejercicio anterior deberían pasar sin que se requiera realizar modificaciones.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

~~~java
import java.time.LocalDate;

public class DateLapseSize implements DateLapseInterfaz {
    
    //variables de instancia
    private LocalDate from;     //fecha de inicio del rango
    private int sizeInDays;     //diferencia de días

    //atributos
    public DateLapseSize (LocalDate from, int size){
        this.from=from;
        this.sizeInDays=size;
    }

    //metodos
    public LocalDate getFrom(){     // Retorna la fecha de inicio
        return this.from;
    }

    public int sizeInDays(){       // Retorna cantidad días entre las fechas 'from' y 'to'
        return this.sizeInDays;
    }

    public boolean includesDate(LocalDate other){ // Verifica si la fecha está dentro del intervalo
        LocalDate to = this.getFrom().plusDays(this.sizeInDays());
        return (other.isAfter(getFrom()) && other.isBefore(to));
    }

}
~~~
</details>

---------------------
