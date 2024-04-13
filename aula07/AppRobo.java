public class AppRobo {
    public static void main(String[] args) {
        Area area = new Area(50, 50);
        RoboSimples robo = new RoboSimples(area);

        robo.exibirPosicao();
        robo.mover(Direcao.Sul, 20);
        robo.exibirPosicao();
        robo.mover(Direcao.Sul, 40);
        robo.exibirPosicao();
    }
}
