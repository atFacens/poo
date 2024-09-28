package model;

/*
 * public
 * protected
 * default
 * private
 */

public class Pessoa {
    protected String nome;
    String telefone; // default

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}