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
public class Caja {
private int nroCaja;
private ArrayList<Venta>listadeVentas=new ArrayList();
private ArrayList <Carrito> listaCarrito=new ArrayList();

    public Caja(int nroCaja) {
        this.nroCaja = nroCaja;
    }
    public void agregarVenta(Venta v){
       listadeVentas.add(v);
    }
   
    public int getNroCaja() {
        return nroCaja;
    }

    public void setNroCaja(int nroCaja) {
        this.nroCaja = nroCaja;
    }

    public ArrayList<Venta> getListadeVentas() {
        return listadeVentas;
    }

    public void setListadeVentas(ArrayList<Venta> listadeVentas) {
        this.listadeVentas = listadeVentas;
    }

    @Override
    public String toString() {
        return "Caja{" + "nroCaja=" + nroCaja + ", listadeVentas=" + listadeVentas + ", listaCarrito=" + listaCarrito + '}';
    }

    


}
