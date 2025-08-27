package SistemaBancario.test;

import java.util.Scanner;

import SistemaBancario.clases.Banco;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();
        int opcion;
        do {
            System.out.print("\033[H\033[2J");
            System.out.println("----------------- ROBAMEX -----------------");
            System.out.println("Selecciona la opción que deseas realizar: ");
            System.out.println("1 - Crear una cuenta");
            System.out.println("2- Mostrar cuentas");
            System.out.println("3- Menu de transacciones");
            System.out.println("4- Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.println("----------------- CREACION DE UNA CUENTA -----------------");
                    System.out.print("Ingresa tu nombre completo: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingresa el monto inicial: $");
                    double monto = sc.nextDouble();
                    banco.crearCuenta(nombre, monto);
                    System.out.println("Cuenta creada con éxito....");
                }
                case 2 -> {
                    sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.println("----------------- LISTA DE CUENTAS -----------------");
                    banco.mostrarCuentas();
                    System.out.println();
                    System.out.println("_____________________________________________________");
                    System.out.println();
                    System.out.println("Cuentas generadas con exito...");
                    System.out.println("Digite cualquier numero para salir");
                    int numero = sc.nextInt();

                }
                case 3 -> {
                    int opcionTransaccion;
                    do {
                        sc.nextLine();
                        System.out.print("\033[H\033[2J");
                        System.out.println("----------------- MENU DE TRANSACCIONES -----------------");
                        System.out.println("1- Depositar");
                        System.out.println("2- Retirar");
                        System.out.println("3- Mostrar transacciones.");
                        System.out.println("4- Volver al menú principal");
                        opcionTransaccion = sc.nextInt();
                        switch (opcionTransaccion) {
                            case 1 -> {
                                System.out.print("\033[H\033[2J");
                                System.out.println("----------------- DEPOSITAR -----------------");
                                System.out.print("Ingresa el ID de la cuenta: ");
                                int idCuentaDeposito = sc.nextInt();
                                System.out.print("Ingresa el monto a depositar: $");
                                double montoDeposito = sc.nextDouble();
                                banco.resgistrarTransaccion(idCuentaDeposito, "Deposito", montoDeposito);
                                System.out.println("Deposito realizado con exito...");
                                System.out.println("Digite cualquier numero para salir");
                                int numero = sc.nextInt();
                            }
                            case 2 -> {
                                System.out.print("\033[H\033[2J");
                                System.out.println("----------------- RETIRAR -----------------");
                                System.out.print("Ingresa el ID de la cuenta: ");
                                int idCuentaRetiro = sc.nextInt();
                                System.out.print("Ingresa el monto a retirar: $");
                                double montoRetiro = sc.nextDouble();
                                banco.resgistrarTransaccion(idCuentaRetiro, "Retiro", montoRetiro);
                                System.out.println("Retiro realizado con exito...");
                                System.out.println("Digite cualquier numero para salir");
                                int numero = sc.nextInt();
                            }
                            case 3 -> {
                                System.out.print("\033[H\033[2J");
                                System.out.println("----------------- LISTA DE TRANSACCIONES -----------------");
                                System.out.println("Ingresa el ID de la cuenta para ver sus transacciones: ");
                                int idCuentaTransacciones = sc.nextInt();
                                banco.mostrarTransacciones(idCuentaTransacciones);
                                System.out.println("Digite cualquier numero para salir");
                                int numero = sc.nextInt();
                            }
                            default -> {
                                System.out.println("Opción no válida.");
                            }
                        }

                    } while (opcionTransaccion != 3);
                }
                case 4 -> {
                    System.out.println("Saliendo...");
                }
                default -> {
                    System.out.println("Opción no válida.");
                }
            }
        } while (opcion != 4);
    }
}
