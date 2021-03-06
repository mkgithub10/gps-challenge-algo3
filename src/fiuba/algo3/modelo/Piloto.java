package fiuba.algo3.modelo;


import fiuba.algo3.titiritero.modelo.ObjetoVivo;

public class Piloto implements ObjetoVivo {

    private String nombre;
    private Vehiculo vehiculo;
    private Boolean enMovimiento;
    private Cronometro cronometro;

    /** limpiar contructores que no sirven **/

    public Piloto() {

        this.cronometro = new Cronometro();
        this.enMovimiento = false;
    }

    public Piloto(String unNombre) {   /** el que se usa! **/

        this.cronometro = new Cronometro();
        this.enMovimiento = false;
        this.nombre = unNombre;

    }

    public Piloto(Vehiculo unVehiculo, String unNombre) {

        this.cronometro = new Cronometro();
        this.vehiculo = unVehiculo;
        this.enMovimiento = false;
        this.nombre = unNombre;

    }

    /**  **/

    public void asignarVehiculo(Vehiculo unVehiculo) {

        this.vehiculo = unVehiculo;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
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

    public void conducir() {

        if (enMovimiento) {

            try {

                this.vehiculo.mover();

            } catch (NoSePuedeMoverEnElMapaElMovibleException exception) {

                System.out.println(exception.getMessage());

            }

        }

    }

    public Cronometro getCronometro() {

        return this.cronometro;
    }

    /** agarrate catalina **/

    public void interactuarCon(Pozo pozo) {

        this.getVehiculo().getEstado().interactuarCon(this,pozo);
    }

    public void interactuarCon(Piquete piquete) {

        this.getVehiculo().getEstado().interactuarCon(this,piquete);

    }

    public void interactuarCon(ControlPolicial layuta) {

        this.getVehiculo().getEstado().interactuarCon(this,layuta);

    }

    public void interactuarCon(SorpresaFavorable sorpresa) {

        this.getVehiculo().getEstado().interactuarCon(this,sorpresa);
    }

    public void interactuarCon(SorpresaDesfavorable sorpresa) {

        this.getVehiculo().getEstado().interactuarCon(this,sorpresa);
    }

    public void interactuarCon(SorpresaCambioDeVehiculo sorpresa) {

        this.getVehiculo().getEstado().interactuarCon(this,sorpresa);
    }

    /** por implementar ObjetoVivo **/

    public void vivir() {

        this.conducir();

    }




}
