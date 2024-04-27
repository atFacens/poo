import java.util.Scanner;

public class MaquivaVenda {
    private static Estoque estoque = new Estoque();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        iniciaMaquina();
        int opcao = 1, codigoProd, qtdeProd;

        while (opcao != 3) {
            System.out.println("1 - reposição de produto");
            System.out.println("2 - venda de produto");
            System.out.println("3 - sair");
            opcao = Integer.parseInt(teclado.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println("Informe o código do produto");
                    codigoProd = Integer.parseInt(teclado.nextLine());
                    System.out.println("Informe a quantidade do produto");
                    qtdeProd = Integer.parseInt(teclado.nextLine());
                    estoque.reposicao(codigoProd, qtdeProd);
                    break;
                case 2:
                    String itens = estoque.exibirMenuEstoque();
                    if (itens.length() == 0) {
                        System.out.println("Máquina vazia...");
                    } else {
                        System.out.println(itens);
                        System.out.println("Informe o código do produto");
                        codigoProd = Integer.parseInt(teclado.nextLine());
                        boolean vendeu = estoque.venda(codigoProd);
                        if (vendeu) {
                            System.out.println("Bom apetite!");
                        } else {
                            System.out.println("Falha...");
                        }
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        teclado.close();
    }

    public static void iniciaMaquina() {
        Produto p1 = new Produto("café", 4.5);
        Produto p2 = new Produto("capucchino", 5.5);

        estoque.novoProduto(p1);
        estoque.novoProduto(p2);
    }
}
