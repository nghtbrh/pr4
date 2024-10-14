import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scannerok = new Scanner(System.in);
        System.out.println("Введіть ваше число");

        int Cif = scannerok.nextInt();

        for (int i = 2; i <= Cif; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Якщо число просте, виводимо його
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}