package es.uv.eu.calculadora.vista;


import java.awt.*;
import javax.swing.JFrame;

/**Clase Calculadora*/


/**
 * La clase CalculadoraVista representa la interfaz grafica de la calculadora.
 * Extiende la clase JFrame y contiene los paneles necesarios para mostrar los elementos de la calculadora.
 */
public class CalculadoraVista extends JFrame {
    CalculadoraMenu menu; //EuroConversorMenu
    FuncionPanel funcionPanel; //ClearPanel
    NumerosPanel numerosPanel; //NumberPanel
    OperacionesPanel operacionesPanel; //OperationPanel
    PantallaPanel pantallaPanel; //DisplayPanel
    
    public static final Color BACKGROUND = new Color(210, 210, 240);

    public CalculadoraVista() {
        super("Calculadora");
        menu = new CalculadoraMenu();
        funcionPanel = new FuncionPanel();
        numerosPanel = new NumerosPanel();
        operacionesPanel = new OperacionesPanel();
        pantallaPanel = new PantallaPanel();

        this.setJMenuBar(menu);
        this.setBackground(BACKGROUND);
        this.setLayout(new BorderLayout());
        this.add(pantallaPanel, BorderLayout.NORTH);
        this.add(numerosPanel, BorderLayout.WEST);
        this.add(operacionesPanel, BorderLayout.EAST);
        this.add(funcionPanel, BorderLayout.SOUTH);
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void setUpperLabelText(String text) {
        pantallaPanel.setUpperLabelText(text);
    }

    public void setLowerLabelText(String text) {
        pantallaPanel.setLowerLabelText(text);
    }

    public void setActionListener(java.awt.event.ActionListener actionListener) {
        funcionPanel.setActionListener(actionListener);
        numerosPanel.setActionListener(actionListener);
        operacionesPanel.setActionListener(actionListener);
        menu.setActionListener(actionListener);
    }

    public static void main(String[] args) {

        CalculadoraVista panel = new CalculadoraVista();

        JFrame frame = new JFrame("Numeros Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
 }

