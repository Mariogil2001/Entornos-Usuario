package es.uv.eu.fruit_machine.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import es.uv.eu.fruit_machine.model.FruitMachineModel;


public class PanelPrincipalView extends JFrame {
    
    private PanelPrincipal panelprincipal;
    private FruitMachineMenuBar menuBar;

    public PanelPrincipalView(FruitMachineModel model) {
        setLayout(new BorderLayout());
        setTitle("Panel Principal View");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        
        panelprincipal = new PanelPrincipal(model);
        panelprincipal.setModelo(model);  // Pasa el modelo al PanelPrincipal

        menuBar = new FruitMachineMenuBar();
        setJMenuBar(menuBar);
        add(panelprincipal, BorderLayout.CENTER);
    
    }
    
    public void setPrincipalListener(ActionListener listener) {
        panelprincipal.setMyActionListener(listener);
    }
    
    public void setPanelSaldoListener(ActionListener listener) {
        panelprincipal.setMyActionListener(listener);
    }

    public void setMenuListener(ActionListener listener){
        menuBar.setMyActionListener(listener);
    }

}
