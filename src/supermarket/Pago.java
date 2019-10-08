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
public class Pago {
private int nroPago;
private float importe;
private float interes;
private float ValorCuota;
private Tarjeta tarjeta;
private Efectivo efectivo;
private Venta venta;

    public Pago(int nroPago, float importe, Tarjeta tarjeta, Efectivo efectivo) {
        this.nroPago = nroPago;
        this.importe = importe;
        this.tarjeta = tarjeta;
        this.efectivo = efectivo;
    }

    
    public void CalcularPago(){
        if(venta.getTotal()<5000){
            if(tarjeta.getTipo().equals("visa")){
            interes=venta.getTotal()+ (venta.getTotal()*5)/100;
            ValorCuota=interes/3;
            
        }
        if(tarjeta.getTipo().equals("mastercard")){
              importe=venta.getTotal()+ (venta.getTotal()*10)/100;
            ValorCuota=importe/6;
        }
        if(tarjeta.getTipo().equals("debito")){
             importe=venta.getTotal()+ (venta.getTotal()*20)/100;
            ValorCuota=importe/12;
        }
        }
        if(venta.getTotal()>10000){
              if(tarjeta.getTipo().equals("visa")){
            interes=venta.getTotal()+ (venta.getTotal()*10)/100;
            ValorCuota=interes/3;
            
        }
        if(tarjeta.getTipo().equals("mastercard")){
              importe=venta.getTotal()+ (venta.getTotal()*20)/100;
            ValorCuota=importe/6;
        }
        if(tarjeta.getTipo().equals("debito")){
             importe=venta.getTotal()+ (venta.getTotal()*30)/100;
            ValorCuota=importe/12;
        }
        else{
            if(venta.getTotal()<20000){
                
            }if(tarjeta.getTipo().equals("visa")){
            interes=venta.getTotal()+ (venta.getTotal()*30)/100;
            ValorCuota=interes/3;
            
        }
        if(tarjeta.getTipo().equals("mastercard")){
              importe=venta.getTotal()+ (venta.getTotal()*20)/100;
            ValorCuota=importe/6;
        }
        if(tarjeta.getTipo().equals("debito")){
             importe=venta.getTotal()+ (venta.getTotal()*10)/100;
            ValorCuota=importe/12;
        }
        }
        }
        
        
     
    }




    public int getNroPago() {
        return nroPago;
    }

    public void setNroPago(int nroPago) {
        this.nroPago = nroPago;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Pago{" + "nroPago=" + nroPago + ", importe=" + importe + ", tarjeta=" + tarjeta + '}';
    }




}
