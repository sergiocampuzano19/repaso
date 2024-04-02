public class Jugador {
    private int posicion;
    public Jugador() {
        this.posicion = 0;
    }
    public int getPosicion(){
        return posicion;
    }

    public void setPosicion(int suma) {
        this.posicion = this.posicion + suma;
    }
}
