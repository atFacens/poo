public class Area {
    private int maxX, maxY;

    public Area(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public boolean posValida(int x, int y, int deslocamento, Direcao direcao) {
        switch (direcao) {
            case Norte:
                return (y - deslocamento >= 0);
            case Sul:
                return (y + deslocamento <= maxY);
            case Oeste:
                return (x - deslocamento >= 0);
            case Leste:
                return (x + deslocamento <= maxX);
        }
        return false;
    }

}
