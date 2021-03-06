package fiuba.algo3.modelo;

import org.jdom2.Element;

public class EstadoAuto extends Estado {

    public void interactuarCon(Piloto piloto, Pozo pozo) {

        pozo.aplicarA(piloto,this);

    }

    public void interactuarCon(Piloto piloto, Piquete piquete) {

        piquete.aplicarA(piloto,this);
    }

    public void interactuarCon(Piloto piloto, ControlPolicial layuta) {

        layuta.aplicarA(piloto,this);

    }

    public void interactuarCon(Piloto piloto, SorpresaFavorable sorpresa) {
        sorpresa.aplicarA(piloto);
    }

    public void interactuarCon(Piloto piloto, SorpresaDesfavorable sorpresa) {
        sorpresa.aplicarA(piloto);

    }
    public void interactuarCon(Piloto piloto, SorpresaCambioDeVehiculo sorpresa) {
        sorpresa.aplicarA(piloto,this);

    }

    /** por ser serializable **/

    public EstadoAuto(){}

    public EstadoAuto(Element xmlEstadoAuto) {}

    public Element serializar() {

        Element xmlNode = new Element("EstadoAuto");

        return xmlNode;

    }

}
