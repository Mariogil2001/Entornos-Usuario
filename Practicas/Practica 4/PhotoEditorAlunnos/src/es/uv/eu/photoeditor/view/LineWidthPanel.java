package es.uv.eu.photoeditor.view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSlider;

public class LineWidthPanel extends JPanel {
    private JLabel label = new JLabel();
    private JSlider slider = new JSlider();

    public LineWidthPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        label = new JLabel("Grosor del pincel:");
        slider = new JSlider(1, 10);
        slider.setMajorTickSpacing(1); // Establecer el espaciado de los ticks mayores
        slider.setMinorTickSpacing(1); // Establecer el espaciado de los ticks menores
        slider.setPaintTicks(true); // Habilitar la pintura de los ticks
        slider.setPaintLabels(true); // Habilitar la pintura de las etiquetas
        slider.setPaintTrack(true);

        add(label);
        add(slider);

        // Agregar un ChangeListener al JSlider
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider)e.getSource();
                if (!source.getValueIsAdjusting()) {
                    int value = source.getValue();
                    // Aquí puedes hacer algo con el valor, como actualizar una etiqueta
                    label.setText("Grosor del pincel: " + value);
                }
            }
        });
        Border border = BorderFactory.createLineBorder(Color.GRAY, 1);
        setBorder(border);
    }
    
    public void SetChangeListener(ChangeListener listener){
        slider.addChangeListener(listener);
    }
    
    public int GetValue(){
        return slider.getValue();
    }
}