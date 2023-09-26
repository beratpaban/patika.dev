import java.util.Scanner;

public class Main {
    static void plus(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç sayı toplayacaksınız: ");
        int count = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int number = scan.nextInt();
            sum += number;
        }
        System.out.println("Toplam: " + sum);
    }
    static void minus(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Kaç sayı çıkaracaksınız: ");
        int count = scan.nextInt();
        int minus = 0;
        for(int i = 1; i <= count; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int number = scan.nextInt();
            minus -= number;
        }
        System.out.println("Çıkarma: " + minus);
    }
    static void times(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç sayı çarpacaksınız: ");
        int count = scan.nextInt();
        int times = 1;
        for(int i = 1; i <= count; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int number = scan.nextInt();
            times *= number;
        }
        System.out.println("Çarpma: " + times);
    }
    static void divided(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç sayı böleceksiniz: ");
        int count = scan.nextInt();
        int divided = 1;
        for(int i = 1; i <= count; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int number = scan.nextInt();
            divided /= number;
        }
        System.out.println("Bölme: " + divided);
    }
    static void power(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        int number = scan.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        int power = scan.nextInt();
        int result = 1;
        for(int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println("Üs: " + result);
    }
    static void factorial(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Faktöriyeli alınacak sayıyı giriniz: ");
        int number = scan.nextInt();
        int result = 1;
        for(int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Faktöriyel: " + result);
    }
    static void mode(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Modu alınacak sayıyı giriniz: ");
        int number = scan.nextInt();
        System.out.print("Mod sayısını giriniz: ");
        int mode = scan.nextInt();
        int result = number % mode;
        System.out.println("Mod: " + result);
    }
    static void rectangle(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        int shortEdge = scan.nextInt();
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        int longEdge = scan.nextInt();
        int area = shortEdge * longEdge;
        int perimeter = 2 * (shortEdge + longEdge);
        System.out.println("Dikdörtgenin alanı: " + area);
        System.out.println("Dikdörtgenin çevresi: " + perimeter);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        do {
            System.out.println(menu);
            System.out.print("Seçiminiz: ");
            select = scan.nextInt();
            switch (select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Yanlış bir seçim yaptınız.");
                    break;
            }
        }while (select != 0);
    }
}