
package com.myprojects.proyectofinaljava1;


public abstract class Producto {
    protected String codigo;
    protected double precioCompra;
    protected double precioVenta;
    protected String fechapublicacion;

    public Producto() {
    }

    public Producto(String codigo, double precioCompra, double precioVenta) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }
    
    public abstract double calcularpreciovta();
}
