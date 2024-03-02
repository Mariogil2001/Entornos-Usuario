package es.uv.eu;

import java.util.HashSet;

/**
 * Clase que representa una coleccion de medicos.
 */
public class ColeccionMedicos {
    private HashSet<Medico> medicos; // Conjunto que almacena los medicos

    /**
     * Constructor que inicializa la coleccion de medicos como un HashSet vaci­o.
     */
    public ColeccionMedicos() {
        medicos = new HashSet<>();
    }

    /**
     * Metodo para agregar un medico a la coleccion.
     *
     * @param medico El medico a agregar.
     */
    public void addMedico(Medico medico) {
        medicos.add(medico);
    }

    /**
     * Metodo que verifica si un medico con el nombre especificado esta presente en la coleccion.
     *
     * @param nombreMedico El nombre del medico a buscar.
     * @return true si el medico esta presente, false en caso contrario.
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
     * Metodo que obtiene un medico de la coleccion por su nombre.
     *
     * @param nombreMedico El nombre del medico a obtener.
     * @return El medico con el nombre especificado, o null si no se encuentra.
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
     * Metodo que devuelve una representacion en forma de cadena de la coleccion de medicos.
     *
     * @return Una cadena que representa la coleccion de medicos.
     */
    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        for (Medico m : medicos) {
            resultado.append(m.toString()).append("\n");
        }
        return resultado.toString();
    }
}
