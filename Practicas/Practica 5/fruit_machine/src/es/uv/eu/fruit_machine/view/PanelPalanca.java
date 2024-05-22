package es.uv.eu.fruit_machine.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelPalanca extends JPanel {
    
    private JButton palanca;

    public PanelPalanca(){
        palanca = new JButton("Tirar Palanca");

        palanca.setActionCommand("palanca");

       add(palanca);
    }

    public void setActionListener(ActionListener listener){
        palanca.addActionListener(listener);
    }
    
}
