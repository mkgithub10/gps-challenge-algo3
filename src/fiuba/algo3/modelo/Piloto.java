package fiuba.algo3.modelo;


public class Piloto {

    private Vehiculo vehiculo;
    private Boolean enMovimiento;
    //private Cronometro cronometro;

    public Piloto() {

        //cronometro = new Cronometro();
        enMovimiento = false;

    }

    public Piloto(Vehiculo unVehiculo) {

        //cronometro = new Cronometro();
        this.vehiculo = unVehiculo;
        enMovimiento = false;

    }

    public void asignarVehiculo(Vehiculo unVehiculo) {

        this.vehiculo = unVehiculo;

    }

    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }

    public void detenerVehiculo() {
        this.enMovimiento = false;
    }

    public void arrancarVehiculo() {
        this.enMovimiento = true;
    }

    public void conducir() throws Exception {

        if (enMovimiento) {

            try {

                this.vehiculo.mover();

            } catch (NoSePuedeMoverEnElMapaElMovibleException exception) {

                System.out.println(exception.getMessage());

            }

        }

    }

    /*public Cronometro getCronometro() {

        return this.cronometro;
    } */


}
