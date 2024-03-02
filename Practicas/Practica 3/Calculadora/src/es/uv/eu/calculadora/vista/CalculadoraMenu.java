
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
public class CalculadoraMenu extends JMenuBar {
    private JMenu menu; // Menu de la calculadora
    private JMenuItem exit; // Opcion de salir, va como un item del menu

    public CalculadoraMenu() {
        menu = new JMenu("Calculadora");
        exit = new JMenuItem("Salir");
        exit.setActionCommand("exit");

        menu.add(exit);
        this.add(menu);
    }

    /**
     * Metodo que anyade un actionListener al item de salir
     * 
     * @param actionListener
     * 
     */
    public void setActionListener(ActionListener actionListener) {
        exit.addActionListener(actionListener);
    }
}
