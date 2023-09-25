import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,power;
        System.out.print("Lütfen bir sayı giriniz: ");
        number=scanner.nextInt();
        System.out.print("Lütfen üssü giriniz: ");
        power=scanner.nextInt();
        int result=1;
        for (int i=1;i<=power;i++){
            result*=number;
        }
        System.out.println("Sonuç: "+result);
    }
}