package es.uv.eu;

/**
 * 
 * @author Mario Gil 
 * @author Daniel Breva
 * 
 * @version 1.0
 * 
 */

import javax.swing.JOptionPane;

/**
 * Clase principal que permite agregar medicos y pacientes a una coleccion y
 * mostrarla.
 */
public class Main {
    public static void main(String[] args) {
        String nombre, sexo, especialidad;
        int edad, categoria, continuarAgregarMedico, continuarAgregarPaciente;

        // Se crea una instancia de la coleccion de medicos
        ColeccionMedicos coleccionMedicos = new ColeccionMedicos();

        // Arreglo de categorias de edad para la seleccion del usuario
        String[] categoriasEdad = { "Ninyo", "Adolescente", "Adulto", "Anciano" };

        // Bucle para agregar medicos y sus pacientes
        do {
            // Se solicita al usuario ingresar el nombre y la especialidad del medico
            String nombreMedico = JOptionPane.showInputDialog(null, "Introduce nombre del medico");
            especialidad = JOptionPane.showInputDialog(null, "Introduce la especialidad del medico");

            // Se crea el medico y se agrega a la coleccion de medicos
            Medico medico = new Medico(nombreMedico, especialidad);
            coleccionMedicos.addMedico(medico);

            // Bucle para agregar pacientes al medico actual
            do {
                // Se solicita al usuario ingresar informacion del paciente
                nombre = JOptionPane.showInputDialog(null, "Introduce nombre del paciente");
                sexo = JOptionPane.showInputDialog(null, "Introduce el sexo del paciente (M/F)");
                try {
                    edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la edad del paciente"));
                } catch (NumberFormatException e) {
                    edad = 18;
                }
                ;
                // Se muestra un dialogo de seleccion de categoria de edad
                categoria = JOptionPane.showOptionDialog(null, "Selecciona la categoria de edad del paciente",
                        "Categoria",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, categoriasEdad,
                        categoriasEdad[0]);

                // Se crea el paciente y se agrega al medico actual
                Paciente paciente = new Paciente(nombre, sexo, edad, categoria);
                medico.addPaciente(paciente);

                // Se pregunta al usuario si desea agregar otro paciente
                continuarAgregarPaciente = JOptionPane.showConfirmDialog(null, "Quieres agregar otro paciente?",
                        "Seleccione la opcion deseada",
                        JOptionPane.YES_NO_OPTION);
            } while (continuarAgregarPaciente == JOptionPane.YES_OPTION);

            // Se pregunta al usuario si desea agregar otro medico
            continuarAgregarMedico = JOptionPane.showConfirmDialog(null, "Quieres agregar otro medico?",
                    "Seleccione la opcion deseada",
                    JOptionPane.YES_NO_OPTION);

        } while (continuarAgregarMedico == JOptionPane.YES_OPTION);

        // Se muestra la coleccion de medicos y sus pacientes en un cuadro de dialogo
        JOptionPane.showMessageDialog(null, coleccionMedicos);
    }
}
