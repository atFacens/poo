public class RoboSimples extends Robo {

    public RoboSimples() {
    }

    public RoboSimples(int x, int y, Area area) {
        super(x, y, area);
    }

    @Override
    public boolean mover(Direcao direcao, int posicoes) {
        if(!movimentoValido(direcao, posicoes)) {
            return false;
        }
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

    private boolean movimentoValido(Direcao direcao, int posicoes) {
        if(posicoes <= 0) return false;
        switch (direcao) {
            case Norte:
                return (y >= posicoes);
            case Sul:
                return (y + posicoes <= area.getMaxY());
            case Leste:
                return (x >= posicoes);
            case Oeste:
                return (x + posicoes <= area.getMaxX());
        }
        return false;
    }

}
