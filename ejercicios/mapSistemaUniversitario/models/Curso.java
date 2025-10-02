package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private Profesor profesor;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private List<Estudiante> estudiantes = new ArrayList<>();

    
    public Curso(String nombre, Profesor profesor, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void agregarAlumno(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }
    public void retirarEstudiante(Estudiante estudiante){
        this.estudiantes.remove(estudiante);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso{");
        sb.append("nombre=").append(nombre);
        sb.append(", profesor=").append(profesor);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append('}');
        return sb.toString();
    }
}
