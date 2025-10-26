package Taller;

public class Main {
    public static void main(String[] args) {

        Animal[] animales = {
            new Perro("Firulais", "Labrador", 3),
            new Gato("Dojacat", "Siames", 2),
            new Ave("Roger", "Gallina de patio", 1),
            new Pez("Nemo", "Payaso", 1, "de rio")
        };

        System.out.println("=== Sonidos de los animales ===");

        for (Animal animal : animales) {
            animal.emitirSonido();
        }
    }
}


