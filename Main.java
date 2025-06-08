import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double raio , area, pi=3.14159;

        raio = scanner.nextDouble();
        area = raio * pi * raio;

        System.out.printf("Aréa= %.4f%n", area);





    }
}