/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author MARCOS
 */
public class Camisas extends PrendaDeVestir implements Tela, Estilo{
    private String tipoTela;
    private String estilo;
    public Camisas(double pre, String tall, boolean disp, String col, String tel, String esti){
        this.setPrecio(pre);
        this.setTalla(tall);
        this.setDisponible(disp);
        this.setColor(col);
        this.setTipoTela(tel);
        this.setEstilo(esti);
    }
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Precio: "+ this.getPrecio()+ 
                "\nTalla: "+ this.getTalla()+
                "\nDisponible: "+ this.isDisponible()+
                "\nColor: "+ this.getColor()+
                "\nTipo Tela: "+ this.getTipoTela()+
                "\nEstilo: "+ this.getEstilo());
    }
    @Override
    public void poner(){
        JOptionPane.showMessageDialog(null, "Se ha puesto la camisa");
    };
    @Override
    public void quitar(){
        JOptionPane.showMessageDialog(null, "Se ha quitado la camisa");
    };

    @Override
    public void tipoTela() {
        JOptionPane.showMessageDialog(null, "La tela es: " + getTipoTela());
    }

    @Override
    public void estilo() {
        JOptionPane.showMessageDialog(null, "Estilo: " + getEstilo());
    }

    /**
     * @return the tipoTela
     */
    public String getTipoTela() {
        return tipoTela;
    }

    /**
     * @param tipoTela the tipoTela to set
     */
    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    /**
     * @return the estilo
     */
    public String getEstilo() {
        return estilo;
    }

    /**
     * @param estilo the estilo to set
     */
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    
    /**
     * @return the precio
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    @Override
    public void setPrecio(double precio) {
        precio*=100;
        precio = Math.round(precio);
        this.precio = precio/100;
    }

    /**
     * @return the talla
     */
    @Override
    public String getTalla() {
        return talla;
    }

    /**
     * @param talla the talla to set
     */
    @Override
    public void setTalla(String talla) {
        this.talla = talla;
    }

    /**
     * @return the disponible
     */
    @Override
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * @param disponible the disponible to set
     */
    @Override
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * @return the color
     */
    @Override
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
