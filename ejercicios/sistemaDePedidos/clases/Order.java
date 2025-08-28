package sistemaDePedidos.clases;

public class Order {
    private int id;
    private static int contador;
    private String customer;
    private OrderStatus status;
    private OrderPriority priority;
    private PaymentMethod paymentMethod;

    

    public Order() {
        this.id = ++Order.contador;
    }


    public Order( String customer, OrderStatus status, OrderPriority priority, PaymentMethod paymentMethod) {
        this();
        this.customer = customer;
        this.status = status;
        this.priority = priority;
        this.paymentMethod = paymentMethod;
    }


    @Override
    public String toString() {
        return "Oreder [id=" + id + ", Cliente: =" + customer + ", Estado: =" + status.mensajeAsociado() + ", Prioridad: =" + priority.numeroDeAtencion()
                + ", Método de pago: =" + paymentMethod.descripcion() + "]";
    }


}
