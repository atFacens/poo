package exemplo01;

public interface Veiculo extends Andar {
    public void ligar();
    public void desligar();

    public default void abastecer(){
        System.out.println("abasteceu");
    }
}

