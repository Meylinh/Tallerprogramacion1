package Taller;

public class Ave extends Animal {

    public Ave(String nombre, String raza, int edad) {
        super(nombre, raza, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " dice: Pío pío");
    }
}