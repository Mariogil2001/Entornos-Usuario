package es.uv.eu;

import java.util.HashSet;

/**
 * Clase que representa una colección de médicos.
 */
public class ColeccionMedicos {
    private HashSet<Medico> medicos; // Conjunto que almacena los médicos

    /**
     * Constructor que inicializa la colección de médicos como un HashSet vacío.
     */
    public ColeccionMedicos() {
        medicos = new HashSet<>();
    }

    /**
     * Método para agregar un médico a la colección.
     *
     * @param medico El médico a agregar.
     */
    public void addMedico(Medico medico) {
        medicos.add(medico);
    }

    /**
     * Método que verifica si un médico con el nombre especificado está presente en la colección.
     *
     * @param nombreMedico El nombre del médico a buscar.
     * @return true si el médico está presente, false en caso contrario.
     */
    public boolean contieneMedico(String nombreMedico) {
        for (Medico medico : medicos) {
            if (medico.getNombre().equalsIgnoreCase(nombreMedico)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que obtiene un médico de la colección por su nombre.
     *
     * @param nombreMedico El nombre del médico a obtener.
     * @return El médico con el nombre especificado, o null si no se encuentra.
     */
    public Medico getMedico(String nombreMedico) {
        for (Medico medico : medicos) {
            if (medico.getNombre().equalsIgnoreCase(nombreMedico)) {
                return medico;
            }
        }
        return null;
    }

    /**
     * Método que devuelve una representación en forma de cadena de la colección de médicos.
     *
     * @return Una cadena que representa la colección de médicos.
     */
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        for (Medico m : medicos) {
            resultado.append(m.toString()).append("\n");
        }
        return resultado.toString();
    }
}
