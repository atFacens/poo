
public class Gerente extends Funcionario {
    private String area;

    public Gerente(String nome, String area) {
        super(nome);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    @Override // sobrescrita
    public String getNome() {
        return "Gerente: " + super.getNome();
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String getDados() {
        return getNome() + " área: " + area;        
    }

}
