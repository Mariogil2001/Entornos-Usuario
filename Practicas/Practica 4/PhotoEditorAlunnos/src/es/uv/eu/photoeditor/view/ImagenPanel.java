package es.uv.eu.photoeditor.view;

import es.uv.eu.photoeditor.model.PhotoEditorModel;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.Color;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImagenPanel extends JPanel {
    BufferedImage imageBuffer;

    PhotoEditorModel modelo;
    BufferedImage imagen;
    
    public ImagenPanel(PhotoEditorModel modelo){
        this.modelo = modelo;
        
        this.setSize(500, 500);
        
        Border borde= BorderFactory.createLineBorder(Color.gray,1);
        this.setBorder(borde);
    }
    

    public void setModelo(PhotoEditorModel model){
        this.modelo = model;
    }
   
    @Override
    public void paintComponent(Graphics g){
         imagen = modelo.getImagen();
        
        if(imagen != null){
            g.drawImage(imagen,0 ,0,imagen.getWidth(),imagen.getHeight(), this);
            System.out.println("La imagen se ha subido");
        }
        
    }
}