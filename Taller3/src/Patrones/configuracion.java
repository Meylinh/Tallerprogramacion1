package Patrones;

 // Aplicación del patrón Singleton en la clase Configuracion        
 // Este patrón garantiza que solo exista una instancia de la clase  
 // y proporciona un punto de acceso global a ella.                  
                                                                     
 public class Configuracion {                                        
     // Atributo estático que almacena la única instancia            
     private static Configuracion instancia = null;                  
                                                                     
     // Atributo de configuración                                    
     private String configValor;                                     
                                                                     
     // Constructor privado para evitar instanciación externa        
     private Configuracion() {                                       
         configValor = "Valor por defecto";                          
     }                                                               
                                                                     
     // Método público y estático para obtener la instancia única    
     public static Configuracion getInstancia() {                    
         if (instancia == null) {                                    
             instancia = new Configuracion(); // Se crea solo una vez
         }                                                           
         return instancia;                                           
     }                                                               
                                                                     
     // Métodos de acceso y modificación del valor de configuración  
     public String getConfigValor() {                                
         return configValor;                                         
     }                                                               
                                                                     
     public void setConfigValor(String valor) {                      
         this.configValor = valor;                                   
     }                                                               
 }                                                                   
                                                                     
