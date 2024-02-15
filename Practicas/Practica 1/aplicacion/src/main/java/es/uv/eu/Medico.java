package es.uv.eu; // Declaración del paquete donde se encuentra la clase

import java.util.HashSet; // Importación de la clase HashSet del paquete java.util

/**
 * Clase que representa a un médico.
 */
public class Medico {
    private HashSet<Paciente> pacientes; // HashSet para almacenar los pacientes del médico
    private String nombre; // Nombre del médico
    private String especialidad; // Especialidad del médico

    /**
     * Constructor de la clase Medico.
     * 
     * @param nombre       Nombre del médico.
     * @param especialidad Especialidad del médico.
     */
    public Medico(String nombre, String especialidad) {
        pacientes = new HashSet<Paciente>(); // Inicializa el HashSet de pacientes
        this.nombre = nombre; // Asigna el nombre proporcionado al médico
        this.especialidad = especialidad; // Asigna la especialidad proporcionada al médico
    }

    /**
     * Método para añadir un paciente al conjunto de pacientes del médico.
     * 
     * @param p Paciente a añadir.
     * @return true si el paciente se añade correctamente, false si ya estaba
     *         presente.
     */
    public boolean añadirPaciente(Paciente p) {
        // Añade el paciente al HashSet y devuelve true si se añade correctamente, false si ya estaba presente.
        return pacientes.add(p); 
    }

    /**
     * Método para obtener el nombre del médico.
     * 
     * @return El nombre del médico.
     */
    public String getNombre() {
        return nombre; // Devuelve el nombre del médico.
    }

    /**
     * Método para establecer el nombre del médico.
     * 
     * @param nombre Nuevo nombre del médico.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre; // Asigna el nuevo nombre al médico.
    }

    /**
     * Método para obtener la especialidad del médico.
     * 
     * @return La especialidad del médico.
     */
    public String getEspecialidad() {
        return especialidad; // Devuelve la especialidad del médico.
    }

    /**
     * Método para establecer la especialidad del médico.
     * 
     * @param especialidad Nueva especialidad del médico.
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad; // Asigna la nueva especialidad al médico.
    }

    /**
     * Método para obtener la lista de pacientes.
     * 
     * @return Un HashSet con los pacientes.
     */
    public HashSet<Paciente> getPacientes() {
        return pacientes;
    }
    /**
     * Sobrecarga de operador para mostrar el medico con un bucle de los pacientes
     * previamente creado.
     */
    public String toString(){
        String resultado = "Medico responsable: " + nombre + ", " + especialidad + "\n";
        for(Paciente p: pacientes)
            resultado += p.toString() + "\n";
        return resultado;
    }
}
