package Patrones;

//Librería externa - no modificar
public class LibreriaExterna {
 public void metodoExterno() {
     System.out.println("Funcionalidad externa sin modificar.");
 }
}

//Interfaz esperada por el sistema
interface AdaptadorI {
 void funcionAdaptada();
}

//Clase Adaptador que traduce la interfaz externa a la esperada
public class Adaptador implements AdaptadorI {
 private LibreriaExterna externa = new LibreriaExterna();

 @Override
 public void funcionAdaptada() {
     // Se adapta la llamada al método externo
     externa.metodoExterno();
 }
}

