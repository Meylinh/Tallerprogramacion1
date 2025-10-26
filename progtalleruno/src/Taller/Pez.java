package Taller;

public class Pez extends Animal {
    String tipoAgua;

    public Pez(String nombre, String raza, int edad, String tipoAgua) {
        super(nombre, raza, edad);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public void emitirSonido() {
        System.out.println(nombre + " nada en agua " + tipoAgua + " y hace burbujas");
    }
}