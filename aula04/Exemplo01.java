public class Exemplo01 {

    public static void main(String[] args) {
        Relogio relogio1 = new Relogio(-2, 10);
        Relogio relogio2 = new Relogio(3, 20);
        Relogio relogio3 = new Relogio();

        relogio1.setHora(2);

        int horaAtual = relogio1.getHora();

        System.out.println("Hora: " + horaAtual);

        relogio1.exbirHoraAtual();
        relogio2.exbirHoraAtual();


    }

}