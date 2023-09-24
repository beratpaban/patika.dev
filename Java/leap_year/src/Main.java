import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Lütfen Yıl Giriniz: ");
        year = scanner.nextInt();
        if(!(year%400==0)){
            if(year%4==0 && year%100!=0){
                System.out.print(year + " bir artık yıldır.");
            }else{
                System.out.print(year + " bir artık yıl değildir.");
            }
        }else {
            System.out.print(year + " bir artık yıldır.");
        }

    }
}