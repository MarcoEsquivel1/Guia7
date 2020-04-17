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
public class FiguraGeometrica implements Area, Perimetro{
    private double altura;
    private double anchura;

    @Override
    public void calcArea() {
        JOptionPane.showMessageDialog(null, "Area = "+ (this.getAltura()*this.getAnchura())+"cm");
    }

    @Override
    public void calcPerimetro() {
        JOptionPane.showMessageDialog(null, "Perimetro = "+ ((this.getAltura()*2)+(this.getAnchura()*2))+"cm");
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the anchura
     */
    public double getAnchura() {
        return anchura;
    }

    /**
     * @param anchura the anchura to set
     */
    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }
}
