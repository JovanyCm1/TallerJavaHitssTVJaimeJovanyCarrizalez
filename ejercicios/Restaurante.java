import java.util.Scanner;

/**
 * Un restaurante necesita un programa que permita al cajero:
 *
 * Mostrar un menú de opciones:
 * 1. Registrar un pedido.
 * 2. Mostrar el total de ventas.
 * 3. Salir del sistema.
 *
 * Cada pedido se registra ingresando el precio.
 *
 * El programa debe seguir mostrando el menú hasta que el cajero elija Salir.
 *
 * Validar que el precio sea positivo antes de sumarlo a las ventas.
 */


public class Restaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        double precio;
        int contadorProductos = 0;
        do {
            System.out.println();
            System.out.println("========= Menú =========");
            System.out.println("1 - Registrar un pedido");
            System.out.println("2 - Mostrar el total de ventas");
            System.out.println("3 - Salir");

            respuesta = sc.nextInt();
            System.out.println();
            switch (respuesta) {
                case 1 -> {
                    System.out.println("========== REGISTRANDO PEDIDO ==========");
                    do {
                        System.out.print("Ingrese el precio del producto: ");
                        precio = sc.nextDouble();
                        if (precio > 0) {
                            contadorProductos++;
                        } else {
                            System.out.println("Precio inválido. Intente nuevamente.");
                        }
                    } while (precio < 0);
                }
                case 2 -> System.out.println("Total de productos vendidos: " + contadorProductos);
                case 3 -> {
                    System.out.println();
                    System.out.println("Haz salido con exito.");
                    System.out.println();
                }
                default -> System.out.println("Ingresa una opción valida.");
            }
        } while (respuesta != 3);
    }
}
