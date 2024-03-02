package es.uv.eu.aplicacion4;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Mario Gil Domingo
 * @version 2020.05.04
 * @description: Clase que representa el panel de la lista
 */
public class ListaPanel extends JPanel {
    private PeliculaModel peliculas;
    private JTextArea textArea;
    private JScrollPane scroll;

    public ListaPanel(PeliculaModel peliculas) {

        this.peliculas = peliculas;

        this.setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBackground(Color.LIGHT_GRAY);
        textArea.setForeground(Color.BLACK);
        textArea.setFont(new Font("Sans", Font.BOLD, 12));
        scroll = new JScrollPane(textArea);

        this.add(scroll, BorderLayout.CENTER);
        this.setVisible(true);

    }

    public void mostrar() {
        textArea.append(peliculas.toString());
    }
}

/**
 * 1. ¿Qué pasaría si hubiésemos utilizado un FlowLayout en vez de un BorderLayout?
 * 
 * El FlowLayout es un layout que coloca los componentes en una fila, de izquierda a derecha, y cuando se acaba el espacio, se pasa a la siguiente fila.
 * Si hubiésemos utilizado un FlowLayout, los componentes se habrían colocado en una fila, y al no haber espacio suficiente, se habrían colocado en la siguiente fila,
 * y así sucesivamente.
 * El BorderLayout coloca los componentes en el centro, norte, sur, este y oeste, y si no hay espacio suficiente, los componentes se redimensionan para que quepan.
 * 
 * 2. ¿Cuál es la ventaja de utilizar BorderLayout frente a FlowLayout?
 * Si se necesita que los componentes se coloquen en una posición concreta, es mejor utilizar BorderLayout.
 */