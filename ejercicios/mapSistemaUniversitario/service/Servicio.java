package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import models.Curso;
import models.Estudiante;

public class Servicio implements IServicio {
    Map<String, Curso> cursos = new TreeMap<>();
    Map<Integer, Estudiante> estudiantes = new TreeMap<>();

    public boolean crearEstudiante(Estudiante estudiante) {
        if (estudiantes.containsKey(estudiante.getId())) {
            System.out.println("Estudiante ya registrado.");
            return false;
        } else {
            estudiantes.put(estudiante.getId(), estudiante);
            return true;
        }
    }

    public boolean crearCurso(Curso curso) {
        if (cursos.containsKey(curso.getNombre())) {
            System.out.println("Estudiante ya registrado.");
            return false;
        } else {
            curso.getProfesor().getCursos().add(curso);
            cursos.put(curso.getNombre(), curso);
            return true;
        }
    }

    @Override
    public boolean inscribirEstudiante(int idEstudiante, String nombreCurso) {
        if (estudiantes.get(idEstudiante).getFechaInicio()==null && estudiantes.get(idEstudiante).getFechaFin()==null) {
            estudiantes.get(idEstudiante).setFechaInicio(cursos.get(nombreCurso).getFechaInicio());
            estudiantes.get(idEstudiante).setFechaFin(cursos.get(nombreCurso).getFechaFin());
            cursos.get(nombreCurso).agregarAlumno(estudiantes.get(idEstudiante));
            return true;
        } else if (estudiantes.get(idEstudiante).getFechaInicio().isAfter(cursos.get(nombreCurso).getFechaFin())
                || estudiantes.get(idEstudiante).getFechaFin().isBefore(cursos.get(nombreCurso).getFechaInicio())) {

                    if () {
                        
                    }
            estudiantes.get(idEstudiante).setFechaInicio(cursos.get(nombreCurso).getFechaInicio());
            estudiantes.get(idEstudiante).setFechaFin(cursos.get(nombreCurso).getFechaFin());
            cursos.get(nombreCurso).agregarAlumno(estudiantes.get(idEstudiante));
            return true;
        } else {
            System.out.println("El estudiante no puede ser inscrito en el curso debido a un conflicto de fechas.");
            return false;
        }
    }

    @Override
    public boolean retirarEstudiante(int idEstudiante, String nombreCurso) {
        List<Estudiante> buscarAlumno = cursos.get(nombreCurso).getEstudiantes();
        boolean alumnoEncontrado = false;
        buscarAlumno.forEach(alumno->{
            if (alumno.getId() == idEstudiante) {
                alumnoEncontrado = true;
                
            }
        });
        if (alumnoEncontrado) {

            cursos.get(nombreCurso).retirarEstudiante(estudiantes.get(idEstudiante));
        }


    }

    @Override
    public List<Curso> listarCursosDeEstudiante(int idEstudiante) {
    }

    @Override
    public Set<Curso> listarCursosDeProfesor(int idProfesor) {
    }

    @Override
    public Set<Curso> listarCursosActivosEnFecha(LocalDate fecha) {

    }

}
