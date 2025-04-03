public class PessoaFisica extends Pessoa {
    private String rg;

    public PessoaFisica(String nome, String rg) {
        super(nome);
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override // anotação
    public String getNome() {
        return "Pessoa física: " + super.getNome();
    }

    // Override: Sobrescrita
    @Override
    public void setNome(String nome) {
        System.out.println("SetNome do PF");
    }

    @Override
    public String toString() {
        return getNome() +  " - "+ rg;
    }
}
