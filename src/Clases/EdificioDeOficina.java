/*
 • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
personas por oficina y numero de pisos. Esta clase implementará los dos
métodos abstractos y los atributos del padre.
De esta clase nos interesa saber cuantas personas pueden trabajar en todo el
edificio, el usuario dirá cuantas personas entran en cada oficina, cuantas
oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).
Crear el método cantPersonas(), que muestre cuantas personas entrarían en
un piso y cuantas en todo el edificio.
 */
package Clases;

/**
 *
 * @author nobil
 */
public class EdificioDeOficina extends Edificio {
    public Integer numeroDeOficina;
    public Integer cantdadDePersonas;
    public Integer numeroDePisos;

    public EdificioDeOficina() {
    }

    public EdificioDeOficina(Integer numeroDeOficina, Integer cantdadDePersonas, Integer numeroDePisos, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.numeroDeOficina = numeroDeOficina;
        this.cantdadDePersonas = cantdadDePersonas;
        this.numeroDePisos = numeroDePisos;
    }

    public Integer getNumeroDeOficina() {
        return numeroDeOficina;
    }

    public void setNumeroDeOficina(Integer numeroDeOficina) {
        this.numeroDeOficina = numeroDeOficina;
    }

    public Integer getCantdadDePersonas() {
        return cantdadDePersonas;
    }

    public void setCantdadDePersonas(Integer cantdadDePersonas) {
        this.cantdadDePersonas = cantdadDePersonas;
    }

    public Integer getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(Integer numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficina{" + "numeroDeOficina=" + numeroDeOficina + ", cantdadDePersonas=" + cantdadDePersonas + ", numeroDePisos=" + numeroDePisos + super.toString() + '}';
    }
    

    @Override
    public void calcularSuperficie(Edificio edificio) {
       Integer aux;
        System.out.println("Ingrese el largo del edificio de oficinas por favor ");
       this.largo=(leer.nextInt());
        System.out.println("Ingrese la altura del edificio de oficinas por favor ");
        this.alto=(leer.nextInt());
        aux= this.largo*this.alto;
    }

    @Override
    public void calcularVolumen(Edificio edificio) {
        Integer aux;
        System.out.println("Ingrese el largo del edificio de oficinas ");
        this.largo=(leer.nextInt());
        System.out.println("Ingrese el ancho del edificio de oficinas ");
        this.ancho=(leer.nextInt());
        System.out.println("Ingrese la altura del edificio de oficinas ");
        this.alto=(leer.nextInt());
        aux= (this.largo*this.ancho)*this.alto;
    }
    public void cantidadDePersonas(){
        Integer numDeOficinas;
        Integer personasTotal;
        System.out.println("Ingrese el numero de oficinas que hay en el edificio por favor ");
        this.numeroDeOficina=(leer.nextInt());
        System.out.println("Ingrese la catidad de personas que hay por oficina por favor ");
        this.cantdadDePersonas=(leer.nextInt());
        System.out.println("Ingrese la cantidad de pisos que hay en el edificio ");
       this.numeroDePisos=(leer.nextInt());
       numDeOficinas= (this.numeroDeOficina/this.numeroDePisos)*this.cantdadDePersonas;
       personasTotal= (this.cantdadDePersonas * numDeOficinas);
        System.out.println("La cantidad de personas que trabajan por piso son " + numDeOficinas);
        System.out.println("La cantidad de personas que trabajan en todo el edificio son " + personasTotal);
    }
}
/*• 
De esta clase nos interesa saber cuantas personas pueden trabajar en todo el
edificio, el usuario dirá cuantas personas entran en cada oficina, cuantas
oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).
Crear el método cantPersonas(), que muestre cuantas personas entrarían en
un piso y cuantas en todo el edificio.*/