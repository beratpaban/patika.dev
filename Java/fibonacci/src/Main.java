import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Fibonacci serisinin kaçıncı elemanını bulmak istiyorsunuz? ");
        number = scanner.nextInt();
        int first = 0, second = 1, third;
        for (int i = 0; i < number; i++) {
            third = first + second;
            System.out.println(first + " + " + second + " = " + third);
            first = second;
            second = third;
        }
    }
}