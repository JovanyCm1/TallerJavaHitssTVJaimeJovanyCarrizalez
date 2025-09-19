package proyectoVuelo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Vuelo> vuelos = new ArrayList<>();

         vuelos.add(new Vuelo("AAL 933", "New York",       "Santiago", LocalDate.of(2021, 8, 29), LocalTime.of( 5, 39), 62));
        vuelos.add(new Vuelo("LAT 755", "Sao Paulo",      "Santiago", LocalDate.of(2021, 8, 31), LocalTime.of( 4, 45), 47));
        vuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(16,  0), 52));
        vuelos.add(new Vuelo("DAL 147", "Atlanta",        "Santiago", LocalDate.of(2021, 8, 29), LocalTime.of(13, 22), 59));
        vuelos.add(new Vuelo("AVA 241", "Bogota",         "Santiago", LocalDate.of(2021, 8, 31), LocalTime.of(14,  5), 25));
        vuelos.add(new Vuelo("AMX 10",  "Mexico City",    "Santiago", LocalDate.of(2021, 8, 31), LocalTime.of( 5, 20), 29));
        vuelos.add(new Vuelo("IBE 6833","Londres",        "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of( 8, 45), 55));
        vuelos.add(new Vuelo("LAT 2479","Frankfurt",      "Santiago", LocalDate.of(2021, 8, 29), LocalTime.of( 7, 41), 51));
        vuelos.add(new Vuelo("SKU 803", "Lima",           "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(10, 35), 48));
        vuelos.add(new Vuelo("LAT 533", "Los Ángeles",    "Santiago", LocalDate.of(2021, 8, 29), LocalTime.of( 9, 14), 59));
        vuelos.add(new Vuelo("LAT 1447","Guayaquil",      "Santiago", LocalDate.of(2021, 8, 31), LocalTime.of( 8, 33), 31));
        vuelos.add(new Vuelo("CMP 111", "Panama City",    "Santiago", LocalDate.of(2021, 8, 31), LocalTime.of(15, 15), 29));
        vuelos.add(new Vuelo("LAT 705", "Madrid",         "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of( 8, 14), 47));
        vuelos.add(new Vuelo("AAL 957", "Miami",          "Santiago", LocalDate.of(2021, 8, 29), LocalTime.of(22, 53), 60));
        vuelos.add(new Vuelo("ARG 5091","Buenos Aires",   "Santiago", LocalDate.of(2021, 8, 31), LocalTime.of( 9, 57), 32));
        vuelos.add(new Vuelo("LAT 1283","Cancún",         "Santiago", LocalDate.of(2021, 8, 31), LocalTime.of( 4,  0), 35));
        vuelos.add(new Vuelo("LAT 579", "Barcelona",      "Santiago", LocalDate.of(2021, 8, 29), LocalTime.of( 7, 45), 61));
        vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth","Santiago",LocalDate.of(2021, 8, 30), LocalTime.of( 7, 12), 58));
        vuelos.add(new Vuelo("LAT 501", "París",          "Santiago", LocalDate.of(2021, 8, 29), LocalTime.of(18, 29), 49));
        vuelos.add(new Vuelo("LAT 405", "Montevideo",     "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(15, 45), 39));


        vuelos.sort(Comparator.comparing((Vuelo v) -> v.getFecha()).thenComparing(Vuelo::getHora));

        System.out.println("Listado ordenado por fecha llegada ascendente: ");
        for (Vuelo vuelo : vuelos) {
            System.out.println(vuelo);
        }
        System.out.println();
        System.out.println("El ultimo vuelo en llegar es: ");
        System.out.println(vuelos.get(vuelos.size() - 1));

        System.out.println();
        vuelos.sort(Comparator.comparing(Vuelo::getPasajeros));
        System.out.println("El vuelo con menor cantidad de pasajeros es: ");
        System.out.println(vuelos.get(0));

    }
}
