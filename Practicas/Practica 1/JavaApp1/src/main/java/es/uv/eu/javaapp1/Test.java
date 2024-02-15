package es.uv.eu.javaapp1;
import java.util.HashSet;
// 4 Ejericio 3 - Contenedores, tipos primitivos y clases envoltorio
public class Test {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>(); // Las wrapper class que acepta son Boolean, Character, Byte, Short, Integer, Float y Double
        hs.add(5); // hs.add(new Integer(5));
        hs.add(6); // hs.add(new Integer(6));
        int suma = 0;
        for (int numero: hs)
        suma += numero; // suma += numero.intValue();
        System.out.println("El valor de la suma es " + suma);
    }
}
