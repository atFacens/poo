import java.util.ArrayList;

public class Cliente {
    private String nome;
    // private ContaCorrente conta = null;
    private ArrayList<ContaCorrente> contas;

    public Cliente(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void addConta(ContaCorrente contaCorrente) {
        contas.add(contaCorrente);
    }

    public String getDados() {
        String dadosConta =  "sem conta";
        if(contas.size() > 0){
            dadosConta = "\n";
            for (int i = 0; i < contas.size(); i++) {
                dadosConta += contas.get(i).getDados() + "\n";
            }
            
        }
        return nome + " - conta(s): " + dadosConta;
    }
}
