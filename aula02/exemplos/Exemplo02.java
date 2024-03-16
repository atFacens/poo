package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.idade = 18;
        p1.nome = "Amanda";

        System.out.println("Nome:" + p1.nome);

        p2.idade = 23;
        p2.nome = "Francisco";

        System.out.println("Nome:" + p2.nome);
    }
}
