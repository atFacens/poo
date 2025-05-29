package br.facens;

import java.util.Scanner;

import br.facens.dao.AlunoDAO;
import br.facens.models.Aluno;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, email;

        System.out.println("Informe o nomedo aluno:");
        nome = scanner.nextLine();
        System.out.println("informe o email do aluno:");
        email = scanner.nextLine();

        Aluno aluno = new Aluno(0, nome, email);

        boolean inserido = AlunoDAO.criarNovoAluno(aluno);

        if(inserido) {
            System.out.println("Aluno cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar o aluno");
        }

        scanner.close();
    }
}