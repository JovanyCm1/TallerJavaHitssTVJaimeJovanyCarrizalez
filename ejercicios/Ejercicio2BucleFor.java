package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Crear una clase con el método main donde el desafío es buscar el número menor
 * de
 * mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de
 * números
 * a comparar, luego utilizando una sentencia for iterar el número de veces
 * (ingresado)
 * para pedir el número entero, entonces se requiere:
 *
 * Calcular el menor número e imprimir el valor.
 *
 * Si el menor número es menor que 10, imprimir "El número menor es menor que
 * 10!".
 * Si no, imprimir "El número menor es igual o mayor que 10!".
 */

public class Ejercicio2BucleFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, numero, menor;

        do {
            System.out.println();
            System.out.println("Introduce la cantidad de numeros a comparar:");
            n = sc.nextInt();
            if (n < 10) {
                System.out.println("Ingresa una cantidad mayor o igual a 10");
            }

        } while (n < 10);

        System.out.println("Ingresa un numero: ");
        menor = sc.nextInt();

        for (int i = 1; i < n; i++) {

            System.out.println("Ingresa un numero: ");
            numero = sc.nextInt();

            if (numero < menor) {
                menor = numero;
            }

        }

        System.out.println("El menor es: " + menor);

        if (menor < 10) {
            System.out.println("¡El número menor es menor que 10!");
        } else {
            System.out.println("¡El número menor es igual o mayor que 10!");
        }

    }

}
