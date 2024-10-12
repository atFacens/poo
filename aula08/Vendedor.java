public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double comissao) {
        super(nome);
        this.comissao = comissao;
    }

    @Override
    public String getNome() {
        
        return "Vendedor: " + super.getNome();
    }

    @Override
    public String getDados() {
        return getNome() + " comissão: " + comissao;
    }

}
