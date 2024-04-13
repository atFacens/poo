public class RoboSimples {
    private int posX, posY;
    private Area area;

    public RoboSimples(Area area) {
        this.area = area;
    }

    public void mover(Direcao direcao, int deslocamento) {
        if (area.posValida(posX, posY, deslocamento, direcao)) {
            switch (direcao) {
                case Norte:
                    posY -= deslocamento;
                    break;
                case Sul:
                    posY += deslocamento;
                    break;
                case Oeste:
                    posX -= deslocamento;
                    break;
                case Leste:
                    posX += deslocamento;
                    break;
            }
        }
    }

    public void exibirPosicao() {
        System.out.println("pos: " + posX + ", " + posY);
    }
}