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
        if (terreno != null) {
            this.terreno = terreno;
        } else {
            this.terreno = new Terreno(0, 0);
        }

    }

    public void moverSul() {
        if (y + 1 <= terreno.getMaxY()) {
            y++;
        }
    }

    public void moverSul(int posicoes) {
        if (posicoes <= 0) {
            return;
        }
        int deslocamentoPermitido = terreno.getMaxY() - y;
        if (y + posicoes <= terreno.getMaxY()) {
            y += posicoes;
        } else {
            y += deslocamentoPermitido;
        }
    }

    public void moverNorte() {
        if (y - 1 >= 0) {
            y--;
        }
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "]";
    }
}