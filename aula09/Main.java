public class Main {
    public static void main(String[] args) {
        Andar meioDeTransporte1 = new Barco();
        Andar meioDeTransporte2 = new Carro();

        meioDeTransporte1.acelerar();
        meioDeTransporte2.acelerar();

    }
}
