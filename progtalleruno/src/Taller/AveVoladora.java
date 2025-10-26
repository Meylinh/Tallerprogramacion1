package Taller;


public class AveVoladora extends Ave implements Volador {

    public AveVoladora(String nombre, String raza, int edad) {
        super(nombre, raza, edad);
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando en el cielo.");
    }
}
