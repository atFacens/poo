public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(123, "João Carlos");

        ContaCorrente cc = new ContaCorrente(111);
        ContaCorrente cc2 = new ContaCorrente(222);
        ContaCorrente cc3 = new ContaCorrente(333);

        // cliente.setConta(cc);

        // if (cliente.getConta() == null) {
        //     System.out.println("Cliente não tem conta");
        // } else {
        //     System.out.println("Cliente possui a conta: " + cliente.getConta().getNumero());
        // }
        cliente.exibirContas();

        cliente.addConta(cc);
        cliente.addConta(cc2);
        cliente.addConta(cc3);
        
        cliente.exibirContas();
    }
}
