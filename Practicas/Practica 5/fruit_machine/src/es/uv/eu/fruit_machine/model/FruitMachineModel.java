package es.uv.eu.fruit_machine.model;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FruitMachineModel {
    
    public int saldo;
    public int nums[];
    public String nombre;
    public int puntuacion;
    private BufferedImage[] images;
    private String[] imagenFileNames;
    private List<Observer> observers;

    public FruitMachineModel(){
        this.saldo = 0;
        this.puntuacion = 0;
        this.images = new BufferedImage[3];
        this.imagenFileNames = new String[3];
        this.observers = new ArrayList<>(); // Inicializa la lista de observadores
        this.tirada();
    }

    public void tirada(){
        nums = new int[3];
        for(int i = 0; i < 3; i++){
            nums[i] = (int)(Math.random() * 7); // Genera un número aleatorio entre 0 y 7
            imagenFileNames[i] = "./imagenes/" + String.format("%02d", nums[i]) + ".png";
            try {
                images[i] = ImageIO.read(new File(imagenFileNames[i]));
                System.out.println("Imagen '" + imagenFileNames[i] + "' leída correctamente.");
            }
            catch (IOException e) {
                System.out.println("Problemas leyendo la imagen '" + imagenFileNames[i] + "'.");
                System.out.println("Motivo: " + e.getLocalizedMessage());
            }
        }
    
        // Verifica si los tres números son iguales
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            switch (nums[0]) {
                case 0:
                    saldo *= 10; // Si los tres números son 0, multiplica el saldo por 10
                    break;
                case 1:
                    saldo += 50; // Si los tres números son 1, aumenta el saldo en 50
                    break;
                case 5:
                    saldo += 100; // Si los tres números son 5, aumenta el saldo en 100
                    break;
            }
        }
    
        notifyObservers();
    }

    public BufferedImage[] getImages() {
        return images;
    }

    public String[] getImagenFileNames() {
        return imagenFileNames;
    }

    public void aumentarSaldo(int amount) {
        this.saldo += amount;
        notifyObservers();
    }

    public int getSaldo() {
        return this.saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    public int getPuntuacion() {
        return this.puntuacion;
    }
    public interface Observer {
        public void update(FruitMachineModel model);        
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}