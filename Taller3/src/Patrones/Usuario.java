package Patrones;

//Aplicación del patrón Factory Method para crear distintos tipos de Usuario
//Este patrón permite instanciar objetos según el tipo solicitado sin exponer la lógica de creación

//Clase base
public class Usuario {
 protected String nombre;

 public Usuario(String nombre) {
     this.nombre = nombre;
 }

 public String getNombre() {
     return nombre;
 }

 public void mostrarTipo() {
     System.out.println("Soy un usuario general");
 }
}

//Subclases específicas
class UsuarioAdmin extends Usuario {
 public UsuarioAdmin(String nombre) {
     super(nombre);
 }

 @Override
 public void mostrarTipo() {
     System.out.println("Soy un usuario administrador");
 }
}

class UsuarioInvitado extends Usuario {
 public UsuarioInvitado(String nombre) {
     super(nombre);
 }

 @Override
 public void mostrarTipo() {
     System.out.println("Soy un usuario invitado");
 }
}

//Clase Factory que decide qué tipo de Usuario crear
public class UsuarioFactory {
 public Usuario crearUsuario(String tipo, String nombre) {
     if (tipo.equalsIgnoreCase("normal")) {
         return new Usuario(nombre);
     } else if (tipo.equalsIgnoreCase("admin")) {
         return new UsuarioAdmin(nombre);
     } else if (tipo.equalsIgnoreCase("invitado")) {
         return new UsuarioInvitado(nombre);
     }

     // Si el tipo no es reconocido, se retorna null o se lanza una excepción
     return null;
 }
}
