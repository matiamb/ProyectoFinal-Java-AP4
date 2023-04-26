
package com.myprojects.proyectofinaljava1;


public abstract class Producto {
    protected String codigo;
    protected double precioCompra;
    protected String fechapublicacion;
    public int cantidadstock;

    public Producto() {
    }

    public Producto(String codigo, double precioCompra, String fechapublicacion, int cantidadstock) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.fechapublicacion = fechapublicacion;
        this.cantidadstock = cantidadstock;
    }
    
    public abstract double calcularpreciovta();
}
