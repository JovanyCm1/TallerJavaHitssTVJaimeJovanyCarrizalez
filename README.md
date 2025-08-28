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

**📂 Dirección del proyecto:** [`SistemaBancario`](/ejercicios/sistemaBancario)

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
