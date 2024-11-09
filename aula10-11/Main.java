public class Main {
    public static void main(String[] args) {
        Terreno terreno1 = null;// = new Terreno(100, 100);
        Terreno terreno2 = new Terreno(200, 200);

        RoboSimples r1 = new RoboSimples(terreno1);
        RoboSimples r2 = new RoboSimples(40, 50, terreno1);
        RoboTank rt1 = new RoboTank(terreno2);
        RoboTank rt2 = new RoboTank(55, 77, terreno2);

        // System.out.println(r1);
        // System.out.println(r2);
        // System.out.println(rt1);
        // System.out.println(rt2);
        
        r2.moverSul(100);
        r2.moverSul(100);
        System.out.println(r2);
    }
}
