public class Main {
    public static void main(String[] args) {
        // Não é possível geral objetos a partir de classe abstrata
        // Pessoa p = new Pessoa();

        Pessoa pessoas[] = new Pessoa[3];

        pessoas[0] = new Aluno();
        pessoas[1] = new Professor();
        pessoas[2] = new Aluno();

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i].apresentar();
            pessoas[i].cumprimentar();

        }

    }
}
