package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import models.Curso;

public interface IServicio {
    // ! Por defecto son publicos y abstractos
    boolean inscribirEstudiante(int idEstudiante, String nombreCurso);

    boolean retirarEstudiante(int Estudiante);

    List<Curso> listarCursosDeEstudiante(int idEstudiante);

    Set<Curso> listarCursosDeProfesor(int idProfesor);

    Set<Curso> listarCursosActivosEnFecha(LocalDate fecha);

}