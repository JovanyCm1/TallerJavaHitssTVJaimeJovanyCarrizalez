package setDeportes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import setDeportes.Jugador;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        Set<Jugador> jugadoresHashSet = new HashSet<>();
        Set<Jugador> jugadoresLinkSet = new LinkedHashSet<>();
        Set<Jugador> jugadoresTreeSet = new TreeSet<>();

        Jugador j1 = new Jugador(1, "Juan Mendez", "Futbol");
        Jugador j31 = new Jugador(1, "Juan Mendez", "Basquetbol");
        Jugador j32 = new Jugador(1, "Juan Mendez", "Basquetbol");// No se agrega
        Jugador j2 = new Jugador(2, "Ana", "Futbol");
        Jugador j3 = new Jugador(3, "Luis", "Futbol");
        Jugador j4 = new Jugador(4, "Maria", "Basquetbol");
        Jugador j41 = new Jugador(4, "Maria", "Voleibol");
        Jugador j5 = new Jugador(5, "Carlos", "Basquetbol");
        Jugador j6 = new Jugador(6, "Sofia", "Basquetbol");
        Jugador j7 = new Jugador(7, "Pedro", "Voleibol");
        Jugador j8 = new Jugador(8, "Lucia", "Voleibol");
        Jugador j9 = new Jugador(9, "Miguel", "Voleibol");

        jugadoresHashSet.add(j1);
        jugadoresHashSet.add(j2);
        jugadoresHashSet.add(j3);
        jugadoresHashSet.add(j4);
        jugadoresHashSet.add(j5);
        jugadoresHashSet.add(j6);
        jugadoresHashSet.add(j7);
        jugadoresHashSet.add(j8);
        jugadoresHashSet.add(j9);
        jugadoresHashSet.add(j32);
        jugadoresHashSet.add(j31);
        jugadoresHashSet.add(j41);

        jugadoresLinkSet.add(j1);
        jugadoresLinkSet.add(j2);
        jugadoresLinkSet.add(j3);
        jugadoresLinkSet.add(j4);
        jugadoresLinkSet.add(j5);
        jugadoresLinkSet.add(j6);
        jugadoresLinkSet.add(j7);
        jugadoresLinkSet.add(j8);
        jugadoresLinkSet.add(j9);
        jugadoresLinkSet.add(j32);
        jugadoresLinkSet.add(j31);
        jugadoresLinkSet.add(j41);

        jugadoresTreeSet.add(j1);
        jugadoresTreeSet.add(j2);
        jugadoresTreeSet.add(j3);
        jugadoresTreeSet.add(j4);
        jugadoresTreeSet.add(j5);
        jugadoresTreeSet.add(j6);
        jugadoresTreeSet.add(j7);
        jugadoresTreeSet.add(j8);
        jugadoresTreeSet.add(j9);
        jugadoresTreeSet.add(j32);
        jugadoresTreeSet.add(j31);
        jugadoresTreeSet.add(j41);

        while (!salir) {
            System.out.print("\033[H\033[2J");
            System.out.println("------ Opciones ------");

            System.out.println("1. Mostrar jugadores por deporte");
            System.out.println("2. Contar jugadores en cada disciplina");
            System.out.println("3. Fusionar equipos (unión)");
            System.out.println("4. Ver jugadores en común (intersección)");
            System.out.println("5. Transferir un jugador de un deporte a otro");
            System.out.println("6. Mostrar todos los jugadores ordenados por nombre");
            System.out.println("7. Mostrar todos los jugadores en orden de inscripción");
            System.out.println("8. Mostrar ranking de jugadores por ID");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> {
                    // ? Mostrar jugadores por deporte
                    System.out.print("\033[H\033[2J");
                    System.out.println("---Jugadores en cada deporte---");
                    System.out.println();

                    System.out.println("Futbol (HashSet)");
                    System.out.println("----------------");
                    Iterator<Jugador> it = jugadoresHashSet.iterator();
                    while (it.hasNext()) {
                        Jugador jugador = it.next();
                        if (jugador.getDeporte().equals("Futbol")) {
                            System.out.println(jugador);
                        }
                    }

                    System.out.println();
                    System.out.println("Basquetbol (LinkedHashSet)");
                    System.out.println("----------------");

                    Iterator<Jugador> it2 = jugadoresLinkSet.iterator();
                    while (it2.hasNext()) {
                        Jugador jugador = it2.next();
                        if (jugador.getDeporte().equals("Basquetbol")) {
                            System.out.println(jugador);
                        }
                    }

                    System.out.println();
                    System.out.println("Voleibol (TreeSet)");
                    System.out.println("----------------");

                    Iterator<Jugador> it3 = jugadoresTreeSet.iterator();
                    while (it3.hasNext()) {
                        Jugador jugador = it3.next();
                        if (jugador.getDeporte().equals("Voleibol")) {
                            System.out.println(jugador);
                        }
                    }
                    System.out.println("Ingrese para continuar...");
                    sc.nextLine();

                }
                case 2 -> {
                    // ? Contar jugadores en cada disciplina
                    System.out.print("\033[H\033[2J");
                    System.out.println("--- Jugadores en cada disciplina ---");
                    System.out.println();
                    int futbol = 0;
                    int basquetbol = 0;
                    int voleibol = 0;

                    Iterator<Jugador> it = jugadoresTreeSet.iterator();
                    while (it.hasNext()) {
                        Jugador jugador = it.next();
                        if (jugador.getDeporte().equals("Futbol")) {
                            futbol++;
                        } else if (jugador.getDeporte().equals("Basquetbol")) {
                            basquetbol++;
                        } else if (jugador.getDeporte().equals("Voleibol")) {
                            voleibol++;
                        }
                    }
                    System.out.println("Futbol: " + futbol);
                    System.out.println("Basquetbol: " + basquetbol);
                    System.out.println("Voleibol: " + voleibol);

                    System.out.print("Ingrese para continuar...");
                    sc.nextLine();

                }
                case 3 -> {
                    // ? Fusionar equipos (unión)
                    System.out.print("\033[H\033[2J");
                    System.out.println("--- Fusion de equipos (Union) ---");
                    System.out.println();

                    System.out.println("Seleccione equipos a fusionar:");
                    System.out.println("1. Futbol y Basquetbol");
                    System.out.println("2. Futbol y Voleibol");
                    System.out.println("3. Basquetbol y Voleibol");
                    int opcionFusion = Integer.parseInt(sc.nextLine());

                    switch (opcionFusion) {
                        case 1 -> {
                            System.out.println("Equipos de Futbol y Basquetbol fusionados:");
                            Iterator<Jugador> it = jugadoresTreeSet.iterator();
                            Set<Jugador> fusion = new HashSet<>();

                            while (it.hasNext()) {
                                Jugador jugador = it.next();
                                if (jugador.getDeporte().equals("Basquetbol")
                                        || jugador.getDeporte().equals("Futbol")) {
                                    fusion.add(jugador);
                                }
                            }
                            for (Jugador jugador : fusion) {
                                System.out.println(jugador);
                            }
                            System.out.println("Ingrese para continuar...");
                            sc.nextLine();
                        }
                        case 2 -> {
                            System.out.println("Equipos de Futbol y Voleibol fusionados:");
                            Iterator<Jugador> it = jugadoresTreeSet.iterator();
                            Set<Jugador> fusion = new HashSet<>();

                            while (it.hasNext()) {
                                Jugador jugador = it.next();
                                if (jugador.getDeporte().equals("Voleibol")
                                        || jugador.getDeporte().equals("Futbol")) {
                                    fusion.add(jugador);
                                }
                            }
                            for (Jugador jugador : fusion) {
                                System.out.println(jugador);
                            }
                            System.out.println("Ingrese para continuar...");
                            sc.nextLine();
                        }
                        case 3 -> {
                            System.out.println("Equipos de Basquetbol y Voleibol fusionados:");
                            Iterator<Jugador> it = jugadoresTreeSet.iterator();
                            Set<Jugador> fusion = new HashSet<>();

                            while (it.hasNext()) {
                                Jugador jugador = it.next();
                                if (jugador.getDeporte().equals("Basquetbol")
                                        || jugador.getDeporte().equals("Voleibol")) {
                                    fusion.add(jugador);
                                }
                            }
                            for (Jugador jugador : fusion) {
                                System.out.println(jugador);
                            }
                            System.out.println("Ingrese para continuar...");
                            sc.nextLine();
                        }
                        default -> System.out.println("Opcion no valida.");
                    }

                }
                case 4 -> {
                    // ! Ver jugadores en común (intersección)
                    System.out.print("\033[H\033[2J");
                    System.out.println("--- Jugadores en común (Intersección) ---\n");

                    // Creamos conjuntos separados por disciplina
                    Set<Jugador> futbol = new HashSet<>();
                    Set<Jugador> basquet = new HashSet<>();
                    Set<Jugador> voleibol = new HashSet<>();

                    for (Jugador j : jugadoresHashSet) {
                        switch (j.getDeporte()) {
                            case "Futbol" -> futbol.add(j);
                            case "Basquetbol" -> basquet.add(j);
                            case "Voleibol" -> voleibol.add(j);
                        }
                    }

                    // --- Futbol y Basquetbol ---
                    System.out.println("Jugadores en común entre Futbol y Basquetbol:");
                    Set<Jugador> inter1 = new HashSet<>();
                    for (Jugador i1 : futbol) {
                        for (Jugador i2 : basquet) {
                            if (i1.getId() == i2.getId()) {
                                inter1.add(i1);
                            }
                        }
                    }
                    if (inter1.isEmpty()) {
                        System.out.println("  (Sin jugadores en común)\n");
                    } else {
                        inter1.forEach(i -> System.out.println("  " + i));
                        System.out.println();
                    }

                    // --- Futbol y Voleibol ---
                    System.out.println("Jugadores en común entre Futbol y Voleibol:");
                    Set<Jugador> inter2 = new HashSet<>();
                    for (Jugador i1 : futbol) {
                        for (Jugador i2 : voleibol) {
                            if (i1.getId() == i2.getId()) {
                                inter2.add(i1);
                            }
                        }
                    }
                    if (inter2.isEmpty()) {
                        System.out.println("  (Sin jugadores en común)\n");
                    } else {
                        inter2.forEach(i -> System.out.println("  " + i));
                        System.out.println();
                    }

                    // --- Basquetbol y Voleibol ---
                    System.out.println("Jugadores en común entre Basquetbol y Voleibol:");
                    Set<Jugador> inter3 = new HashSet<>();
                    for (Jugador i1 : basquet) {
                        for (Jugador i2 : voleibol) {
                            if (i1.getId() == i2.getId()) {
                                inter3.add(i1);
                            }
                        }
                    }
                    if (inter3.isEmpty()) {
                        System.out.println("  (Sin jugadores en común)\n");
                    } else {
                        inter3.forEach(i -> System.out.println("  " + i));
                        System.out.println();
                    }

                    System.out.println("Ingrese para continuar...");
                    sc.nextLine();

                }
                case 5 -> {
                    // ? Transferir un jugador de un deporte a otro
                    System.out.print("\033[H\033[2J");
                    System.out.println("--- Transferir un jugador de un deporte a otro ---");
                    System.out.println();
                    System.out.print("Ingrese el ID del jugador a transferir: ");
                    int idTransferir = Integer.parseInt(sc.nextLine());
                    Jugador jugadorATransferir = null;
                    for (Jugador jugador : jugadoresTreeSet) {
                        if (jugador.getId() == idTransferir) {
                            jugadorATransferir = jugador;
                            break;
                        }
                    }
                    if (jugadorATransferir != null) {
                        System.out.println("Jugador encontrado: " + jugadorATransferir);
                        System.out.print("Ingrese el nuevo deporte: ");
                        String nuevoDeporte = sc.nextLine();
                        jugadorATransferir.setDeporte(nuevoDeporte);
                        System.out.println("Deporte actualizado: " + jugadorATransferir);
                    } else {
                        System.out.println("Jugador con ID " + idTransferir + " no encontrado.");
                    }

                }
                case 6 -> {
                    // ? Mostrar todos los jugadores ordenados por nombre
                    System.out.print("\033[H\033[2J");
                    System.out.println("--- Jugadores ordenados por nombre ---");
                    System.out.println();
                    Iterator<Jugador> it = jugadoresTreeSet.iterator();
                    while (it.hasNext()) {
                        Jugador jugador = it.next();
                        System.out.println(jugador);
                    }

                    System.out.println("Ingrese para continuar...");
                    sc.nextLine();

                }
                case 7 -> {
                    // ? Mostrar todos los jugadores en orden de inscripción
                    System.out.print("\033[H\033[2J");
                    System.out.println("--- Jugadores en orden de inscripcion ---");
                    System.out.println();
                    Iterator<Jugador> it = jugadoresLinkSet.iterator();
                    while (it.hasNext()) {
                        Jugador jugador = it.next();
                        System.out.println(jugador);
                    }
                    System.out.println("Ingrese para continuar...");
                    sc.nextLine();

                }
                case 8 -> {
                    // ? Mostrar ranking de jugadores por ID
                    System.out.print("\033[H\033[2J");
                    System.out.println("--- Ranking de jugadores por ID ---");
                    System.out.println();

                    Set<Jugador> jugadoresPorId = new TreeSet<>(
                            Comparator.comparingInt(Jugador::getId) 
                                    .thenComparing(Jugador::getNombre)
                                    .thenComparing(Jugador::getDeporte));
                    jugadoresPorId.addAll(jugadoresHashSet);

                    List<Jugador> lista = new ArrayList<>(jugadoresPorId);
                    ListIterator<Jugador> it = lista.listIterator(lista.size());
                    while (it.hasPrevious()) {
                        System.out.println(it.previous()); 
                    }
                    System.out.println("Ingrese para continuar...");
                    sc.nextLine();

                }
                case 9 -> {
                    System.out.print("\033[H\033[2J");
                    System.out.println("Saliendo...");
                    salir = true;
                }
                default -> {
                    System.out.print("\033[H\033[2J");
                    System.out.println("Error, seleccione una ocpion valida.");
                    System.out.println();
                }

            }

        }
    }

}
