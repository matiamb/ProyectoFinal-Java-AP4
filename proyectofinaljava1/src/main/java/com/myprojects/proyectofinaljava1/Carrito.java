
package com.myprojects.proyectofinaljava1;

import java.util.ArrayList;


public class Carrito {
    public ArrayList<Itemsalcarrito> items;    
    
    public Carrito() {
        items = new ArrayList<>();
    }

    public Carrito(ArrayList<Itemsalcarrito> item) {
        this.items = item;
    }

    public ArrayList<Itemsalcarrito> getItem() {
        return items;
    }

    public void setItem(ArrayList<Itemsalcarrito> item) {
        this.items = item;
    }
    
    public void agregarAlCarrito(Itemsalcarrito ic){
        items.add(ic);
        System.out.println("Item agregado con exito");
    }
    
    public void quitardelCarrito(Itemsalcarrito ic){
        items.remove(ic);
        System.out.println("Item quitado del carrito");
    }
    
    public void mostrarCarrito(){
        if (items.isEmpty()){
            System.out.println("El carrito esta vacio");
        }
        
        else{
            for(Itemsalcarrito i : items){              
                /*System.out.println(i.getLibro().getTitulo());
                System.out.println(i.getRevista().getNombre());*/
                if (i.getLibro() != null){
                    System.out.println(i.getLibro().getTitulo());
                }
                else {System.out.println(i.getRevista().getNombre());}
            }
        }
    }
    
    public double precioTotal(){
        double precio = 0;
        if (items.isEmpty()){
            System.out.println("El carrito esta vacio");
        }
        
        else{
            for(Itemsalcarrito i : items){
                precio += i.precio();                
            }
        }
        return precio;
    }
}
