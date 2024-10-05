public class Conta {
    private int numero;
    private double saldo;

    public Conta(){} // default
    
    // sobrecarga = overload = mais "funções" para o "mesmo" método
    // o que diferencia é o número e/ou tipo de parâmetro

    public Conta(int numero) {
        this.numero = numero;
    }

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
