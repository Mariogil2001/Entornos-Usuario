package es.uv.eu; // Declaracion del paquete donde se encuentra la clase

import java.util.HashSet; // Importacioon de la clase HashSet del paquete java.util

/**
 * Clase que representa a un medico.
 */
public class Medico {
    private final HashSet<Paciente> pacientes; // HashSet para almacenar los pacientes del médico
    private String nombre; // Nombre del médico
    private String especialidad; // Especialidad del médico

    /**
     * Constructor de la clase Medico.
     * 
     * @param nombre       Nombre del médico.
     * @param especialidad Especialidad del médico.
     */
    public Medico(String nombre, String especialidad) {
        pacientes = new HashSet<>(); // Inicializa el HashSet de pacientes
        this.nombre = nombre; // Asigna el nombre proporcionado al médico
        this.especialidad = especialidad; // Asigna la especialidad proporcionada al médico
    }

    /**
     * Metodo para anyadir un paciente al conjunto de pacientes del medico.
     * 
     * @param p Paciente a anyadir.
     * @return true si el paciente se añade correctamente, false si ya estaba
     *         presente.
     */
    public boolean addPaciente(Paciente p) {
        // Anyade el paciente al HashSet y devuelve true si se anyade correctamente, false si ya estaba presente.
        return pacientes.add(p); 
    }

    /**
     * Metodo para obtener el nombre del medico.
     * 
     * @return El nombre del medico.
     */
    public String getNombre() {
        return nombre; // Devuelve el nombre del medico.
    }

    /**
     * Metodo para establecer el nombre del medico.
     * 
     * @param nombre Nuevo nombre del medico.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre; // Asigna el nuevo nombre al medico.
    }

    /**
     * Metodo para obtener la especialidad del medico.
     * 
     * @return La especialidad del medico.
     */
    public String getEspecialidad() {
        return especialidad; // Devuelve la especialidad del medico.
    }

    /**
     * Metodo para establecer la especialidad del medico.
     * 
     * @param especialidad Nueva especialidad del medico.
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad; // Asigna la nueva especialidad al medico.
    }

    /**
     * Metodo para obtener la lista de pacientes.
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
    @Override
    public String toString(){
        String resultado = "Medico responsable: " + nombre + ", " + especialidad + "\n";
        for(Paciente p: pacientes)
            resultado += p.toString() + "\n";
        return resultado;
    }
}
