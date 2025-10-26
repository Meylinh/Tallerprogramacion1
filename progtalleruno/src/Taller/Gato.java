package Taller;

public class Gato extends Animal {

    public Gato(String nombre, String raza, int edad) {
        super(nombre, raza, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " dice: Miau");
    }
}