package br.facens;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClienteDAO {
    private static String url = "jdbc:mysql://localhost:3306/aulalp_facens";
    private static String user = "profFacens";
    private static String password = "aula";

    public static void createTable() {
        try {
            System.out.println("tentando conexão com o BD...");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com sucesso");

            String sql = "create table tb_cliente(id int, name varchar(150), email varchar(80));";

            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);

            System.out.println("Tabela cliente criada com sucesso.");

            connection.close();
            System.out.println("Desconectado com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static boolean inserir(Cliente cliente) {
        String sql = "insert into tb_cliente values (?, ?, ?);";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, cliente.getId());
            statement.setString(2, cliente.getName());
            statement.setString(3, cliente.getEmail());

            statement.executeUpdate(sql);

            connection.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return false;
    }

    public static Cliente buscar(int id) {
        String sql = "select from tb_cliente where id = ?;";

        try (Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = connection.prepareStatement(sql);) {

            statement.setInt(1, id);

            ResultSet resultset = statement.executeQuery(sql);

            if (resultset.next()) {
                int idCliente = resultset.getInt("id");
                String name = resultset.getString("name");
                String email = resultset.getString("email");

                Cliente cliente = new Cliente(idCliente, name, email);
                return cliente;
            }

            return null;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }
}
