
package com.myprojects.proyectofinaljava1;


public class Proyectofinaljava1 {

    public static void main(String[] args) {
        Libro harryPotter = new Libro();
        System.out.println("Libro creado");
        
        harryPotter.setTitulo("Harry Potter y la piedra filosofal");
        harryPotter.setAutor("J.K. Rowling");
        harryPotter.setCodigo("1");
        harryPotter.setEditorial("El mundo del libro");
        harryPotter.setPrecioCompra(550);
        harryPotter.setfechapublicacion("12-04-1998");
        harryPotter.setCantidadstock(200);
        
        /*System.out.println("Datos cargados correctamente.");
        System.out.println("Titulo: " + harryPotter.getTitulo());
        System.out.println("Autor: " + harryPotter.getAutor());
        System.out.println("Fecha de publicacion: " + harryPotter.getfechapublicacion());
        System.out.println("Stock: "+ harryPotter.getCantidadstock() + " unidades");*/
        
        Itemsalcarrito harry = new Itemsalcarrito();
        
        harry.setLibro(harryPotter);
        harry.setFisico(true);
        harry.setCantidadcompra(150);
        System.out.println(harry.precio());        
    }
}
