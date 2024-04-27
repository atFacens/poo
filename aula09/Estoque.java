import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> listaProdutos;

    public Estoque() {
        listaProdutos = new ArrayList<>();
    }

    public void novoProduto(Produto novoProduto) {
        listaProdutos.add(novoProduto);
    }

    public String exibirEstoque() {
        String result = "";

        for (Produto produto : listaProdutos) { // Para cada produto da lista de produtos
            result += produto.getNome() + " - R$ " + produto.getValor() + " Qtde: " + produto.getQuantidade() + "\n";
        }

        return result;
    }

    public String exibirMenuEstoque() {
        String result = "";

        for (int i = 0; i < listaProdutos.size(); i++) {
            if(listaProdutos.get(i).getQuantidade() > 0){
                result +=  (i + 1) + ": " + listaProdutos.get(i).getNome() + " - R$ " + listaProdutos.get(i).getValor() + "\n";
            }
        }

        return result;
    }

    public boolean venda(int produto) {
        if(listaProdutos.get(produto-1).venda()) {
            return true;
        }
        return false;
    }

    public void reposicao(int produto, int quantidade) {
        listaProdutos.get(produto-1).reposicao(quantidade);
    }
}
