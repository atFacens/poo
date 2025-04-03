public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Emerson");
        PessoaFisica pf = new PessoaFisica("Emerson", "123456789");


        // p.setNome("Emerson");
        System.out.println("Pessoa: " + p.getNome());

        // pf.setNome("Emerson");
        // pf.setRg("123456789");
        pf.setNome("Emerson", "Paduan");
        // pf.setNome("PF");
        System.out.println(pf.getNome() + " - "+ pf.getRg());
        System.out.println("----------");
        System.out.println(pf);
    }
}
