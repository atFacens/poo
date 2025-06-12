package br.facens;

import java.util.Optional;
import java.util.Scanner;

import br.facens.dao.AlunoDAO;
import br.facens.models.Aluno;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, email;
        int id;

        // System.out.println("Informe o nomedo aluno:");
        // nome = scanner.nextLine();
        // System.out.println("informe o email do aluno:");
        // email = scanner.nextLine();

        // Aluno aluno = new Aluno(0, nome, email);

        // boolean inserido = AlunoDAO.criarNovoAluno(aluno);

        // if(inserido) {
        // System.out.println("Aluno cadastrado com sucesso!");
        // } else {
        // System.out.println("Erro ao cadastrar o aluno");
        // }

        // System.out.println("Informe o id do aluno:");
        // id = Integer.parseInt(scanner.nextLine());

        // Optional<Aluno> optionalAluno = AlunoDAO.buscarAluno(id);

        // if(optionalAluno.isEmpty()) {
        // System.out.println("Aluno não encontrado.");
        // } else {
        // System.out.println(optionalAluno.get());

        // }

        // System.out.println("Informe o id do aluno:");
        // id = Integer.parseInt(scanner.nextLine());

        // System.out.println("informe o novo email do aluno:");
        // email = scanner.nextLine();

        // Optional<Aluno> optionalAluno = AlunoDAO.atualizarEmail(id, email);

        // if (optionalAluno.isEmpty()) {
        //     System.out.println("Aluno não encontrado.");
        // } else {
        //     System.out.println("Email atualizado:");
        //     System.out.println(optionalAluno.get());

        // }

        System.out.println("Informe o id do aluno:");
        id = Integer.parseInt(scanner.nextLine());

      
        boolean apagado = AlunoDAO.apagar(id);

        if (apagado) {
            System.out.println("Aluno removido.");
        } else {
            System.out.println("Aluno não encontrado ou erro na operção");
        }

        scanner.close();
    }
}