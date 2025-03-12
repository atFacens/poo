public class AppRelogio {
    public static void main(String[] args) {
        
        Relogio relogio1 = new Relogio();
        Relogio relogio2 = new Relogio(80);

        relogio1.exibirHora();
        relogio2.exibirHora();
        
        relogio2.setHora(9);
        System.out.println("Hora = " + relogio2.getHora());

        relogio2.exibirHora();

    }
}
