import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Lütfen sayı giriniz: ");
        number = scanner.nextInt();
        for(int i=1; i<=number; i++){
            if(i%3==0&&i%4==0){
                System.out.println(i);
            }
        }
    }
}
