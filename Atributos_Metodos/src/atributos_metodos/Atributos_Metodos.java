/**
 * Este proyecto permite pasar atributos a ttabes de los metodos
 * desde una clase que genera los metòdos, y los atributos
 **/
package atributos_metodos;

/**
 *
 * Johan Benavides
 * octubre 4 de 2018
 */
public class Atributos_Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Acciones Bici1 = new Acciones();  
       
        System.out.println("\n\nLa bicicleta ");
        Bici1.arrancar("convencional","antiprostatico","Carreras gt","2","2018","Shimano");
        Bici1.acelerar();
        Bici1.girar();
        Bici1.picar();
        Bici1.frenar();
        
        Acciones Bici2 = new Acciones(); 
        
        System.out.println("\n\nLa bicicleta ");
        Bici2.arrancar("otro","antiprostatico","Carreras gt","2","2018","Shimano");
        Bici2.acelerar();
        Bici2.girar();
        Bici2.picar();
        Bici2.frenar();
        
        Acciones Bici3 = new Acciones(); 
        
        System.out.println("\n\nLa bicicleta ");
        Bici3.arrancar("otro2","antiprostatico","Carreras gt","2","2018","Shimano");
        Bici3.acelerar();
        Bici3.girar();
        Bici3.picar();
        Bici3.frenar();
        
        Acciones Bici4 = new Acciones(); 
        
        System.out.println("\n\nLa bicicleta ");
        Bici4.arrancar("otro3","antiprostatico","Carreras gt","2","2018","Shimano");
        Bici4.acelerar();
        Bici4.girar();
        Bici4.picar();
        Bici4.frenar();
        
        Acciones Bici5 = new Acciones(); 
        
        System.out.println("\n\nLa bicicleta ");
        Bici5.arrancar("otro56","antiprostatico","Carreras gt","2","2018","Shimano");
        Bici5.acelerar();
        Bici5.girar();
        Bici5.picar();
        Bici5.frenar();
        
    }
    
}
