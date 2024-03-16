public class Relogio {
    // atributos
    private int hora;
    private int minuto;
    private int segundo;

    public void alteraHora(int novaHora) {
        if (novaHora >= 0 && novaHora < 24) {
            hora = novaHora;
        }
    }

    // public Relogio(){

    // }

    //construtor = inicializar o objeto
    public Relogio(int horaInicial, int minutoInicial) {
        alteraHora(minutoInicial);
        minuto = minutoInicial;
    }


    // métodos = ações = verbos
    public void exbirHoraAtual() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

}
