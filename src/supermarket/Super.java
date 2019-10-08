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
public class Super {
private String nombre;
private ArrayList<Producto> listadeProducto=new ArrayList();
private ArrayList<Carrito> listadeCarrito=new ArrayList();
private ArrayList<Venta> listadeVenta=new ArrayList();
private ArrayList<Caja> listadeCaja=new ArrayList();

    public Super(String nombre) {
        this.nombre = nombre;
    }
    public void agregarProducto(Producto p){
        listadeProducto.add(p);
        
    }
     public void agregarCarrito(Carrito c){
        listadeCarrito.add(c);
        
    }
      public void agregarVenta(Venta v){
        listadeVenta.add(v);
        
    }
      
 public void agregarCaja(Caja c,Carrito ca){
        listadeCaja.add(c);
        listadeCarrito.add(ca);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getListadeProducto() {
        return listadeProducto;
    }

    public void setListadeProducto(ArrayList<Producto> listadeProducto) {
        this.listadeProducto = listadeProducto;
    }

    public ArrayList<Carrito> getListadeCarrito() {
        return listadeCarrito;
    }

    public void setListadeCarrito(ArrayList<Carrito> listadeCarrito) {
        this.listadeCarrito = listadeCarrito;
    }

    public ArrayList<Venta> getListadeVenta() {
        return listadeVenta;
    }

    public void setListadeVenta(ArrayList<Venta> listadeVenta) {
        this.listadeVenta = listadeVenta;
    }

    public ArrayList<Caja> getListadeCaja() {
        return listadeCaja;
    }

    public void setListadeCaja(ArrayList<Caja> listadeCaja) {
        this.listadeCaja = listadeCaja;
    }

    @Override
    public String toString() {
        return "Super{" + "nombre=" + nombre + ", listadeProducto=" + listadeProducto + ", listadeCarrito=" + listadeCarrito + ", listadeVenta=" + listadeVenta + ", listadeCaja=" + listadeCaja + '}';
    }




}
