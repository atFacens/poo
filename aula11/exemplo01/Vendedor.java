public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome) {
        super(nome);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String exibir() {
        return getNome() + " comissão: " + comissao;
    }
}
