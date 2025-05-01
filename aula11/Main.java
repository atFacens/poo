public class Main {
    public static void main(String[] args) {
        RoboSimples roboSimples = new RoboSimples();

        roboSimples.mover(Direcao.Sul, 10);
        System.out.println(roboSimples);

        roboSimples.mover(Direcao.Oeste, 10);
        System.out.println(roboSimples);
    }
}
