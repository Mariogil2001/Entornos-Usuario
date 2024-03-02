package es.uv.eu.aplicacion5;

import java.awt.event.ActionListener;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 * @description Esta clase extiende JMenuBar y representa la barra de menú de la aplicación.
 * Contiene tres menús: Archivo, Ayuda y Ventana.
 * 
 * @author Mario Gil Domingo
 * @version 2020.05.04
 */
public class PeliculaMenu extends JMenuBar{
    private JMenu file; // Menú Archivo
    private JMenu help; // Menú Ayuda
    private JMenu window; // Menú Ventana

    private JMenuItem salir; // Opción Salir en el menú Archivo
    private JMenuItem about; // Opción Acerca de en el menú Ayuda
    private JMenuItem maximize; // Opción Maximizar en el menú Ventana
    private JMenuItem defalut; // Opción Tamaño por defecto en el menú Ventana

    /**
     * Constructor de la clase PeliculaMenu.
     * Inicializa los menús y las opciones de menú, y los añade a la barra de menú.
     */
    public PeliculaMenu() {
        file = new JMenu("Archivo");
        salir = new JMenuItem("Salir");
        salir.setActionCommand("ItemSalir");

        file.add(salir);
        add(file);

        help = new JMenu("Ayuda");
        about = new JMenuItem("Acerca de...");
        about.setActionCommand("Info"); // Comando para el ActionListener

        help.add(about);
        this.add(help);

        window = new JMenu("Ventana");
        maximize = new JMenuItem("Maximizar");
        maximize.setActionCommand("Maximizar");
        defalut = new JMenuItem("Tamaño por defecto");
        defalut.setActionCommand("PorDefecto");

        window.add(maximize);
        window.add(defalut);
        this.add(window);
    }

    /**
     * Añade el ActionListener proporcionado a todas las opciones de menú.
     * 
     * @param actionListener el ActionListener que se añadirá a las opciones de menú
     */
    public void setActionListener(ActionListener actionListener){
        salir.addActionListener(actionListener);
        about.addActionListener(actionListener);
        maximize.addActionListener(actionListener);
        defalut.addActionListener(actionListener);
    }
}