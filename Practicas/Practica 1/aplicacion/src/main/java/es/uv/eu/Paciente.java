package es.uv.eu;

/**
 * La clase Paciente representa a un paciente con informacion basica como
 * nombre, sexo, edad y numero de afiliacion.
 */

public class Paciente {

    private String nombre; // El nombre del paciente
    private String sexo; // El sexo del paciente
    private int edad; // La edad del paciente

    private final int n_afiliacion; // El numero de afiliacion del paciente
    private static int proximo_n_afiliacion; // El proximo numero de afiliacion disponible

    /**
     * Las siguientes constantes representan las categorias de edad del paciente.
     */
    
    private final int categoria;
    public final static int NINYO = 0, ADOLESCENTE = 1, ADULTO = 2, ANCIANO = 3;

    /**
     * Constructor para crear un nuevo objeto Paciente con nombre, sexo y edad
     * proporcionados.Asigna automaticamente el numero de afiliacion del paciente.
     * 
     * @param nombre El nombre del paciente.
     * @param sexo   El sexo del paciente.
     * @param edad   La edad del paciente.
     * @param categoria 
     */
    public Paciente(String nombre, String sexo, int edad, int categoria) {
        this.nombre = nombre; // Asigna el nombre proporcionado al paciente
        this.sexo = sexo; // Asigna el sexo proporcionado al paciente
        this.edad = edad; // Asigna la edad proporcionada al paciente
        this.categoria = categoria;
        n_afiliacion = proximo_n_afiliacion; // Asigna el proximo numero de afiliacion disponible al paciente
        proximo_n_afiliacion++; // Incrementa el proximo numero de afiliacion disponible para el siguiente paciente
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
    @Override
    public String toString(){
        String cadenaCategoria = "";

        cadenaCategoria = switch (categoria) {
            case 0 -> "Niño";
            case 1 -> "Adolescente";
            case 2 -> "Adulto";
            case 3 -> "Anciano";
            default -> "Error cargando el genero";
        };

        return "  -Paciente: " + nombre + "\n" + "  -Sexo: " + sexo + "\n" + "  -Edad: " + edad + "\n" + "  -Categoria: " + cadenaCategoria + "\n" + "  -Numero afilido: " + n_afiliacion + "\n";
    }
}
