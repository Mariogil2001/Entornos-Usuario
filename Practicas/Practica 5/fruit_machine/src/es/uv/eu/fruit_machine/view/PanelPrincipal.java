package es.uv.eu.fruit_machine.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelPrincipal extends JPanel {
    
    private JLabel nombre;
    private JTextArea nombreusuario;
    private JLabel tematica;
    private JComboBox<String> tematicalista;
    private JCheckBox asistente; // Declarar el JCheckBox
    private JLabel saldo;
    private JButton jugarButton, salirButton, anadirSaldoButton;

    public PanelPrincipal() {
        // Configurar el panel principal con BoxLayout en eje Y (vertical)
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Crear el JLabel y JTextArea para el nombre
        nombre = new JLabel("Nombre: ");
        nombreusuario = new JTextArea(1, 20); // Ajustar el tamaño a una sola línea de texto
        nombreusuario.setLineWrap(true);
        nombreusuario.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(nombreusuario);
        scrollPane.setPreferredSize(new Dimension(200, 20)); // Ajustar el tamaño preferido del JScrollPane

        // Crear el JLabel y JComboBox para la temática
        tematica = new JLabel("Temática: ");
        String[] opciones = {"Frutas", "Comidas", "Coches"};
        tematicalista = new JComboBox<>(opciones);

        // Crear el JCheckBox para el asistente
        asistente = new JCheckBox("Asistente");

        // Crear el JLabel para el saldo
        saldo = new JLabel("Saldo: ");

        // Crear los botones
        jugarButton = new JButton("Jugar");
        jugarButton.setActionCommand("Jugar");
        salirButton = new JButton("Salir");
        salirButton.setActionCommand("salir");
        anadirSaldoButton = new JButton("Añadir Saldo");
        anadirSaldoButton.setActionCommand("aumentarSaldo");

        // Crear el panel de botones y agregar los botones
        JPanel botonesPanel = new JPanel();
        botonesPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        botonesPanel.add(jugarButton);
        botonesPanel.add(salirButton);
        botonesPanel.add(anadirSaldoButton);

        // Agregar los componentes al panel con BoxLayout
        add(Box.createRigidArea(new Dimension(0, 50))); // Añadir espacio vertical fijo al principio para aumentar el espacio inicial
        add(createHorizontalPanel(nombre, scrollPane));
        add(Box.createRigidArea(new Dimension(0, 10))); // Añadir espacio vertical fijo entre los componentes
        add(createHorizontalPanel(tematica, tematicalista));
        add(Box.createRigidArea(new Dimension(0, 10))); // Añadir espacio vertical fijo entre los componentes
        add(asistente);
        add(Box.createRigidArea(new Dimension(0, 50))); // Añadir espacio vertical fijo entre los componentes
        add(saldo);
        add(Box.createRigidArea(new Dimension(0, 50))); // Añadir espacio vertical fijo entre los componentes
        add(botonesPanel); // Añadir el panel de botones
        add(Box.createRigidArea(new Dimension(0, 20))); // Añadir espacio vertical fijo al final
    }

    private JPanel createHorizontalPanel(JComponent component1, JComponent component2) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER)); // Centrar los componentes horizontalmente
        panel.add(component1);
        panel.add(Box.createRigidArea(new Dimension(10, 0))); // Añadir espacio horizontal fijo entre los componentes
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
}
