public class Aluno {
    // atributos
    String nome;
    double media;

    // métodos (ações)
    public void verificarAprovacao(){
        if (media >= 7) {
            System.out.println(nome + " aprovado");
        } else {
            System.out.println(nome + " reprovado");
        }
    }
    
    public String verificarAprovacao2(){
        if (media >= 7) {
            return(nome + " aprovado");
        } else {
            return (nome + " reprovado");
        }
    }
}
