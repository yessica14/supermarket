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
public class Producto {
 private int codProd;
 private String Descripcion;
 private int stock;
 private float precio;

    public Producto(int codProd, String Descripcion, int stock, float precio) {
        this.codProd = codProd;
        this.Descripcion = Descripcion;
        this.stock = stock;
        this.precio = precio;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codProd=" + codProd + ", Descripcion=" + Descripcion + ", stock=" + stock + ", precio=" + precio + '}';
    }
 
 
}
