import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Satır sayısını girin: ");
        int satirSayisi = scanner.nextInt();
        System.out.print("Sütun sayısını girin: ");
        int sutunSayisi = scanner.nextInt();
        int toplamElemanSayisi = satirSayisi * sutunSayisi;

        int[][] mayinlar = new int[satirSayisi][sutunSayisi];
        int[][] oyunTahtasi = new int[satirSayisi][sutunSayisi];
        int mayinSayisi = toplamElemanSayisi / 4;

        // Mayınları rastgele yerleştir
        for (int i = 0; i < mayinSayisi; i++) {
            int rastgeleSatir = random.nextInt(satirSayisi);
            int rastgeleSutun = random.nextInt(sutunSayisi);
            if (mayinlar[rastgeleSatir][rastgeleSutun] == 1) {
                i--;
            } else {
                mayinlar[rastgeleSatir][rastgeleSutun] = 1;
            }
        }

        boolean oyunDevamEdiyor = true;

        while (oyunDevamEdiyor) {
            oyunTahtasiniGoster(oyunTahtasi);
            System.out.print("Satır girin: ");
            int satir = scanner.nextInt();
            System.out.print("Sütun girin: ");
            int sutun = scanner.nextInt();

            if (satir < 0 || satir >= satirSayisi || sutun < 0 || sutun >= sutunSayisi) {
                System.out.println("Geçersiz bir konum girdiniz. Lütfen tekrar deneyin.");
            } else if (mayinlar[satir][sutun] == 1) {
                oyunTahtasi[satir][sutun] = -1;
                oyunDevamEdiyor = false;
                oyunTahtasiniGoster(oyunTahtasi);
                System.out.println("Oyunu kaybettiniz!");
            } else {
                int mayinSayisiCevresi = mayinlariSay(oyunTahtasi, mayinlar, satir, sutun);
                oyunTahtasi[satir][sutun] = mayinSayisiCevresi;
                if (kontrolEt(oyunTahtasi, toplamElemanSayisi - mayinSayisi)) {
                    oyunDevamEdiyor = false;
                    oyunTahtasiniGoster(oyunTahtasi);
                    System.out.println("Oyunu kazandınız!");
                }
            }
        }

        scanner.close();
    }

    public static void oyunTahtasiniGoster(int[][] oyunTahtasi) {
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");
        for (int i = 0; i < oyunTahtasi.length; i++) {
            for (int j = 0; j < oyunTahtasi[i].length; j++) {
                if (oyunTahtasi[i][j] == -1) {
                    System.out.print("* ");
                } else if (oyunTahtasi[i][j] == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print(oyunTahtasi[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static int mayinlariSay(int[][] oyunTahtasi, int[][] mayinlar, int satir, int sutun) {
        int sayac = 0;
        int[][] cevre = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1},           {0, 1},
                {1, -1}, {1, 0}, {1, 1}
        };

        for (int[] koordinat : cevre) {
            int yeniSatir = satir + koordinat[0];
            int yeniSutun = sutun + koordinat[1];

            if (yeniSatir >= 0 && yeniSatir < oyunTahtasi.length && yeniSutun >= 0 && yeniSutun < oyunTahtasi[0].length) {
                sayac += mayinlar[yeniSatir][yeniSutun];
            }
        }

        return sayac;
    }

    public static boolean kontrolEt(int[][] oyunTahtasi, int kalanElemanSayisi) {
        int acilanElemanSayisi = 0;
        for (int i = 0; i < oyunTahtasi.length; i++) {
            for (int j = 0; j < oyunTahtasi[i].length; j++) {
                if (oyunTahtasi[i][j] >= 0) {
                    acilanElemanSayisi++;
                }
            }
        }

        return kalanElemanSayisi == acilanElemanSayisi;
    }
}
