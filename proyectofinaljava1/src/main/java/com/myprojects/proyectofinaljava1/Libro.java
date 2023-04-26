
package com.myprojects.proyectofinaljava1;


public class Libro extends Producto {
    public String titulo;
    public String autor;
    public String editorial;

    public Libro() {
    }

    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Libro(String titulo, String autor, String editorial, String codigo, double precioCompra, String fechapublicacion, int cantidadstock) {
        super(codigo, precioCompra, fechapublicacion, cantidadstock);
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
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
    
    public String getfechapublicacion() {
        return fechapublicacion;
    }

    public void setfechapublicacion(String fecha) {
        this.fechapublicacion = fecha;
    }

    public int getCantidadstock() {
        return cantidadstock;
    }

    public void setCantidadstock(int cantidad) {
        this.cantidadstock = cantidad;
    }

    @Override
    public double calcularpreciovta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
