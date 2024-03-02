
package es.uv.eu.calculadora.vista;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Mario Gil
 * @author Daniel Breva
 * @version 1.0
 * 
 */
/**
 * La clase CalculadoraMenu representa la barra de menu para la aplicación de calculadora.
 * Extiende la clase JMenuBar y proporciona un menu con una opcion de salida.
 */
public class CalculadoraMenu extends JMenuBar {
    private JMenu menu; // Menu de la calculadora
    private JMenuItem exit; // Opcion de salir, se agrega como un elemento del menu

    public CalculadoraMenu() {
        menu = new JMenu("Calculadora");
        exit = new JMenuItem("Salir");
        exit.setActionCommand("exit");

        menu.add(exit);
        this.add(menu);
    }

    /**
     * Método que anyade un ActionListener al elemento de salir.
     * 
     * @param actionListener el ActionListener a anyadir
     */
    public void setActionListener(ActionListener actionListener) {
        exit.addActionListener(actionListener);
    }
}
