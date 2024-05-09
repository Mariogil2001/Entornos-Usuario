package es.uv.eu.photoeditor.view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;


/**
 * Es la barra de menú (no se muestra en la figura) y deriva de la clase
 * JMenuBar. Cuenta con las operaciones “Cargar imagen. . . ”, “Guardar imagen. . . ” y “Salir” en el
 * menú Archivo. Las operaciones cargar y guardar imagen se implementarán mediante las clases
 * SaveImage y LoadImage comentadas más abajo.
 * 
 */

public class PhotoEditorMenuBar extends JMenuBar {
    private JMenuItem cargarImagenMenuItem;
    private JMenuItem guardarImagenMenuItem;
    private JMenuItem salirMenuItem;

    public PhotoEditorMenuBar() {
        JMenu archivoMenu = new JMenu("Archivo");

        cargarImagenMenuItem = new JMenuItem("Cargar imagen");
        guardarImagenMenuItem = new JMenuItem("Guardar imagen");
        salirMenuItem = new JMenuItem("Salir");

        cargarImagenMenuItem.setActionCommand("Cargar");
        guardarImagenMenuItem.setActionCommand("Guardar");
        salirMenuItem.setActionCommand("Salir");

        archivoMenu.add(cargarImagenMenuItem);
        archivoMenu.add(guardarImagenMenuItem);
        archivoMenu.addSeparator();
        archivoMenu.add(salirMenuItem);

        add(archivoMenu);
    }

    public void setMyActionListener(ActionListener listener){
        cargarImagenMenuItem.addActionListener(listener);
        guardarImagenMenuItem.addActionListener(listener);
        salirMenuItem.addActionListener(listener);
    }
}
