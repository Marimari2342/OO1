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

## 🟡 Ejercicio 15 --> Distribuidora Eléctrica

Una distribuidora eléctrica desea gestionar los consumos de sus usuarios para la emisión de facturas de cobro. De cada usuario se conoce su nombre y domicilio. Se considera que cada usuario sólo puede tener un único domicilio en donde se registran los consumos.

Los consumos de los usuarios se dividen en dos componentes:

* Consumo de energía activa: tiene un costo asociado para el usuario. Se mide en kWh (kilowatt/hora).

* Consumo de energía reactiva: no genera ningún costo para el usuario, es decir, se utiliza solamente para determinar si hay alguna bonificación. Se mide en kVArh ( kilo voltio-amperio reactivo hora).

Se cuenta con un cuadro tarifario que establece el precio del kWh para calcular el costo del consumo de energía activa. Este cuadro tarifario puede ser ajustado periódicamente según sea necesario (por ejemplo, para reflejar cambios en los costos).

Para emitir la factura de un cliente se tiene en cuenta solo su último consumo registrado. Los datos que debe contener la factura son los siguientes:

* El usuario a quien se está cobrando.

* La fecha de emisión.

* La bonificación, sí aplica.

* El monto final de la factura: se calcula restando la bonificación al costo del consumo:

* (a) El costo del consumo se calcula multiplicando el consumo de energía activa por el precio del kWh proporcionado por el cuadro tarifario.

* (b) Se calcula su factor de potencia para determinar si hay alguna bonificación aplicable. Si el factor de potencia estimado (fpe) del último consumo del usuario es mayor a 0.8, el usuario recibe una bonificación del 10%.

El factor de potencia estimado se calcula de acuerdo a la siguiente fórmula:

~~~java
double fpe = enAct / (Math.sqrt( Math.pow(enAct,2) + Math.pow(enReac,2) ));
~~~

### Tareas:

a. Analice el problema: realice el modelo de dominio detallando, cuando sea posible, para cada clase conceptual identificada:

* La categoría correspondiente a la clase

* Los atributos candidatos de la clase

* Las asociaciones entre las clases conceptuales

b. Modele e implemente

* Realice el diagrama de clases UML para su solución

<details><summary> <code> Respuesta 🖱 </code></summary><br>

![umlpunto15](/practica/ejercicio15/uml.jpg)

</details>

* Implemente en Java de la funcionalidad requerida.

Respuesta <code>[AQUI](/practica/ejercicio15/src/main/java/ar/edu/unlp/info/oo1/ej15_distribuidora/)</code>

c. Pruebas automatizadas: implemente tests automatizados utilizando JUnit para verificar su solución.

---------------------

## 🟡 Ejercicio 16 --> Filtered Set

En la teoría de colecciones se explicaron algunos tipos de colecciones; en particular, el Set (java.util.Set) es una colección que no admite duplicados y no tiene índice para sus elementos.

Implemente una clase EvenNumberSet (conjunto de números pares). Esta clase se comporta casi exactamente igual a Set, con la diferencia que únicamente permite agregar números enteros que sean pares. Por simplicidad, considere únicamente el tipo de datos Integer para su solución (ignore el resto de tipos de datos numéricos). Tenga en cuenta que la clase EvenNumberSet debe implementar la interface Set</E/> de Java. Esto significa que a las variables de tipo Set</Integer/> se les puede asignar un objeto concreto de tipo EvenNumberSet y luego utilizarlo enviando los mensajes que están
definidos en el protocolo de Set</E/>.

El siguiente fragmento de código ejemplifica cómo se podría usar la clase EvenNumberSet:

~~~java
Set<Integer> numbers = new EvenNumberSet();
// inicialmente el Set está vacío => []
numbers.add(1); // No es par, entonces no se agrega => []
numbers.add(2); // Es par, se agrega al set => [2]
numbers.add(4); // Es par, se agrega al set => [2, 4]
numbers.add(2); // Es par, pero ya está en el set, no se agrega => [2, 4]
~~~

Evalúe las distintas opciones para implementar la clase EvenNumberSet. Para evitar reinventar la rueda, considere reutilizar alguna de las clases existentes en Java que ofrezcan funcionalidades similares.

### Tareas:

