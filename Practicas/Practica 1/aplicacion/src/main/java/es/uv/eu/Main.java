package es.uv.eu;

/**
 * 
 * @author Mario Gil Domingo
 * 
 * @version 1.0
 * 
 */

import javax.swing.JOptionPane;

/**
 * Clase principal que permite agregar médicos y pacientes a una colección y
 * mostrarla.
 */
public class Main {
    public static void main(String[] args) {
        String nombre, sexo, especialidad;
        int edad, categoria, continuarAgregarMedico, continuarAgregarPaciente;

        // Se crea una instancia de la colección de médicos
        ColeccionMedicos coleccionMedicos = new ColeccionMedicos();

        // Arreglo de categorías de edad para la selección del usuario
        String[] categoriasEdad = { "Niño", "Adolescente", "Adulto", "Anciano" };

        // Bucle para agregar médicos y sus pacientes
        do {
            // Se solicita al usuario ingresar el nombre y la especialidad del médico
            String nombreMedico = JOptionPane.showInputDialog(null, "Introduce nombre del médico");
            especialidad = JOptionPane.showInputDialog(null, "Introduce la especialidad del médico");

            // Se crea el médico y se agrega a la colección de médicos
            Medico medico = new Medico(nombreMedico, especialidad);
            coleccionMedicos.addMedico(medico);

            // Bucle para agregar pacientes al médico actual
            do {
                // Se solicita al usuario ingresar información del paciente
                nombre = JOptionPane.showInputDialog(null, "Introduce nombre del paciente");
                sexo = JOptionPane.showInputDialog(null, "Introduce el sexo del paciente (M/F)");
                try {
                    edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la edad del paciente"));
                } catch (NumberFormatException e) {
                    edad = 18;
                }
                ;
                // Se muestra un diálogo de selección de categoría de edad
                categoria = JOptionPane.showOptionDialog(null, "Selecciona la categoría de edad del paciente",
                        "Categoría",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, categoriasEdad,
                        categoriasEdad[0]);

                // Se crea el paciente y se agrega al médico actual
                Paciente paciente = new Paciente(nombre, sexo, edad, categoria);
                medico.añadirPaciente(paciente);

                // Se pregunta al usuario si desea agregar otro paciente
                continuarAgregarPaciente = JOptionPane.showConfirmDialog(null, "¿Quieres agregar otro paciente?",
                        "Seleccione la opción deseada",
                        JOptionPane.YES_NO_OPTION);
            } while (continuarAgregarPaciente == JOptionPane.YES_OPTION);

            // Se pregunta al usuario si desea agregar otro médico
            continuarAgregarMedico = JOptionPane.showConfirmDialog(null, "¿Quieres agregar otro médico?",
                    "Seleccione la opción deseada",
                    JOptionPane.YES_NO_OPTION);

        } while (continuarAgregarMedico == JOptionPane.YES_OPTION);

        // Se muestra la colección de médicos y sus pacientes en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, coleccionMedicos);
    }
}
