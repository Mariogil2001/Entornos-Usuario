package es.uv.eu.calculadora.vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.Color;

/**
 *
 * @author Mario Gil Domingo
 * @author Daniel Breva
 * @version 1.0
 * 
 */
class NumerosPanel extends JPanel {
    private JButton[] numeros;
    private JButton decimalButton;
    private JButton clearButton;

    public NumerosPanel() {
        setLayout(new GridLayout(3, 4)); // Establecer el layout como GridLayout de tamaño 3x4

        numeros = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = new JButton(Integer.toString(i)); // Crear botones numericos del 0 al 9
            add(numeros[i]); // Anyadir botones al panel
            numeros[i].setActionCommand(Integer.toString(i)); // Establecer el comando de accion de los botones numericos
        }
        decimalButton = new JButton(".");
        decimalButton.setActionCommand(".");
        add(decimalButton); // Anyadir boton decimal al panel (ultimo boton del panel)
        clearButton = new JButton("C");
        clearButton.setActionCommand("C");
        clearButton.setForeground(Color.BLUE); // Cambiar el color del texto a azul
        add(clearButton); // Anyadir boton clear al panel (ultimo boton del panel)
    }

    public void setActionListener(ActionListener actionListener) {
        for (int i = 0; i < 10; i++) {
            numeros[i].addActionListener(actionListener); // Anyadir actionListener a los botones numéricos
        }
        decimalButton.addActionListener(actionListener); // Anyadir actionListener al boton decimal
        clearButton.addActionListener(actionListener); // Anyadir actionListener al boton clear
    }
    public static void main(String[] args) {

        NumerosPanel panel = new NumerosPanel();

        JFrame frame = new JFrame("Numeros Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}
