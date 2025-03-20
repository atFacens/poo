public class Funcionario {
    private String nome;
    private Dependente dependente;

    public Funcionario(String nome) {
        this.nome = nome;
        // dependente = new Dependente("não possui");
    }

    public void exibirDados() {
        System.out.println("Funcionário: " + nome);
        if (dependente != null) {
            dependente.exibirDados();
        } 
        // else {
        //     System.out.println("Sem dependentes");
        // }
    }

}