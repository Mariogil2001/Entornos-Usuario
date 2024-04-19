package es.uv.eu.photoeditor.view;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class LineWidthPanel extends JPanel {
    private JLabel label;
    private JSlider slider;

    public LineWidthPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        label = new JLabel("Grosor del pincel:");
        slider = new JSlider(1, 10);
        slider.setMajorTickSpacing(1); // Establecer el espaciado de los ticks mayores
        slider.setMinorTickSpacing(1); // Establecer el espaciado de los ticks menores
        slider.setPaintTicks(true); // Habilitar la pintura de los ticks
        
        add(label);
        add(slider);
    }
}