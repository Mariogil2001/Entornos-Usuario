package es.uv.eu.aplicacion5;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcercaView extends JFrame{
    public AcercaView() {
        // Establece el titulo de la ventana
        super("Acerca de");

        // Define el mensaje a mostrar, con etiquetas HTML para permitir saltos de línea, sino no se muestra el mensaje completo
        String mensaje = "<html>Una pequeña aplicación para mostrar<br>el desarrollor de interfaces gráficas de usuario<br>con la API Swing  de Java.</html>";

        // Crea un nuevo panel con BorderLayout
        JPanel panel = new JPanel(new BorderLayout());

        // Crea las etiquetas para el título y el mensaje
        JLabel titleLabel = new JLabel("Aplicación 1", JLabel.CENTER);
        JLabel textLabel = new JLabel(mensaje, JLabel.CENTER);

        // Crea el boton OK
        JButton okButton = new JButton("OK");

        // Anyade un ActionListener al botón OK para cerrar la ventana cuando se haga clic en este
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra esta ventana
            }
        });

        // Añade los componentes al panel en las posiciones correspondientes
        panel.add(titleLabel, BorderLayout.NORTH); // Título en la parte superior
        panel.add(textLabel, BorderLayout.CENTER); // Mensaje en el centro
        panel.add(okButton, BorderLayout.SOUTH); // Botón OK en la parte inferior

        // Añade el panel a la ventana
        this.add(panel);

        // Establece el tamaño de la ventana
        this.setSize(300, 200);

        // Establece que la ventana se cierre cuando se haga clic en el botón de cierre de la ventana
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}