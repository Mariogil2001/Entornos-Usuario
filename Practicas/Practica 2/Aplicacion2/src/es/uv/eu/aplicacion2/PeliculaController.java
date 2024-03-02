package es.uv.eu.aplicacion2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * JavaApplication: controlador del programa
 * 
 * @author Mario Gil Domingo
 * @version 2020.05.04
 * @description: Clase que representa la aplicación
 * 
 */

public class PeliculaController {

    // No se por qué no me detecta el uso de las variables model y view
    @SuppressWarnings("unused")
    private PeliculaModel model;
    @SuppressWarnings("unused")
    private PeliculaView view;

    // Constructor
    public PeliculaController(PeliculaModel model, PeliculaView view) {
        this.model = model;
        this.view = view;

        view.addWindowListener(new PeliculaControllerWindowListener());
    }

    //Clase empotrada que implementa el interfaz WindowListener
    class PeliculaControllerWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("PeliculaController: Cerrar la aplicación.");
            System.exit(0);
        }
    }
}
