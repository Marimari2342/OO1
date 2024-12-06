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

Necesito generar casos de prueba para las diferentes funcionalidades, como dar de alta servicios, calcular costos de servicios, y calcular la recaudación. Los casos de prueba deben cubrir todas las situaciones posibles en las que el sistema podría comportarse de manera diferente.

#### Casos de prueba para **`recaudacion(LocalDate fecha)`** (calculando la recaudación de una mascota en una fecha dada):

1. **Particiones equivalentes**:

   - **Entrada válida (fecha válida):**
     - Se debe proporcionar una fecha válida que coincida con una fecha de servicio. Esta es la partición "válida".
   
   - **Entrada inválida (fecha fuera del rango de los servicios prestados):**
     - Se debe probar con una fecha que no coincida con ninguna fecha de servicio. Esto simula que no hubo servicios en esa fecha.

   - **Entrada nula (fecha nula):**
     - Se debe probar con una fecha nula (en caso de que la fecha pueda ser null) para verificar cómo maneja el sistema un valor nulo.

2. **Valores de borde**:

   - **Fecha de servicio exacta**:
     - El borde de este caso sería cuando la fecha proporcionada es exactamente el mismo día de un servicio.
   
   - **Primero o último servicio**:
     - Se debe verificar el cálculo con el primer servicio registrado para la mascota y el último servicio registrado. Esto asegura que no haya errores al manejar los extremos de la lista de servicios.

   - **Fecha de domingo**:
     - Dado que se aplica un costo adicional si el servicio se realiza en un domingo, se debe probar con una fecha que sea un **domingo** para asegurarse de que el recargo sea correcto.

3. **Casos adicionales**:

   - **Servicios en varias fechas**:
     - Se debe verificar que el sistema sume correctamente los costos de los servicios prestados en diferentes fechas. Por ejemplo, si la mascota recibió un servicio el 1 de enero y otro el 5 de enero, la recaudación de la fecha 1 de enero debe incluir solo el costo de ese día.
   
   - **Mascota con varios servicios en la misma fecha**:
     - Se debe probar el caso donde una mascota tiene múltiples servicios en el mismo día. El sistema debe sumar correctamente todos los costos de esos servicios.

------------------------

### Casos de prueba detallados:

#### Caso de prueba 1: **Calcular la recaudación en una fecha válida**  
**Descripción**: Verificar que el sistema calcule correctamente la recaudación de una mascota en una fecha específica en la que se le haya prestado al menos un servicio.  
**Entrada**:  
  - Fecha de servicio: `2024-12-01`  
  - Servicios prestados:  
    - Consulta médica: `$500`  
    - Fecha de atención: `2024-12-01`  
**Resultado esperado**:  
  - Recaudación total para el `2024-12-01` = `$500`.

#### Caso de prueba 2: **Calcular la recaudación en una fecha no válida**  
**Descripción**: Verificar que el sistema no considere servicios prestados en fechas diferentes a la proporcionada.  
**Entrada**:  
  - Fecha de consulta: `2024-12-01`  
  - Servicios prestados:  
    - Consulta médica: `$500`  
    - Fecha de atención: `2024-12-02`  
**Resultado esperado**:  
  - Recaudación para el `2024-12-01` = `$0`.

#### Caso de prueba 3: **Calcular la recaudación con una fecha nula**  
**Descripción**: Verificar que el sistema maneje correctamente una fecha nula.  
**Entrada**:  
  - Fecha de consulta: `null`  
**Resultado esperado**:  
  - El sistema debe retornar un error o un valor predeterminado como `0` o indicar que la fecha es obligatoria.

#### Caso de prueba 4: **Fecha en domingo (recaudación con recargo por domingo)**  
**Descripción**: Verificar que el sistema calcule correctamente la recaudación cuando el servicio se prestó en un domingo, aplicando el recargo correspondiente.  
**Entrada**:  
  - Fecha de consulta: `2024-12-07` (un domingo)  
  - Servicios prestados:  
    - Consulta médica: `$500`  
    - Fecha de atención: `2024-12-07`  
**Resultado esperado**:  
  - Recaudación total = `$500 + $200 (recargo domingo) = $700`.

#### Caso de prueba 5: **Calcular recaudación de múltiples servicios en la misma fecha**  
**Descripción**: Verificar que el sistema sume correctamente los costos de múltiples servicios prestados el mismo día.  
**Entrada**:  
  - Fecha de consulta: `2024-12-01`  
  - Servicios prestados:  
    - Consulta médica: `$500`  
    - Vacunación: `$300`  
    - Fecha de atención: `2024-12-01`  
**Resultado esperado**:  
  - Recaudación total para el `2024-12-01` = `$500 + $300 = $800`.

#### Caso de prueba 6: **Primero y último servicio en la lista**  
**Descripción**: Verificar el comportamiento del sistema al calcular la recaudación de la mascota con el primer y último servicio registrado.  
**Entrada**:  
  - Fecha de consulta: `2024-01-01` (primer servicio) y `2024-12-31` (último servicio)  
  - Servicios prestados:  
    - Primer servicio: `$400`  
    - Último servicio: `$600`  
**Resultado esperado**:  
  - Recaudación total para el `2024-01-01`: `$400`  
  - Recaudación total para el `2024-12-31`: `$600`.

---

</details>

* Implemente utilizando JUnit los tests automatizados diseñados en el punto anterior.