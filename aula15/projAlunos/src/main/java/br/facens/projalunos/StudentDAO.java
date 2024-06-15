package br.facens.projalunos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

    
    public static boolean inserir(Student student) {
        final String INSERT_STUDENT = "insert into alunos values(null, ?, ?)"; 

        try (Connection conn = ConnectionBD.getConnection();
        PreparedStatement preparedStatement = conn.prepareStatement(INSERT_STUDENT)
        ) {
            preparedStatement.setString(1, student.getNome());
            preparedStatement.setString(2, student.getEmail());
            preparedStatement.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } 
    }
    
  public static Student buscarPorRA(int ra) {
        final String SELECT_USERS_SQL = "SELECT * FROM alunos WHERE ra = ?;";

        try (
            Connection conn = ConnectionBD.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_USERS_SQL)) {
            preparedStatement.setInt(1, ra);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) { // testa se tem uma próxima linha na tabela
                int raAluno = rs.getInt("ra");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                Student student = new Student(raAluno, nome, email);
                return student;
            }
            return null; // não achou o RA
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
  
      public static int atualizarEmail(int ra, String email) {
        final String SELECT_USERS_SQL = "UPDATE alunos SET email = ? WHERE ra = ?;";

        try (Connection conn = ConnectionBD.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_USERS_SQL)) {
            preparedStatement.setString(1, email);
            preparedStatement.setInt(2, ra);
            int registros = preparedStatement.executeUpdate();
            return registros;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int apagarPorRA(int ra) {
        final String SELECT_USERS_SQL = "DELETE FROM alunos WHERE ra = ?;";

        try (Connection conn = ConnectionBD.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_USERS_SQL)) {
            preparedStatement.setInt(1, ra);
            int registros = preparedStatement.executeUpdate();
            return registros;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