a. Investigue qué clases se pueden utilizar para implementar la clase EvenNumberSet. Consulte la documentación de Set.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

En Java, la interfaz Set es parte del paquete java.util y tiene varias implementaciones comunes:

**HashSet:** Una implementación de Set basada en una tabla hash. No mantiene el orden de los elementos y no permite duplicados.

**LinkedHashSet:** Similar a HashSet, pero mantiene el orden de inserción.

**TreeSet:** Una implementación de Set que mantiene los elementos en orden ascendente.

Dado que la clase EvenNumberSet debe comportarse como un Set<Integer>, lo más sencillo es extender alguna de las implementaciones existentes de Set, como HashSet. De esta forma, aprovechamos las funcionalidades estándar de Set y añadimos la validación para asegurarnos de que solo se agreguen números pares.

</details>

b. Explique brevemente cómo propone utilizar las clases investigadas anteriormente para implementar su solución. Por ejemplo:

* “Se debe subclasificar una determinada clase y redefinir un método para que haga lo siguiente”.

* “Se debe crear una nueva clase que contenga un objeto de un determinado tipo al cual se le delegará está responsabilidad”.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

La idea es subclasificar HashSet y sobrecargar el método add(). De esta forma, delegamos las funcionalidades generales del conjunto (como verificar duplicados) a HashSet, pero nos aseguramos de que solo se puedan agregar números enteros que sean pares. Si un número es impar, lo ignoramos.

Pasos:

Herencia: Nuestra clase va a heredar de HashSet<Integer>, ya que esta clase proporciona la funcionalidad de conjunto sin duplicados.

Sobrecarga de add(): En lugar de agregar directamente un número al conjunto, primero verificamos si el número es par.

Delegación: Si el número es par, delegamos el comportamiento de agregarlo al HashSet.

</details>

c. Implemente en Java las alternativas que haya propuesto.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

~~~java
import java.util.HashSet;

public class EvenNumberSet extends HashSet<Integer>{
    
    /*variables de instancia y constructor --> Ya los tengo en HashSet, no necesito ponerlos acá*/
    
    //metodos
    /*Sobrecarga de add(): En lugar de agregar directamente un número al conjunto, primero 
    verificamos si el número es par.*/
    public boolean add(Integer num){
        return (int)num % 2 == 0 ? super.add(num): false;
    }
}
~~~

</details>

d. Implemente tests automatizados utilizando JUnit para verificar sus implementaciones.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

~~~java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenNumberSetTest {

    @Test
    public void testAgregarNumeroPar() {
        Set<Integer> numbers = new EvenNumberSet();
        assertTrue(numbers.add(2), "El número par debe ser agregado");
        assertFalse(numbers.add(2), "El número par duplicado no debe ser agregado");
    }

    @Test
    public void testAgregarNumeroImpar() {
        Set<Integer> numbers = new EvenNumberSet();
        assertFalse(numbers.add(1), "El número impar no debe ser agregado");
    }
}
~~~

</details>

e. Compare las soluciones y liste las ventajas y desventajas de cada una.

---------------------

## 🟡 Ejercicio 17. Alquiler de propiedades

Se desea diseñar e implementar una plataforma para gestión de reservas de propiedades que llamaremos OOBnB. En la misma, los usuarios pueden gestionar sus inmuebles para su alquiler así como también realizar reservas sobre estos.

De los usuarios se conoce el nombre, la dirección y el DNI. Cada usuario posee propiedades que desea alquilar, de las cuales se guarda la dirección, un nombre descriptivo y el precio que se desea cobrar por noche. Además, los usuarios pueden realizar reservas sobre cualquiera de las propiedades disponibles.

Nos piden implementar la siguiente funcionalidad:

- Consultar la disponibilidad de una propiedad en un período específico: dada una propiedad, una fecha inicial y una fecha final, se debe determinar si la propiedad está disponible el período indicado.

- Crear una reserva: Un usuario puede realizar una reserva para un período de tiempo determinado. Si la propiedad está disponible, se crea la reserva y la propiedad pasa a estar ocupada durante ese período. Si no lo está, la reserva no será creada.

- Calcular el precio de una reserva: Dada una reserva, se debe poder calcular su precio. El mismo se obtiene multiplicando la cantidad de noches por el precio por noche.

