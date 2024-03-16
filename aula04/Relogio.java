public class Relogio {
    // atributos
    private int hora;
    private int minuto;
    private int segundo;

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
    }

    public void setHoraAtual(int hora) {
        setHora(hora);
    }

    public void setHoraAtual(int hora, int minuto) {
        setHora(hora);
        setMinuto(hora);
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    // sobrecarga
    public Relogio() {

    }

    // construtor = inicializar o objeto
    public Relogio(int horaInicial, int minutoInicial) {
        setHora(horaInicial);
        minuto = minutoInicial;
    }

    // métodos = ações = verbos
    public void exbirHoraAtual() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

}
