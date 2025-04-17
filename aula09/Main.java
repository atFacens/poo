public class Main {
    public static void main(String[] args) {
        Andar a1 = new Carro();
        Andar a2 = new Barco();

        a1.acelerar();
        a2.acelerar();
        // a2.ancorar(); // não é possível acionar a partir da interface

    }


}
