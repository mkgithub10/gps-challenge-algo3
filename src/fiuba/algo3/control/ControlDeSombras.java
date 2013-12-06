package fiuba.algo3.control;


import fiuba.algo3.modelo.*;
import fiuba.algo3.titiritero.modelo.ObjetoVivo;
import java.util.Iterator;


/** SHADOW s CONTROL: welcome to the dark side
 *  Vader: Luke, I am your father!
 *  Luke: noooooouuuu!
 */

public class ControlDeSombras implements ObjetoVivo {


    private Partida partidaControlada;
    private Neblina neblina;

    public ControlDeSombras(Partida unaPartida) {

        this.partidaControlada = unaPartida;
        this.neblina = new Neblina();


    }

    public Neblina getNeblina() {

        return this.neblina;
    }

    private void esclarecerVisionDelPiloto() {


        Iterator<Posicion> iterator = this.neblina.getPosicionesDeLasSombras().iterator();
        Posicion posicionVehiculo = this.partidaControlada.getPiloto().getVehiculo().getPosicion();


        while (iterator.hasNext()) {

            Posicion posicionSombra = iterator.next();

            if ( posicionSombra.equals(posicionVehiculo) ) {

                try {

                this.neblina.getVistaSombra(posicionSombra).quitarNeblina();

                } catch (Exception e) {/*nunca va ser invalida, ya que entro en el if*/}

                this.esclarecerVision(posicionSombra,new DireccionArriba());
                this.esclarecerVision(posicionSombra,new DireccionAbajo());
                this.esclarecerVision(posicionSombra,new DireccionDerecha());
                this.esclarecerVision(posicionSombra,new DireccionIzquierda());

                break;
            }
        }

    }

    /** ACEPTA MODIFICACIONES **/
    /** quita la niebla de dos sombras consecutivas ( respecto de una posicion la dos que le sigan
     *  en determinada direccion **/
    private void esclarecerVision( Posicion posicion , Direccion unaDireccion) {

        Posicion posicionDeLaDireccion = unaDireccion.devolverComoPosicion();
        Posicion posicionSumada = posicion.sumar(posicionDeLaDireccion);

        try {

            this.neblina.getVistaSombra( posicionSumada ).quitarNeblina();
            this.neblina.getVistaSombra(posicionSumada.sumar(posicionDeLaDireccion)).quitarNeblina();

        } catch (Exception e) {
            System.out.println("no hay rango de vision en esta direccion");
        }

    }

    public void actualizar() {

        this.neblina.nublar();
        this.esclarecerVisionDelPiloto();


    }

    /** por implementar ObjetoVivo **/
    public void vivir() {

        this.actualizar();

    }


}