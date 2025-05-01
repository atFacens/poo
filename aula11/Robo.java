public abstract class Robo {
    int x, y;

    public Robo() {
    }

    public Robo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract boolean mover(Direcao direcao, int posicoes);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Robo [x=" + x + ", y=" + y + "]";
    }
}