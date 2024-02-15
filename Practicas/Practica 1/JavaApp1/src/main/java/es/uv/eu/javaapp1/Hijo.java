package es.uv.eu.javaapp1;

// 5 Ejercicio 4 - Herencia. Construccion de objetos.

public class Hijo extends Padre{
    Hijo(){
        System.out.println("Creando Hijo");
    }
    Hijo ( int a) {
        System.out.println("Creando Hijo con un parametro");
    }
    Hijo (int a, int b){
        super(b);
        System.out.println("Creando Hijo con dos parametros");
    }
}
