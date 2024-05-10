package es.uv.eu.photoeditor.view;

import es.uv.eu.photoeditor.controller.PhotoEditorController;
import es.uv.eu.photoeditor.model.PhotoEditorModel;
import java.awt.BorderLayout;
import javax.swing.event.ChangeListener;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class PhotoEditorView extends JFrame {
    
    private SelectPanel selectPanel = new SelectPanel();
    private ImagenPanel imagenPanel;
    private StatusPanel statusPanel = new StatusPanel();
    private PhotoEditorMenuBar menuBar = new PhotoEditorMenuBar();
    private LineWidthPanel widthpanel = new LineWidthPanel();
    
    
    public PhotoEditorView(PhotoEditorModel model) {
        super("Photo Editor");
        setLayout(new BorderLayout());

        menuBar = new PhotoEditorMenuBar();
        selectPanel = new SelectPanel();
        imagenPanel = new ImagenPanel(model);
        statusPanel = new StatusPanel();
        widthpanel = new LineWidthPanel();
       
       
        
        setJMenuBar(menuBar);
        add(selectPanel, BorderLayout.WEST);
        add(imagenPanel, BorderLayout.CENTER);
        add(statusPanel, BorderLayout.SOUTH);
        setVisible(true);
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }


    // Métodos getter para los paneles, si los necesitas
    public SelectPanel getSelectPanel() {
        return selectPanel;
    }

    public ImagenPanel getImagenPanel() {
        return imagenPanel;
    }

    public StatusPanel getStatusPanel() {
        return statusPanel;
    }
    

    public void SetGrosor(String grosor)
    {
        statusPanel.setGrosor(grosor);
    }
    public int GetGrosor(){
        return widthpanel.getGrosor();
    }
    
    public void SetColor(Color color){
        statusPanel.setColorPincel(color);
    }
    
    public void SetRelleno(Color color){
        statusPanel.setColorRelleno(color);
    }

    public void setBotonListener1(PhotoEditorController.BotonActionListener Listener) {
        selectPanel.setListener1(Listener);
    }

    public void setBotonListener2(PhotoEditorController.BotonActionListener Listener) {
        selectPanel.setListener2(Listener);    
    }
    
    public void setMyChangeListener(ChangeListener change){
        widthpanel.SetChangeListener(change);
    }
    
    public void setPhotoEditorModel(PhotoEditorModel modelo){
        imagenPanel.setModelo(modelo);
    }

    public void setMenuListener(ActionListener listener){
        menuBar.setMyActionListener(listener);
    }

}   
