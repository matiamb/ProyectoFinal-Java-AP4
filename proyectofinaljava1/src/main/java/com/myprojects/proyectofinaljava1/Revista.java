
package com.myprojects.proyectofinaljava1;


public class Revista extends Producto{
    public String nombre;
    public String editor;

    public Revista() {
    }

    public Revista(String nombre, String editor) {
        this.nombre = nombre;
        this.editor = editor;
    }

    public Revista(String nombre, String editor, String codigo, double precioCompra, String fechapublicacion, int cantidad) {
        super(codigo, precioCompra, fechapublicacion, cantidad);
        this.nombre = nombre;
        this.editor = editor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(String fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }
    
    public int getCantidadstock() {
        return cantidadstock;
    }

    public void setCantidadstock(int cantidad) {
        this.cantidadstock = cantidad;
    }

    @Override
    public boolean queSoy() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
