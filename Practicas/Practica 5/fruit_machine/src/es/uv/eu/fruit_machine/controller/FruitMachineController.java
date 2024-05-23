package es.uv.eu.fruit_machine.controller;

import es.uv.eu.fruit_machine.view.*;
import es.uv.eu.fruit_machine.model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class FruitMachineController {

    private FruitMachineView view;
    private FruitMachineModel model;
    private PanelPrincipalView panelPrincipalView;

    public FruitMachineController(PanelPrincipalView panelPrincipalView, FruitMachineView view, FruitMachineModel model) {
        this.view = view;
        this.model = model;
        this.panelPrincipalView = panelPrincipalView;

        MenuActionListener MenuListener = new MenuActionListener();
        PanelSaldoActionListener PanelSaldoListener = new PanelSaldoActionListener();
        PanelPalancaActionListener PanelPalancaListener = new PanelPalancaActionListener();

        view.setPanelPalancaListener(PanelPalancaListener);
        view.setPanelSaldoListener(PanelSaldoListener);
        view.setMenuListener(MenuListener);
        panelPrincipalView.setMenuListener(MenuListener);
        panelPrincipalView.setPanelSaldoListener(PanelSaldoListener);
    }

    /**
     * Clase para el Menu de la aplicacion, muestra un mensaje de informacion,
     * el ranking y cierra la aplicacion.
     * 
     */
    public class MenuActionListener implements ActionListener {
        public MenuActionListener() {
        }

        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch (command) {
                case "ranking":
                    // Implementar ranking
                    System.out.println("Ranking");
                    break;

                case "informacion":
                    JOptionPane.showMessageDialog(view, "Fruit Machine. Hecho por Mario Gil y Daniel Breva");
                    break;

                case "salir":
                    System.out.println("Salir");
                    System.exit(0);
                    break;
                
                case "Jugar":
                    panelPrincipalView.setVisible(false);
                    view.setVisible(true);
                    break;
                    
                default:
                    System.err.println("Acción no reconocida: " + command);
                    break;
            }
        }
    }

    public class PanelSaldoActionListener implements ActionListener {
        public PanelSaldoActionListener() {
        }

        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            switch (command) {
                case "aumentarSaldo":
                    String inputValue = JOptionPane.showInputDialog("Por favor, introduce la cantidad a aumentar:");
                    try {

                        int amount = Integer.parseInt(inputValue);
                        System.out.println("Aumentar saldo en " + amount);
                        model.aumentarSaldo(amount);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, introduce un número entero.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    view.repaint();
                    break;

                case "retirarSaldo":
                    System.out.println("No implementado");

                default:
                System.err.println("Acción no reconocida: " + command);
                    break;
            }

        }
    }

    public class PanelPalancaActionListener implements ActionListener {
        public PanelPalancaActionListener() {

        }

        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch (command) {
                case "palanca":
                    if (model.getSaldo() > 1) {
                        model.setSaldo(model.getSaldo() - 1);
                        model.tirada();
                        view.repaint();
                        model.getSaldo();
                    }
                    break;
                default:
                    break;
            }
        }

    }
}
