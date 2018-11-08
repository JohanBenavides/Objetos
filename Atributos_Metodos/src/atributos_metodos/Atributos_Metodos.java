/**
 * Este proyecto permite pasar atributos a travez de los metodos.
 * Ademas se imprimen las carcteristicas asignadas a cada objeto.
 **/
package atributos_metodos;

/**
 * Johan Benavides Arias
 * octubre 1 de 2018
 */
public class Atributos_Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Estilo, marco, modelo, manubrio, grupo, sillin, ruedas.
        
        caracteristicas Bici1 = new caracteristicas();//objeto #1
        Bici1.imprimircaracteristicas("Fixie","Aventador","2018","Bullhorn","Shimano","Santafixie",2);//Caracteristicas objeto #1 enviadas como parametro a la función imprimir caracteristicas 
                
        caracteristicas Bici2 = new caracteristicas();//objeto #2  
        Bici2.imprimircaracteristicas("Mountain bike","GW","2018","De montaña","Sram","antiprostatico",2);//Caracteristicas objeto #2 enviadas como parametro a la función imprimir caracteristicas 
                
        caracteristicas Bici3 = new caracteristicas();//objeto #3
        Bici3.imprimircaracteristicas("Bmx","Trek","2010","Gorilla","Alu","odysseey bmx",2);//Caracteristicas objeto #3 enviadas como parametro a la función imprimir caracteristicas 
                
        caracteristicas Bici4 = new caracteristicas();//objeto #4  
        Bici4.imprimircaracteristicas("Carretera","GW","2016","Cinelli ruta","Shimano","Carbono ruta",2);//Caracteristicas objeto #4 enviadas como parametro a la función imprimir caracteristicas 
                
        caracteristicas Bici5 = new caracteristicas();//objeto #5 
        Bici5.imprimircaracteristicas("Monareta","Feo","1980","Ancho","Pollito","Alargado y con espaldar",2);//Caracteristicas objeto #5 enviadas como parametro a la función imprimir caracteristicas             
    }
    
}
