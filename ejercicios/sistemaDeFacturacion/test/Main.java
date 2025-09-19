package test;

import genericos.ServicioGenerico;

import java.util.Arrays;

import Facturas.GenerarFactura;
import entidades.*;

/**
 * Sistema de facturacion, utilizando las siguientes entidades:
 * - Cliente
 * - Producto
 * - Factura
 * Un servicio generico con las siguientes operaciones:
 * Guardar(agregar) elementos
 * Listar elementos
 * Buscar por ID
 * Eliminar por ID
 * Actualizar por ID
 * 
 * Una interfaz generica Identificable, que obliga a implementar el metodo
 * getId()
 */

public class Main {
    public static void main(String[] args) {
        ServicioGenerico<Cliente, String> clienteServicio = new ServicioGenerico<>();
        ServicioGenerico<Producto, Integer> productoServicio = new ServicioGenerico<>();
        ServicioGenerico<Factura, Long> facturaServicio = new ServicioGenerico<>();

        // !Tratar de crear un servicio para proveedor nos dara error
        Cliente c1 = new Cliente("C01", "Juan Perez");
        Cliente c2 = new Cliente("C02", "Carlos Sanchez");
        Cliente c3 = new Cliente("C03", "Maria Lopezzzz");

        clienteServicio.agregar(c1);
        clienteServicio.agregar(c2);
        clienteServicio.agregar(c3);

        Producto p1 = new Producto(1, "Laptop", 1500.0);
        Producto p2 = new Producto(2, "Smartphone", 800.0);
        Producto p3 = new Producto(3, "Tablet", 300.0);

        productoServicio.agregar(p1);
        productoServicio.agregar(p2);
        productoServicio.agregar(p3);

        // ? Facturacion

        Factura f1 = new Factura(1001L, c1, Arrays.asList(p1, p2, p3));
        Factura f2 = new Factura(1002L, c2, Arrays.asList(p2, p3));

        System.out.println("----Guardar facturas---");
        GenerarFactura.guardarFactura(f1);
        GenerarFactura.guardarFactura(f2);
        System.out.println();
        System.out.println("----Listar facturas---");
        System.out.println(GenerarFactura.listarFacturas());
        System.out.println();
        System.out.println("---Leer Factura por id 1001---");
        GenerarFactura.leerFactura(1001);

        // System.out.println("Listado de Facturas:");
        // for (Factura factura : facturaServicio.listar()) {
        // System.out.println(factura.construirFacturaString());
        // }
        // System.out.println();
        // // Busqueda por ID
        // System.out.println("Buscar Cliente C01: " +
        // clienteServicio.buscarPorId("C01"));

        // // Actualizar Cliente por id
        // System.out.println("Actualizar Cliente C02:");
        // Cliente c2Actualizado = new Cliente("C02", "Carlos M. Sanchez");
        // clienteServicio.actualizar("C02", c2Actualizado);
        // System.out.println("Cliente actualizado: " +
        // clienteServicio.buscarPorId("C02"));
        // System.out.println();
        // // Mostrar clientes
        // System.out.println("Listado de Clientes:");
        // for (Cliente cliente : clienteServicio.listar()) {
        // System.out.println(cliente);
        // }
        // System.out.println();
        // // Eliminar cliente por ID
        // System.out.println("Eliminar Cliente C03:");
        // clienteServicio.eliminarPorId("C03");
        // System.out.println("Listado de Clientes despues de eliminar:");
        // for (Cliente cliente : clienteServicio.listar()) {
        // System.out.println(cliente);
        // }
        // System.out.println();
        // // Intentar eliminar un cliente que no existe
        // System.out.println("Intentar eliminar Cliente C03 nuevamente:");
        // clienteServicio.eliminarPorId("C03");
        // System.out.println("Listado de Clientes despues de intentar eliminar:");
        // for (Cliente cliente : clienteServicio.listar()) {
        // System.out.println(cliente);
        // }

        // System.out.println();

    }
}