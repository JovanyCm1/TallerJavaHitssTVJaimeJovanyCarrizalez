package companiaEmpleados;

public class Empleado extends Persona {
    private double remuneracion;
    private static int contadorEmpleados = 0;
    private int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.empleadoId = ++Empleado.contadorEmpleados;
        this.remuneracion = remuneracion;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje) {
        if (porcentaje > 0) {
            this.remuneracion += this.remuneracion * porcentaje / 100.0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado [empleadoId=" + empleadoId + ", remuneracion=" + remuneracion + "]";
    }

}
