import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        number = scanner.nextInt();

        for(int i=1; i<=number; i*=4){
            for (int j=1; j<=number; j*=5){
                System.out.println(i*j);
            }
        }
    }
}