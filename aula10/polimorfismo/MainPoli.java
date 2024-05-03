package polimorfismo;

public class MainPoli {

    public static void main(String[] args) {
        Veiculo v = new Veiculo(10);

        v.acelerar();
        System.out.println("Vel: "+ v.getVelocidade());

        v.acelerar(5);
        System.out.println("Vel: "+ v.getVelocidade());

        CarroEsporte c = new CarroEsporte(12);

        c.acelerar();
        System.out.println("Vel Sport: " + c.getVelocidade());

        System.out.println(v);
        System.out.println(c);
    }
}