package es.uv.eu.view;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;


/**
 * Clase que crea la vista del menu de la aplicacion
 * 
 */
public class FruitMachineMenuBar extends JMenuBar{

    private JMenu menu;
    private JMenuItem ranking;
    private JMenuItem informacion;
    private JMenuItem salir;

    public FruitMachineMenuBar() {

        menu = new JMenu("Menu");
        ranking = new JMenuItem("Ranking");
        informacion = new JMenuItem("Acerca de ...");
        salir = new JMenuItem("Salir");

        ranking.setActionCommand("ranking");
        informacion.setActionCommand("informacion");
        salir.setActionCommand("salir");
        
        menu.add(ranking);
        menu.add(informacion);
        menu.add(salir);

        add(menu);
    }

    public void setMyActionListener(ActionListener listener){
        ranking.addActionListener(listener);
        informacion.addActionListener(listener);
        salir.addActionListener(listener);
    }
    
}
