
package es.uv.eu.calculadora.vista;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

/**
 *
 * @author Mario Gil Domingo
 * @author Daniel Breva
 * @version 1.0
 * 
 */
/**
 * La clase FuncionPanel representa un panel que contiene un boton para borrar el contenido.
 * Extiende la clase JPanel.
 */
class FuncionPanel extends JPanel {

    private JButton clearButton;

    /**
     * Crea un nuevo objeto FuncionPanel.
     * Inicializa el boton de borrar y lo agrega al panel.
     */
    public FuncionPanel() {
        clearButton = new JButton("CLEAR");
        clearButton.setActionCommand("clear");
        setLayout(new BorderLayout());
        add(clearButton,BorderLayout.SOUTH);
    }

    /**
     * Establece el ActionListener para el boton de borrar.
     * @param actionListener el ActionListener a establecer
     */
    public void setActionListener( ActionListener actionListener) {
        clearButton.addActionListener(actionListener);
    }
}
