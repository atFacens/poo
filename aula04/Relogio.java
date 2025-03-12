public class Relogio {
    // atributos
    private int hora, minuto, segundo;

    // métodos
    public void exibirHora() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

    public void alterarHora(int novaHora) {
        if(novaHora >= 0 && novaHora < 24) {
            hora = novaHora;
        }
    }
}