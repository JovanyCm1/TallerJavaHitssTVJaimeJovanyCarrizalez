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
