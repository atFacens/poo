package br.facens;

public class Main {
    public static void main(String[] args) {
        // ClienteDAO.createTable();
/* 
        Cliente cliente = new Cliente(1, "Junior", "junior@email.com");

        boolean sucesso = ClienteDAO.inserir(cliente);
        if (sucesso) {
            System.out.println("Cliente inserido com sucesso.");
        } else {
            System.out.println("Erro na inserção do cliente.");
        } */

        Cliente cliente = ClienteDAO.buscar(1);
        if(cliente != null){
            System.out.println(cliente);
        } else {
            System.out.println("Cliente não encontrado.");
        }

    }
}
