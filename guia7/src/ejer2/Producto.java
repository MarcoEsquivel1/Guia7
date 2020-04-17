/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author MARCOS
 */
public class Producto implements Impuesto, Caducidad{
    private double precio;
    private double impuesto=0;
    private Date caducidad;
    SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Producto(double p, Date caducidad){
        this.setPrecio(p);
        this.setCaducidad(caducidad);
    }
    
    @Override
    public void Impuesto() {
        this.impuesto*=100;
        this.impuesto = Math.round(impuesto);
        this.impuesto /= 100;
        JOptionPane.showMessageDialog(null, "El impuesto es de: "+ impuesto);
    }

    @Override
    public void caduci() {
        
        JOptionPane.showMessageDialog(null, "La fecha de caducidad es: "+ sf.format(caducidad));
    }

    /**
     * @return the precio
     */
    public void getPrecio() {
        JOptionPane.showMessageDialog(null, "El precio es de: "+ precio);
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @param impuesto the impuesto to set
     */

    /**
     * @param caducidad the caducidad to set
     */
    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public void calcImpuesto(){
        this.impuesto = this.precio*0.13;
    }
    
}
