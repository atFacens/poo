package exemplo01;


public class Conta {
    private int numero;
    private double saldo;
    
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

    void exibir() {
        System.out.println("conta " + numero + " : " + saldo);
    }

}