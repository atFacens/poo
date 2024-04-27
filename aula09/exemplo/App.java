package exemplo;

public class App {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();

        Produto.nome = "teclado";
        Produto.nome = "mouse";


        Produto.exibirNome();
        Produto.exibirNome();

        p1.exibirObjeto();

        // System.out.println(Produto.nome);
        // System.out.println(Produto.nome);

    }
}
