public class RoboSimples extends Robo {

    public RoboSimples(){}

    public RoboSimples(int x,int y){
        super(x, y);
    }

    @Override
    public boolean mover(Direcao direcao, int posicoes) {
        switch (direcao) {
            case Norte:
                y -= posicoes;
                break;
            case Sul:
                y += posicoes;
                break;
            case Leste:
                x -= posicoes;
                break;
            case Oeste:
                x += posicoes;
                break;
        }
        return true;
    }

}