- Cancelar una reserva: Se debe permitir cancelar una reserva. En este caso, la propiedad pasa a estar disponible durante el período de tiempo indicado en la reserva. Esta operación sólo es permitida si el período de la reserva no está en curso.

- Calcular los ingresos de un propietario: Se debe calcular la retribución a un propietario, la cual es el 75% de la suma de precio totales de las reservas incluidas en un período específico de tiempo.

Notas sobre el diseño e implementación:

Para el manejo de los períodos de reserva se sugiere añadir un nuevo método a la interfaz DateLapse definida en el ejercicio anterior (ejercicio de Intervalos de tiempo).

A modo de sugerencia, la especificación del mismo puede ser la siguiente:

~~~java
/**
Retorna true si el período de tiempo del receptor se superpone con el
recibido por parámetro
**/
public boolean overlaps (anotherDateLapse: DateLapse)
~~~

Tareas:
1. Realice el diagrama del modelo conceptual.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

### Entidades:

* Usuario: Representa a la persona que gestiona propiedades o realiza reservas.

* Propiedad: Es un inmueble que está disponible para alquilar.

* Reserva: Es el acto de un usuario reservando una propiedad durante un período específico.

* DateLapse: Representa las fechas asociadas a las reservas.

### Relaciones:

* Un Usuario puede tener muchas Propiedades.

* Un Usuario puede hacer muchas Reservas sobre diferentes Propiedades.

* Una Propiedad puede tener muchas Reservas asociadas.

* Una Reserva tiene una Fecha de inicio y una Fecha de fin.

### Modelo conceptual:

~~~
Usuario ----> Propiedad
                   |
                   V
               Reserva
~~~

</details>

2. Realice el diagrama de clases UML

<details><summary> <code> Respuesta 🖱 </code></summary><br>

![umlpunto17](/practica/ejercicio17/uml17.jpg)

</details>

3. Implemente en Java de la funcionalidad requerida.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Respuesta <code>[AQUI](/practica/ejercicio17y18/src/main/java/ar/edu/unlp/info/oo1/Ejercicio17/)</code>

</details>

4. Implemente en JUnit pruebas automatizadas en donde:

* Se muestre cómo verificar la disponibilidad de una fecha para una propiedad que no tenga reservas en ese período.

* Se muestre cómo verificar la disponibilidad de una fecha para una propiedad en la que haya reservas en ese período.

* Se muestre cómo se reserva una propiedad para un período en particular.

* Se muestre cómo cancelar una reserva creada.

<details><summary> <code> Respuesta 🖱 </code></summary><br>
</details>

---------------------

## 🟡 Ejercicio 18. Políticas de cancelación

A la implementación del ejercicio anterior se quiere extender la funcionalidad de cancelar una reserva de manera tal que calcule el monto que será reembolsado (devuelto) al inquilino. Para hacer esto posible, las propiedades deben conocer una política de cancelación que se define al momento de crearla. Esta política puede ser una de las siguientes: flexible, moderada, o estricta y puede cambiarse en cualquier momento.

Al momento de reembolsar, las políticas se comportan de la siguiente manera:

* a) Política de cancelación flexible: reembolsa el monto total sin importar la fecha de cancelación (que de todas maneras debe ser anterior a la fecha de inicio de la reserva).

* b) Política de cancelación moderada: reembolsa el monto total si la cancelación se hace hasta una semana antes y 50% si se hace hasta 2 días antes.

* c) Política de cancelación estricta: no reembolsará nada (0, cero) sin importar la fecha tentativa de cancelación.

Actualice su diseño, implementación y tests de acuerdo a los nuevos requerimientos.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

### UML completo (Ejercicios 17 y 18)

![uml17y18](/practica/ejercicio17y18/uml17y18.jpg)

Uso una interfaz y tres clases que la implementan

### Interfaz Cancelacion 
~~~java
public interface Cancelacion {

    //metodos
    double reembolso(Reserva reserva);
}
~~~

### Clase CancelacionFlexible
~~~java
import java.time.LocalDate;

public class CancelacionFlexible implements Cancelacion {
    
    //metodos
    public double reembolso(Reserva reserva){
        return reserva.getFecha().includesDate(LocalDate.now()) ? 0: reserva.calcularPrecio();
    }
}
~~~

