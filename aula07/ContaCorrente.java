public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(){
        super();
    }

    public ContaCorrente(int numero) {
        super(numero); // super é uma chamada ao construtor da classe pai = Conta(numero)
    }

    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo); // super = Conta(numero, saldo)
    }

    public ContaCorrente(int numero, double saldo, double limite) {
        this(numero, saldo); // chama o próprio construtor, com 2 parâmetros: ContaCorrente(numero, saldo)
        this.limite = limite; // o atributo recebe o parâmetro : "ContaCorrente.limite = limite"
    }

    public double getLimite() {
        return limite;
    }
}
