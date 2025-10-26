package Taller;

public class EjemploSOLID {
    public static void main(String[] args) {

        System.out.println("\n=== Ejemplo de Principios SOLID ===");
        // S - Single Responsibility
     

        // O - Open/Closed
        Animal pez = new Pez("Dory", "Payaso", 2, "de playa");
        pez.emitirSonido();

        // L - Liskov Substitution
        Animal animal = new Gato("Tom", "Siames", 3);
        animal.emitirSonido();

        // I - Interface Segregation
        Volador ave = new AveVoladora("Piolin", "Perico", 1);
        ave.volar();

        // D - Dependency Injection
        volarObjeto(new Avion("JAY JAY"));
    }

    public static void volarObjeto(Volador v) {
        v.volar();
    }
}