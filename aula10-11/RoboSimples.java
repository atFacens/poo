public class RoboSimples {

    private int x, y;
    private Terreno terreno;

    public RoboSimples(Terreno terreno) {
        // x = 0;
        // y = 0;
        this.terreno = terreno;
    }

    public RoboSimples(int x, int y, Terreno terreno) {
        this.x = x;
        this.y = y;
        this.terreno = terreno;
    }

    @Override
    public String toString() {
        return "[" + x + ","+ y + "]";
    }
}