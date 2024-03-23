import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nome;

    // private ContaCorrente conta; 
    private ArrayList<ContaCorrente> contas = new ArrayList<>(); 

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    // public ContaCorrente getConta() {
    //     return conta;
    // }

    // public void setConta(ContaCorrente conta) {
    //     this.conta = conta;
    // }

    public void addConta(ContaCorrente cc) {
        contas.add(cc);
    }

    public void exibirContas() {
        if(contas.size() == 0) {
            System.out.println("Cliente sem contas");
        } else {
            for (int i = 0; i < contas.size(); i++) {
                System.out.println("Cliente possui conta " + contas.get(i).getNumero());
            }
        }
    }

}
