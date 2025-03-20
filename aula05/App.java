public class App {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Emerson");

        Dependente dep = new Dependente("Paduan", func);

        dep.exibirDados();
    }
}
