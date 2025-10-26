package Taller;

public class Animal {
    String nombre;
    String raza;
    int edad;

    // Constructor
    public Animal(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    // Método general
    public void emitirSonido() {
        System.out.println("El animal hace un sonido.");
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }
}