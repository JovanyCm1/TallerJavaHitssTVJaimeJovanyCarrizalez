import java.util.Arrays;
import java.util.Scanner;

/**
 * Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
 * Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y
 * también imprimir la cantidad de veces que aparece en el arreglo.
 *
 * Por ejemplo, para el arreglo: [1, 2, 3, 3, 4, 5, 5, 5, 6, 7]
 * Como resultado debería imprimir lo siguiente:
 * 1. La mayor ocurrencias es: 3
 * 2. El elemento que más se repite es: 5
 *
 * En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una
 * ocurrencia de 3 veces.
 */

public class EjercicioArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int vecesRepetidoFinal = 1;
        int vecesRepetido = 1;
        int moda = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        sc.close();

        Arrays.sort(numeros);

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] == numeros[i + 1]) {
                vecesRepetido++;
            } else {
                if (vecesRepetido > vecesRepetidoFinal) {
                    moda = numeros[i];
                    vecesRepetidoFinal = vecesRepetido;
                }
                vecesRepetido = 1;
            }
        }

        if (vecesRepetido > vecesRepetidoFinal) {
            moda = numeros[numeros.length - 1];
            vecesRepetidoFinal = vecesRepetido;
        }

        System.out.println("El número que más se repitió es: " + moda);
        System.out.println("La cantidad de veces que se repitió es: " + vecesRepetidoFinal);
    }

}
