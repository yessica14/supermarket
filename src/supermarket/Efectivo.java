/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 *
 * @author Yessica-
 */
public class Efectivo {
 private float cantidadDinero;

    public Efectivo(float cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public float getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(float cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    @Override
    public String toString() {
        return "Efectivo{" + "cantidadDinero=" + cantidadDinero + '}';
    }
 
 
}
