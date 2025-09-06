package modelos;

import java.time.LocalDate;

public class Comics extends Libro{
    String personaje;

    public Comics(LocalDate fechaPublicacion, String autor, String titulo, String editorial, int precio, String personaje) {
        super(fechaPublicacion, autor, titulo, editorial, precio);
        this.personaje = personaje;
    }

}