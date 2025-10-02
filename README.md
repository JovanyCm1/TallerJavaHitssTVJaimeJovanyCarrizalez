<h1 align="center">📚 Ejercicios Del Taller Java TV 2025</h1>

<p align="center" style="font-size: 16px;">
  Este repositorio recopila una serie de ejercicios desarrollados como parte del <strong>Taller Java Turno Vespertino 2025</strong>.  
  Los ejercicios están organizados de forma <span style="color:#ff4d4d; font-weight:bold;">descendente</span>, mostrando primero el más reciente y terminando con el más antiguo.
</p>

<p align="center">
  <img src="./autor.svg" alt="Autor: Jaime Jovany Carrizalez Montoya" />
</p>

## Lista de Ejercicios

### 22. ifSupermercado
**Fecha:** 01/10/2025  
**Enunciado:**  
Implementar un sistema básico de gestión de ventas para un supermercado.

**Entidades:**
1. **Producto**: `id (int)`, `nombre (String)`, `precio (double)`, `stock (int)`  
2. **Cliente**: `id (int)`, `nombre (String)`, `tipo (String => "Normal", "VIP")`  
3. **Empleado**: `id (int)`, `nombre (String)`, `puesto (String)`  
4. **Venta**: `id (int)`, `cliente (Cliente)`, `empleado (Empleado)`, `productos (List<Producto>)`, `total (double)`

**Requerimientos (interfaces funcionales):**
1. Filtrar productos con **stock < 5**.  
2. Calcular el **total** de una venta a partir de su lista de productos.  
3. Imprimir los **detalles** de una venta.  
4. Generar un **producto de muestra** para pruebas.  
5. Aplicar **10% de descuento** a un producto.  
6. **Comparar** dos productos y devolver el **más caro**.  
7. Verificar si un **cliente** puede acceder a **descuento** (p. ej., si es VIP y la compra supera 1000).  
8. Generar un **ticket de venta** (Cliente + Venta) en consola.  
9. **Notificar** a un cliente que su compra fue procesada por un empleado.  
10. Clase `SupermercadoService` que centralice estas **operaciones**.

**📂 Dirección del proyecto:** [`ifSupermercado`](/ejercicios/ifSupermercado)

---

### 21. Expresión Lambda: Palabra más repetida
**Fecha:** 30/09/2025  
**Enunciado:**  
Escribir una **expresión lambda** que reciba una frase y cuente cuántas veces se repite cada palabra, devolviendo la **palabra más repetida** junto con su cantidad de repeticiones.  

Requisitos:  
- La expresión lambda debe recibir una frase y devolver un objeto `Map` con la palabra más repetida como clave y el número de repeticiones como valor.  
- El resultado debe mostrarse en consola, iterando el `Map` o accediendo al primer elemento con `get()`.  

**📂 Dirección del proyecto:** [`ExpresionLambdaPalabra.java`](/ejercicios/expresionLambdaPalabra)

---

### 20. Expresión Lambda: Transformación de frases
**Fecha:** 29/09/2025  
**Enunciado:**  
Crear una expresión **Lambda** que:  
1. Elimine los espacios, comas y puntos de una frase.  
2. Devuelva la frase resultante convertida en **mayúsculas**.  

**📂 Dirección del proyecto:** [`ExpresionLambdaFrase`](/ejercicios/expresionLambdaFrase.java)

---

### 19. Sistema Universitario
**Fecha:** 25/09/2025  
**Enunciado:**  
La universidad desea un sistema para gestionar cursos, estudiantes y profesores con control de conflictos de horarios:

1. **Cursos:**
   - Cada curso tiene un nombre, un profesor, y fechas de inicio y fin.
   - Los estudiantes inscritos no deben duplicarse.
   - Un curso puede usarse para detectar solapamientos de fechas.

2. **Estudiantes:**
   - Cada estudiante tiene un ID único y un nombre.
   - Un estudiante puede inscribirse en varios cursos, pero no en cursos con fechas que se traslapan.

3. **Profesores:**
   - Cada profesor puede impartir varios cursos.

4. **Requisitos del sistema:**
   - Inscribir un estudiante en un curso solo si no hay conflicto de fechas con otros cursos en los que ya esté inscrito.
   - Retirar un estudiante de un curso.
   - Listar los cursos de un estudiante.
   - Listar cursos de un profesor.
   - Listar cursos activos en una fecha determinada.

5. **Estructuras sugeridas:**
   - Usar `Set<Student>` para los estudiantes de cada curso.
   - Usar `Map<String, Course>` para gestionar los cursos por nombre.

**📂 Dirección del proyecto:** [`mapSistemaUniversitario`](/ejercicios/mapSistemaUniversitario)

---

### 18. Gestión de Inventario en una Tienda de Deportes

**Fecha:** 24/09/2025  
**Enunciado:**  
Una cadena de tiendas de deportes maneja miles de productos (tenis, camisetas, balones, etc.).  
Cada producto tiene:

- Código único (SKU)
- Nombre del producto
- Categoría (fútbol, baloncesto, running, etc.)
- Stock disponible en cada sucursal

El reto es gestionar el inventario de manera eficiente:

- Poder acceder rápidamente a un producto por su código.
- Mantener los productos ordenados por nombre para listados.
- Mantener el orden de inserción para reportes de recepción de mercancía.

