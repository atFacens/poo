package principal;

import model.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        // não pode acessar os atributos aqui
        // cliente.nome = "Emerson";
        // cliente.telefone = "123456";

        System.out.println(cliente.getNome());
    }
}
