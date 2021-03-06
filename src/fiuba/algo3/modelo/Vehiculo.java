package fiuba.algo3.modelo;

//import ar.uba.fi.algo3.titiritero.Posicionable;
import fiuba.algo3.titiritero.modelo.ObjetoPosicionable;

public class Vehiculo implements Movible , ObjetoPosicionable {

    /** atributos **/

    private Posicion posicion;
    private Direccion direccion;
    private Estado estado;

    /**Constructores**/

    public Vehiculo(Posicion unaPosicion , Direccion unaDireccion, Estado unEstado) {
        this.posicion = unaPosicion;
        this.direccion = unaDireccion;
        this.estado = unEstado;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado unEstado) {
        this.estado = unEstado;
    }


    /**implementacion por ser movible**/

    public void mover() throws NoSePuedeMoverEnElMapaElMovibleException {

        Posicion avance = this.getDireccion().devolverComoPosicion();
        this.setPosicion(this.getPosicion().sumar(avance));
        try {

            Mapa.getMapa().ubicar(this);

        } catch (LaPosicionNoExisteEnElMapaException e) {

            this.setPosicion(this.getPosicion().restar(avance));
            throw new NoSePuedeMoverEnElMapaElMovibleException("la direccion es invalida para la posicion actual") ;

        }

    }

    public void setDireccion(Direccion nuevaDireccion) {
        this.direccion = nuevaDireccion;
    }

    public Direccion getDireccion() {
        return this.direccion;
    }


    public void posicionarEnElMapa() throws NoSePuedePonerEnElMapaElPosicionableException {

        try {

            Mapa.getMapa().ubicar(this);

        } catch (LaPosicionNoExisteEnElMapaException e) {

            throw new NoSePuedePonerEnElMapaElPosicionableException("la posicion en la cual se quiere ubicar es invalida");
        }

    }

    public Posicion getPosicion() {
        return this.posicion;
    }

    public void setPosicion(Posicion nuevaPosicion) {
        this.posicion = nuevaPosicion;
    }

    /** Por implementar ObjetoPosicionable **/

    private static final int factorDeEscala = 40;

    public int getX() {

        return (factorDeEscala*this.posicion.getPosicionX());
        //return (this.posicion.getPosicionX());

    }

    public int getY() {

        return (factorDeEscala*this.posicion.getPosicionY());
        //return (this.posicion.getPosicionY());

    }

}
