/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.calculadora;

import es.uv.eu.calculadora.controlador.CalculadoraControlador;
import es.uv.eu.calculadora.modelo.CalculadoraModelo;
import es.uv.eu.calculadora.vista.CalculadoraVista;

/**
 *
 * @author Mario Gil
 * @author Daniel Breva
 * @version 1.0
 * 
 */
public class Calculadora {
    
    public static void main(String[] args) {
        
        CalculadoraModelo model = new CalculadoraModelo();
        CalculadoraVista view = new CalculadoraVista();
        @SuppressWarnings("unused")
        CalculadoraControlador controller = new CalculadoraControlador(model, view);

        view.setVisible(true);
    }
}
