package es.uv.eu.view;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;

import javax.swing.JFrame;

import es.uv.eu.model.FruitMachineModel;

/**
 * Clase que crea la vista de la aplicacion
 * 
 */
public class FruitMachineView extends JFrame{
    
    private FruitMachineMenuBar menuBar;

    private PanelSaldo panelSaldo;
    private PanelPalanca panelPalanca;

    public FruitMachineView(FruitMachineModel model){
        super("Fruit Machine");
        setLayout(new BorderLayout());

        menuBar = new FruitMachineMenuBar();
        panelSaldo = new PanelSaldo(model);
        panelPalanca = new PanelPalanca();

        setJMenuBar(menuBar);
        add(panelSaldo, BorderLayout.EAST);
        add(panelPalanca, BorderLayout.SOUTH);
        
        setVisible(true);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setMenuListener(ActionListener listener){
        menuBar.setMyActionListener(listener);
    }

    public void setSaldo(int saldo){
        panelSaldo.setSaldo(saldo);
    }

    public void setPanelPalancaListener(ActionListener listener){
        panelPalanca.setActionListener(listener);
    }

    public void setPanelSaldoListener(ActionListener listener){
        panelSaldo.setActionListener(listener);
    }
}
