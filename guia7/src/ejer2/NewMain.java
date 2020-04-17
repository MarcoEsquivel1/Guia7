/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author MARCOS
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto panBimbo = new Producto(3.75, new Date());
        panBimbo.calcImpuesto();
        panBimbo.getPrecio();
        panBimbo.Impuesto();
        panBimbo.caduci();
    }
    
}
