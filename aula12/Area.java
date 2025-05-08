public class Area {
    private int maxX, maxY;

    public Area() {
        this.maxX = 50;
        this.maxY = 50;
    }

    public Area(int maxX, int maxY) {
        this(); // Area();
        if(maxX > 50 && maxY > 50) {
            this.maxX = maxX;
            this.maxY = maxY;
        }
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    @Override
    public String toString() {
        return "Area [maxX=" + maxX + ", maxY=" + maxY + "]";
    }

}
