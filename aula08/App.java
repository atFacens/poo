public class App {
    public static void main(String[] args) {
        // Uma classe bstrata não pode ser instanciada
        // Funcionario f = new Funcionario("Emerson");

        // System.out.println(f.getNome());

        Funcionario f1 = new Gerente("Emerson", "Desenvolvimento");
        System.out.println(f1.getNome());
        System.out.println(f1.getDados());

        Funcionario f2 = new Vendedor("Paduan", 0.1);
        System.out.println(f2.getDados());

        Funcionario[] funcionarios = new Funcionario[50];

        funcionarios[0] = f1;
        funcionarios[1] = f2;

        
    }
}
