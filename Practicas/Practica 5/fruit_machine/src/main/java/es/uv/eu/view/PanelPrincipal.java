package es.uv.eu.view;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PanelPrincipal extends JFrame{
    
    private JLabel nombre;

    public PanelPrincipal(){
        nombre = new JLabel("Nombre: ");

        setSize(100,100);
        setVisible(true);
        add(nombre);
    }
}
