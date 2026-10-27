import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę (a): ");
        double a = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę (b): ");
        double b = scanner.nextDouble();

        double suma = a + b;
        System.out.println("Suma wynosi: " + suma);

        scanner.close();
    }
}