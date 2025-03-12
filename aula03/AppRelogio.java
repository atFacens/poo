public class AppRelogio {
    public static void main(String[] args) {
        
        Relogio relogio1 = new Relogio();
        Relogio relogio2 = new Relogio();

        relogio1.exibirHora();
        // relogio1.hora = 20; // somente public
        relogio1.exibirHora();

        relogio2.alterarHora(9);
        relogio2.exibirHora();
        

    }
}
