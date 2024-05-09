package es.uv.eu.photoeditor.view;

import static java.awt.SystemColor.text;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class StatusPanel extends JPanel {
    private JLabel lineWidthLabel = new JLabel();
    private JLabel borderColorLabel = new JLabel();
    private JLabel backgroundColorLabel = new JLabel();
    private JLabel grosor = new JLabel();
    private JLabel color = new JLabel();
    private JLabel colorrelleno = new JLabel();
    
    
    public StatusPanel() {
        lineWidthLabel = new JLabel("Grosor del Pincel: ", JLabel.LEFT);
        grosor = new JLabel("5", JLabel.CENTER);
        grosor.setPreferredSize((new Dimension(40, 20)));
        Border borde = BorderFactory.createLineBorder(Color.black,1);
        grosor.setBorder(borde);

        
        borderColorLabel = new JLabel("Color del pincel: ", JLabel.CENTER);
        color = new JLabel();
        color.setOpaque(true);
        color.setBackground(Color.black);
        color.setPreferredSize(new Dimension(60, 25));
        
        backgroundColorLabel = new JLabel("Color del relleno: ", JLabel.RIGHT);
        colorrelleno = new JLabel();
        
        colorrelleno.setOpaque(true);
        colorrelleno.setBackground(Color.white);
        colorrelleno.setPreferredSize(new Dimension(60, 25));
        
        add(lineWidthLabel);
        add(grosor);
        
        add(borderColorLabel);
        add(color);
        
        add(backgroundColorLabel);
        add(colorrelleno);
        
        // Establecer el borde gris oscuro
        Border border = BorderFactory.createLineBorder(Color.gray, 2);
        this.setBorder(border);
    }

    public void setGrosor(String tamgrosor) {
        grosor.setText(tamgrosor);
    }

    public void setColorPincel(Color colorpincel) {
        color.setBackground(colorpincel);
    }

    public void setColorRelleno(Color Colorrelleno) {
        colorrelleno.setBackground(Colorrelleno);
    }
}