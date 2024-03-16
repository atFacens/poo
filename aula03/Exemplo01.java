public class Exemplo01 {

    public static void main(String[] args) {
        Relogio relogio1 = new Relogio(-2, 10);
        Relogio relogio2 = new Relogio(3, 20);

        // relogio1.hora = 1; // hora é privada

        // relogio2.hora = 2;
        // relogio2.minuto = -10;
        // relogio2.segundo = 230;

        relogio1.alteraHora(24);

        relogio1.exbirHoraAtual();
        relogio2.exbirHoraAtual();


    }

}