### Clase CancelacionModerada
~~~java
import java.time.LocalDate;

public class CancelacionModerada implements Cancelacion {
    
    //metodos
    public double reembolso(Reserva reserva){
        int cant=reserva.getFecha().diasQueFaltan(LocalDate.now());
        if (reserva.getFecha().includesDate(LocalDate.now())||cant<2){
            return 0;
        }
        return cant>=7 ? reserva.calcularPrecio(): reserva.calcularPrecio()*0.5;
    }
}
~~~

### Clase CancelacionEstricta
~~~java
public class CancelacionEstricta implements Cancelacion {
 
    //metodos
    public double reembolso(Reserva reserva){
        return 0;
    }
}
~~~

Además agrego un nuevo método a la **Clase DateLapse**
~~~java
public int diasQueFaltan(LocalDate dia){
    return (int) dia.until(getFrom(), ChronoUnit.DAYS);
}
~~~

Y agrego la Politica de Cancelación como variable de instancia en la **Clase Propiedad**, y la defino en el constructor.

Ejercicio completo <code>[AQUI](/practica/ejercicio17y18/src/main/java/ar/edu/unlp/info/oo1/Ejercicio17/)</code>

</details>

---------------------

## 🟡 Ejercicio 19. Servicio de envíos de paquetes
Una empresa de envíos de paquetes ofrece a sus clientes distintos servicios, como envíos locales, interurbanos e internacionales. Los envíos locales son envíos dentro de la misma ciudad y cuentan con una opción de entrega rápida. Los envíos interurbanos son envíos entre ciudades. Los envíos internacionales son envíos a destinos fuera del país.

De cada envío se registra la fecha en la cual se realiza el despacho, la dirección de origen, la dirección de destino y el peso expresado en gramos. Para los interurbanos además, la distancia expresada en km.

La empresa trabaja con dos tipos de clientes: personas físicas, que son individuos, y clientes corporativos, empresas que tienen un volumen alto de envíos. De las personas físicas, se conoce el nombre, dirección y DNI. De los clientes corporativos se conoce nombre de la empresa, dirección y CUIT.

Nos piden implementar la siguiente funcionalidad:

* Agregar un envío para un cliente: dado un cliente y un envío, se agrega ese envío al cliente indicado.

* Monto a pagar por los envíos realizados dentro de un período. Se indica el cliente para el cual se quiere calcular el monto y las fechas de inicio y fin del período a considerar. Para calcular el monto total a pagar, se suma el costo de todos los envíos despachados durante el período especificado.

 1. Los envíos locales tienen un costo fijo de $1000 para las entregas estándar y $500 adicional por entrega rápida.

 2. Los envíos interurbanos tienen un costo que depende de la distancia entre el origen y el destino (utilice $20 para menos de 100 km por cada gramo de peso, $25 para distancias entre 100 km y 500 km por gramo de peso, y $30 para distancias de más de 500 km por gramo de peso).

 3. Los envíos internacionales tienen un costo que depende del país destino y del peso del paquete. Por ahora, utilice $5000 para cualquier destino y $10 por gramo de peso para envíos de hasta 1 kg y $12 para envíos de más de 1 kg.

Los envíos efectuados por personas físicas tienen un 10% de descuento.

### Tareas:

a. Modele e implemente

* Diagrama de clases UML.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

![uml19](/practica/ejercicio19/ejercicio19.jpg)

</details>

* Implemente en Java la funcionalidad requerida.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Ejercicio completo <code>[AQUI](/practica/ejercicio19/src/main/java/ar/edu/unlp/info/oo1/ejercicio19/)</code>

</details>

b. Pruebas automatizadas

* Diseñe los casos de prueba teniendo en cuenta los conceptos de valores de borde y particiones equivalentes vistos en la teoría.

<details><summary> <code> Respuesta 🖱 </code></summary><br>

Clase: EnvioInternacional

Metodo: precioEnvio

Casos: 

* 1. El peso del envío es menor o igual a 1kg. En este caso se cobra $5000 + $10 * gramo de peso por el envío.

* 2. El peso del envío es mayor a 1kg. En este caso se cobra $5000 + $12 * gramo de peso por el envío.

---------------------

Clase: EnvioInterurbano

Metodo: precioEnvio

Casos: 

