package br.facens.projalunos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Instruções para criar o BD e a tabela:
 * 
 * create schema bd_escola_facens;
 * 
 * use bd_escola_facens;
 * 
 * create table alunos (ra int primary key auto_increment, nome varchar(200), email varchar(50));
 * 
 */


public class ConnectionBD {
    private static final String BD_URL = "jdbc:mysql://localhost:3306/bd_escola_facens"; 
    private static final String USER = "profFacens"; // root
    private static final String PASSWORD = "aula";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(BD_URL, USER, PASSWORD);
    }
}
