package es.uv.eu;

/**
 * La clase Paciente representa a un paciente con información básica como
 * nombre, sexo, edad y número de afiliación.
 */

public class Paciente {

    private String nombre; // El nombre del paciente
    private String sexo; // El sexo del paciente
    private int edad; // La edad del paciente

    private int n_afiliacion; // El número de afiliación del paciente
    private static int proximo_n_afiliacion; // El próximo número de afiliación disponible

    /**
     * Las siguientes constantes representan las categorías de edad del paciente.
     */
    private int categoria;
    public final static int NINYO = 0, ADOLESCENTE = 1, ADULTO = 2, ANCIANO = 3;

    /**
     * Constructor para crear un nuevo objeto Paciente con nombre, sexo y edad
     * proporcionados.
     * Asigna automáticamente el número de afiliación del paciente.
     * 
     * @param nombre El nombre del paciente.
     * @param sexo   El sexo del paciente.
     * @param edad   La edad del paciente.
     */
    public Paciente(String nombre, String sexo, int edad, int categoria) {
        this.nombre = nombre; // Asigna el nombre proporcionado al paciente
        this.sexo = sexo; // Asigna el sexo proporcionado al paciente
        this.edad = edad; // Asigna la edad proporcionada al paciente
        this.categoria = categoria;
        n_afiliacion = proximo_n_afiliacion; // Asigna el próximo número de afiliación disponible al paciente
        proximo_n_afiliacion++; // Incrementa el próximo número de afiliación disponible para el siguiente paciente
    }

    /**
     * Devuelve el nombre del paciente.
     * 
     * @return El nombre del paciente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del paciente.
     * 
     * @param nombre El nuevo nombre del paciente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el sexo del paciente.
     * 
     * @return El sexo del paciente.
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Establece el sexo del paciente.
     * 
     * @param sexo El nuevo sexo del paciente.
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Devuelve la edad del paciente.
     * 
     * @return La edad del paciente.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del paciente.
     * 
     * @param edad La nueva edad del paciente.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Devuelve el número de afiliación del paciente.
     * 
     * @return El número de afiliación del paciente.
     */
    public int getN_afiliacion() {
        return n_afiliacion;
    }

    /**
     * Sobrecarga del operador para mostrar los datos de un paciente.
     */
    public String toString(){
        String cadenaCategoria = "";

        switch (categoria) {
            case 0:
            cadenaCategoria = "Niño";
                break;
            case 1:
            cadenaCategoria = "Adolescente";
                break;
            case 2:
            cadenaCategoria = "Adulto";
                break;
            case 3:
            cadenaCategoria = "Anciano";
                break;
            default:
            cadenaCategoria = "Error cargando el genero";
                break;
        }

        return "  -Paciente: " + nombre + "\n" + "  -Sexo: " + sexo + "\n" + "  -Edad: " + edad + "\n" + "  -Categoria: " + cadenaCategoria + "\n" + "  -Numero afilido: " + n_afiliacion + "\n";
    }
}
