public class Main {
    public static void main(String[] args) {

        Conta c0 = new Conta();
        Conta c1 = new Conta(123);
        Conta c2 = new Conta(321, 100);

        System.out.println(c1.getNumero() + " : " + c1.getSaldo());
        
        ContaCorrente cc1 = new ContaCorrente(456, 1000, 2000);
        System.out.println(cc1.getNumero() + " : " + cc1.getSaldo() + " : " + cc1.getLimite());

    }
}
