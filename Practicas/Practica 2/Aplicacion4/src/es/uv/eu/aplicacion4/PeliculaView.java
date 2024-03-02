package es.uv.eu.aplicacion4;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

/**
 *
 * @author Mario Gil Domingo
 * @version 2020.05.04
 * @description: Clase que representa la vista de la aplicación Pelicula
 * 
 */
public class PeliculaView extends JFrame {

    @SuppressWarnings("unused") // Para evitar el warning de que la variable no se usa
    private PeliculaModel peliculas;
    private ListaPanel listaPanel;
    private PeliculaMenu PeliculaMenu;
    private JButton exit;
    
    public PeliculaView(PeliculaModel peliculas) {
        // Invoca al constructor de la clase padre
        super("Aplicación 1 : Lista de Películas");

        this.peliculas = peliculas;
        this.setLayout(new BorderLayout());
        
        // Crea el panel de la lista de películas
        this.setSize(800,400);

        // Crea el menú
        PeliculaMenu = new PeliculaMenu();
        this.setJMenuBar(PeliculaMenu);

        //Botón de salida
        exit = new JButton("Salir");
        exit.setActionCommand("buttonExit");

        //Cabecera identificativa de la aplicación
        JLabel label = new JLabel("Lista de Películas");
        label.setFont(new Font("Sans", Font.BOLD, 14));

        // El panel con la lista de películas
        listaPanel = new ListaPanel(peliculas);
        listaPanel.mostrar();

        // Añade los componentes al panel
        this.add(label, BorderLayout.NORTH);
        this.add(listaPanel, BorderLayout.CENTER);
        this.add(exit, BorderLayout.SOUTH);
        }

        public void setActionListener(ActionListener actionListener){
            exit.addActionListener(actionListener);
            PeliculaMenu.setActionListener(actionListener);
        }
}

/**
 * ¿A qué clase pertenece el método add?
 * A la clase container, que es una clase padre de JFrame.
 * 
 * ¿Qué sucedería si comentamos la línea 25 del listado 1? 
 * ¿Obtendriamos la misma disposicion de componentes?
 * ¿Por qué?
 * 
 * Si comentamos la línea 25 del listado 1, no obtendríamos la misma disposición de componentes.
 */