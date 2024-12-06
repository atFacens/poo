package br.facens;

import br.facens.dao.ClienteDAO;
import br.facens.model.Cliente;

public class Main {
    public static void main(String[] args) {

        // Cliente cliente1 = new Cliente(1, "Tiago", "tiago@email.com");

        // ClienteDAO.inserirCliente(cliente1);

        // Cliente cliente = ClienteDAO.buscarCliente(1);
        // System.out.println(cliente);

        boolean apagou = ClienteDAO.apagarCliente(1);

        if(apagou) {
            System.out.println("Cliente removido");
        } else {
            System.out.println("Falha ao remover");
        }

    }
}