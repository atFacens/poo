package polimorfismo;

public class CarroEsporte extends Veiculo {

    private double potencia;

    public CarroEsporte(double potencia) {
        this.potencia = potencia;
    }

    // Polimorfismo: Sobrescrita - Overrride
    @Override
    public void acelerar() {
        super.acelerar(5);
    }

    @Override
    public String toString() {
        return "Velociade: " + getVelocidade() + " potencia: " + potencia;
    }
}
