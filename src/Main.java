
public class Main {
    public static void main(String[] args) {
        baraja bararaja = new baraja();
        Jugador jug1 = new Jugador();

        bararaja.barajoide(); //imprime la baraja
        System.out.println();
        for (; jug1.getPosicion() <= 24; jug1.setPosicion(1)) {
            System.out.print(" " + jug1.getPosicion());
            if (bararaja.getBaraja(jug1.getPosicion()) != null){
                jug1.setPosicion(bararaja.getBaraja(jug1.getPosicion()).metodoheredado());
            }
        }
        System.out.println();
        bararaja.sacarvalores();
    }
}