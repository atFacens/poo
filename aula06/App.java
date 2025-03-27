public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        PessoaFisica pf = new PessoaFisica();

        p.setNome("Paduan");
        System.out.println("Pessoa: " + p.getNome());

        pf.setNome("Emerson");
        pf.setRg("123456789");
        System.out.println(pf.getNome() + " - "+ pf.getRg());
    }
}
