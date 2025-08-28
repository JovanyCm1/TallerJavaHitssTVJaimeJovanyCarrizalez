package SistemaBancario.clases;

public class Transaccion {
    private static int contadorTransacciones;
    private static int idTransaccion;

    private int cuentaAsociadaId;
    private String tipoTransaccion;
    private double montoTransaccion;
    private CuentaBancaria cuentaBancaria;

    public Transaccion() {
        
    idTransaccion=++Transaccion.contadorTransacciones;
    }

    public Transaccion(int cuentaAsociadaId, String tipoTransaccion, double montoTransaccion, CuentaBancaria cuentaBancaria) {
        this();
        this.cuentaAsociadaId = cuentaAsociadaId;
        this.tipoTransaccion = tipoTransaccion;
        this.montoTransaccion = montoTransaccion;
        this.cuentaBancaria = cuentaBancaria;
        realizarTransaccion();
    }


    public void realizarTransaccion(){
        if (this.tipoTransaccion.equals("Deposito")) {
            this.cuentaBancaria.setSaldo(cuentaBancaria.getSaldo() + montoTransaccion);
        }else if (this.tipoTransaccion.equals("Retiro")) {
            this.cuentaBancaria.setSaldo(cuentaBancaria.getSaldo() - montoTransaccion);   
        }
    }


    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public double getMontoTransaccion() {
        return montoTransaccion;
    }

    public void setMontoTransaccion(double montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
    }

    public int getCuentaAsociadaId() {
        return cuentaAsociadaId;
    }

    public void setCuentaAsociadaId(int cuentaAsociadaId) {
        this.cuentaAsociadaId = cuentaAsociadaId;
    }

    @Override
    public String toString() {
        return "Transaccion " + "[ tipoTransaccion=" + tipoTransaccion
                + ", montoTransaccion=" + montoTransaccion + ", cuentaAsociadaId=" + cuentaAsociadaId + "]";
    }

}
