
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
class FuncionPanel extends JPanel {

    private JButton clearButton;

    public FuncionPanel() {
        clearButton = new JButton("CLEAR");
        clearButton.setActionCommand("clear");
        setLayout(new BorderLayout());
        add(clearButton,BorderLayout.SOUTH);
    }

    public void setActionListener( ActionListener actionListener) {
        clearButton.addActionListener(actionListener);
    }
}
