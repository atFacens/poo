public class Gerente extends Funcionario {
    private String area;

    public Gerente(String nome) {
        super(nome);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String exibir() {
        return getNome() + " área: " + area;
    }

}
