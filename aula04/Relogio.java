public class Relogio {
    // atributos
    private int hora, minuto, segundo;

    // sobrecarga de método: overload

    public Relogio() { //constutor default
        hora = 0;
        minuto = 0;
        segundo = 1;
    }

    // construtor sobrecarregado
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
    }

    // overload do setHora - pelo menos 1 parâmetro diferente em tipo ou quantidade
    public void setHora(float horaf) {
        int hora = (int) horaf;
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
    }

    public int getHora() {
        return hora;
    }

    // métodos
    public String horarioAtual() {
        return hora + ":" + minuto + ":" + segundo;
    }
}