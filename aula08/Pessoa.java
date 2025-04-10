public abstract class Pessoa {
    protected String nome;

    public abstract void apresentar();

    public void cumprimentar() {
        System.out.println("Boa noite");
    }
}