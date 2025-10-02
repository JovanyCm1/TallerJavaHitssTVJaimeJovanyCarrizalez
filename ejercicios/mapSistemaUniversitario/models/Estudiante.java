package models;

import java.time.LocalDate;

public class Estudiante {
    private int id;
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;


    public Estudiante(String nombre, int id) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
}
