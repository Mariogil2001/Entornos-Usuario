package es.uv.eu.photoeditor.controller;

import es.uv.eu.photoeditor.model.PhotoEditorModel;
import es.uv.eu.photoeditor.view.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PhotoEditorController {
    private PhotoEditorModel modelo;
    private PhotoEditorView vista;
    LoadImage Load;
    SaveImage save;
    Color color1,color2;
    int grosor, x1, y1,x2,y2;
    
    public PhotoEditorController(PhotoEditorModel modelo, PhotoEditorView vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.color1 = Color.RED;
        this.color2 = Color.RED;
        
        
        BotonActionListener BotonActionlistener1 = new BotonActionListener("1");
        vista.setBotonListener1(BotonActionlistener1);
        
        BotonActionListener BotonActionListener2 = new BotonActionListener("2");
        vista.setBotonListener2(BotonActionListener2);
        
        //MenuActionListener MenuListener = new MenuActionListener();
        //vista.setMenuListener(MenuListener);
        
        //MyChangeListener SliderListener = new MyChangeListener();
        //vista.setMyChangeListener(SliderListener);
        
        
        //vista.setPhotoEditorModel(modelo);
    }
    
     public class BotonActionListener implements ActionListener{
        String nombre;
        public BotonActionListener(String nombre ){
            this.nombre = nombre;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            
            String comand = e.getActionCommand();
             Color[] colores = {Color.BLACK,Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.LIGHT_GRAY, Color.MAGENTA,
                Color.ORANGE, Color.PINK, Color.YELLOW, Color.WHITE, Color.RED, Color.BLUE, Color.GREEN};
            
            if("1".equals(nombre)){
                color1 = colores[Integer.parseInt(comand)];
                vista.SetColor(color1);
            } 
            else if("2".equals(nombre)){
                color2 = colores[Integer.parseInt(comand)];
                vista.SetRelleno(color2);
            }
            System.out.print(nombre);
            System.out.print(comand);
        }
        
    }
    
}
