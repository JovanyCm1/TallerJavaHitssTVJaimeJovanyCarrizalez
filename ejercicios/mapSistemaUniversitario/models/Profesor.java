package models;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private int id;
    private String nombre;
    List <Curso> cursos = new ArrayList<>();
    
    public Profesor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Profesor{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }

    
}
