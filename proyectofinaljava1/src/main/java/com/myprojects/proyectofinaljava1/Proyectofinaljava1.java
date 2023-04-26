
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
        
        System.out.println("Datos cargados correctamente.");
        System.out.println("Titulo: " + harryPotter.getTitulo());
        System.out.println("Autor: " + harryPotter.getAutor());
        System.out.println("Fecha de publicacion: " + harryPotter.getfechapublicacion());
        System.out.println("Stock: "+ harryPotter.getCantidadstock() + " unidades");
        
        Itemsalcarrito harry = new Itemsalcarrito();
        
        harry.setLibro(harryPotter);
        harry.setFisico(true);
        harry.setCantidadcompra(150);
        System.out.println("Item al carrito");
        harry.mostrarItem();
        System.out.println("Precio: " + harry.precio());
        System.out.println("------------------------------------------");
        
        Revista topgear = new Revista();
        
        topgear.setCodigo("02");
        topgear.setNombre("Top Gear: The Magazine");
        topgear.setEditor("Jeremy Clarkson");
        topgear.setFechapublicacion("17-08-2014");
        topgear.setPrecioCompra(200);
        topgear.setCantidadstock(500);
        
        System.out.println("Revista creada");
        System.out.println("Datos cargados correctamente.");
        System.out.println("Nombre: " + topgear.getNombre());
        System.out.println("Editor: " + topgear.getEditor());
        System.out.println("Fecha de publicacion: " + topgear.getFechapublicacion());
        System.out.println("Stock: "+ topgear.getCantidadstock() + " unidades");
        System.out.println("------------------------------------------");
        Itemsalcarrito top = new Itemsalcarrito();
        
        top.setRevista(topgear);
        top.setFisico(true);
        top.setCantidadcompra(350);
        System.out.println("Item al carrito:");
        top.mostrarItem();
        System.out.println("Precio: " + top.precio());
    }
}
