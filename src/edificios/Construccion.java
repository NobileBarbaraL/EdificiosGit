/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y
largo. La clase edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser
Techado o Abierto, esta clase implementará los dos métodos abstractos y los
atributos del padre.

• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
personas por oficina y numero de pisos. Esta clase implementará los dos
métodos abstractos y los atributos del padre.
De esta clase nos interesa saber cuantas personas pueden trabajar en todo el
edificio, el usuario dirá cuantas personas entran en cada oficina, cuantas
oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).
Crear el método cantPersonas(), que muestre cuantas personas entrarían en
un piso y cuantas en todo el edificio.

Por ultimo, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe
contener dos polideportivos y dos edificios de oficinas. Luego, recorrer este array
y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. Se
deberá mostrar la superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuantos
polideportivos son techados y cuantos abiertos. Y para la clase EdificioDeOficinas
deberemos llamar al método cantPersonas() y mostrar los resultados de cada
edificio de oficinas.
 */
package edificios;

import Clases.Edificio;
import Clases.EdificioDeOficina;
import Clases.Polideportivo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nobil
 */
public class Construccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List <Edificio> construcciones = new ArrayList();
        Polideportivo p = new Polideportivo();        
        Polideportivo p1 = new Polideportivo();
        EdificioDeOficina edo = new EdificioDeOficina();
        EdificioDeOficina edo1 = new EdificioDeOficina();
        construcciones.add(p);
        construcciones.add(p1);
        construcciones.add(edo);
        construcciones.add(edo1);
        Integer aux=0;
        Integer aux1=0;
        for (Edificio construccione : construcciones) {
            
          construccione.calcularSuperficie(construccione);
          construccione.calcularVolumen(construccione);
                if (construccione instanceof Polideportivo ) {
                    if (((Polideportivo) construccione).esTechado()) {
                        aux++;
                    }else{
                        aux1++;
                    }
                    System.out.println("Hay " + aux + " polideportivos techados");
                    System.out.println("Hay " + aux1 + " polideportivos sin techar");
            }
                
   
       }
    
}
