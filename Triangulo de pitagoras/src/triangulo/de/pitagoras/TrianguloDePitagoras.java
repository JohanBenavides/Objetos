/*
 * Este programa calcula la hipotenusa mediante objetos, los cuales retornan valores que se unen para dar un resultado total
 */
package triangulo.de.pitagoras;
import java.util.Scanner;
/**
 *
 * @Johan Benavides
 */
public class TrianguloDePitagoras {
    static Scanner leer = new Scanner(System.in);//scanner leer esta global por que lo uso en el metodo nùmeros
    static TrianguloDePitagoras mth = new TrianguloDePitagoras();
    
    int nùmeros (String solicitud){//objeto solicitar nùmeros, este retorna el atributo n
        System.out.print("Ingrese "+solicitud+": ");
        int n = leer.nextInt();        
        return n;
    }
    int potencia (int a, int b){      
     if(b==0){//caso base
       return 1;}
     else{ return a*potencia(a,b-1);}//potencia obtenida mediante recursión
    }
    public double raiz_cuadrada (int a)//función cuadrada, recibe como parámetro un número cuya raíz cuadrada se calcula
    {     
     return Math.sqrt(a);//La clase Math contiene métodos para realizar operaciones numéricas básicas como las funciones exponencial elemental, logaritmo, raíz cuadrada y trigonométrica.
    }
    void imprimir (int a,int b){//objeto imprimir, su atributo es la hipotenusa
        double hipotenusa =mth.raiz_cuadrada(a+b);
        System.out.println("La hipotenusa es: "+hipotenusa);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //valor de los catetos
        int a1 = mth.nùmeros(" cateto #1 ");//se llama al objeto nùmeros que cumple la funcion de recibir un nùmero de consola y lo retorna
        int b1 = mth.nùmeros(" cateto #2 ");//se llama al objeto nùmeros que cumple la funcion de recibir un nùmero de consola y lo retorna
        
        //catetos al cuadrado
        int a2= mth.potencia(a1,2);//se llama al objeto potencia se envia como parametro la base y el exponente
        int b2= mth.potencia(b1,2);//se llama al objeto potencia se envia como parametro la base y el exponente
        
        mth.imprimir(a2, b2);//llamado del objeto imprimir se envaian como parametros los valores de los catetos al cuadrado
        
        
        
    }
    
}
