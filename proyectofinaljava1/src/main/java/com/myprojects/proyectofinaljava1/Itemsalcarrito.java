
package com.myprojects.proyectofinaljava1;


public class Itemsalcarrito {
    public Libro libro;
    public Revista revista;
    //public Producto producto;
    public int cantidadcompra;
    public boolean fisico;

    public Itemsalcarrito() {
    }

    public Itemsalcarrito(Libro libro, int cantidadcompra, boolean fisico) {
        this.libro = libro;
        this.cantidadcompra = cantidadcompra;
        this.fisico = fisico;
    }
    
    public Itemsalcarrito(Revista revista, int cantidadcompra, boolean fisico) {
        this.revista = revista;
        this.cantidadcompra = cantidadcompra;
        this.fisico = fisico;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    public int getCantidadcompra() {
        return cantidadcompra;
    }

    public void setCantidadcompra(int cantidadcompra) {
        this.cantidadcompra = cantidadcompra;
    }

    public boolean isFisico() {
        return fisico;
    }

    public void setFisico(boolean fisico) {
        this.fisico = fisico;
    }
    
    public boolean verificarStockLibros(Libro lib, int cantidad, boolean fisico){
        if (cantidad > lib.cantidadstock && fisico == true){
            return false;
        }
        else{ return true; }        
    }
    
    public boolean verificarStockRevistas(Revista rev, int cantidad, boolean fisico){
        if (cantidad > rev.cantidadstock && fisico == true){
            return false;
        }
        else{ return true; }        
    }
    
    public void mostrarItem(){ // necesito saber si es un libro o una revista
        if (libro != null) {
            System.out.println("Producto: " + libro.getTitulo());
            System.out.println("Cantidad: " + cantidadcompra);
        }
        else if (revista != null){
            System.out.println("Producto: " + revista.getNombre());
            System.out.println("Cantidad: " + cantidadcompra);
        }
    }
    
    public double precio(){
        double precio = 0;
        if(this.libro != null && fisico == true){
            precio = (libro.getPrecioCompra() * 1.18)*cantidadcompra;
        }
        else if(this.libro != null && fisico == false){
            precio = (libro.getPrecioCompra() * 1.08)*cantidadcompra;
        }
        
        else if(this.revista != null && fisico == true){
            precio = (revista.getPrecioCompra() * 1.22)*cantidadcompra;
        }
        
        else if(this.revista != null && fisico == false){
            precio = (revista.getPrecioCompra() * 1.12)*cantidadcompra;
        }
        
        return precio;
    }
}
