import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı adeti: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
            return;
        }
        int min = 0, max = 0;
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            int number = scanner.nextInt();
            if (i == 0) {
                min = number;
                max = number;
            } else {
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            }
        }
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}