package es.uv.eu.fruit_machine.view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;

public class PanelPrincipalView extends JFrame {
    
    private PanelPrincipal panelprincipal;

    public PanelPrincipalView() {
        // Configurar el marco principal
        setLayout(new BorderLayout());
        setTitle("Panel Principal View");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Crear una instancia de PanelPrincipal y agregarla al JFrame
        panelprincipal = new PanelPrincipal();
        add(panelprincipal, BorderLayout.CENTER);

    }
    public void setMenuListener(ActionListener listener) {
        panelprincipal.setMyActionListener(listener);
    }
    public void setPanelSaldoListener(ActionListener listener) {
        panelprincipal.setActionListener(listener);
    }
}
