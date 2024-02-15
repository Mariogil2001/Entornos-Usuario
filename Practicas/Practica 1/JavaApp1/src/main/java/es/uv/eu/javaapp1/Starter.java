package es.uv.eu.javaapp1;

import javax.swing.JOptionPane;

public class Starter {
    /*public static int parseInt(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    } */

    public static void main(String[] args) {
        String nombre, director;
        int anyo, genero, continuar;
        Coleccion coleccion = new Coleccion();
        String[] generos = { "Terror", "Ciencia ficcion", "Accion", "Suspense", "Comedia" };
        do {
            nombre = JOptionPane.showInputDialog(null, "Introduce nombre de la pelicula ");
            director = JOptionPane.showInputDialog(null, "Introduce el director de la pelicula ");
            try {
                anyo = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el anyo de la pelicula "));
            } catch (NumberFormatException e) {
                anyo = 0;
            };
            genero = JOptionPane.showOptionDialog(null, "Introduce genero de la pelicula ", "Genero",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, generos, generos[0]);
            continuar = JOptionPane.showConfirmDialog(null, "Quieres continuar? ", 
            "Seleccione la opcion deseada", JOptionPane.YES_NO_OPTION);
            coleccion.add(new Pelicula(nombre, director, anyo, genero));
        } while (continuar == 0);
        JOptionPane.showMessageDialog(null, coleccion);
        
        // 5 Ejercicio 4 - Herencia. Construccion de objetos.
       // Hijo h1 = new Hijo();
        //Hijo h2 = new Hijo(3);
        //Hijo h3 = new Hijo(3,3);
        
        /**
         * Salida por pantalla:
         * 
         * Creando padre
         * Creando Hijo
         * Creando padre
         * Creando Hijo con un parametro
         * Creando Padre con un parametro
         * Creando Hijo con dos parametros
         */
        
         // Si eliminas el constructor de la clase padre, la clase hijo no funciona porque al hacer el super da error
    }
}
