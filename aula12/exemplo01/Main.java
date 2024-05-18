package exemplo01;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Caminhao caminhao = new Caminhao();

        Motor motor = new Motor();

        motor.darPartida(carro);
        motor.darPartida(caminhao);
    }
}
