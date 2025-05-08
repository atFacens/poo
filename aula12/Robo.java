public abstract class Robo {
    int x, y;
    Area area;

    public Robo() {
        area = new Area();
    }

    public Robo(int x, int y, Area area) {
        this.x = x;
        this.y = y;
        this.area = area;
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
        return "Robo [x=" + x + ", y=" + y + "] " + area;
    }
}