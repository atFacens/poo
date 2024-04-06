package exemplo01;

public class App {
    public static void main(String[] args) {
        ContaEspecial cc = new ContaEspecial(123, 500, 1000);

        // cc.numero = 123;
        // cc.saldo = 1000;
        // cc.limite = 500;

        cc.exibir();
    }
}
