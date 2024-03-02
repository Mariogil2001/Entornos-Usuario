package es.uv.eu.calculadora.vista;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author
 */
class OperacionesPanel extends JPanel {

    private JButton[] operaciones;

    public OperacionesPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        operaciones = new JButton[5];
        operaciones[0] = new JButton("+");
        operaciones[1] = new JButton("-");
        operaciones[2] = new JButton("*");
        operaciones[3] = new JButton("/");
        operaciones[4] = new JButton("=");
        for (int i = 0; i < 5; i++) {
            this.add(operaciones[i]);
            operaciones[i].setActionCommand(operaciones[i].getText());
        }
    }

    public void setActionListener(java.awt.event.ActionListener actionListener) {
        for (int i = 0; i < 5; i++) {
            operaciones[i].addActionListener(actionListener);
        }
    }

    public static void main(String[] args) {
        OperacionesPanel panel = new OperacionesPanel();

        JFrame frame = new JFrame("Numeros Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}