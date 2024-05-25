package es.uv.eu.fruit_machine.view;

import javax.imageio.ImageIO;
import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import es.uv.eu.fruit_machine.model.FruitMachineModel;
import es.uv.eu.fruit_machine.model.FruitMachineModel.Observer; // Importa la interfaz Observer correcta

public class PanelPrincipal extends JPanel implements Observer {
    
    private JLabel nombre;
    private JTextArea nombreusuario;
    private JLabel tematica;
    private JComboBox<String> tematicalista;
    private JCheckBox asistente;
    private JLabel saldo;
    private JButton jugarButton, salirButton, anadirSaldoButton;
    private FruitMachineModel model;
    private BufferedImage logo;

    public PanelPrincipal() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        try {
            logo = ImageIO.read(new File("./imagenes/header_fruit.jpg"));
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen");
        }

        // Crea un JLabel con la imagen si la imagen se cargó correctamente
        if (logo != null) {
            JLabel imagenLabel = new JLabel(new ImageIcon(logo));
            imagenLabel.setAlignmentX(CENTER_ALIGNMENT);
            add(Box.createRigidArea(new Dimension(0, 30)));
            add(imagenLabel, BorderLayout.CENTER);
        }
        
        nombre = new JLabel("Nombre: ");
        nombreusuario = new JTextArea(1, 20);
        nombreusuario.setLineWrap(true);
        nombreusuario.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(nombreusuario);
        scrollPane.setPreferredSize(new Dimension(200, 20));

        tematica = new JLabel("Temática: ");
        String[] opciones = {"Frutas", "Comidas", "Coches"};
        tematicalista = new JComboBox<>(opciones);

        asistente = new JCheckBox("Asistente");
        asistente.setAlignmentX(CENTER_ALIGNMENT);

        saldo = new JLabel("Saldo: ");
        saldo.setAlignmentX(CENTER_ALIGNMENT);

        jugarButton = new JButton("Jugar");
        jugarButton.setActionCommand("Jugar");
        salirButton = new JButton("Salir");
        salirButton.setActionCommand("salir");
        anadirSaldoButton = new JButton("Añadir Saldo");
        anadirSaldoButton.setActionCommand("aumentarSaldo");

        JPanel botonesPanel = new JPanel();
        botonesPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        botonesPanel.setOpaque(false); // Para que el fondo del panel sea transparente
        botonesPanel.add(jugarButton);
        botonesPanel.add(salirButton);
        botonesPanel.add(anadirSaldoButton);
        
        add(Box.createRigidArea(new Dimension(0, 30)));
        add(createHorizontalPanel(nombre, scrollPane));
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(createHorizontalPanel(tematica, tematicalista));
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(asistente);
        add(Box.createRigidArea(new Dimension(0, 50)));
        add(saldo);
        add(Box.createRigidArea(new Dimension(0, 50)));
        add(botonesPanel);
        add(Box.createRigidArea(new Dimension(0, 20)));
        
    }

    

    private JPanel createHorizontalPanel(JComponent component1, JComponent component2) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(component1);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.add(component2);
        return panel;
    }

    public void setMyActionListener(ActionListener listener){
        jugarButton.addActionListener(listener);
        salirButton.addActionListener(listener);
    }
    public void setActionListener(ActionListener listener){
        anadirSaldoButton.addActionListener(listener);
    }
    
    public void setModelo(FruitMachineModel model) {
        if (this.model != null) {
            this.model.removeObserver(this);
        }
        this.model = model;
        this.model.addObserver(this);
        update(model);
    }

    @Override
    public void update(FruitMachineModel model) {
        saldo = new JLabel("Saldo: " + model.getSaldo());
    }

    
}
    