package Patrones;

//Clase base
public class Animal {
 public void hacerSonido() {
     System.out.println("Sonido genérico de animal");
 }
}

//Decorador base que envuelve un objeto Animal
public class AnimalDecorador extends Animal {
 protected Animal animal;

 public AnimalDecorador(Animal animal) {
     this.animal = animal;
 }

 @Override
 public void hacerSonido() {
     animal.hacerSonido();
 }
}

//Decorador concreto: añade comportamiento de rugido
class RugidoDecorador extends AnimalDecorador {
 public RugidoDecorador(Animal animal) {
     super(animal);
 }

 @Override
 public void hacerSonido() {
     super.hacerSonido();
     System.out.println("¡Rugido adicional!");
 }
}

//Decorador concreto: añade comportamiento de eco
class EcoDecorador extends AnimalDecorador {
 public EcoDecorador(Animal animal) {
     super(animal);
 }

 @Override
 public void hacerSonido() {
     super.hacerSonido();
     System.out.println("Eco... Eco...");
 }
}
