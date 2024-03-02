package es.uv.eu.calculadora.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


/**
 *
 * @author Mario Gil
 * @author Daniel Breva
 * @version 1.0
 * 
 */
class PantallaPanel extends JPanel {
        private JLabel upperLabel;
        private JLabel lowerLabel;    

        public PantallaPanel() {
            setLayout(new BorderLayout()); // Establecer el layout como BorderLayout

            lowerLabel = new JLabel(" ", SwingConstants.LEFT); // Crear label inferior
            upperLabel = new JLabel("0", SwingConstants.RIGHT); // Crear label superior

            lowerLabel.setFont( new Font("SansSerif", Font.PLAIN, 10) ); // Establecer fuente del label inferior
            upperLabel.setFont( new Font("SansSerif", Font.BOLD, 30) ); // Establecer fuente del label superior

            Color BACKGROUND = new Color(180,170, 105);
            setBackground(BACKGROUND); // Establecer color de fondo del panel

            Border border = BorderFactory.createLineBorder(Color.BLACK, 5);
            setBorder(border);

            add(upperLabel, BorderLayout.NORTH); // Anyadir label superior al panel
            add(lowerLabel, BorderLayout.SOUTH); // Anyadir label inferior al panel
            setSize(300,115);
        }
        
        public void setUpperLabelText(String text) {
            upperLabel.setText(text);
        }
        
        public void setLowerLabelText(String text) {
            lowerLabel.setText(text);
        }
}
