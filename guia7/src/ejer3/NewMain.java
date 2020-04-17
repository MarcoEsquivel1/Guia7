/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;
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
        Camisas camisa1 = new Camisas(55.00, "XL", true, "Amarillo", "Algodon", "Polo");
        
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("[1]Ver Datos \n[2]Poner \n[3]Quitar \n[4]SALIR"));
            switch (op) {
                case 1:
                    camisa1.mostrarDatos();
                    break;
                case 2:
                    camisa1.poner();
                    break;
                case 3:
                    camisa1.quitar();
                    break;
                default:
                    break;
            }
        } while (op != 4);
    }
    
}
