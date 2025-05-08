public class Main {
    public static void main(String[] args) {
        RoboSimples roboSimples = new RoboSimples();

        roboSimples.mover(Direcao.Sul, 10);
        System.out.println(roboSimples);

        roboSimples.mover(Direcao.Leste, 10);
        System.out.println(roboSimples);

        Area area = new Area(100, 100);
        RoboSimples roboSimples2 = new RoboSimples(50, 50, area);

        System.out.println(roboSimples2);
    }
}
