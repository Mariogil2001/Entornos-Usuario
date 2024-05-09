package es.uv.eu.photoeditor.view;

import java.awt.Dimension;
import java.awt.event.ActionListener;
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
        colorPanel1 = new ColorPanel("Color de linea: ");
        colorPanel2 = new ColorPanel("Color de relleno: ");
        
        label1 = new JLabel(" ", JLabel.CENTER);
        label2 = new JLabel(" ", JLabel.CENTER);
        // Registrar oyentes aquí
        add(lineWidthPanel);
        add(label1);
        add(colorPanel1);
        add(label2);
        add(colorPanel2);
        
        setPreferredSize(new Dimension(200, 200)); // Ajusta estos valores según sea necesario

    }
    
    public void setListener1(ActionListener listener){
        colorPanel1.setListener(listener);
    }
    
    public void setListener2(ActionListener listener){
        colorPanel2.setListener(listener);
    }
}

