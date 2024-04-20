public class MaquivaVenda {
    public static void main(String[] args) {
        Produto p1 = new Produto("café", 4.5);
        Produto p2 = new Produto("capucchino", 5.5);

        Estoque estoque = new Estoque();
        estoque.novoProduto(p1);
        estoque.novoProduto(p2);

        System.out.println(estoque.exibirEstoque());
        

        estoque.reposicao(1, 10);

        System.out.println(estoque.venda(1));

        System.out.println(estoque.exibirEstoque());

        System.out.println(estoque.exibirMenuEstoque());
        int opcao =1;
        switch (opcao) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }
}
