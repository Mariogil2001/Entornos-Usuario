package es.uv.eu.fruit_machine.view;

import es.uv.eu.fruit_machine.model.FruitMachineModel;
import javax.swing.JPanel;
import java.awt.Color; // Import the Color class
import javax.swing.border.Border; // Import the Border class
import javax.swing.BorderFactory; // Import the BorderFactory class
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImagenPanel extends JPanel{

    FruitMachineModel model;
    private BufferedImage[] images;
    private int imageWidth = 150; // Ancho de la imagen
    private int imageHeight = 150; // Altura de la imagen

    public ImagenPanel(FruitMachineModel model){
        this.model = model;
        this.images = model.getImages();
       
        this.setSize(500,500);
        this.setVisible(true);
        setBackground(Color.GRAY);
        Border borde = BorderFactory.createLineBorder(Color.BLACK, 5);
        this.setBorder(borde);
    }

    public void setModel(FruitMachineModel model){
        this.model = model;
        this.images = model.getImages();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (images != null) {
            int totalWidth = (imageWidth * images.length) + (20 * (images.length - 1)); // Ancho total de todas las imágenes y espacios
            int startX = (this.getWidth() - totalWidth) / 2; // Posición x de inicio para centrar las imágenes
            for (int i = 0; i < images.length; i++) {
                if (images[i] != null) {
                    g.drawImage(images[i], startX + i * (imageWidth + 20), (this.getHeight() - imageHeight) / 2, imageWidth, imageHeight, this);
                }
            }
        }
    }
}