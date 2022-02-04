/*
 • Clase Polideportivo con su nombre y tipo de instalación que puede ser
Techado o Abierto, esta clase implementará los dos métodos abstractos y los
atributos del padre.
 */
package Clases;

/**
 *
 * @author nobil
 */
public class Polideportivo extends Edificio {
    public String nombre;
    public String tipoDeInstalacion;

    public Polideportivo() {
        super();
    }

    public Polideportivo(String nombre, String tipoDeInstalacion, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(String tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", tipoDeInstalacion=" + tipoDeInstalacion + super.toString() + '}';
    }
    

    @Override
    public void calcularSuperficie(Edificio edificio) {
        Integer aux;
        System.out.println("Ingrese el largo de polideportivo por favor ");
       this.largo=(leer.nextInt());
        System.out.println("Ingrese la altura del polideportivo por favor ");
        this.alto=(leer.nextInt());
        aux= this.largo*this.alto;
        System.out.println("La superficie del polideportivo es " + aux);
    }

    @Override
    public void calcularVolumen(Edificio edificio) {
       Integer aux;
        System.out.println("Ingrese el largo del polideportivo ");
        this.largo=(leer.nextInt());
        System.out.println("Ingrese el ancho del polideportivo ");
        this.ancho=(leer.nextInt());
        System.out.println("Ingrese la altura del polideportivo ");
        this.alto=(leer.nextInt());
        aux= (this.largo*this.ancho)*this.alto;
        System.out.println("El volumen del polideportivo es " + aux);
    }
    public Boolean esTechado(){
        System.out.println("¿El polideportivo es techado? si/no ");
        this.tipoDeInstalacion=(leer.next());
        return this.tipoDeInstalacion.equalsIgnoreCase("si");        
    }

}
/*largo*ancho o largo*ancho*altura*/
/*Método calcularSuperficie(): calcula la superficie del edificio. largo*ancho
• Método calcularVolumen(): calcula el volumen del edifico. largo*ancho*altura*/