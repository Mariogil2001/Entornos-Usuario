package es.uv.eu.model;

public class FruitMachineModel {
    
    public int saldo;
    public int nums[];

    public FruitMachineModel(){
        this.saldo = 0;
    }

    public void aumentarSaldo(int amount) {
        this.saldo += amount;

    }

    public int getSaldo() {
        return this.saldo;
    }

    public void tirada(){
        nums = new int[3];
        for(int i = 0; i < 3; i++){
            nums[i] = (int)(Math.random() * 7); // Genera un número aleatorio entre 0 y 9
            System.out.println(nums[i]);
        }
    }
}