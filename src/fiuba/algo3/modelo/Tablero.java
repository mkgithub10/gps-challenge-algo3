package fiuba.algo3.modelo;

public class Tablero {

    private int tamanioColumna;
    private int tamanioFila;
    private Casilla[][] mapa;

    public Tablero (int cantidadFilas,int cantidadColumnas) {

        this.mapa = new Casilla[cantidadFilas][cantidadColumnas];
        this.tamanioFila = cantidadFilas ;
        this.tamanioColumna = cantidadColumnas ;
        for (int i = 0; i < this.tamanioFila; i++) {
            for (int j = 0; j < this.tamanioColumna; j++) {
                Posicion unaPosicion = new Posicion(i,j);
                this.mapa[i][j] = new Casilla(unaPosicion);
            }
        }
    }

    public boolean coordenadaDentroDelTablero(int x, int y) {
        return ((x >= 0) && (x < this.tamanioFila) && (y >= 0) && (y < this.tamanioColumna));
    }


    public Casilla getCasilla(int x, int y) {

        if (!this.coordenadaDentroDelTablero(x, y))
            return null;

        return this.mapa[x][y];
    }

    public int cantidadDeFilas() {
        return this.tamanioFila;
    }

    public int cantidadDeColumnas() {
        return this.tamanioColumna;
    }

}
