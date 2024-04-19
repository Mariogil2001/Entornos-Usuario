package es.uv.eu.photoeditor.view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class ColorPanel extends JPanel{
    private JLabel color;
    private JButton[] botones;
    private String[] etiquetabotones = {"Negro","Cyan","Gris oscuro", "Gris", "Gris claro", "Magenta", "Naranja", "Rosa", "Amarillo", 
       "Blanco", "Rojo", "Azul", "Verde"};
    private Color[] coloresbotones = {Color.BLACK,Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.LIGHT_GRAY, Color.MAGENTA,
    Color.ORANGE, Color.PINK, Color.YELLOW, Color.WHITE, Color.RED, Color.BLUE, Color.GREEN};
    
    public ColorPanel(String nombre){
        this.setLayout(new GridLayout(7,2,8,8));
        botones = new JButton[13];
        color = new JLabel(nombre);
        Border borde = BorderFactory.createLineBorder(Color.GRAY,1);
        this.setBorder(borde);
        
        
        this.add(color);
        
        for(int i=0;i < 13; i++){
           botones[i] = new JButton(etiquetabotones[i]);
           botones[i].setBackground(coloresbotones[i]);
           if(0==i || i==2 || i== 11){
               botones[i].setForeground(Color.WHITE);
           }
           String cadena = i+"";
           botones[i].setActionCommand(cadena);
           this.add(botones[i]);
        }
    }
    
    public void SetLabel(String label){
        color.setText(label);
    }
    
    public void SetListener(ActionListener listener){
        for (JButton botone : botones) {
            botone.addActionListener(listener);
        }
    }
}