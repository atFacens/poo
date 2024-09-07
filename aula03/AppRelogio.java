public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(20, 24, 0);

        // o acesso é negado pois é privado
        // relogio.hora = -20;
        // relogio.minuto = 90;

        
        System.out.println(relogio.horarioAtual());
        
        relogio.setHora(21);
        
        System.out.println(relogio.horarioAtual());

        System.out.println("Hora: " + relogio.getHora());

    }
}
