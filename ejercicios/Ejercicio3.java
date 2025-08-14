package ejercicios;

import java.util.Scanner;

/**
 * Pedir 20 notas finales de alumnos en una escala de 1 a 10, manejar decimales
 * en las notas (double).
 * Mostrar el promedio de las notas mayores o iguales a 6, promedio de notas
 * inferiores a 6 y la cantidad
 * de notas iguales a 1, además mostrar el promedio total.
 *
 * Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir
 * las notas una a una para
 * realizar los cálculos (contadores, sumas).
 *
 * Opcional: si una de las notas ingresadas es menor que 1.0 o mayor que 10.0
 * debe salirse del ciclo for
 * y mostrar un mensaje de error finalizando el programa.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mayoresOIgualesASeis = 0;
        double inferioresASeis = 0;
        double promedioTotal = 0;
        double notaIgualAUno = 0;
        double total = 0;

        double totalMayoresOIgualesASeis = 0;
        double totalInferioresASeis = 0;

        double nota;

        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese nota " + (i + 1) + " : ");
            nota = sc.nextDouble();
            if (nota < 1 || nota > 10) {
                System.out.println("Error finalizando programa...");
                return;
            }
            if (nota >= 6) {
                mayoresOIgualesASeis += nota;
                totalMayoresOIgualesASeis++;
            }
            if (nota < 6) {
                inferioresASeis += nota;
                totalInferioresASeis++;
            }
            if (nota == 1) {
                notaIgualAUno++;
            }
            total += nota;

        }

        if (totalMayoresOIgualesASeis == 0) {
            System.out.println("No hay notas mayores o iguales a seis.");
        } else {
            System.out.println("Promedio de notas mayores o iguales a seis: "
                    + (mayoresOIgualesASeis / totalMayoresOIgualesASeis));
        }
        if (totalInferioresASeis == 0) {
            System.out.println("No hay notas inferiores a seis.");
        } else {
            System.out.println("Promedio de notas inferiores a seis: " + (inferioresASeis / totalInferioresASeis));
        }
        System.out.println("Cantidad de notas iguales a uno: " + notaIgualAUno);
        System.out.println("Promedio total: " + (total / 20));
    }

}
