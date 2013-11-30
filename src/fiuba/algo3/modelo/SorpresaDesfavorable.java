package fiuba.algo3.modelo;


public class SorpresaDesfavorable extends SorpresaCambioDeTiempo {



    private static final int porcentaje = 25;  /** cambiar aca si se quiere modificar la clase**/

    public SorpresaDesfavorable (Posicion unaPosicion) {

        super(porcentaje,unaPosicion);
    }


    public void actualizar(Piloto piloto) {

        Vehiculo vehiculoDelCandidatoASerAplicar = piloto.getVehiculo();

        if ( vehiculoDelCandidatoASerAplicar.getPosicion().equals(this.getPosicion()) )
        {
            piloto.interactuarCon(this);
        }

    }

    public void aplicarA(Piloto piloto) {
        piloto.getCronometro().variarPorcentaje(this.devolverPorcentaje());
    }

    public void aplicarA(Piloto piloto, EstadoAuto estadoAuto) { /** No hace nada **/ }
    public void aplicarA(Piloto piloto, EstadoMoto estadoMoto) { /** No hace nada **/ }
    public void aplicarA(Piloto piloto, Estado4x4 estado4x4) { /** No hace nada **/ }

}
