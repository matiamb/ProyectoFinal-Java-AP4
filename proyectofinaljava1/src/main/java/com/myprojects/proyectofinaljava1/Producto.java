
package com.myprojects.proyectofinaljava1;


public abstract class Producto {
    protected String codigo;
    protected double precioCompra;
    protected double precioVenta;
    protected String fechapublicacion;
    public int cantidad;

    public Producto() {
    }

    public Producto(String codigo, double precioCompra, double precioVenta, String fechapublicacion, int cantidad) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.fechapublicacion = fechapublicacion;
        this.cantidad = cantidad;
    }
    
    public abstract double calcularpreciovta();
}
