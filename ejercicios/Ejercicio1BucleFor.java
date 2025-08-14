package ejercicios;

import java.util.Scanner;

/**
 * Mediante el teclado pedir dos números enteros positivos o negativos y
 * multiplicarlos, pero sin usar el símbolo de multiplicación (*).
 *
 * Puede utilizar una sentencia for para realizar la multiplicación y
 * tener en cuenta los unarios, donde menos por menos es positivo.
 */

public class Ejercicio1BucleFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa valor 1: ");
        int numero1 = sc.nextInt();
        System.out.println("Ingresa valor 2: ");
        int numero2 = sc.nextInt();
        boolean esNegativo = false;

        if ((numero1 < 0 && numero2 > 0) || (numero1 > 0 && numero2 < 0)) {
            esNegativo = true;
        }

        int resultado = 0;
        numero1 = Math.abs(numero1);
        numero2 = Math.abs(numero2);

        for (int i = 0; i < numero1; i++) {
            resultado += numero2;
        }

        if (esNegativo) {
            resultado *= -1;
        }

        System.out.println(resultado);

    }

}
