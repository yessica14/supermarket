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
public class Venta {
private int nroVenta;
private Fecha fecha;
private float total;

private LineaVenta lineaventa;
private Pago pago;

    public Venta(int nroVenta, Fecha fecha, LineaVenta lineaventa, Pago pago) {
        this.nroVenta = nroVenta;
        this.fecha = fecha;
        this.lineaventa = lineaventa;
        this.pago = pago;
    }

   public void Calculartotal(){
     total =lineaventa.getSubtotal()+total;
       System.out.println("el total de la compra:"+total);
  
   }
   

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
   

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    

    public LineaVenta getLineaventa() {
        return lineaventa;
    }

    public void setLineaventa(LineaVenta lineaventa) {
        this.lineaventa = lineaventa;
    }
   
   
    

    public int getNroVenta() {
        return nroVenta;
    }

    public void setNroVenta(int nroVenta) {
        this.nroVenta = nroVenta;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta{" + "nroVenta=" + nroVenta + ", fecha=" + fecha + ", total=" + total + ", lineaventa=" + lineaventa + ", pago=" + pago + '}';
    }

    

    

    



}
