package exemplo01;

public class Caminhao implements Veiculo {
	@Override
	public void ligar() {
		System.out.println("O caminhão foi ligado");
	}

	@Override
	public void desligar() {
		System.out.println("O caminhão foi desligado");
	}

    @Override
    public void acelerar() {
        System.out.println("Andando com o caminhão...");
    }
}
