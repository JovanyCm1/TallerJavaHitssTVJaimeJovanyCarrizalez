package sistemaDePedidos.clases;

public enum PaymentMethod {
  CASH {
    @Override
    public String descripcion() {
      return "Pago en efectivo";
    }
  },
  
  CARD {
    @Override
    public String descripcion() {
      return "Pago con tarjeta de credito / debito";
    }
  },
  TRANSFER {
    @Override
    public String descripcion() {
      return "Transferencia bancaria";
    }
  };

  public abstract String descripcion();
}
