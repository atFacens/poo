

import pasta.Aluno;

public class AlunoPos extends Aluno {

    public AlunoPos(String nome) {
        super(nome);
    }

    public void exibir() {
        System.out.println("Aluno " + nome);
    }

}
