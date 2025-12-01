import java.util.Scanner;

public class Calculator {

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
            int choice;

            // validation feature
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter integers only.");
                sc.nextLine();
                continue;
            }

            if (choice == 2) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    try {
                        int a = sc.nextInt();
                        int b = sc.nextInt();
                        System.out.println("Result: " + calc.add(a, b));
                    } catch (Exception e) {
                        System.out.println("Invalid input! Please enter integers only.");
                        sc.nextLine();
                    }
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }

        sc.close();
    }
}
