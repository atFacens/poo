import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList<Relogio> lista = new ArrayList<>(); 

        lista.add(new Relogio(2, 30));
        lista.add(new Relogio(3, 15));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getHora());
        }

    }
}
