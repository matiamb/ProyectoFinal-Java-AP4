
package com.myprojects.proyectofinaljava1;

import java.util.ArrayList;


public class Carrito {
    public ArrayList<Itemsalcarrito> items;    

    public Carrito() {
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
        items = new ArrayList<Itemsalcarrito>();
        items.add(ic);
    }
    
    public void quitardelCarrito(Itemsalcarrito ic){
        items.remove(ic);
    }
    
    public void mostrarCarrito(){
        if (items.isEmpty()){
            System.out.println("El carrito esta vacio");
        }
        
        else{
            for(Itemsalcarrito i : items){
                System.out.println(i);;
            }
        }
    }
}
