import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi uzunluğunu girin: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Hedef sayıyı girin: ");
        int target = scanner.nextInt();

        Arrays.sort(array);

        int closestSmaller = findClosestSmaller(array, target);
        int closestLarger = findClosestLarger(array, target);

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);

        scanner.close();
    }
    public static int findClosestSmaller(int[] array, int target) {
        int closestSmaller = Integer.MIN_VALUE;
        for (int num : array) {
            if (num < target && num > closestSmaller) {
                closestSmaller = num;
            }
        }
        return closestSmaller;
    }

    public static int findClosestLarger(int[] array, int target) {
        int closestLarger = Integer.MAX_VALUE;
        for (int num : array) {
            if (num > target && num < closestLarger) {
                closestLarger = num;
            }
        }
        return closestLarger;
    }
}