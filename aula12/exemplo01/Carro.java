package exemplo01;

public class Carro implements Veiculo {

	@Override
	public void ligar() {
		System.out.println("O carro foi ligado");
	}

	@Override
	public void desligar() {
		System.out.println("O carro foi desligado");
	}

    @Override
    public void acelerar() {
        System.out.println("Andando com o carro...");
    }

}
