import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int basamakSayisi = sayi;

        while (basamakSayisi != 0) {
            int basamak = basamakSayisi % 10;
            toplam += basamak;
            basamakSayisi /= 10;
        }

        System.out.println("Girilen sayının basamaklarının toplamı: " + toplam);
    }
}
