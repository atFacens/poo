package pasta;

public class Aluno {

    private static int qtde;
    protected String nome;

    public Aluno(String nome) {
        this.nome = nome;
        qtde++;
    }

    public static int getQtde() {
        return qtde;
    }

    public String getNome() {
        return nome;
    }

}