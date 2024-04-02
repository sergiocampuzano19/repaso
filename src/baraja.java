public class baraja {
    public padre getBaraja(int i) {
        return baraja[i];
    }

    private padre[] baraja=new padre[25];

    public baraja() {
        baraja[1] = new hijo1();

        for (int i = 5; i <=7; i++) {
            baraja[i]= new hikjo2();
        }
        for (int i = 15; i <=18 ; i++) {
            baraja[i]= new hijo3();
        }

    }
    public void barajoide(){
        for (int i = 0; i <=24 ; i++) {
            if (baraja[i]==null){
                System.out.print("[ ]");
            }else
                System.out.print(baraja[i].toString());
        }
    }
    public void sacarvalores(){
        for (int i = 0; i <=24 ; i++) {
            if (baraja[i]==null) {
                System.out.print("[ ]");
            }else
                System.out.print(baraja[i].metodoheredado());
        }
    }


}
