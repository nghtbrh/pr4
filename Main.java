import java.util.Scanner;

public class Main{
    public static void main(String[] args) {;

    Scanner scanner = new Scanner(System.in);

//Завдання - 1

    System.out.println("Введіть перше число");
    Integer intValue = scanner.nextInt();

    scanner.nextLine();

    System.out.println("Введіть друге число");
    Integer intCifra = scanner.nextInt();

    scanner.nextLine();

    System.out.println("Введіть математичну дію");
    String string = scanner.nextLine();
    switch(string) {
        case "/":
            System.out.println(intValue + string + intCifra + "=" + intValue/intCifra);
            break;
        case "*":
            System.out.println(intValue + string + intCifra + "=" + intValue*intCifra);
            break;
        case "-":
            System.out.println(intValue + string + intCifra + "=" + (intValue-intCifra));
            break;
        case "+":
            System.out.println(intValue + string + intCifra + "=" + (intValue+intCifra));
            break;

//Завдання 2

    }
    }
}