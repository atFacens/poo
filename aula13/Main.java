import pasta.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Carlos");

        System.out.println(aluno1.getNome() + " - " + Aluno.getQtde());
        // System.out.println(aluno1.nome + " - " + Aluno.getQtde());

        Aluno aluno2 = new Aluno("Maria");
        System.out.println(aluno2.getNome() + " - " + Aluno.getQtde());
    }

}
