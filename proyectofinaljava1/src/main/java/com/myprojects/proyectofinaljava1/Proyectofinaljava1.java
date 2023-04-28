
package com.myprojects.proyectofinaljava1;


public class Proyectofinaljava1 {

    public static void main(String[] args) {
        
        Libro harryPotter = new Libro();
        System.out.println("Libro creado");
        
        harryPotter.setTitulo("Harry Potter y la piedra filosofal");
        harryPotter.setAutor("J.K. Rowling");
        harryPotter.setCodigo("01");
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
        
        System.out.println("------------------------------------------");
        
        Libro got = new Libro();
        System.out.println("Libro creado");
        
        got.setTitulo("Game of thrones: A Song of Ice and Fire");
        got.setAutor("George R. R. Martin");
        got.setCodigo("03");
        got.setEditorial("Bantam Books");
        got.setPrecioCompra(400);
        got.setfechapublicacion("01-08-1996");
        got.setCantidadstock(250);
        
        System.out.println("Datos cargados correctamente.");
        System.out.println("Titulo: " + got.getTitulo());
        System.out.println("Autor: " + got.getAutor());
        System.out.println("Fecha de publicacion: " + got.getfechapublicacion());
        System.out.println("Stock: "+ got.getCantidadstock() + " unidades");
        
        Itemsalcarrito games = new Itemsalcarrito();
        
        games.setLibro(got);
        games.setFisico(false);
        games.setCantidadcompra(1);
        System.out.println("Item al carrito");
        games.mostrarItem();
        System.out.println("Precio: " + games.precio());
        System.out.println("------------------------------------------");
        
        Revista caras = new Revista();
        
        caras.setCodigo("04");
        caras.setNombre("Caras");
        caras.setEditor("Juan Perez");
        caras.setFechapublicacion("17-08-2022");
        caras.setPrecioCompra(100);
        caras.setCantidadstock(300);
        
        System.out.println("Revista creada");
        System.out.println("Datos cargados correctamente.");
        System.out.println("Nombre: " + caras.getNombre());
        System.out.println("Editor: " + caras.getEditor());
        System.out.println("Fecha de publicacion: " + caras.getFechapublicacion());
        System.out.println("Stock: "+ caras.getCantidadstock() + " unidades");
        System.out.println("------------------------------------------");
        
        Itemsalcarrito cara = new Itemsalcarrito();
        
        cara.setRevista(caras);
        cara.setFisico(true);
        cara.setCantidadcompra(200);
        System.out.println("Item al carrito:");
        cara.mostrarItem();
        System.out.println("Precio: " + cara.precio());
        
        System.out.println("------------------------------------------");
        
        System.out.println("Carrito");
        
        Carrito carrito = new Carrito();
        carrito.agregarAlCarrito(top);
        carrito.agregarAlCarrito(games);
        carrito.agregarAlCarrito(harry);
        carrito.agregarAlCarrito(cara);
        System.out.println("Su carrito de compras: ");
        carrito.mostrarCarrito();
        System.out.println("------------------------------------------");        
        carrito.quitardelCarrito(cara);
        System.out.println("Su carrito de compras: ");
        carrito.mostrarCarrito();
        System.out.println("------------------------------------------");
        System.out.println("El precio total a abonar es de: "+carrito.precioTotal()+ " pesos.");
    }
}
