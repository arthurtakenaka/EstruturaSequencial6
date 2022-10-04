import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner (System.in);
        double raio, pi, area;
        System.out.println("Digite o raio do circulo: ");
        raio = entrada.nextDouble();
        pi = 3.14;
        area = (raio * raio) * pi;

        System.out.println("A area do circulo eh igual a: " + area);
    }
}
