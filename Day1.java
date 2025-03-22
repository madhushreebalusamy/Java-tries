import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) { 
            System.out.println("\nEnter the choices from the menu:");
            System.out.println("1. Sum of first N natural numbers");
            System.out.println("2. Sum of N given numbers");
            System.out.println("3. Multiplication of N numbers");
            System.out.println("4. Fibonacci series");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    sumOfNaturalNumbers(scanner);
                    break;
                case 2:
                    sumOfGivenNumbers(scanner);
                    break;
                case 3:
                    productOfNumbers(scanner);
                    break;
                case 4:
                    fibonacciSeries(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
        scanner.close();
    }

    public static void sumOfNaturalNumbers(Scanner scanner) {
        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }

    public static void sumOfGivenNumbers(Scanner scanner) {
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }
        System.out.println("Sum of the given numbers: " + sum);
    }

    public static void productOfNumbers(Scanner scanner) {
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int product = 1; 
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            product *= scanner.nextInt();
        }
        System.out.println("Product of the given numbers: " + product);
    }

    public static void fibonacciSeries(Scanner scanner) {
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci series:");
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}
