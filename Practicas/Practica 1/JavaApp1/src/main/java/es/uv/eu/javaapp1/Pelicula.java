
/*
 * Clase Pelicula
 * 
 * Entornos de Usuario, Practica 1 (2012)
 * 
 */

package es.uv.eu.javaapp1;

/**
 * 
 * @author Mario Gil Domingo
 * @author Daniel Breva
 * @version 1.0
 * 
 */

public class Pelicula {

    /**
     * Titulo de la pelicula.
     */
    private String titulo;
    /**
     * Director de la pelicula.
     */
    private String director;
    /**
     * Anyo de la pelicula
     */
    private int anyo;
    /**
     * Codigo generado automaticamente para la pelicula
     */
    private int codigo;
    /**
     * Variable de clase para almacenar el proximo codigo que sera asignado a una
     * pelicula
     */
    private static int proximoCodigo = 0;
    /**
     * Codigo del genero de la pelicula.
     */
    private int genero;
    public final static int TERROR = 0, CIENCIA_FICCION = 1, ACCION = 2, SUSPENSE = 3, COMEDIA = 4;

    /**
     * Constructor de Pelicula
     * 
     * @param titulo   Titulo de la pelicula.
     * @param director Nombre del director.
     * @param anyo     Anyo de produccion.
     * @param genero
     */
    public Pelicula(String titulo, String director, int anyo, int genero) {
        this.titulo = titulo;
        this.director = director;
        this.anyo = anyo;
        this.genero = genero;
        codigo = proximoCodigo;
        proximoCodigo++;
    }

    /**
     * Devuelve el anyo de produccion de la pelicula.
     * 
     * @return Anyo de produccion de la pelicula.
     */
    public int getAnyo() {
        return anyo;
    }

    /**
     * Asigna el anyo de produccion de la pelicula.
     * 
     * @param anyo Anyo de produccion de la pelicula.
     */
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    /**
     * Obtiene el nombre del director de la pelicula.
     * 
     * @return Nombre del director de la pelicula.
     */
    public String getDirector() {
        return director;
    }

    /**
     * Asigna el nombre del director de la pelicula.
     * 
     * @param director Nombre del director de la pelicula.
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Obtiene el titulo de la pelicula.
     * 
     * @return Titulo de la pelicula.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Asigna el titulo de la pelicula.
     * 
     * @param titulo Titulo de la pelicula.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Devuelve un entero con el codigo de la pelicula.
     * 
     * @return El entero correspondiente.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Devuelve un entero con el codigo del genero de la pelicula.
     * 
     * @return El entero correspondiente.
     */
    public int getGenero() {
        return genero;
    }

    /**
     * Asigna el genero a la pelicula
     * 
     * @param genero
     */
    public void setGenero(int genero) {
        this.genero = genero;
    }

    /**
     * Sobrecarga el operador para mostrar por pantalla.
     */
    @Override
    public String toString() {
        String cadenaGenero = "";

        switch (genero) {
            case 0:
                cadenaGenero = "Terror";
                break;
            case 1:
                cadenaGenero = "Ciencia ficcion";
                break;
            case 2:
                cadenaGenero = "Accion";
                break;
            case 3:
                cadenaGenero = "Suspense";
                break;
            case 4:
                cadenaGenero = "Comedia";
                break;
            default:
                cadenaGenero = "Error cargando el genero";
                break;
        }
        return "Codigo: " + codigo + "\n" + "Pelicula: " + titulo + "\n" + "Director: " + director + "\n" + "Anyo: "
                + anyo + "\n" + "Genero: " + cadenaGenero + "\n";
    }

    public static void main(String[] args) {
        Pelicula peli1, peli2;
        peli1 = new Pelicula("2001: Una Odisea en el Espacio", "Stanley Kubrick", 1968, Pelicula.CIENCIA_FICCION);
        peli2 = new Pelicula("2046", "Wong Kar Wai", 2004, Pelicula.CIENCIA_FICCION);
        System.out.println(peli1);
        System.out.println(peli2);

    }
}
