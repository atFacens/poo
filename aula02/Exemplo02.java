import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // criando uma referência
        // Aluno aluno1;

        // cria um objeto Aluno
        // aluno1 = new Aluno();

        Aluno aluno1 = new Aluno();

        System.out.println("Digite o nome do aluno");
        aluno1.nome = scanner.nextLine();

        System.out.println("Digite a média do aluno:");
        aluno1.media = scanner.nextDouble();

        aluno1.verificarAprovacao();

        String resultado = aluno1.verificarAprovacao2();

        System.out.println(resultado);
        
        scanner.close();
    }
}
