package br.facens.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

import br.facens.models.Aluno;

// CRUD = Create, Read, Update, Delete

public class AlunoDAO {
    static final String url = "jdbc:mysql://localhost:3306/bd_poo_facens";
    static final String user = "profFacens";
    static final String password = "aula";

    public static boolean criarNovoAluno(Aluno aluno) {
        final String SQL = "insert into alunos (nome, email) values(?, ?);";
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        ) {
            preparedStatement.setString(1, aluno.getNome());
            preparedStatement.setString(2, aluno.getEmail());

            preparedStatement.execute();

            return true;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }

    public static Optional<Aluno> buscarAluno(int id) {
        final String SQL = "select * from alunos where id = ?;";
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        ) {
            preparedStatement.setInt(1, id);

            ResultSet resultado = preparedStatement.executeQuery();

            boolean achou = resultado.next();
            if(achou) {
                int idAluno = resultado.getInt("id");
                String nomeAluno = resultado.getString("nome");
                String emailAluno = resultado.getString("email");

                Aluno aluno = new Aluno(idAluno, nomeAluno, emailAluno);
                return Optional.of(aluno);
            }

            return Optional.empty();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return Optional.empty();
        }
    }

    public static Optional<Aluno> atualizarEmail(int id, String email) {
        final String SQL = "update alunos set email = ? where id = ?;";
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        ) {
            preparedStatement.setString(1, email);
            preparedStatement.setInt(2, id);

            int alterados = preparedStatement.executeUpdate();

            if(alterados > 0) {
                return buscarAluno(id);
            }

            return Optional.empty();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return Optional.empty();
        }
    }
    public static boolean apagar(int id) {
        final String SQL = "delete from alunos where id = ?;";
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        ) {
            preparedStatement.setInt(1, id);

            int apagados = preparedStatement.executeUpdate();

            return apagados > 0;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }


}
