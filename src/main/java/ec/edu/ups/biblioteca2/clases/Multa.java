/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca2.clases;

/**
 *
 * @author mateo
 */
public class Multa {
    private double monto;
    private boolean pagada;

    public Multa() {
    }

    public Multa(double monto, boolean pagada) {
        this.monto = monto;
        this.pagada = pagada;
    }
    

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }
    
     public void pagarMulta() {
        pagada = true;
    }

    public boolean estaPagada() {

        if(pagada==true){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Multa{" + "monto=" + monto + ", pagada=" + pagada + '}';
    }
    
    
}
