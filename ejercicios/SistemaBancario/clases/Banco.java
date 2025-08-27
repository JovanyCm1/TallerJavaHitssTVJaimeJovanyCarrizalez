package SistemaBancario.clases;

public class Banco {
    private int contadorTransacciones=0;
    private static int contadorCuentasBancarias=0;

    private CuentaBancaria[] cuentasBancarias;
    private Transaccion[][] transacciones;
     private int[] contadorTransaccionesPorCuenta;
    
    
    public Banco() {
        cuentasBancarias = new CuentaBancaria[10]; 
        transacciones = new Transaccion[10][10]; 
        contadorTransaccionesPorCuenta=new int [10]; 
    }
    

    public void crearCuenta(String nombreCompleto, double montoInicial){
        cuentasBancarias[Banco.contadorCuentasBancarias++]= new CuentaBancaria(nombreCompleto, montoInicial);
    }

    public void resgistrarTransaccion(int idCuenta, String tipoTransaccion, double monto){
        int idx = contadorTransaccionesPorCuenta[idCuenta];
        transacciones[idCuenta][idx] = new Transaccion(idCuenta,tipoTransaccion,monto);
        contadorTransaccionesPorCuenta[idCuenta]++;

    }

    public void mostrarCuentas(){
        for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
            if (cuentaBancaria!=null) {
                System.out.println(cuentaBancaria);
                
            }
        }
    }

    public void mostrarTransacciones(int idCuenta){
        for (int i = 0; i < contadorTransaccionesPorCuenta[idCuenta]; i++) {
            System.out.println(transacciones[idCuenta][i]);
        }
    }

}
