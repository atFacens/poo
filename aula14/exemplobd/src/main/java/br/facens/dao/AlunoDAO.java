package br.facens.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import br.facens.models.Aluno;

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
}
