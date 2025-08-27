package SistemaBancario.clases;

public class CuentaBancaria {
    private static int contadorCuentasBancarias;
    private int id;
    private String nombreTitular;
    private double saldo;
    private Transaccion transaccion;

    public CuentaBancaria() {
        this.id = ++CuentaBancaria.contadorCuentasBancarias;
    }

    public CuentaBancaria(String nombreTitular, double saldoInical) {
        this();
        this.nombreTitular = nombreTitular;
        this.saldo = saldoInical;
    }


    //GaS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //Methods

    public void depositar(Double saldo){
        transaccion.setCuentaAsociadaId(this.id);
        transaccion.setTipoTransaccion("Deposito");
        transaccion.setMontoTransaccion(saldo);
        this.saldo += saldo;
    }

    
    public void retirar(Double saldo){
        transaccion.setCuentaAsociadaId(this.id);
        transaccion.setTipoTransaccion("Retiro");
        transaccion.setMontoTransaccion(saldo);
        this.saldo -= saldo;
    }



    @Override
    public String toString() {
        return "CuentaBancaria [id=" + id + ", nombreTitular=" + nombreTitular + ", saldo=" + saldo + "]";
    }

    

}
