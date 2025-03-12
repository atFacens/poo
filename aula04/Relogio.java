public class Relogio {
    // atributos
    private int hora, minuto, segundo;

    // construtor
    // métodos especial chamado na construção do objeto

    public Relogio() {

    }

    // sobrecarga: overload
    public Relogio(int novaHora) {
        setHora(novaHora);
    }

    public Relogio(int novaHora, int minuto) {
        setHora(novaHora);
    }

    // métodos
    public void exibirHora() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            // this é uma referência ao próprio obj
            this.hora = hora;
        }
    }

    public int getHora() {
        return hora;
    }
}