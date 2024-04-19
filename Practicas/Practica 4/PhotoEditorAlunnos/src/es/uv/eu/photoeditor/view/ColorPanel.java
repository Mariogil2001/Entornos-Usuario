package es.uv.eu.photoeditor.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class ColorPanel extends JPanel {
    private JButton[][] buttons;
    private List<Color> colors;
    private List<String> colorNames;

    public ColorPanel() {
        buttons = new JButton[7][7]; // Ajustar el tamaño según sea necesario

        // Crear una lista de colores
        colors = new ArrayList<>();
        colors.add(Color.BLACK);
        colors.add(Color.CYAN);
        colors.add(Color.DARK_GRAY);
        colors.add(Color.GRAY);
        colors.add(Color.LIGHT_GRAY);
        colors.add(Color.MAGENTA);
        colors.add(Color.ORANGE);
        colors.add(Color.PINK);
        colors.add(Color.YELLOW);
        colors.add(Color.WHITE);
        colors.add(Color.RED);
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);

        // Crear una lista de nombres de colores
        colorNames = new ArrayList<>();
        colorNames.add("Negro");
        colorNames.add("Cyan");
        colorNames.add("Gris oscuro");
        colorNames.add("Gris");
        colorNames.add("Gris claro");
        colorNames.add("Magenta");
        colorNames.add("Naranja");
        colorNames.add("Rosa");
        colorNames.add("Amarillo");
        colorNames.add("Blanco");
        colorNames.add("Rojo");
        colorNames.add("Azul");
        colorNames.add("Verde");

        // Inicializar y configurar los botones aquí
        int colorIndex = 0;
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                Color color = colors.get(colorIndex % colors.size());
                buttons[i][j] = new JButton();
                
                // Establecer el color de fondo del botón
                buttons[i][j].setBackground(color);
                
                // Establecer el texto del botón para representar su color
                buttons[i][j].setText(colorNames.get(colorIndex % colorNames.size()));

                add(buttons[i][j]);
                colorIndex++;
            }
        }
    }
}