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
public class LineaVenta {
 private float cant;
 private float subtotal;
 
 private ArrayList<Carrito> listadeCarrito=new ArrayList();

    public LineaVenta(float cant) {
        this.cant = cant;
    }
    public void agregarCarrito(Carrito c){
        listadeCarrito.add(c);
    }
    

    public void subtotal(){
        for (Carrito l : listadeCarrito) {
            for (Producto p  : l.getListadeProducto()) {
                subtotal=p.getPrecio()*cant;
               
            }
        }
        System.out.println("el subtotal es:"+subtotal);
        
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    

    public ArrayList<Carrito> getListadeCarrito() {
        return listadeCarrito;
    }

    public void setListadeCarrito(ArrayList<Carrito> listadeCarrito) {
        this.listadeCarrito = listadeCarrito;
    }
    
    public float getCant() {
        return cant;
    }

    public void setCant(float cant) {
        this.cant = cant;
    }
   
    @Override
    public String toString() {
        return "LineaVenta{" + "cant=" + cant + '}';
    }
 
 
}
