import java.util.Scanner;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    // ⭐ ميزة factorial فقط
    public long factorial(int n) {
        if (n < 0) return -1;
        long f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
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
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    long res = calc.factorial(n);
                    System.out.println("Factorial: " + res);
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }

        sc.close();
    }
}
