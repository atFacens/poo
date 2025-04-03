public class Pessoa {

    private String nome;
    private String sobreNome;


    public Pessoa(){}

    // sobrecarga: overload
    public Pessoa(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && nome.length() > 0) {
            this.nome = nome;
        }
    }
    
    public void setNome(String nome, String sobreNome) {
        if (nome != null && nome.length() > 0) {
            this.nome = nome;
        }
        if (sobreNome != null && sobreNome.length() > 0) {
            this.sobreNome = sobreNome;
        }
    }

    public String getSobreNome() {
        return sobreNome;
    }
}