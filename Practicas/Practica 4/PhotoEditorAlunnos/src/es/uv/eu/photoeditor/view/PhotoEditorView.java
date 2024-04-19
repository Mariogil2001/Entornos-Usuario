package es.uv.eu.photoeditor.view;

import es.uv.eu.photoeditor.model.PhotoEditorModel;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class PhotoEditorView extends JFrame {
    private SelectPanel selectPanel;
    private ImagenPanel imagenPanel;
    private StatusPanel statusPanel;
    private PhotoEditorMenuBar menuBar;

    public PhotoEditorView(PhotoEditorModel model) {
        super("Photo Editor");
        setLayout(new BorderLayout());

        menuBar = new PhotoEditorMenuBar();
        selectPanel = new SelectPanel();
        imagenPanel = new ImagenPanel(model.getImagen());
        statusPanel = new StatusPanel();

        setJMenuBar(menuBar);
        add(selectPanel, BorderLayout.WEST);
        add(imagenPanel, BorderLayout.CENTER);
        add(imagenPanel, BorderLayout.EAST);
        add(statusPanel, BorderLayout.SOUTH);

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
}