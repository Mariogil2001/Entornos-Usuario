package es.uv.eu.photoeditor.view;

import es.uv.eu.photoeditor.model.PhotoEditorModel;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImagenPanel extends JPanel {
    private BufferedImage imageBuffer;

    PhotoEditorModel modelo;
    BufferedImage imagen;
    
    public ImagenPanel(BufferedImage imageBuffer) {
        this.imageBuffer = imageBuffer;
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imageBuffer, 0, 0, this);
    }
}