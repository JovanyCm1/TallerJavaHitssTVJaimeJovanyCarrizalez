<h1 align="center">📚 Ejercicios Del Taller Java TV 2025</h1>

<p align="center" style="font-size: 16px;">
  Este repositorio recopila una serie de ejercicios desarrollados como parte del <strong>Taller Java Turno Vespertino 2025</strong>.  
  Los ejercicios están organizados de forma <span style="color:#ff4d4d; font-weight:bold;">descendente</span>, mostrando primero el más reciente y terminando con el más antiguo.
</p>

<p align="center">
  <img src="./autor.svg" alt="Autor: Jaime Jovany Carrizalez Montoya" />
</p>

---

## Lista de Ejercicios
### 13. Validación de Usuarios en .txt
**Fecha:** 08/09/2025  
**Enunciado:**  
Desarrolla un programa que lea un archivo de texto con una lista de nombres de usuarios.  
- Si el archivo no existe, captura la excepción correspondiente.  
- Verifica que cada nombre tenga al menos 3 caracteres; en caso contrario, lanza una excepción personalizada llamada `NombreInvalidoException`.  

**📂 Dirección del proyecto:** [`validacionDeUsuarios`](/ejercicios/validacionDeUsuarios)

---

### 12. Ejercicio: Catálogo de productos
**Fecha:** 04/09/2025  
**Enunciado:**  
El objetivo es exponer los conceptos de **polimorfismo** mediante clases abstractas e interfaces.  

- **Interfaces:**  
  - `IProducto`: `getPrecio()`, `getPrecioVenta()`.  
  - `IElectronico`: `getFabricante()`.  
  - `ILibro`: `getFechaPublicacion()`, `getAutor()`, `getTitulo()`, `getEditorial()`.  

- **Clases abstractas:**  
  - `Producto` (implementa `IProducto`, atributo `precio`).  
  - `Electronico` (implementa `IElectronico`, atributo `fabricante`).  

- **Clases concretas:**  
  - `IPhone` (extiende `Electronico`, atributos `color` y `modelo`).  
  - `TvLcd` (extiende `Electronico`, atributo `pulgada`).  
  - `Libro` (extiende `Producto`, implementa `ILibro`, atributos `fechaPublicacion`, `autor`, `titulo`, `editorial`).  
  - `Comics` (extiende `Libro`, atributo `personaje`).  

Finalmente, crear la clase `ProyectoCatalogo` con ejemplos (4 a 7 objetos) en un arreglo `IProducto[]` y mostrar los datos en consola aplicando polimorfismo.  

**📂 Dirección del proyecto:** [`interfacesCatalogo`](/ejercicios/interfacesCatalogo)

---

### 11. Ejercicio: Abstracción mamíferos
**Fecha:** 02/09/2025  
**Enunciado:**  
Diseñar un programa para administrar mamíferos de un zoológico: leones, tigres, guepardos, lobos y perros salvajes africanos.  

Se requiere una jerarquía con la clase abstracta `Mamifero`, y derivadas `Felino` (León, Tigre, Guepardo) y `Canino` (Lobo, Perro).  
- **Mamífero:** atributos comunes (hábitat, altura, largo, peso, nombre científico) y métodos abstractos `comer()`, `dormir()`, `correr()`, `comunicarse()`.  
- **Canino:** agrega color y tamaño de colmillos.  
- **Felino:** agrega tamaño de garras y velocidad.  
- **Clases concretas:**  
  - León: número de manada y potencia de rugido.  
  - Tigre: especie.  
  - Guepardo: sin atributos extra.  
  - Lobo: número de camada y especie.  
  - Perro: fuerza de mordida.  

Crear la clase `EjemploMamiferos` con instancias (5 a 7 objetos) y mostrar la información en consola usando polimorfismo (`toString()`).  

**📂 Dirección del proyecto:** [`ejercicioMamiferos`](/ejercicios/ejercicioMamiferos)

---

### 10. Ejercicio: Compañía de empleados
**Fecha:** 01/09/2025  
**Enunciado:**  
Una compañía maneja empleados y clientes, entre los empleados hay gerentes que manejan presupuesto para su área (modificable) y a todos los empleados se les puede aumentar el sueldo.  

Se pide una jerarquía de clases de los tipos de persona mencionados, tomando como base la figura del diagrama UML de clases.  

