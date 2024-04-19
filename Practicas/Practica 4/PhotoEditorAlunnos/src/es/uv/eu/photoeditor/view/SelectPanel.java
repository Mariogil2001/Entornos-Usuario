package es.uv.eu.photoeditor.view;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SelectPanel extends JPanel{
    private LineWidthPanel lineWidthPanel;
    private ColorPanel colorPanel1;
    private ColorPanel colorPanel2;
    private JLabel label1;
    private JLabel label2;

    public SelectPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        lineWidthPanel = new LineWidthPanel();
        colorPanel1 = new ColorPanel();
        colorPanel2 = new ColorPanel();
        
        label1 = new JLabel("Color de linea");
        label2 = new JLabel("Color de relleno");
        // Registrar oyentes aquí
        add(lineWidthPanel);
        add(label1);
        add(colorPanel1);
        add(label2);
        add(colorPanel2);
        
        setPreferredSize(new Dimension(200, 600)); // Ajusta estos valores según sea necesario

    }
}