**Requisitos del sistema:**

1. Registrar productos en el inventario.
2. Consultar un producto en O(1) usando su código SKU.
3. Generar un reporte de productos en el orden en que fueron agregados.
4. Generar un reporte de productos ordenados alfabéticamente por nombre.
5. Actualizar stock cuando se registren ventas o lleguen nuevas unidades.

**📂 Dirección del proyecto:** [`mapTiendaDeDeportes`](/ejercicios/mapTiendaDeDeportes)

---

### 17. Gestión de un Torneo Deportivo Universitario

**Fecha:** 22/09/2025  
**Enunciado:**  
Administrar un torneo con varias disciplinas (fútbol, básquetbol, voleibol, etc.), registrando jugadores y gestionando inscripciones con diferentes implementaciones de `Set`.

**Requisitos:**

1. **Registro de jugadores por disciplina**
   - Cada jugador: **ID único** y **nombre**.
   - **Sin duplicados** en la misma disciplina.
2. **Mostrar inscripciones con `Set`:**
   - `HashSet` → verificación rápida (sin orden).
   - `LinkedHashSet` → orden de **inscripción**.
   - `TreeSet` → **orden alfabético** por nombre.
3. **Operaciones:**
   - Registrar jugador en una disciplina (evitar duplicados).
   - Mostrar jugadores por disciplina según el `Set` utilizado.
   - Buscar si un jugador está inscrito en una disciplina.
   - Eliminar jugador de una disciplina.
4. **Menú de opciones:**
   1. Mostrar jugadores por deporte
   2. Contar jugadores en cada disciplina
   3. Fusionar equipos (unión)
   4. Ver jugadores en común (intersección)
   5. Transferir jugador de un deporte a otro
   6. Mostrar todos los jugadores **ordenados por nombre**
   7. Mostrar todos los jugadores en **orden de inscripción**
   8. **Ranking** de jugadores por **ID**
   9. Salir

**Pruebas sugeridas:**

- Contar inscritos por disciplina.
- Fusionar equipos (fútbol + básquetbol) y mostrar únicos.
- Encontrar jugadores comunes (intersección) entre deportes.
- Transferir jugador de básquetbol a fútbol.
- Mostrar jugadores ordenados por **nombre** (TreeSet).
- Generar listado en **orden de inscripción** (LinkedHashSet).
- Ranking por **ID** (p. ej., `TreeSet` con comparador por ID).

**📂 Dirección del proyecto:** [`setDeportes`](/ejercicios/setDeportes)

---

### 16. List: Proyecto Vuelo

**Fecha:** 18/09/2025  
**Enunciado:**  
A partir de una tabla de llegadas de vuelos, se pide:

1. Crear una lista de objetos `Vuelo` manteniendo el mismo orden de la tabla original.

   - Atributos: nombre (String), origen (String), destino (String), fecha de llegada (LocalDate/LocalTime) y número de pasajeros (int).

2. Implementar un método que permita ordenar los vuelos por fecha de llegada de forma ascendente.

3. Obtener el último vuelo en llegar.

4. Identificar el vuelo con el menor número de pasajeros.

El resultado esperado debe mostrar:

- El listado ordenado por fecha de llegada ascendente.
- El último vuelo en llegar.
- El vuelo con menor número de pasajeros.

**📂 Dirección del proyecto:** [`ProyectoVuelo`](/ejercicios/proyectoVuelo)

---

### 15.Sistema de facturación

**Fecha:** 15/09/2025  
**Enunciado:**  
Crear una clase con métodos estáticos para administrar facturas:

1. **Guardar factura:** se debe almacenar en un archivo dentro de una carpeta llamada `facturas`, con el nombre `factura_idFactura.txt`.

   - Ejemplo: `Archivos.guardarFactura(f1);`

2. **Leer factura:** mostrar en consola el contenido de una factura dado su ID.

   - Ejemplo: `Archivos.leerFactura(idFactura);`

3. **Listar facturas:** mostrar en consola los nombres de todos los archivos de facturas existentes.
   - Ejemplo de salida:
     ```
     factura_1.txt
     factura_2.txt
     ```

**📂 Dirección del proyecto:** [`sistemaDeFacturacion`](/ejercicios/sistemaDeFacturacion)

---

### 14. Genericos supermercado

**Fecha:** 10/09/2025  
**Enunciado:**  
Diseñar una jerarquía de productos con una clase padre `Producto` (atributos: nombre, precio) y cuatro clases hijas:

- **Fruta:** peso, color.
- **Lácteo:** cantidad, proteínas.
- **Limpieza:** componentes, litros.
- **NoPerecible:** contenido, calorías.

Cada clase debe tener sus constructores y getters para inicializar y acceder a los atributos.

En la clase `Main`, crear un objeto "bolsa" para cada tipo de producto con 5 elementos y mostrar el detalle completo de cada uno (nombre, precio y atributos propios) sin necesidad de usar _casting_ ni sobrescribir `toString()`.

**📂 Dirección del proyecto:** [`carritoDeSupermercado`](/ejercicios/carritoDeSupermercado)

---

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

- Métodos _getter_
- Un constructor
- El método `toString()` con sobre-escritura
- Para `Gerente` además, el método _setter_ de presupuesto.

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