Para todas las clases de la jerarquía tenga en cuenta:  
- Métodos *getter*  
- Un constructor  
- El método `toString()` con sobre-escritura  
- Para `Gerente` además, el método *setter* de presupuesto.  

También incluir una clase `Main` con algún ejemplo de un `Gerente` e imprimir todos sus datos (y heredados) vía `toString()`.  

**📂 Dirección del proyecto:** [`companiaEmpleados`](/ejercicios/companiaEmpleados)

---

### 9. Ejercicio: Sistema de pedidos
**Fecha:** 28/08/2025  
**Enunciado:**  
Vas a crear un mini sistema de pedidos usando varios enum.  

**Paso 1: Crear enums**  
1. `OrderStatus` → con los estados de un pedido:  
   - `NEW` → Pedido creado  
   - `PROCESSING` → Pedido en proceso  
   - `SHIPPED` → Pedido enviado  
   - `DELIVERED` → Pedido entregado  
   - `CANCELLED` → Pedido cancelado  
   Cada estado debe tener un mensaje asociado.  

2. `OrderPriority` → con los niveles de prioridad:  
   - `LOW`  
   - `MEDIUM`  
   - `HIGH`  
   Cada prioridad debe tener un número de atención (1 = baja prioridad, 3 = alta prioridad).  

3. `PaymentMethod` → con los métodos de pago:  
   - `CASH` → Efectivo  
   - `CARD` → Tarjeta de crédito/débito  
   - `TRANSFER` → Transferencia bancaria  
   Cada uno con una descripción (ejemplo: "Efectivo", "Tarjeta de crédito/débito", "Transferencia bancaria").  


**Paso 2: Crear la clase `Order`**  
La clase debe tener:  
- `int id` → identificador del pedido  
- `String customer` → nombre del cliente  
- `OrderStatus status`  
- `OrderPriority priority`  
- `PaymentMethod paymentMethod`  

Además, un método `showDetails()` que muestre la información del pedido.  


**Paso 3: Clase principal `Main`**  
En `main()`, crea **3 pedidos diferentes** con distintos estados, prioridades y métodos de pago, y muestra los detalles en pantalla.  

**Ejemplo de salida esperada:** 

Pedido #1
Cliente: Ana
Estado: NEW → Pedido creado
Prioridad: HIGH (Nivel 3)
Método de pago: CARD → Tarjeta de crédito/débito

Pedido #2
Cliente: Luis
Estado: SHIPPED → Pedido enviado
Prioridad: MEDIUM (Nivel 2)
Método de pago: CASH → Efectivo

Pedido #3
Cliente: Marta
Estado: DELIVERED → Pedido entregado
Prioridad: LOW (Nivel 1)
Método de pago: TRANSFER → Transferencia bancaria

**📂 Dirección del proyecto:** [`sistemaDePedidos`](/ejercicios/sistemaDePedidos)

---

### 8. Ejercicio sistema bancario simple

**Fecha:** 26/08/2025  
**Enunciado:**  
Problema: Sistema Bancario Simple con IDs Automáticos

Una institución bancaria necesita un sistema básico para administrar cuentas bancarias y registrar sus transacciones.  
Cada cuenta creada debe tener un ID único que se genere automáticamente sin que el usuario lo proporcione. Lo mismo debe ocurrir con cada transacción registrada.

El sistema debe permitir:

1. Crear cuentas bancarias con un titular y un depósito inicial.
   - Cada cuenta debe tener: un ID único, el nombre del titular y el saldo actual.
2. Realizar operaciones bancarias:
   - **Depósito:** aumentar el saldo de la cuenta.
   - **Retiro:** disminuir el saldo, siempre que haya suficiente dinero disponible.
3. Registrar transacciones asociadas a las cuentas.
   - Cada transacción debe tener un ID único automático, el tipo de operación (depósito o retiro), el monto y la cuenta asociada.
4. Mostrar información de las cuentas y de las transacciones realizadas.

**Ejemplo de funcionamiento esperado:**

- Crear dos cuentas:
  - Ana con $5000
  - Luis con $10000
- Ana deposita $2000 y retira $1000.
- Luis retira $3000 y deposita $1500.
- El sistema debe mostrar el detalle de cada cuenta y un historial de las transacciones con IDs únicos.

**📂 Dirección del proyecto:** [`SistemaBancario`](/ejercicios/SistemaBancario)

---

### 7. Ejercicio X: matriz con letra X

