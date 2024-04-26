package es.uv.eu.photoeditor.view;

import java.awt.Color;
import java.util.Hashtable;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.event.ChangeListener;
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
        slider.setPaintLabels(true); // Habilitar la pintura de las etiquetas
        
        Hashtable<Integer, JLabel> labelTable = new Hashtable<>();
        for (int i = 1; i <= 10; i++) {
            labelTable.put(i, new JLabel(String.valueOf(i)));
        }
        slider.setLabelTable(labelTable);
        
        add(label);
        add(slider);
        
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
