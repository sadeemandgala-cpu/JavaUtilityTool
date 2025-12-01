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
        System.out.println("1. Add\n2. Factorial\n3. Exit");

        while (true) {
            System.out.print("Choose option: ");
            int choice;

            // Validate menu input
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter integers only.");
                sc.nextLine(); // clear invalid input
                continue;
            }

            if (choice == 3) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    try {
                        int a = sc.nextInt();
                        int b = sc.nextInt();
                        System.out.println("Result: " + calc.add(a, b));
                    } catch (Exception e) {
                        System.out.println("Invalid input! Please enter integers only.");
                        sc.nextLine(); // clear invalid input
                    }
                    break;

                case 2:
                    System.out.print("Enter number for factorial: ");
                    try {
                        int n = sc.nextInt();
                        long f = calc.factorial(n);
                        if (f == -1) System.out.println("Invalid input!");
                        else System.out.println("Factorial: " + f);
                    } catch (Exception e) {
                        System.out.println("Invalid input! Please enter integers only.");
                        sc.nextLine(); // clear invalid input
                    }
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }

        sc.close();
    }
}

