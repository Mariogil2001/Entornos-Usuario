package es.uv.eu.fruit_machine.view;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;

import javax.swing.JFrame;

import es.uv.eu.fruit_machine.model.FruitMachineModel;

/**
 * Clase que crea la vista de la aplicacion
 * 
 */
public class FruitMachineView extends JFrame{
    
    private FruitMachineMenuBar menuBar;
    
    private ImagenPanel imagenPanel;

    private PanelSaldo panelSaldo;
    private PanelPalanca panelPalanca;

    public FruitMachineView(FruitMachineModel model){
        super("Fruit Machine");
        setLayout(new BorderLayout());

        menuBar = new FruitMachineMenuBar();
        panelSaldo = new PanelSaldo(model);
        imagenPanel = new ImagenPanel(model);
        panelPalanca = new PanelPalanca();

        setJMenuBar(menuBar);
        add(imagenPanel, BorderLayout.CENTER); // Add the panel to the frame (center position
        add(panelSaldo, BorderLayout.EAST);
        add(panelPalanca, BorderLayout.SOUTH);
        
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setMenuListener(ActionListener listener){
        menuBar.setMyActionListener(listener);
    }


    public void setPanelPalancaListener(ActionListener listener){
        panelPalanca.setActionListener(listener);
    }

    public void setPanelSaldoListener(ActionListener listener){
        panelSaldo.setActionListener(listener);
    }
}
