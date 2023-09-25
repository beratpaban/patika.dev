import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, ebob = 1, ekok,i=1;
        System.out.print("Birinci sayıyı giriniz: ");
        number1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        number2 = scanner.nextInt();
        int min= Math.min(number1, number2);
        while (i <= min) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        ekok = (number1 * number2) / ebob;
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);

    }
}