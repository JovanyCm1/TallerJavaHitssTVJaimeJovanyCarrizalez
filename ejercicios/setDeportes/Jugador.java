package setDeportes;

import java.util.Comparator;

public class Jugador extends Persona implements Comparable<Jugador> {
    String deporte;

    public Jugador(int id, String nombre, String deporte) {
        super(id, nombre);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "Jugador: id=" + id + ", nombre=" + nombre + ", deporte=" + deporte;
    }

    @Override
    public int compareTo(Jugador o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((deporte == null) ? 0 : deporte.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Jugador other = (Jugador) obj;
        if (this.id != other.id)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (deporte == null) {
            if (other.deporte != null)
                return false;
        } else if (!deporte.equals(other.deporte))
            return false;
        return true;
    }

}
