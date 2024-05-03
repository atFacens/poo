package polimorfismo;

public class Veiculo {
    private int velocidade;

    public Veiculo() {
        velocidade = 0;
    }

    public Veiculo(int velocidadeInicial) {
        velocidade = velocidadeInicial;
    }

    public void acelerar() {
        velocidade++;
    }

    // Polimorfismo: sobrecarga de método
    public void acelerar(int valor) {
        velocidade += valor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    @Override
    public String toString() {
        return "Velocidade atual: " + velocidade;
    }
}
