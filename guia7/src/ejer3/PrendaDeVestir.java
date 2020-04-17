/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

import java.awt.Color;

/**
 *
 * @author MARCOS
 */
public abstract class PrendaDeVestir {
    public double precio;
    public String talla;
    public boolean disponible;
    public String color;
    
    public abstract void poner();
    public abstract void quitar();

    /**
     * @return the precio
     */
    public abstract double getPrecio();

    /**
     * @param precio the precio to set
     */
    public abstract void setPrecio(double precio);

    /**
     * @return the talla
     */
    public abstract String getTalla();

    /**
     * @param talla the talla to set
     */
    public abstract void setTalla(String talla);

    /**
     * @return the disponible
     */
    public abstract boolean isDisponible();

    /**
     * @param disponible the disponible to set
     */
    public abstract void setDisponible(boolean disponible);

    /**
     * @return the color
     */
    public abstract String getColor();

    /**
     * @param color the color to set
     */
    public abstract void setColor(String color);
}
