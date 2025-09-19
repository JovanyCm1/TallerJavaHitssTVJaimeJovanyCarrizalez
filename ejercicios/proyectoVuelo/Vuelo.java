package proyectoVuelo;
import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelo {
    private final String nombre;
    private final String origen;
    private final String destino;
    private final LocalDate fecha;
    private final LocalTime hora;
    private final int pasajeros;

    public Vuelo(String nombre, String origen, String destino, LocalDate fecha, LocalTime hora, int pasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.pasajeros = pasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo [nombre=" + nombre + ", origen=" + origen + ", destino=" + destino + ", fecha=" + fecha
                + ", hora=" + hora + ", pasajeros=" + pasajeros + "]";
    }
    
    

}
