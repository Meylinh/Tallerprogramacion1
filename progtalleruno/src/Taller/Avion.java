package Taller;

public class Avion implements Volador {
    String modelo;

    public Avion(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void volar() {
        System.out.println("El avión modelo " + modelo + " esta volando.");
    }
}
