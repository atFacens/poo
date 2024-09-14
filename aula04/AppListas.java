import java.util.ArrayList;

public class AppListas {
    public static void main(String[] args) {
        Relogio relogios[] = new Relogio[10]; // estática: não pode alterar o tamanho

        relogios[0] = new Relogio();

        ArrayList<Relogio> listaDeRelogios = new ArrayList<>(); // dinâmico: pode alterar o tamanho

        System.out.println(listaDeRelogios.isEmpty());

        listaDeRelogios.add(new Relogio());
        listaDeRelogios.add(new Relogio());
        listaDeRelogios.add(new Relogio());

        System.out.println(listaDeRelogios.size());

        listaDeRelogios.get(0).setHora(1);
        listaDeRelogios.get(1).setHora(2);
        listaDeRelogios.get(2).setHora(3);

        // listaDeRelogios.remove(0);
        // System.out.println(listaDeRelogios.size());

        Relogio relogioProcurado = null;

        for (int i = 0; i < listaDeRelogios.size(); i++) {
            System.out.println(listaDeRelogios.get(i).horarioAtual());

            if(listaDeRelogios.get(i).getHora() == 2) {
                relogioProcurado = listaDeRelogios.get(i);
            }
        }
        
        if(relogioProcurado != null) {
            listaDeRelogios.remove(relogioProcurado);
        }
        
        System.out.println("---");

        for (int i = 0; i < listaDeRelogios.size(); i++) {
            System.out.println(listaDeRelogios.get(i).horarioAtual());
        }

        System.out.println("---");
        // foreach
        // para cada relógio da lista de relógios faça:
        for (Relogio relogio : listaDeRelogios) {
            System.out.println(relogio.horarioAtual());
        }

    }
}
