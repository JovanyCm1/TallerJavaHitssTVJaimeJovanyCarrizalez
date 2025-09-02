package companiaEmpleados;

public  class Cliente extends Persona {
    private int clienteId;
    private static Integer contadorClientes=0;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = ++Cliente.contadorClientes;
    }

    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return "Cliente [clienteId=" + clienteId + ", " + super.toString() + "]";
    }

}
