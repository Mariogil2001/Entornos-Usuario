package es.uv.eu.fruit_machine.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import es.uv.eu.fruit_machine.model.FruitMachineModel;

public class PanelPrincipalView extends JFrame {
    
    private PanelPrincipal panelprincipal;

    public PanelPrincipalView(FruitMachineModel model) {
        setLayout(new BorderLayout());
        setTitle("Panel Principal View");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        
        panelprincipal = new PanelPrincipal();
        panelprincipal.setModelo(model);  // Pasa el modelo al PanelPrincipal
        add(panelprincipal, BorderLayout.CENTER);
    }
    
    public void setMenuListener(ActionListener listener) {
        panelprincipal.setMyActionListener(listener);
    }
    
    public void setPanelSaldoListener(ActionListener listener) {
        panelprincipal.setActionListener(listener);
    }
}
