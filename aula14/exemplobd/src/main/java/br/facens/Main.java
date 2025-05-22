package br.facens;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    static final String url = "jdbc:mysql://localhost:3306/bd_poo_facens";
    static final String user = "profFacens"; 
    static final String password = "aula"; 

    public static void main(String[] args) {
        Connection connection;
        try {
            System.out.println("Conectando com o BD ...");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com sucesso.");

            Thread.sleep(3000);
            
            System.out.println("Desconectando...");
            connection.close();
            System.out.println("Desconectado com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}