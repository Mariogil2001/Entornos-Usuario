package es.uv.eu.aplicacion4;

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
        view.setActionListener(new PeliculaControllerActionListener());
    }

    //Clase empotrada que implementa el interfaz WindowListener
    class PeliculaControllerWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("PeliculaController: Cerrar la aplicación.");
            System.exit(0);
        }
    }

    class PeliculaControllerActionListener implements java.awt.event.ActionListener {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            String command = e.getActionCommand();
            switch (command) {
                case "buttonExit":
                    System.out.println("PeliculaController: Cerrar la aplicación.");
                    System.exit(0);
                    break;
                case "ItemSalir":
                    System.out.println("PeliculaController: Cerrar la aplicación.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("PeliculaController: Comando" + command + " no reconocido.");
                    break;
            }
        }
    }
}
