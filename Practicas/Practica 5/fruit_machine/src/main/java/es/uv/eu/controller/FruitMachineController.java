package es.uv.eu.controller;

import es.uv.eu.view.*;
import es.uv.eu.model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class FruitMachineController {
    
    private FruitMachineView view;
    private FruitMachineModel model;

    public FruitMachineController(FruitMachineView view, FruitMachineModel model){
        this.view = view;
        this.model = model;
        
        MenuActionListener MenuListener = new MenuActionListener();
        PanelSaldoActionListener PanelSaldoListener = new PanelSaldoActionListener();
        PanelPalancaActionListener PanelPalancaListener = new PanelPalancaActionListener();

        view.setPanelPalancaListener(PanelPalancaListener);
        view.setPanelSaldoListener(PanelSaldoListener);
        view.setMenuListener(MenuListener);
    }

    /**
     * Clase para el Menu de la aplicacion, muestra un mensaje de informacion,
     * el ranking y cierra la aplicacion.
     * 
     */
    public class MenuActionListener implements ActionListener{
        public MenuActionListener(){
        }

        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            switch (command) {
                case "ranking":
                //Implementar ranking
                    System.out.println("Ranking");
                    break;

                case "informacion":
                    JOptionPane.showMessageDialog(view, "Fruit Machine. Hecho por Mario Gil y Daniel Breva");
                    break;

                case "salir":
                    System.out.println("Salir");
                    System.exit(0);
                    break;

                default:
                    System.err.println("Acción no reconocida: " + command);
                    break;
            }
        }
    }

    public class PanelSaldoActionListener implements ActionListener{
        public PanelSaldoActionListener(){
        }

        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();


            switch (command) {
                case "aumentarSaldo":
                    String inputValue = JOptionPane.showInputDialog("Por favor, introduce la cantidad a aumentar:");
                    try {

                        int amount = Integer.parseInt(inputValue);
                        System.out.println("Aumentar saldo en " + amount);
                        model.aumentarSaldo(amount);
                        view.setSaldo(model.saldo);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, introduce un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                break;

                case "retirarSaldo":
                    System.out.println("No implementado");
            
                default:
                    break;
            }

        }
    }

    public class PanelPalancaActionListener implements ActionListener{
        public PanelPalancaActionListener(){

        }
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            switch (command) {
                case "palanca":
                    model.tirada();
                    
                    break;
            
                default:
                    break;
            }
        }

    }
}