**Fecha:** 19/08/2025  
**Enunciado:**  
Escribir un programa que imprima una X construida a base de la letra X en las diagonales de la matriz y utilizar el carácter guion bajo como relleno.  
El tamaño de la X se basa en una variable n que indicará el tamaño de la letra para imprimir en una matriz de n x n.  
El carácter "X" en mayúscula y el guion bajo "\_" para los espacios.

Por ejemplo para n=5 se obtiene:  
X**_X
X_X
X
X_X
X_**X

Por ejemplo para n=6 se obtiene:

X\_**\_X
X**X
XX
XX
X**X
X\_\_**X

Si n es igual a cero imprimir `"ERROR"` y finalizar la ejecución del programa.

**📂 Dirección del proyecto:** [`EjercicioMatrizX.java`](/ejercicios/EjercicioMatrizX.java)

---

### 6. Ejercicio de arreglos

**Fecha:** 19/08/2025  
**Enunciado:**  
Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).  
Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces que aparece en el arreglo.

Por ejemplo, para el arreglo: `[1, 2, 3, 3, 4, 5, 5, 5, 6, 7]`  
Como resultado debería imprimir lo siguiente:

1. La mayor ocurrencias es: 3
2. El elemento que más se repite es: 5

En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.

**📂 Dirección del proyecto:** [`EjercicioArreglos.java`](/ejercicios/EjercicioArreglos.java)

---

### 5. Ejercicio restaurante

**Fecha:** 14/08/2025  
**Enunciado:**  
Un restaurante necesita un programa que permita al cajero:

Mostrar un menú de opciones:

1. Registrar un pedido.
2. Mostrar el total de ventas.
3. Salir del sistema.

Cada pedido se registra ingresando el precio.

El programa debe seguir mostrando el menú hasta que el cajero elija Salir.

Validar que el precio sea positivo antes de sumarlo a las ventas.

**📂 Dirección del proyecto:** [`Restaurante.java`](/ejercicios/Restaurante.java)

---

### 4. Ejercicio 3: notas finales

**Fecha:** 13/08/2025  
**Enunciado:**  
Pedir 20 notas finales de alumnos en una escala de 1 a 10, manejar decimales en las notas (`double`).  
Mostrar el promedio de las notas mayores o iguales a 6, promedio de notas inferiores a 6 y la cantidad de notas iguales a 1, además mostrar el promedio total.

Ayuda: usar un bucle `for` que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).

Opcional: si una de las notas ingresadas es menor que 1.0 o mayor que 10.0 debe salirse del ciclo `for` y mostrar un mensaje de error finalizando el programa.

**📂 Dirección del proyecto:** [`Ejercicio3.java`](/ejercicios/Ejercicio3.java)

---

### 3. Ejercicio 2: bucle for

**Fecha:** 12/08/2025  
**Enunciado:**  
Crear una clase con el método `main` donde el desafío es buscar el número menor de mínimo 10 valores enteros, usando la clase `Scanner` para ingresar la cantidad de números a comparar, luego utilizando una sentencia `for` iterar el número de veces (ingresado) para pedir el número entero, entonces se requiere:

Calcular el menor número e imprimir el valor.

Si el menor número es menor que 10, imprimir `"El número menor es menor que 10!"`.  
Si no, imprimir `"El número menor es igual o mayor que 10!"`.

**📂 Dirección del proyecto:** [`Ejercicio2BucleFor.java`](/ejercicios/Ejercicio2BucleFor.java)

---

### 2. Ejercicio 1: bucle for

**Fecha:** 12/08/2025  
**Enunciado:**  
Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación `(*)`.

Puede utilizar una sentencia `for` para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.

**📂 Dirección del proyecto:** [`Ejercicio1BucleFor.java`](/ejercicios/Ejercicio1BucleFor.java)

---

### 1. Ejercicio de cadenas

**Fecha:** 06/08/2025  
**Enunciado:**  
La tarea consiste en crear una clase llamada `ProgramaManejoDeNombres` de la siguiente manera:

Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

Se pide por cada nombre de la persona una nueva variable del tipo `String` al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como `N.es`.

Debe imprimir como resultado los tres nuevos nombres separados con guion bajo (como una única variable).

Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:  
`N.es_A.ia_E.pe`

**📂 Dirección del proyecto:** [`ProgramaManejoDeNombres.java`](/ejercicios/ProgramaManejoDeNombres.java)
