package fiuba.algo3.control;


//import fiuba.algo3.vista.VistasMenu.BotonAnimadoVehiculo;
import fiuba.algo3.vista.VistasMenu.BotonAnimadoVehiculo;
import fiuba.algo3.vista.VistasMenu.VistaInstrucciones;
import fiuba.algo3.vista.VistasMenu.VistaFinalizacion;
        import fiuba.algo3.vista.VistasMenu.VistaMenu;

        import java.awt.event.MouseEvent;
        import java.util.ArrayList;


public class ControlDeClickBotonJugar extends ControlDeClickBotonConPartida {


    BotonAnimadoVehiculo botonAnimadoVehiculo;
    VistaFinalizacion vistaFinalizacion;

    public ControlDeClickBotonJugar(VistaFinalizacion unaVistaFinalizacion, BotonAnimadoVehiculo botonAnimadoVehiculo, Partida unaPartida, ArrayList<VistaMenu> vistasOn, ArrayList<VistaMenu> vistasOff){

        super(unaPartida,vistasOn,vistasOff);
        this.botonAnimadoVehiculo = botonAnimadoVehiculo;
        this.vistaFinalizacion = unaVistaFinalizacion;


    }

    public ControlDeClickBotonJugar(Partida unaPartida, ArrayList<VistaMenu> vistasOn, ArrayList<VistaMenu> vistasOff){

        super(unaPartida,vistasOn,vistasOff);


    }

    @Override
    public void mouseClicked(MouseEvent e) {


        this.partida.cargarVehiculoParaElPiloto();
        this.partida.iniciar();
        this.partida.pausar();
        VistaInstrucciones unaVistaInstrucciones = new VistaInstrucciones();

        this.actualizar();
        this.botonAnimadoVehiculo.comenzarAnimacion(); // el orden es importante, tiene que ser despues!
        this.vistaFinalizacion.comenzarVista();



    }

}
