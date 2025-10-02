package models;

public class Empleado {
    private static int contadorEmpleados = 0;
    private int id;
    private String nombre;
    private String puesto;

    public Empleado(String nombre, String puesto) {
        this.id = ++Empleado.contadorEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + "]";
    }

}
