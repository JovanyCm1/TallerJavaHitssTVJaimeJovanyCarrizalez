
package modelos;


import java.time.LocalDate;
import interfaces.ILibro;

public class Libro extends Producto implements ILibro{
    LocalDate fechaPublicacion;
    String autor;
    String titulo;
    String editorial;

    public Libro(LocalDate fechaPublicacion, String autor, String titulo, String editorial, int precio) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return editorial;
    }   

    
}
