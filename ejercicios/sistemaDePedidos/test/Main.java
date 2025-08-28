package sistemaDePedidos.test;

import sistemaDePedidos.clases.*;


public class Main {
    public static void main(String[] args) {
        Order order = new Order("Ana", OrderStatus.NEW, OrderPriority.HIGH, PaymentMethod.CARD);
        Order order2 = new Order("Luis", OrderStatus.SHIPPED, OrderPriority.MEDIUM, PaymentMethod.CASH);
        Order order3 = new Order("Marta", OrderStatus.DELIVERED, OrderPriority.LOW, PaymentMethod.TRANSFER);
        System.out.println(order);
        System.out.println(order2);
        System.out.println(order3);
    }

}
