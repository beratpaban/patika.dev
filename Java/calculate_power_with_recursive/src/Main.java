import java.util.Scanner;
public class Main {
    static int calculatePower(int x , int y){
        int total2 = 1;
        int p = 1;
        while(p<=y){
            total2 *= x;
            p++;
        }
        return total2;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int x = scanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int y = scanner.nextInt();
        int total = calculatePower(x,y);
        System.out.println("Sonuç: " + total);
    }
}