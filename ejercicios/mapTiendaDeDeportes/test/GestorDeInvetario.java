package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import clases.Producto;

public class GestorDeInvetario {

    public static void main(String[] args) {
        Map<Integer, Producto> inventario = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);

        inventario.put(1003, new Producto(1003, "Camiseta", "Ropa", 100));
        inventario.put(1001, new Producto(1001, "Laptop", "Electrónica", 20));
        inventario.put(1002, new Producto(1002, "Smartphone", "Electrónica", 30));
        inventario.put(1005, new Producto(1005, "Zapatos", "Calzado", 50));
        inventario.put(1004, new Producto(1004, "Pantalones", "Ropa", 80));
        inventario.put(1006, new Producto(1006, "Tablet", "Electrónica", 15));
        inventario.put(1008, new Producto(1008, "Chaqueta", "Ropa", 40));
        inventario.put(1007, new Producto(1007, "Auriculares", "Electrónica", 60));

        boolean salir = false;
        while (!salir) {
            System.out.print("\033[H\033[2J");
            System.out.println("--- Inventario de Productos ---");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Consultar un producto");
            System.out.println("3. Generar un reporte de productos en orden que fueron agregados");
            System.out.println("4. Generar un reporte de productos ordenados por nombre");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> {

                    boolean salirProducto = false;
                    while (!salirProducto) {
                        System.out.print("\033[H\033[2J");

                        System.out.println("--- Registrar un Producto ---");
                        System.out.println("1. Registrar un producto");
                        System.out.println("2. Registrar venta de un producto");
                        System.out.println("3. Registrar nuevas unidades de un producto");
                        System.out.println("4. Regresar al menú principal");
                        System.out.print("Seleccione una opción: ");
                        int opcionProducto = Integer.parseInt(sc.nextLine());
                        switch (opcionProducto) {
                            case 1 -> {
                                System.out.print("\033[H\033[2J");
                                System.out.println("--- Registrar un producto ---");
                                System.out.println();
                                System.out.print("Ingresa SKU: ");
                                Integer sku = Integer.parseInt(sc.nextLine());
                                while (inventario.get(sku) != null) {
                                    System.out.print("\033[H\033[2J");
                                    System.out.println(
                                            "El producto con sku " + sku + " ya existe intente con uno nuevo.");
                                    System.out.print("Ingresa SKU: ");
                                    sku = Integer.parseInt(sc.nextLine());
                                }
                                System.out.print("Ingresa nombre del producto: ");
                                String nombre = sc.nextLine();
                                System.out.print("Ingresa categoria: ");
                                String categoria = sc.nextLine();
                                System.out.print("Ingresa stock disponible: ");
                                int stock = Integer.parseInt(sc.nextLine());

                                inventario.put(sku, new Producto(sku, nombre, categoria, stock));
                                if (inventario.containsKey(sku)) {
                                    System.out.println("Producto agregado exitosamente: " + inventario.get(sku));
                                } else {
                                    System.out.println("Error al agregar producto");
                                }
                                System.out.println();

                                System.out.println("El producto con sku " + sku + " ya existe en el inventario");

                                System.out.print("Presione enter para continuar... ");
                                sc.nextLine();

                            }
                            case 2 -> {
                                System.out.print("\033[H\033[2J");
                                System.out.println("--- Registrar venta de un producto ---");
                                System.out.println();
                                System.out.print("Ingresa sku del producto: ");
                                int sku = Integer.parseInt(sc.nextLine());
                                while (inventario.get(sku) == null) {
                                    System.out.print("\033[H\033[2J");
                                    System.out.println(
                                            "El producto con sku " + sku + " no existe vuelva a intentarlo.");
                                    System.out.print("Ingresa SKU: ");
                                    sku = Integer.parseInt(sc.nextLine());
                                }
                                int cantidadAVender;
                                do {
                                    System.out.print("Ingresa la cantidad a vender: ");
                                    cantidadAVender = Integer.parseInt(sc.nextLine());

                                    if (cantidadAVender > inventario.get(sku).getStock()) {
                                        System.out.print("\033[H\033[2J");
                                        System.out.println("La cantidad a vender supera la del stock actual");
                                        System.out.println("Enter para continuar...");
                                        sc.nextLine();
                                    } else {
                                        inventario.get(sku).venderProducto(cantidadAVender);
                                        System.out.println("Se ha registrado la venta con exito.");
                                        System.out.println("Enter para continuar...");
                                        sc.nextLine();
                                        break;
                                    }

                                } while (cantidadAVender > inventario.get(sku).getStock());

                            }
                            case 3 -> {
                                System.out.print("\033[H\033[2J");
                                System.out.println("--- Registrar compra de un producto ---");
                                System.out.println();
                                System.out.print("Ingresa sku del producto: ");
                                int sku = Integer.parseInt(sc.nextLine());
                                while (inventario.get(sku) == null) {
                                    System.out.print("\033[H\033[2J");
                                    System.out.println(
                                            "El producto con sku " + sku + " no existe vuelva a intentarlo.");
                                    System.out.print("Ingresa SKU: ");
                                    sku = Integer.parseInt(sc.nextLine());
                                }
                                int cantidadAComprar;
                                System.out.print("Ingresa la cantidad a comprar: ");
                                cantidadAComprar = Integer.parseInt(sc.nextLine());

                                inventario.get(sku).comprarProducto(cantidadAComprar);
                                System.out.println("Se ha registrado la compra con exito.");
                                System.out.println("Enter para continuar...");
                                sc.nextLine();

                            }
                            case 4 -> salirProducto = true;
                        }

                    }

                }
                case 2 -> {
                    System.out.print("\033[H\033[2J");
                    System.out.println("--- Consultar un producto ---");
                    System.out.println();
                    System.out.print("Ingresa sku del producto: ");
                    int sku = Integer.parseInt(sc.nextLine());
                    if (inventario.containsKey(sku)) {
                        System.out.println("Producto encontrado: " + inventario.get(sku));
                    } else {
                        System.out.println("Producto no encontrado...");
                    }
                    System.out.println();

                    System.out.print("Presione enter para continuar... ");
                    sc.nextLine();

                }
                case 3 -> {
                    System.out.print("\033[H\033[2J");
                    System.out.println("--- Generar un reporte de productos en orden que fueron agregados ---");
                    System.out.println();
                    System.out.println("Generando reporte: ");
                    for (Entry<Integer, Producto> entry : inventario.entrySet()) {
                        System.out.println(entry.getValue());

                    }
                    System.out.println();
                    System.out.print("Ingrese algo para continuar: ");
                    sc.nextLine();
                }
                case 4 -> {
                    System.out.print("\033[H\033[2J");
                    System.out.println("--- Generar un reporte de productos ordenados por nombre ---");
                    System.out.println();
                    System.out.println("Generando reporte....");
                    List<Entry<Integer, Producto>> lista = new ArrayList<>(inventario.entrySet());

                    lista.sort(Comparator.comparing(entry -> entry.getValue().getNombre()));
                    for (Entry<Integer, Producto> entry : lista) {
                        System.out.println(entry.getValue());
                    }

                    System.out.println();
                    System.out.print("Presione enter para continuar... ");
                    sc.nextLine();
                }
                case 5 -> {
                    salir = true;
                }
            }
        }
        sc.close();

    }

}
