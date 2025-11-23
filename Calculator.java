import java.util.Scanner;

public class Calculator {

    // Basic addition method
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Java Utility Tool");
        System.out.println("1. Add\n2. Exit");

        while (true) {
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 2) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Result: " + calc.add(a, b));
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }

        sc.close();
    }
}
