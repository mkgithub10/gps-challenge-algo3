package fiuba.algo3.masterOfPuppets;



import fiuba.algo3.titiritero.modelo.ObjetoDibujable;
import fiuba.algo3.titiritero.modelo.ObjetoVivo;
import fiuba.algo3.titiritero.modelo.SuperficieDeDibujo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @author MirkoSoft
 * Retornando de la muerte al GRAN ControladorDeJuego (by @NicoPaez) en forma de gameLoop logrando compatibilidad
 * con el nuevo titiritero
 */

public class GameLoop implements Runnable {

    private Thread hilo;
    private long intervaloSimulacion;
    private boolean estaEnEjecucion;

    /** Constructor **/
    public GameLoop(){
        this.objetosVivos = new ArrayList<ObjetoVivo>();
        this.dibujables = new ArrayList<ObjetoDibujable>();

    }

    public boolean estaEnEjecucion(){
        return this.estaEnEjecucion;
    }

    public void comenzarJuego() {
        this.estaEnEjecucion = true;
        this.hilo = new Thread(this);
        this.hilo.start();
    }

    public void detenerJuego() {
        this.estaEnEjecucion = false;
        this.hilo.interrupt();
    }

    /** la posta **/
    public void run() {

        estaEnEjecucion = true;
        while(estaEnEjecucion) {
            simular();
            dibujar();
            try {
                hilo.sleep(this.intervaloSimulacion);
            } catch (InterruptedException e) {
                System.out.println("interrupcion al gameloop");
                e.printStackTrace();
            }
        }
    }

    /** Para manejar la frecuencia de simulacion del gameLoop **/

    public long getIntervaloSimulacion() {
        return intervaloSimulacion;
    }

    public void setIntervaloSimulacion(long intervaloSimulacion) {
        this.intervaloSimulacion = intervaloSimulacion;
    }

    /*public void comenzarJuego(int cantidadDeCiclos){
        int contador = 0;
        estaEnEjecucion = true;
        try{
            while(contador < cantidadDeCiclos && estaEnEjecucion){
                simular();
                dibujar();
                Thread.sleep(intervaloSimulacion);
                contador++;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    } */

    /** Objetos vivos y Dibujables del gameLoop **/

    private List<ObjetoVivo> objetosVivos;
    private List<ObjetoDibujable> dibujables;


    public void agregar(ObjetoVivo objetoVivo){
        objetosVivos.add(objetoVivo);
    }

    public void remover(ObjetoVivo objetoVivo){
        objetosVivos.remove(objetoVivo);
    }

    public void agregar(ObjetoDibujable unDibujable){
        dibujables.add(unDibujable);
    }

    public void remover(ObjetoDibujable unDibujable){
        dibujables.remove(unDibujable);
    }

    private void dibujar() {

        Iterator<ObjetoDibujable> iterador = dibujables.iterator();
        while(iterador.hasNext()){
            ObjetoDibujable dibujable = iterador.next();
            dibujable.dibujar(this.superficieDeDibujo);
        }
        this.superficieDeDibujo.actualizar();
    }

    /**
     * Ejecuta la simulacion recorriendo la coleccion de objetivos vivos.
     */
    private void simular() {

        Iterator<ObjetoVivo> iterador = objetosVivos.iterator();
        while(iterador.hasNext()){
            iterador.next().vivir();
        }
    }

    /** Superficie que controla el gameLoop **/

    private SuperficieDeDibujo superficieDeDibujo;

    public SuperficieDeDibujo getSuperficieDeDibujo() {
        return superficieDeDibujo;
    }

    public void setSuperficieDeDibujo(SuperficieDeDibujo superficieDeDibujo) {
        this.superficieDeDibujo = superficieDeDibujo;
        //this.superficiePanel = (SuperficiePanel)superficieDeDibujo; /**!**/
    }

}

