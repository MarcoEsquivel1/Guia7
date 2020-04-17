/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

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
        FiguraGeometrica rectangulo = new FiguraGeometrica();
        rectangulo.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la figura en cm")));
        rectangulo.setAnchura(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la anchura de la figura en cm")));
        rectangulo.calcArea();
        rectangulo.calcPerimetro();
    }
    
}