* 1. La distancia entre origen y destino del envío es < 100km. En este caso se cobra $20 * gramo de peso por el envío.

* 2. La distancia entre origen y destino del envío es >= 100km y <= 500km. En este caso se cobra de peso $25 * gramo por el envío.

* 3. La distancia entre origen y destino del envío es > 500km. En este caso se cobra $30 * gramo de peso por el envío.

---------------------

Clase: EnvioLocal

Metodo: precioEnvio

Casos: 

* 1. El envío es con entrega estandar. En este caso se cobra $1000 el envío.

* 2. El envío es con entrega rápida. En este caso se cobra $1000 + $500 adicionales el envío.

---------------------

</details>

* Implemente utilizando JUnit los tests automatizados diseñados en el punto anterior.

c) Es probable que los montos utilizados para los cálculos le hayan quedado fijos dentro del código (hardcoded). Piense qué pasaría si al calcular el monto a pagar se proveyera (como un parámetro más) el "cuadro tarifario". ¿Cómo sería ese objeto? ¿Qué responsabilidad le podría delegar? ¿Cómo haríamos para tener montos diferentes para los distintos países en los envíos internacionales según los pesos de los envíos?

---------------------

## 🟡 Ejercicio 20. Liquidación de haberes

Estamos desarrollando una aplicación para realizar la liquidación de haberes de los empleados de una empresa. De estos se conoce nombre, apellido, CUIL, fecha de nacimiento, si tiene hijos a cargo y los contratos de trabajo que tiene con la empresa. Los contratos de los empleados tienen la fecha de inicio del contrato, la fecha de fin (si corresponde) y algunos valores adicionales dependiendo del tipo de contrato. Hay dos tipos de contratos:

1. Si el contrato es "por horas", se indica el valor-hora acordado, y el número de horas que trabajará por mes. También se indica la fecha de fin del contrato.

2. Si el contrato es "de planta", se indica el sueldo mensual acordado, el monto acordado por tener cónyuge a cargo, y el monto acordado por tener hijos a cargo. Estos contratos no tienen fecha de fin (nunca se vencen).

Pueden existir varios contratos para un mismo empleado; sin embargo, un empleado solo puede tener un único contrato activo (no vencido) a la vez. El contrato activo para el caso de contrato “de planta” es el único contrato vigente. Para un contrato “por horas”, se considera activo aquel cuya fecha de fin sea posterior a la fecha actual.

Nos piden implementar:

* Generar recibo de sueldo para un empleado: Para generar el recibo de sueldo de un empleado se tiene en cuenta solo su contrato vigente. El recibo de sueldo debe contener la siguiente información: el nombre, apellido, CUIL y antigüedad en la empresa del empleado al que pertenece el recibo; la fecha en la que fue generado el recibo; y el monto total que le corresponde cobrar al empleado según el contrato vigente.

El monto se calcula en dos pasos, el sueldo básico y un adicional por antigüedad. El básico se calcula de la siguiente forma:

1. Si su contrato es por horas fijas, el monto a cobrar es el valor-hora acordado multiplicado por el número de horas que trabaja por mes.

2. Si su contrato es de planta, el monto a cobrar es el sueldo mensual acordado, más el monto acordado por tener cónyuge a cargo (si es que tiene cónyuge a cargo), más el monto acordado por tener hijos a cargo (si es que tiene hijos a cargo).

El adicional por antigüedad se calcula como un porcentaje del básico. La política de la empresa determina que el porcentaje se aumente automáticamente cuando se alcanza cierta antigüedad, en función de esta escala: 5 años 30%, 10 años 50%, 15 años 70%, 20 años 100%. Tenga en cuenta que la antigüedad de un empleado se calcula como la suma de las duraciones de cada uno de los contratos registrados.

### Tareas:

a) Modele e implemente

* Diagrama de clases UML.

* Implementación en Java la funcionalidad requerida.

b) Pruebas automatizadas

* Diseñe los casos de prueba teniendo en cuenta los conceptos de valores de borde y particiones equivalentes vistos en la teoría.

* Implemente utilizando JUnit los tests automatizados diseñados en el punto anterior.

Ejercicio completo <code>[AQUI](/practica/ejercicio20/src/main/java/ar/edu/unlp/info/oo1/ejercicio20/)</code>

---------------------