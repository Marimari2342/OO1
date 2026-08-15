# Criterios y heurísticas: 
## Ejercicios con mala implementación para corregir

### 🟢 Ejercicio chatgpt (redictado 2026)

<details><summary> <code> Código a corregir 🖱 </code></summary><br>
  
~~~java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Inversion {
  public enum TipoDeInversion {ACCIONES, PLAZO_FIJO}
  public TipoDeInversion tipoDeInversion; 
  public String nombre; 
  public int cantidad;
  public double valorUnitario; 
  public LocalDate fechaDeConstitucion; 
  public double montoDepositado; 
  public double porcentajeDeInteresDiario; 
  
  public Inversion(String nombre, int cantidad, double valorUnitario) { 
    this.tipoDeInversion = TipoDeInversion.ACCIONES; 
    this.nombre = nombre; 
    this.cantidad = cantidad; 
    this.valorUnitario = valorUnitario; 
  } 
    
  public Inversion(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) { 
    this.tipoDeInversion = TipoDeInversion.PLAZO_FIJO; 
    this.fechaDeConstitucion = fechaDeConstitucion; 
    this.montoDepositado = montoDepositado; 
    this.porcentajeDeInteresDiario = porcentajeDeInteresDiario; 
  }
}

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Inversor {
  private String nombre; 
  private List<Inversion> inversiones; 
  
  public Inversor(String nombre) { 
    this.nombre = nombre; 
    this.inversiones = new ArrayList<>(); 
  } 
  
  public void agregarInversion(Inversion inversion) { 
    inversiones.add(inversion);
  }

  public double valorActual() {
    double valorActual = 0.0; 
    for (Inversion inversion : inversiones) { 
      valorActual += this.valorActual(inversion); 
    } 
    return valorActual; 
  } 
  
  private double valorActual(Inversion inversion) { 
    double valorActual = 0.0; 
    switch (inversion.tipoDeInversion) { 
      case ACCIONES: 
        valorActual = inversion.cantidad * inversion.valorUnitario; 
        break; 
      case PLAZO_FIJO: 
        LocalDate fechaActual = LocalDate.now(); 
        long dias = ChronoUnit.DAYS.between(inversion.fechaDeConstitucion, fechaActual); 
        double intereses = inversion.montoDepositado * inversion.porcentajeDeInteresDiario * dias; 
        valorActual = inversion.montoDepositado + intereses; 
        break; 
    } 
    return valorActual;
  }
~~~

</details>

### Problemas en la solución

* **CLASE DE DATOS O ANÉMICA**: la clase Inversión no presenta comportamiento, es una clase anémica (sólo tiene variables de instancia y los constructores, pero no presenta ningún método).

<details><summary> <code> Problema 🖱 </code></summary><br>

~~~java
class Inversion {
  //variables de instancia
  //constructores
}
~~~

</details>

**Solución**: asegurarse que no hay comportamiento que debería estar haciendo esta clase y lo está haciendo algún otro objeto (que mostraría envidia de atrubutos).

* **ROMPER ENCAPSULAMIENTO**: como las variables son de tipo públicas, se rompe el encapsulamiento porque puedo acceder a las mismas desde otras clases.

<details><summary> <code> Problema 🖱 </code></summary><br>

~~~java
  public TipoDeInversion tipoDeInversion; 
  public String nombre; 
  public int cantidad;
  public double valorUnitario; 
  public LocalDate fechaDeConstitucion; 
  public double montoDepositado; 
  public double porcentajeDeInteresDiario;
~~~

</details>

**Solución**: poner las variables de instancia como privadas (o protegidas), y evitar usar getters y setters porque si (aunque en este caso el que se rompa el encapsulamiento no se debe a eso).

* **VARIABLES DE INSTANCIA QUE DEBERÍAN SER TEMPORALES O NO CORRESPONDEN**: esto se debe a que al tener la clase definida así, hay variables que no se usan (por ejemplo si es de tipo ACCIONES no uso montoDepositado porque es una variable que corresponde al tipo PLAZO_FIJO).

<details><summary> <code> Problema 🖱 </code></summary><br>

~~~java
  public TipoDeInversion tipoDeInversion; 
  public String nombre; 
  public int cantidad;
  public double valorUnitario; 
  public LocalDate fechaDeConstitucion; 
  public double montoDepositado; 
  public double porcentajeDeInteresDiario;
~~~

</details>

**Solución**: se soluciona usando herencia + polimorfismo. Tengo que hacer dos clases: PlazoFijo y Acciones que hereden de Inversion, cada una de estas clases tendrá sus propias variables y así evito declarar variables que no siempre voy a usar.

* **ENVIDIA DE ATRIBUTOS**: Inversor esta entrando a Inversión y usando todos sus atributos para hacer los cálculos.

<details><summary> <code> Problema 🖱 </code></summary><br>

~~~java
//dentro de un método de la clase Inversor tengo:
valorActual = inversion.cantidad * inversion.valorUnitario; 
long dias = ChronoUnit.DAYS.between(inversion.fechaDeConstitucion, fechaActual); 
double intereses = inversion.montoDepositado * inversion.porcentajeDeInteresDiario * dias; 
valorActual = inversion.montoDepositado + intereses; 
~~~

</details>

**Solución**: delegar las tareas que corresponde que calcule Inversion a ese objeto, puesto que estos atributos corresponden a la clase Inversion y no a la clase Inversor.

* **SWITCH STATEMENTS**: está preguntando qué tipo de inversión es para decidir cómo calcular su valor mediante el uso de switch case.

<details><summary> <code> Problema 🖱 </code></summary><br>

~~~java
private double valorActual(Inversion inversion) { 
  double valorActual = 0.0; 
  switch (inversion.tipoDeInversion) { 
    case ACCIONES: 
      //codigo
    case PLAZO_FIJO: 
      //codigo
  } 
  return valorActual;
}
~~~

</details>

**Solución**: se soluciona usando polimorfismo + herencia, entonces evito preguntar por la clase de objeto que es para hacer algo. 




