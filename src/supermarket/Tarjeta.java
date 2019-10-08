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
public class Tarjeta {
 private String tipo;
 private int nroTarjeta;

    public Tarjeta(String tipo, int nroTarjeta) {
        this.tipo = tipo;
        this.nroTarjeta = nroTarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(int nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "tipo=" + tipo + ", nroTarjeta=" + nroTarjeta + '}';
    }
 
}
