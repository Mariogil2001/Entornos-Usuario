package es.uv.eu.aplicacion4;

import java.awt.event.ActionListener;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 * @author Mario Gil Domingo
 */

public class PeliculaMenu extends JMenuBar{
    private JMenu file;
    private JMenuItem salir;

    public PeliculaMenu() {
        file = new JMenu("Archivo");
        salir = new JMenuItem("Salir");
        salir.setActionCommand("ItemSalir");

        file.add(salir);
        this.add(file);
    }

    public void setActionListener(ActionListener actionListener){
        salir.addActionListener(actionListener);
    }
}
