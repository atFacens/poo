
package br.facens.projalunos;

public class Student {
    private int ra;
    private String nome;
    private String email;

    public Student() {
    }
    
    public Student(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Student(int ra, String nome, String email) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student [ra=" + ra + ", nome=" + nome + ", email=" + email + "]";
    }
}
