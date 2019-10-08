/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.util.ArrayList;

/**
 *
 * @author Yessica-
 */
public class Carrito {
 private int nroCarrito;
 private ArrayList<Producto>listadeProducto=new ArrayList();

    public Carrito(int nroCarrito) {
        this.nroCarrito = nroCarrito;
    }
 
 
 public void agregar(Producto p){
     listadeProducto.add(p);
 }

    public int getNroCarrito() {
        return nroCarrito;
    }

    public void setNroCarrito(int nroCarrito) {
        this.nroCarrito = nroCarrito;
    }

    public ArrayList<Producto> getListadeProducto() {
        return listadeProducto;
    }

    public void setListadeProducto(ArrayList<Producto> listadeProducto) {
        this.listadeProducto = listadeProducto;
    }

   
    @Override
    public String toString() {
        return "Carrito{" + "nroCarrito=" + nroCarrito + ", listadeProducto=" + listadeProducto + '}';
    }
 
 
 
}
