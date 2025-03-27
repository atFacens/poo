public class PessoaFisica extends Pessoa {
    private String rg;

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
}
