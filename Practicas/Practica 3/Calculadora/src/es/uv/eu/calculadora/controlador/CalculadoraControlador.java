package es.uv.eu.calculadora.controlador;

import java.awt.event.ActionListener;

import es.uv.eu.calculadora.modelo.CalculadoraModelo;
import es.uv.eu.calculadora.vista.CalculadoraVista;

/**
 *
 * @author Mario Gil
 * @author Daniel Breva
 * @version 1.0
 * 
 */
public class CalculadoraControlador {
    CalculadoraModelo modelo;
    CalculadoraVista vista;

    public CalculadoraControlador(CalculadoraModelo modelo, CalculadoraVista vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setActionListener(new Listener());
    }

    class Listener implements ActionListener{

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            String command = e.getActionCommand();
            switch (command) {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "0":
                    modelo.addDigit(command);
                    break;
                case ".":
                    modelo.addPoint();
                    break;
                case "C":
                    modelo.deleteChar();
                    break;
                case "clear":
                    modelo.reset();
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "=":
                    modelo.calc(command);
                    break;
                case "exit":
                    System.exit(0);
                    break;       
                
                default:
                    break;
            }
            vista.setUpperLabelText(modelo.getValor());
            vista.setLowerLabelText(modelo.getStatus());

        }
    }
}