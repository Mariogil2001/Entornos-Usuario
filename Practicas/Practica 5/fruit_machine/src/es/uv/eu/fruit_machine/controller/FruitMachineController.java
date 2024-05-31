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
        PrincipalActionListener PrincipalListener = new PrincipalActionListener();

        view.setPanelPalancaListener(PanelPalancaListener);
        view.setPanelSaldoListener(PanelSaldoListener);
        view.setMenuListener(MenuListener);
        panelPrincipalView.setMenuListener(MenuListener);
        panelPrincipalView.setPrincipalListener(PrincipalListener);
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
                    System.out.println(model.getNombre() + " " + model.getPuntuacion());
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

    public class PrincipalActionListener implements ActionListener {
        public PrincipalActionListener() {
        }

        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch (command) {
                case "Jugar":
                    String nombre = panelPrincipalView.getNombre();
                    if (nombre == null || nombre.equals("")) {
                        JOptionPane.showMessageDialog(panelPrincipalView, "Por favor, introduce un nombre válido.");
                    } else {
                        panelPrincipalView.setVisible(false);
                        model.setNombre(nombre);
                        view.setVisible(true);
                    }
                    break;
                case "salir":
                    System.out.println("Salir");
                    System.exit(0);
                    break;
                
                case "aumentarSaldo":
                    
                    panelPrincipalView.repaint();
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

                        if (amount > 0) {
                        System.out.println("Aumentar saldo en " + amount);
                        model.aumentarSaldo(amount);
                        model.notifyObservers();  // Notificar a los observadores
                        
                        } else {
                            JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, introduce un número entero.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    view.repaint();
                    panelPrincipalView.repaint();
                    break;

                case "retirarSaldo":
                    int currentSaldo = model.getSaldo();
                    if (currentSaldo > 0) {
                        model.setPuntuacion(currentSaldo);
                        model.setSaldo(0);  // Dejar el saldo a 0
                        JOptionPane.showMessageDialog(null, "Ha retirado: " + currentSaldo, "Retiro de saldo", JOptionPane.INFORMATION_MESSAGE);
                        model.notifyObservers();  // Notificar a los observadores
                    } else {
                        JOptionPane.showMessageDialog(null, "El saldo ya es 0.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    }
                    view.repaint();
                    break;

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
                    if (model.getSaldo() >= 1) {
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
