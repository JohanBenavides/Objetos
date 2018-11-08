/**
 *Esta clase acciones lleva los atributos de los objetos  
 **/
package atributos_metodos;

/**
 * Johan Benavides Arias
 * octubre 1 de 2018
 */
    public class caracteristicas {
        
    String estilo, marco, modelo, manubrio, grupo, sillin;//caracteristicas de los objetos
    int ruedas;
    
    void imprimircaracteristicas(String estilo, String marco, String modelo, String manubrio, String grupo, String sillin, int ruedas){//metodo para imprimir las caracteristicas
        
         //Estilo, marco, modelo, manubrio, grupo, sillin, ruedas.
        
        System.out.println("La bicicleta tiene los sigueintes datos: \n");
        //impresión de cada una de las caracteristicas       
        System.out.println("Estilo: "+estilo);
        System.out.println("Marco: "+marco);
        System.out.println("Modelo: "+modelo);
        System.out.println("Manubrio: "+manubrio);
        System.out.println("Grupo: "+grupo);
        System.out.println("Sillin: "+sillin);
        System.out.println("Ruedas: "+ruedas+"\n");
        
        
    }
                
}
   
