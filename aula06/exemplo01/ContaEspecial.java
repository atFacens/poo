package exemplo01;
public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    // sobrescrita de método
    @Override
    void exibir() {
        System.out.println("Especial " + getNumero() + " : " + 
            getSaldo()  + " : " + limite);
    }
}
