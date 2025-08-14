package ejercicios;

import java.util.Scanner;

/**
 * La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la
 * siguiente manera:
 *
 * Se requiere desarrollar un programa que reciba los nombres de 3 integrantes
 * de tu
 * familia o amigos como argumentos de línea de comandos.
 *
 * Se pide por cada nombre de la persona una nueva variable del tipo String al
 * tomar el
 * segundo carácter pero convertido en mayúscula y se le concatena un punto y
 * los dos
 * últimos caracteres de la persona. Por ejemplo para Andres debe quedar como
 * N.es
 *
 * Debe imprimir como resultado los tres nuevos nombres separado con guion bajo
 * (como
 * una única variable).
 *
 * Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe
 * podría ser:
 * N.es_A.ia_E.pe
 */

public class ProgramaManejoDeNombres {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String nombre1 = sc.next().trim();
                String nombre2 = sc.next().trim();
                String nombre3 = sc.next().trim();
                sc.close();

                String nuevoNombre1 = nombre1.substring(1, 2).toUpperCase() + "."
                                + nombre1.substring(nombre1.length() - 2, nombre1.length()) + "_";
                String nuevoNombre2 = nombre2.substring(1, 2).toUpperCase() + "."
                                + nombre2.substring(nombre2.length() - 2, nombre2.length()) + "_";
                String nuevoNombre3 = nombre3.substring(1, 2).toUpperCase() + "."
                                + nombre3.substring(nombre3.length() - 2, nombre3.length());

                System.out.println(nuevoNombre1 + nuevoNombre2 + nuevoNombre3);
        }

}
