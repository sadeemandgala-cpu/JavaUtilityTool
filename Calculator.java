import java.util.Scanner;

public class Calculator {

    // Basic addition method
    public int add(int a, int b) {
        return a + b;
    }

    // Feature 1: Factorial (from factor branch)
    public long factorial(int n) {
        if (n < 0) return -1; // invalid input
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Java Utility Tool");
        System.out.println("1. Add\n2. Factorial\n3. Exit");

        while (true) {
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 3) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Result: " + calc.add(a, b));
                    break;

                case 2:
                    System.out.print("Enter number for factorial: ");
                    int n = sc.nextInt();
                    long f = calc.factorial(n);
                    if (f == -1)
                        System.out.println("Invalid input!");
                    else
                        System.out.println("Factorial: " + f);
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }

        sc.close();
    }
}
