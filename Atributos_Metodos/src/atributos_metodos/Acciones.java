/**
 * Esta clase acciones lleva los atributos de los objetos 
 * asi como los metodos que sirven para crear acciones a los objetos del main
 **/
package atributos_metodos;

/**
 *Johan Benavides
 * octubre 4 de 2018
 */
public class Acciones {
    String manubrio, sillin, marco, marca, modelo, grupo;
    int ruedas;
    
    void arrancar(String manubrio, String sillin, String marco, String ruedas, String modelo, String grupo){
        System.out.println("La bicicleta ha arrancado");
        System.out.println("La bicicleta tiene los sigueintes datos: ");
        System.out.println("Manubrrio: "+manubrio);
        System.out.println("Sillin: "+sillin);
        System.out.println("Marco: "+marco);
        System.out.println("Ruedas: "+ruedas);
        System.out.println("Modelo: "+modelo);
        System.out.println("Grupo: "+grupo);
    }
    void acelerar(){
        System.out.println("La bicicleta esta acelerando");
    }
    void girar(){
        System.out.println("La bicicleta esta girando");
    }
    void picar(){
        System.out.println("La bicicleta esta picando");
    }
    void frenar(){
        System.out.println("La bicicleta ha frenado");
    }
            
}
