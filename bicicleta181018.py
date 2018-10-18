"""
En este proyecto crearemos un objeto denominado bicicleta
cada bicicleta tiene los mismos atributos como lo son:
un estilo, un marco, un modelo, un manubrio, un grupo, un sillín un número de ruedas.
Además de esto crearemos métodos los cuales representan una acción para el objeto las cuales serán:
arrancar, acelerar, girar, picar, frenar.
Creado por Johan Benavides Arias
04 de octubre de 2018
"""
import time
class acciones:

    def imprimir_caracteristicas(self,estilo,marco,modelo,manubrio,grupo,sillin,ruedas,n):
        print("La bicicleta # "+n+" tiene los sigueintes datos: ")

        print("Estilo: " + estilo)
        print("Marco: " + marco)
        print("Modelo: " + modelo)
        print("Manubrio: " + manubrio)
        print("Grupo: " + grupo)
        print("Sillin: " + sillin)
        print("Ruedas: " + ruedas)

    def arrancar(self):
        print ("La bicicleta ha arrancado")

    def acelerar(self, velocidad):
        for i in range (0,velocidad,2):
            print("la bicicleta esta acelerando a una velocidad de ",i," km/h")
            time.sleep(0.05)
        print("La bicicleta  acelero hasta la velocidad de ",velocidad," km/h")

    def girar(self):
         print("La bicicleta esta girando")

    def picar(self):
        print("La bicicleta esta picando")

    def frenar(self, velocidad, frenar ):
        for i in range (velocidad,frenar,-2):
            print("la bicicleta esta frenando a una velocidad de ",i," km/h")
            time.sleep(0.1)        
        print("La bicicleta ha frenado\n")

"""
A partir de aquí creo los objetos denominados bicicleta#
y enseguida llamo a los métodos empezando por el método "imprimir_caracteristicas” envió 8 parámetros los cuales representan lo siguiente:

El primer parámetro representa el estilo de la bicicleta
El segundo parámetro representa la marca de la bicicleta
El tercer parámetro representa el modelo de la bicicleta
El cuarto parámetro representa la marca o estilo del manubrio
El quinto parámetro representa el grupo es decir el juego de frenos, cadena etc...
El sexto parámetro representa la marca o el estilo del sillín
El séptimo parámetro representa el número de ruedas de la bicicleta
El octavo parámetro representa el número del objeto

Después de esto se llama a los métodos los cuales representan las acciones del objeto.

"""

bici1 = acciones()

bici1.imprimir_caracteristicas("Fixie","Aventador","2018","Bullhorn","Shimano","Santafixie","2","1")
bici1.arrancar()
bici1.acelerar(60)
bici1.girar()
bici1.picar()
bici1.frenar(60,0)
