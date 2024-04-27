package exemplo;

import java.util.ArrayList;

public class Produto {
    static String nome;
    ArrayList<Integer> numeros = null;

    public Produto() {
        numeros = new ArrayList<>();
    }

    public void exibirObjeto() {
        System.out.println("objeto");
        System.out.println(numeros);
    }

    public static void exibirNome() {
        System.out.println(nome);
    }
}