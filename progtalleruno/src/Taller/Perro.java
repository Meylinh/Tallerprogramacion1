package Taller;

public class Perro extends Animal {

    public Perro(String nombre, String raza, int edad) {
        super(nombre, raza, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " dice: Guau");
    }
}