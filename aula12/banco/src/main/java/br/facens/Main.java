package br.facens;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/bd_poo_facens";
        String user = "profFacens";
        String password = "aula";

        try {
            System.out.println("Conectando ao BD...");
            Connection connection = DriverManager.getConnection(url, user, password);

            System.out.println("Criando a tabela...");
            String sql = "create table tb_cliente(id int, name varchar(100), email varchar(80));";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Tabela criada!");

            System.out.println("Fechando a conexão...");
            connection.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}