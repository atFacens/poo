public class Dependente {
    private String nome;
    private Funcionario responsavel;

    public Dependente(String nome, Funcionario funcionario) {
        this.nome = nome;
        responsavel = funcionario;
    }

    public Dependente(String nomeDependente, String nomeFuncionario) {
        nome = nomeDependente;
        responsavel = new Funcionario(nomeFuncionario);
    }

    public void exibirDados() {
        System.out.println("Dependente: " + nome);
        responsavel.exibirDados();
    }
}
