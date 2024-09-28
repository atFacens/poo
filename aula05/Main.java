public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Carlos da Silva");

        ContaCorrente conta = new ContaCorrente(4567);
        
        cliente.addConta(conta);
        conta.depositar(4000);

        ContaCorrente conta2 = new ContaCorrente(8888);
        cliente.addConta(conta2);

        System.out.println(cliente.getDados());
    }
}
