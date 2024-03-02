/*
 * Clase Coleccion
 * 
 * Entornos de Usuario, Practica 1 (2012)
 * 
 */

package es.uv.eu.javaapp1;

import java.util.HashSet; // Utilizamos HashSet para evitar posibles duplicados en la coleccion

/**
 * 
 * @author Mario Gil
 * @author Daniel Breva
 * @version 1.0
 * 
 */

public class Coleccion {
    private final HashSet<Pelicula> peliculas;
    // private static final int MAX = 100;
    // private int posicionActual = 0;

    /**
     * Constructor sin parametros
     */
    public Coleccion() {
        peliculas = new HashSet<Pelicula>();
    }

    /**
     * Anyade una pelicula a la coleccion
     * 
     * @param p La pelicula que debe anyadirse
     * @return verdadero si la operacion ha tenido exito o falso si no cabe
     */
    public boolean add(Pelicula p) {
        return peliculas.add(p);
    }

    @Override
    public String toString() {
        String resultado = "";
        for (Pelicula p : peliculas)
            resultado = resultado + p.toString() + "\n";
        return resultado;
    }

    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();
        coleccion.add(new Pelicula("2001: Una Odisea en el Espacio", "Stanley Kubrick", 1968, Pelicula.CIENCIA_FICCION));
        coleccion.add(new Pelicula("2046", "Wong Kar Wai", 2004, Pelicula.CIENCIA_FICCION));
        System.out.println(coleccion);
    }
}
