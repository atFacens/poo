public class ContaCorrente {
    private int numero;
    private double saldo;
    
    public ContaCorrente(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
        }
    }

    public String getDados() {
        return numero + ": R$ " + saldo;
    }
}
