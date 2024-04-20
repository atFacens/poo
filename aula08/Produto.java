
public class Produto {
    private String nome;
    private double valor;
    private int quantidade;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void reposicao(int quantidade) {
        this.quantidade += quantidade;
    }

    public boolean venda() {
        if(quantidade > 0){
            quantidade--; // quantidade = quantidade - 1; // quantidade -= 1;
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
}