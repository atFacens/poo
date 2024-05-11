public class AppFuncionario {
    public static void main(String[] args) {
        // Não pode instanciar pois a classe é abstrata
        // Funcionario f = new Funcionario();

        Gerente g = new Gerente("Gerente Carlos");
        Vendedor v = new Vendedor("Vendedor Luiz");

        Funcionario f1 = new Gerente("Ger/Fun André");
        Funcionario f2 = new Vendedor("Ven/Fun Ana");

        Funcionario vetFuncionarios[] = new Funcionario[4];

        vetFuncionarios[0] = f1;
        vetFuncionarios[1] = f2;
        vetFuncionarios[2] = g;
        vetFuncionarios[3] = v;

        for (int i = 0; i < vetFuncionarios.length; i++) {
            System.out.println(vetFuncionarios[i].exibir());
        }
    }
}
